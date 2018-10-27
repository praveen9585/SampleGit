package SampleTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleTest {
@Test
	public void logintest() throws IOException{
		WebDriver wd=new FirefoxDriver();
		wd.get("https://www.bing.com/");
		WebElement search=wd.findElement(By.xpath("html/body/table/tbody/tr/td/div/div[2]/div[2]/form/div[1]/input[1]"));
		search.sendKeys("abc");
		File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		FileUtils.copyDirectory(src, new File("C:\\seleniumWorkspace\\WebDriverTest\\Screenshot"));
	}
}

