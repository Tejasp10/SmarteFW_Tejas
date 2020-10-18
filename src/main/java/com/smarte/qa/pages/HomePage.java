package com.smarte.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.smarte.qa.base.TestBase;

public class HomePage extends TestBase{
	
		@FindBy(name="q")
		WebElement Searchfield;
		
		@FindBy(xpath="//button[@class='vh79eN']")
		WebElement Searchbtn;
		
		@FindBy(xpath="//button[@class='_2AkmmA _29YdH8']")
		WebElement Closepopupbtn;
		
		@FindBy(xpath = "(//select[@class='fPjUPw'])[2]")
		WebElement PriceRangeDropdown;
		
		@FindBy(xpath="//div[contains(text(),'Processor Brand')]")
		WebElement ProcessorBrandLink;
		
		@FindBy(xpath="//div[contains(text(),'Snapdragon')]/preceding-sibling::div")
		WebElement Processorbrandname;
		
			
		
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void SearchonFlipkart (String Product,String PriceRange,String ProcessorBrand) throws InterruptedException 
	
	{
		Closepopupbtn.click();
		Searchfield.sendKeys(Product);
		Searchbtn.click();
		
		Select dd = new Select(PriceRangeDropdown);
		dd.selectByValue(PriceRange);
		
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ProcessorBrandLink);
		Thread.sleep(500); 		
		ProcessorBrandLink.click();
		
		Processorbrandname.click();
		
		
	}

}
