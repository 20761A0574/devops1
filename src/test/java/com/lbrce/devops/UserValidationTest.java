package com.lbrce.devops;
import org.testng.Assert;
import org.testng.annotations.Test;
public class UserValidationTest {
	
		@Test

		public void testCase1()

		{

			UserValidation uv=new UserValidation();

			Assert.assertEquals(false,uv.check("",""));

		}

		public void testCase2()

		{

			UserValidation uv=new UserValidation();

			Assert.assertEquals(false,uv.check("sravanthi","sravanthi44"));

		}

		public void testCase3()

		{

			UserValidation uv=new UserValidation();

			Assert.assertEquals(true,uv.check("sravanthi","sravanthi45"));

		}

		public void testCase4()

		{

			UserValidation uv=new UserValidation();

			Assert.assertEquals(false,uv.check("sravanthi","sravanthi46"));

		}
		public void testCase5()

		{

			UserValidation uv=new UserValidation();

			Assert.assertEquals(true,uv.check("sravanthi","sravanthi43"));

		}

	}