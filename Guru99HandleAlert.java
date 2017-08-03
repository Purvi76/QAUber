import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Guru99HandleAlert {

	public static void main(String[] args) throws InterruptedException {
	FirefoxDriver driver = new FirefoxDriver();
	driver.get(" http://demo.guru99.com/v4/");
	
	driver.findElement(By.name("uid")).sendKeys("mngr91340");
	driver.findElement(By.name("password")).sendKeys("yqUjYje");
    driver.findElement(By.name("btnLogin")).submit();
    driver.findElement(By.linkText("Delete Customer")).click();
    Thread.sleep(5000);
    driver.findElement(By.name("cusid")).sendKeys("99145");
    driver.findElement(By.name("AccSubmit")).click();
    
    Alert a = driver.switchTo().alert();
    String text = a.getText();
    System.out.println(text);
    a.accept();
    
	}

}
