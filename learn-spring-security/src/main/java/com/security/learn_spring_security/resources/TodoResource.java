package com.security.learn_spring_security.resources;

import java.util.List;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.security.RolesAllowed;

@RestController
public class TodoResource {

	private static final List<Todo> TODOS_LIST = List.of(
			new Todo("chaturved","Learn AWS"),
			new Todo("chaturved","Learn GCP")
		);

	@GetMapping("/todos")
	public List<Todo> retrieveAllTodos() {
		return TODOS_LIST;
	}
	
	@GetMapping("/users/{username}/todos")
//	@PreAuthorize("hasRole('USER') and #username == authentication.name")
	@PreAuthorize("hasRole('USER')")
//	@PostAuthorize("returnObject.username == 'chaturved'")
	@RolesAllowed({"ADMIN","USER"}) // this is working
	@Secured({"ROLE_ADMIN","ROLE_USER"}) // this is also working
	public Todo retrieveTodosForSpecificUser(@PathVariable("username") String username) {
		return TODOS_LIST.get(0);
	}
	
	@PostMapping("/users/{username}/todos")
	public Todo createTodosForSpecificUser(@PathVariable("username") String username, @RequestBody Todo todo) {
		return TODOS_LIST.get(0);
	}
	
}

record Todo (String username, String description) {
	
}
