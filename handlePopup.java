import java.util.Set;

//import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class handlePopup {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.globalrph.com/davescripts/popup.htm");
		driver.findElement(By.xpath("html/body/div/center/table/tbody/tr[7]/td/div/table/tbody/tr/td[2]/div[1]/form/table/tbody/tr[4]/td[2]/p/input")).click();
		Set<String> handles = driver.getWindowHandles();
		java.util.Iterator<String> it = handles.iterator();
		
		String mainWindow = it.next();
		String popupWindow = it.next();
	
		driver.switchTo().window(popupWindow);
		WebElement label = driver.findElement(By.xpath("html/body/h2"));
		String text = label.getText();
		System.out.println(text);
		
		driver.switchTo().window(mainWindow);
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
		
		
	}

}
