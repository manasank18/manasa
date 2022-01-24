
package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {
WebDriver w;
@Test
public void frameTest() throws InterruptedException {System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manasa k\\Downloads\\chromedriver_win32\\chromedriver.exe");
w = new ChromeDriver();
w.get("http://demo.automationtesting.in/Frames.html");
w.manage().window().maximize();
w.switchTo().frame(0);
w.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("hi");
Thread.sleep(1000);
w.switchTo().defaultContent();w.findElement(By.linkText("Iframe with in an Iframe")).click();w.switchTo().frame(1);
WebElement web = w.findElement(By.xpath("//iframe[@src = 'SingleFrame.html']"));w.switchTo().frame(web);
Thread.sleep(1000);
w.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("hello");
Thread.sleep(1000);
w.switchTo().parentFrame();
System.out.println("switched to parent frame");
w.switchTo().defaultContent();
System.out.println("switched to main frame");w.close();}
}

