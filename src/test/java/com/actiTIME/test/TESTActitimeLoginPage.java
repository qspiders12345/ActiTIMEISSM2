package com.actiTIME.test;

import java.io.IOException;
import org.testng.annotations.Test;
import com.actiTIME.generics.BaseTest;
import com.actiTIME.pom.POMActiTIMELoginPage;

public class TESTActitimeLoginPage extends BaseTest
{
	@Test
	public void actitimeLogin() throws IOException
	{
		POMActiTIMELoginPage login=new POMActiTIMELoginPage(driver);
		login.loginMethod();
	}
}