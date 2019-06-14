package gov.gsa.sam.locators;

import org.openqa.selenium.By;

public class VideoLocators {
	// public static final By clearCookies = By.xpath("//*[@id=\"primary-content\"]/div[2]/button[2]") ;
	public static final By newVideo = By.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div[2]/div[1]/div[1]/a");
	public static final By title =  By.xpath("//*[@id=\"title\"]");
	public static final By description =  By.xpath("//*[@id=\"definition\"]");
	public static final By selectVideo = By.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div/form-only/div/div/div/div[2]/div[2]/sam-tabs/sam-tab[1]/div/div[3]/sam-label-wrapper[1]/div/sam-upload/div/div/div/a");
	public static final By selectCaption = By.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div/form-only/div/div/div/div[2]/div[2]/sam-tabs/sam-tab[1]/div/div[3]/sam-label-wrapper[2]/div/sam-upload/div/div/div/a");
    public static final By clickDone = By.xpath("//*[@id=\"question-done\"]"); 
}
