package com.springboot.jpa.learn_spring_boot_jpa.course.jpa;

import org.springframework.stereotype.Repository;

import com.springboot.jpa.learn_spring_boot_jpa.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepository {
	
	@PersistenceContext  //--> @Autowired is similar, for entity manager, more suitable annotation is persistence context
	private EntityManager entityManager;
	
	public void insert(Course course)
	{
		entityManager.merge(course);
	}
	
	public Course findById(long id)
	{
		return entityManager.find(Course.class,id);
	}
	
	public void deleteById(long id)
	{
		Course course = entityManager.find(Course.class,id);
		entityManager.remove(course);
	}
	
}
