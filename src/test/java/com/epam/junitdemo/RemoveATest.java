package com.epam.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveATest {

	RemoveA test1;
	@BeforeEach
	void setUp(){
		test1=new RemoveA();
	}
	@Test
	void test1() {
		assertEquals("BCD",test1.remove("ABCD"));
	}
	@Test
	void test2() {
		
		assertEquals("CD", test1.remove("AACD"));
	}
	@Test
	void test3() {
		
		assertEquals("", test1.remove("A"));
	}
	@Test
	void test4() {
		
		assertEquals("BCD",test1.remove("BACD"));
	}
	@Test
	void test5() {
		
		assertEquals("BBAA", test1.remove("BBAA"));
	}
	@Test
	void test6() {
		
		assertEquals("CD", test1.remove("AACD"));
	}
	@Test
	void test7() {
		
		assertEquals("", test1.remove(""));
	}
	@Test
	void test8() {
		
		assertEquals("B", test1.remove("B"));
	}

}
