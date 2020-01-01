package com.qa.tests;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class DemoTest2 {
	@Test
	public void add() {
		System.out.println("SUM");
		int a = 10;
		int  b = 20;
		Assert.assertEquals(30, a+b);
	}
	@Test
	public void Sub() {
		System.out.println("SUB");
		int a = 10;
		int  b = 20;
		Assert.assertEquals(10, b-a);
	}
	@Test
	public void multi() {
		System.out.println("MULTI");
		int a = 10;
		int  b = 20;
		Assert.assertEquals(200, a*b);
	}
	@Test
	public void div() {
		System.out.println("DIV");
		int a = 10;
		int  b = 20;
		Assert.assertEquals(2, b/a);
	}

}
