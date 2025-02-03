package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class MyAssertTest {

	List<String> todos = Arrays.asList("AWS","Azure");
	
	@Test
	void test() {
		boolean test = todos.contains("AWS");
		boolean test2 = todos.contains("AW");
		assertEquals(true, test);
		assertTrue(test); // only for boolean values
		assertFalse(test2);
		assertArrayEquals(new int[] {1,2}, new int[] {2,1});
		assertEquals(2,todos.size());
	}

}
