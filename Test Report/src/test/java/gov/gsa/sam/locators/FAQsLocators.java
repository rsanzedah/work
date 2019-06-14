package gov.gsa.sam.locators;

import org.openqa.selenium.By;

public class FAQsLocators {

	public static final By newFAQ =By.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div[2]/div[1]/div[1]/a");
	public static final By question = By.xpath("//*[@id=\"title\"]");
	public static final By response = By.xpath("//*[@id=\"definition\"]");
	public static  final By dispayFAQInHomePage = By.xpath("//*[@id=\"toggle faq\"]");
}
