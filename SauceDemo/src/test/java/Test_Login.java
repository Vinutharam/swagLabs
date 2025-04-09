import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.saucedemo.baseclass.Base;
import com.saucedemo.pageobjects.LoginPage;

public class Test_Login extends Base {

	LoginPage loginpg;

	public Test_Login() throws IOException {
		super();

	}

	@BeforeMethod
	public void setup() throws IOException {
		initialize();
		loginpg = new LoginPage();
		

	}

	@Test
	public void logintest() {

		loginpg.login(prop.getProperty("username"), prop.getProperty("password"));

	}

	@AfterTest
	public void close() {
		driver.close();
	}
}
