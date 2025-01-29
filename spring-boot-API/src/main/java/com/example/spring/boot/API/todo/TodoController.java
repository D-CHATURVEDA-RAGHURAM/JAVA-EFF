package com.example.spring.boot.API.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;

@Controller
@SessionAttributes("name")
public class TodoController {
	
	private TodoService todoService;
	
	public TodoController(TodoService todoService) {
		super();
		this.todoService = todoService;
	}

	@RequestMapping("list-todos")
	public String listAllTodos(ModelMap map)
	{
		List<Todo> todos = todoService.findByUsername("Chatur");
		map.addAttribute("todos",todos);
		return "ListTodos";
	}
	
	@RequestMapping("delete-todo")
	public String deleteTodo(@RequestParam int id)
	{
		todoService.deleteById(id);
		return "redirect:list-todos";
	}
	
	@RequestMapping(value = "update-todo",method = RequestMethod.GET)
	public String showUpdateTodoPage(@RequestParam int id, ModelMap map)
	{
		Todo todo = todoService.findById(id);
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
		String username = (String)map.get("name");
		todo.setUserName(username);
		todoService.updateTodo(todo);
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
		String username = (String)map.get("name");
		todoService.addTodo(username, todo.getDescription(), todo.getTargetDate(), false);
		return "redirect:list-todos";
	}
	
}
