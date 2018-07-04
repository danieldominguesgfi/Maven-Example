import static org.junit.jupiter.api.Assertions.*;

import org.junit.internal.runners.statements.Fail;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class AutomationTest {

	@Test
	void test() {
		System.setProperty("webdriver.gecko.driver",
                "C:\\GFI Automation\\Maven-Example\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:8080/maven-project/Index.jsp");
		driver.findElement(By.id("inputEmail")).sendKeys("rui@gmail.com");
		driver.findElement(By.id("inputPassword")).sendKeys("123qwe");
		driver.findElement(By.id("btnSubmit")).click();
		String welcome ="Welcome Rui you are Logged in!";
		String welcome1 = driver.findElement(By.xpath("//*[@id=\"div1\"]")).getText();
		if(welcome1.equals(welcome)) {
			driver.close();
		}else {
			driver.close();
			fail("ERROR");			
		}
	}

}
