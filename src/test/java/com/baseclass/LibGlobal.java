package com.baseclass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {

	public static WebDriver driver;
	//1
	public static void getDriver() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			}
	//2
	public static void loadUrl(String url) {
				driver.get(url);
				}
	//3
	public static  void maximize() {
				driver.manage().window().maximize();
				}
	//3
	public void type(WebElement element,String data) {
				element.sendKeys(data);
				}
	//4
	public static void click(WebElement element) {
				element.click();
				}
	//5
	public WebElement findElementById(String data) {
				WebElement element = driver.findElement(By.id(data));
				return element;
				}
	//6
	public WebElement findElementByXpath(String data) {
				WebElement element = driver.findElement(By.xpath(data));
				return element;
				}
	//7
	public WebElement findElementByName(String data) {
				WebElement element = driver.findElement(By.name(data));
				return element;
				}
	//8
	public WebElement findElementByClassName(String data) {
				WebElement element = driver.findElement(By.className(data));
				return element;
				}
	//9
	public String getTitle() {
				String title = driver.getTitle();
				return title;
				}
	//10
	public String getEnteredUrl() {
				String currentUrl = driver.getCurrentUrl();
				return currentUrl;
				
				}
	public String gettext(WebElement element) {
		String text = element.getText();
		return text;
	
	}
	
	//11
	public String getAttribute(WebElement element) {
				String name = element.getAttribute("value");
				return name;
				}
	//12
	public String getAttribute(WebElement element,String attributename) {
				String name = element.getAttribute(attributename);
				return name;
				}
	//13
	public void selectOptionByText(WebElement element, String data) {
				Select select = new Select(element);
				select.selectByVisibleText(data);
				}
	//14
	public void selectOptionByValue(WebElement element, String data) {
				Select select = new Select(element);
				select.selectByVisibleText(data);
				}
	//15
	public void selectOptionByIndex(WebElement element, int index) {
				Select select = new Select(element);
				select.selectByIndex(index);
	
	}	
	
	public static void alert() {
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
}
	

}
