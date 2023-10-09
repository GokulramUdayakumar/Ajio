package com.ajio.pomrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ajio_04_ProductPage {
	WebDriver driver;

	public Ajio_04_ProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSize() {
		return Size;
	}

	public WebElement getAddToBag() {
		return AddToBag;
	}

	public WebElement getBagIcon() {
		return BagIcon;
	}

	public WebElement getProceedToShipping() {
		return ProceedToShipping;
	}
	
	public WebElement getProceedToPayment() {
		return ProceedToPayment;
	}

	@FindBy(xpath = "(//div[@class='slick-list'])[3]/div/div[1]/div")
	private WebElement Size;

	@FindBy(xpath = "//span[text()='ADD TO BAG']")
	private WebElement AddToBag;

	@FindBy(xpath = "//div[@class='scb']/div[2]/a[@href='/cart']/div[1]")
	private WebElement BagIcon;

	@FindBy(xpath = "//button[text()='Proceed to shipping']")
	private WebElement ProceedToShipping;
	
	@FindBy(xpath = "//div[text()='Proceed to Payment']")
	private WebElement ProceedToPayment;	
}
