package com.example.spring.boot.API.todo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring.boot.API.todo.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer>{
	public List<Todo> findByUserName(String username);
}
