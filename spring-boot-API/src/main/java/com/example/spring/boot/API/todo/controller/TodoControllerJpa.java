package com.example.spring.boot.API.todo.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.spring.boot.API.todo.Todo;
import com.example.spring.boot.API.todo.repo.TodoRepository;

import jakarta.validation.Valid;

@Controller
@SessionAttributes("name")
public class TodoControllerJpa {
	
	private TodoRepository todoRepository;
	
	public TodoControllerJpa(TodoRepository todoRepository) {
		super();
		this.todoRepository = todoRepository;
	}

	@RequestMapping("list-todos")
	public String listAllTodos(ModelMap map)
	{
		String username = getLoggedInUsername(map);
		
		List<Todo> todos = todoRepository.findByUserName(username);
		map.addAttribute("todos",todos);
		return "ListTodos";
	}
	
	private String getLoggedInUsername(ModelMap map) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication(); 
		return authentication.getName();
	}

	@RequestMapping("delete-todo")
	public String deleteTodo(@RequestParam int id)
	{
		todoRepository.deleteById(id);
		return "redirect:list-todos";
	}
	
	@RequestMapping(value = "update-todo",method = RequestMethod.GET)
	public String showUpdateTodoPage(@RequestParam int id, ModelMap map)
	{
		Todo todo = todoRepository.findById(id).get();
		map.addAttribute("todo",todo);
		return "todo";
	}
	
	@RequestMapping(value = "update-todo",method = RequestMethod.POST)
	public String UpdateTodo(ModelMap map, @Valid Todo todo, BindingResult result)
	{
		if (result.hasErrors())
		{
			return "todo";
		}
		String username = getLoggedInUsername(map);
		todo.setUserName(username);
		todoRepository.save(todo);
		return "redirect:list-todos";
	}
	
	
	@RequestMapping(value = "add-todo",method = RequestMethod.GET)
	public String showNewTodoPage(ModelMap map)
	{
		String username = (String)map.get("name");
		Todo todo = new Todo(0,username, "", LocalDate.now().plusYears(1), false);
		map.put("todo", todo);
		return "todo";
	}
	
	@RequestMapping(value = "add-todo",method = RequestMethod.POST)
	public String addNewTodo(ModelMap map, @Valid Todo todo, BindingResult result)
	{
		if (result.hasErrors())
		{
			return "todo";
		}
		String username = getLoggedInUsername(map);
		todo.setUserName(username);
		todoRepository.save(todo);
		return "redirect:list-todos";
	}
	
}
