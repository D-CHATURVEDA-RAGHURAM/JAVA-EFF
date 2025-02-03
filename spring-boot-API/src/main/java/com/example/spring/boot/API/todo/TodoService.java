package com.example.spring.boot.API.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service

public class TodoService {
	
	private static int todosCount = 0;
	private static List<Todo> todos = new ArrayList<>();
	static {
		todos.add(new Todo(++todosCount,"chatur","Learn SpringBoot 1",LocalDate.now().plusYears(1), false));
		todos.add(new Todo(++todosCount,"chatur","Learn Spring 1",LocalDate.now().plusYears(2), false));
		todos.add(new Todo(++todosCount,"chatur","Learn Boot 1",LocalDate.now().plusYears(3), false));
	}
	
	public List<Todo> findByUserName(String Username)
	{
		Predicate<? super Todo> predicate = todo -> todo.getUserName().equalsIgnoreCase(Username);
		return todos.stream().filter(predicate).toList();
	}
	
	public void addTodo(String username, String description, LocalDate targetDate, boolean done)
	{
		Todo todo = new Todo(++todosCount,username,description,targetDate,done);
		todos.add(todo);
	}
	
	public void deleteById(int id)
	{
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		todos.removeIf(predicate);
	}

	public Todo findById(int id)
	{
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		Todo todo = todos.stream().filter(predicate).findFirst().get();
		return todo;
	}

	public void updateTodo(@Valid Todo todo)
	{
		deleteById(todo.getId());
		todos.add(todo);
		
	}
	
}
