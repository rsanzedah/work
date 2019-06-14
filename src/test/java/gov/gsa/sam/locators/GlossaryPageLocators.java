package gov.gsa.sam.locators;

import org.openqa.selenium.By;

public class GlossaryPageLocators {

	public static final By clickGlossary = By.xpath("//*[@id=\"workspace-widgets\"]/div[7]/workspace-cms/div/div/workspace-widget/div/div[2]/div[1]/div[1]/a");
			//*[@id=\"main-container\"]/ng-component/page/div/div/div[3]/div/workspace-cms/div/div/workspace-widget/div/div[2]/div[1]/div[1]/a");
	        
	
	public static final By selectNew = By.xpath("//*[@id=\"New\"]");
	public static final By clearFilter = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div[1]/sidebar/content-management-sidenav/div/div[4]/span/a");
	public static final By clickPublised = By.xpath("//*[@id=\"Published\"]");
	public static final By clickDraft = By.xpath("//*[@id=\"Draft\"]");
	public static final By clickArchived = By.xpath("//*[@id=\"Archived\"]");
	public static final By searchBox = By.xpath("//*[@id=\"search-term\"]");
	public static final By newGlossary = By
			.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div[2]/div[1]/div[1]/a");
	public static final By dataField = By.xpath("//*[@id=\"title\"]");
	public static final By definition = By.xpath("//*[@id=\"definition\"]");
	public static final By source = By.xpath("//*[@id=\"source\"]");
	public static final By domain = By.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div/form-only/div/div/div/div[2]/div[2]/sam-tabs/sam-tab[1]/div/div[4]/sam-autocomplete-multiselect/div/sam-label-wrapper/div/div[2]/div[2]/div");
	public static final By glossaryDone = By.xpath("//*[@id=\"question-done\"]");
	public static final By keyword = By.xpath("//*[@id=\"keywords-ac-textarea\"]");
	public static final By linkGlossary = By.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[1]/div/sam-breadcrumbs/ul/li[2]/a");
     public static final By breadCrumbs1 = By.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[1]/div/sam-breadcrumbs/ul/li[1]/a");
     public static final By breadCrumbs2 = By.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[1]/div/sam-breadcrumbs/ul/li[2]/span");
     public static final By ascendingOrder  = By.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div[2]/div[1]/div[1]/sam-sort/div/a/i");
     public static final By descendingOrder  = By.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div[2]/div[1]/div[1]/sam-sort/div/a/i");
     public static final By clickWorkSpace = By
			.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[1]/div/sam-breadcrumbs/ul/li[1]/a");
	public static final By clickGlossaryAction = By.xpath("//button[@class='usa-button']");
	public static final By clickGlossaryPublish = By.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/sam-actions-dropdown/div/ul/li[1]/button/span[2]");
	public static final By publishText = By.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div");
	public static final By publishName = By.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/h4/a");
	public static final By clickGlossaryEdit = By.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/sam-actions-dropdown/div/ul/li[1]/button/span[2]");
	public static final By editDefinition = By.xpath("//*[@id=\"definition\"]");
	public static final By editTextarea = By.xpath("//*[@id=\"keywords-ac-textarea\"]");
	public static final By clickArchive = By.xpath("//button[@class='usa-button']//*[text()='Archive']");
	public static final By clickUnArchive = By.xpath("//button[@class='usa-button']//*[text()='Unarchive']");
	public static final By clickPublished = By.xpath("//button[@class='usa-button']//*[text()='Publish']");
	public static final By editDone = By.xpath("//*[@id=\"question-done\"]");
	///////////////////////////////////////////////
	public static final By clickFAQSLink = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/page/div/div/div[3]/div/workspace-cms/div/div/workspace-widget/div/div[2]/div[1]/div[2]/a");
	public static final By clickReleaselink = By.xpath(
			"//*[@id=\"workspace-widgets\"]/div[7]/workspace-cms/div/div/workspace-widget/div/div[2]/div[2]/div[2]/a");
	
	public static final By clickVideosLink = By.xpath(
			"//*[@id=\"main-container\"]/ng-component/page/div/div/div[3]/div/workspace-cms/div/div/workspace-widget/div/div[2]/div[2]/div[1]/a");
	public static final By footerReleaseLink = By.xpath("//*[@id=\"sam-footer\"]/div/div/nav/ul/li[2]/ul/li[2]/a");

}
