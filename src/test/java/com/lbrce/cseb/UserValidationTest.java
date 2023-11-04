package com.lbrce.cseb;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserValidationTest {
	@Test
	public void testCase1()
	{
		UserValidation uv=new UserValidation();
		Assert.assertEquals(true,uv.check("srikanth", "sri@123"));
	}
	@Test
	public void testCase2()
	{
		UserValidation uv=new UserValidation();
		Assert.assertEquals(false,uv.check("Srinu", "Srinu@12345"));
	}
}
