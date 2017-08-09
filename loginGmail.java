import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;

public class loginGmail {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FireFoxDriver ();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Dwm&osid=1&service=mail&ltmpl=default&rm=false&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		Thread.sleep(3000);
		String url = driver.getCurrentUrl ();
		System.out.println(url);
		WebElement emailField = driver.findElement(By.xpath(".//*[@id='identifierId']"));
	    emailField.sendKeys("purvipatil87@gmail.com");
	    
	    WebElement password = driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input"));
		password.sendKeys("123abc");
		
		WebElement Button =  driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span"));
		Button.click();
		
       Navigation ngv =  driver.navigate();
       ngv.back();
	}

}
