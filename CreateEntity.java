package NewProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateEntity {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get ("http://fits.qauber.com");
		Thread.sleep(3000);
		String url = driver.getCurrentUrl ();
		System.out.println(url);
		WebElement searchtextbox = driver.findElement(By.xpath(".//*[@id='exampleInputEmail1']"));
		searchtextbox.sendKeys("rome@mailinator.com");
		
		WebElement password = driver.findElement(By.xpath(".//*[@id='exampleInputPassword1']"));
		password.sendKeys("qauber2017");
        WebElement loginButton = driver.findElement(By.xpath("html/body/div[2]/div/div/div[1]/div[2]/form/button"));
        loginButton.click();
        Thread.sleep(30000);
        WebElement addReport = driver.findElement(By.xpath("html/body/div[2]/aside[1]/div/nav/ul/li[4]/a/span"));
        addReport.click();
       // Thread.sleep(5000);
        WebElement radioButton = driver.findElement(By.xpath("html/body/div[2]/section/div/div/form/div[1]/div[2]/div[2]/fieldset/div[2]/div/div/label/span"));
        Thread.sleep(30000);
        radioButton.click();
        
        WebElement nextButton = driver.findElement(By.xpath("html/body/div[2]/section/div/div/form/div[1]/div[2]/div[2]/ul/li/a"));
        nextButton.click();
        //WebElement subjectInformation = driver.findElement(By.xpath("html/body/div[2]/section/div/div/form/div[1]/div[2]/ol/li[2]/h3/div"));
       // subjectInformation.click();
        //Thread.sleep(5000);
        WebElement lastName = driver.findElement(By.xpath("html/body/div[2]/section/div/div/form/div[1]/div[2]/div[3]/fieldset/div[2]/div[1]/div/div/input"));
        lastName.sendKeys("Patel");
        WebElement firstName = driver.findElement(By.xpath("html/body/div[2]/section/div/div/form/div[1]/div[2]/div[3]/fieldset/div[2]/div[2]/div/div/input"));
        firstName.sendKeys("Jina");
        Thread.sleep(5000);
        WebElement gangMembership = driver.findElement(By.xpath("html/body/div[2]/section/div/div/form/div[1]/div[2]/ol/li[5]/h3"));
        Thread.sleep(5000);
        gangMembership.click();
        
        WebElement locationOfStop = driver.findElement(By.xpath("html/body/div[2]/section/div/div/form/div[1]/div[2]/div[6]/fieldset[2]/div[2]/div/div/div/input"));
        locationOfStop.sendKeys("Pune");
        Thread.sleep(3000);
        WebElement preview = driver.findElement(By.xpath("html/body/div[2]/section/div/div/form/div[1]/div[2]/ol/li[8]/h3/div"));
        preview.click();
        
	}

}
