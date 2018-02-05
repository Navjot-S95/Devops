package com.arith.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArithServiceTest {

	private ArithService arithService;

	@Before
	public void name() {
		arithService = new ArithService();
	}

	@Test
	public void add() {
		int result = arithService.add(12, 13);
		assertEquals(25, result);
	}

	@Test
	public void sub() {
		int result = arithService.sub(12, 13);
		assertEquals(-1, result);
	}

	@Test(expected = ArithmeticException.class)
	public void div() {
		int result = arithService.div(12, 0);
	}

	@Test
	public void addNegative() {
		int result = arithService.add(12, 13);
		assertNotEquals(0, result);
	}

}
