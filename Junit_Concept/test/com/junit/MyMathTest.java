package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {

	private MyMath math = new MyMath();
	@Test
	void ThreeMemberArray() {
		assertEquals(6, math.calSum(new int[] {1,2,3}));
		//Absence of failure is success
	}
	
	@Test
	void ZeroLenthArray() {
		assertEquals(0, math.calSum(new int[] {}));
		//Absence of failure is success
	}
}