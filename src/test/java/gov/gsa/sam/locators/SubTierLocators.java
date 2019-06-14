package gov.gsa.sam.locators;

import org.openqa.selenium.By;

public class SubTierLocators {

	public static final By crateSubTier = By
			.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[1]/button");
	
	 //*[@id="primary-content"]/ng-component/div/div[1]/div[1]/button
	public static final By departmentName = By.xpath("//input[@id='orgName-input']");
	public static final By startMonth = By.xpath("//input[@id='org-start-date_month']");

	public static final By shortName = By.xpath("//*[@id=\"orgShortName-input\"]");
	public static final By agencyCode = By.xpath("//*[@id=\"fpds-input\"]");
	public static final By ombCode = By.xpath("//*[@id=\"omb-input\"]");
	public static final By SubmitsunTier = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/sam-button/button");

	            
	
	public static final By editsubTier = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/button");
	public static final By subTierConfirmation = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/create-org-form/div/div[2]/div/sam-button/button");

	public static final By profile = By.xpath("//*[@id=\"main-container\"]/ng-component/div/aside/div/ul/li[1]/a");
	public static final By editSubTier1 = By
			.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/form/div/button");
	public static final By editSubTier2 = By
			.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/section/sam-button/button");
	public static final By editSubmit1 = By
			.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/form/div[4]/sam-button/button");
	public static final By editSubmit2 = By
			.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/section/sam-button/button");

	public static final By clickFederalHierarchyLink = By
			.xpath("//*[@id=\"main-container\"]/ng-component/div/sam-breadcrumbs/ul/li[2]/a");
	public static final By firstLink = By
			.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[4]/div/div[2]/div/div[2]/div[1]/a");

}
