package gov.gsa.sam.locators;

import org.openqa.selenium.By;

public class MyWorkspace {
	
	public static final By clickFAQs =  By.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[3]/div/workspace-cms/div/div/workspace-widget/div/div[2]/div[1]/div[2]/a");
	//public static final By clickFAQs =  By.xpath("//a[@href='/cm/faqs?order=desc&amp']");
	public static final By newReleaseNote =By.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[2]/div[2]/div[1]/div[1]/a");
	public static final By withinLastDays = By.xpath("//*[@id=\"passed\"]");
    public static final By scheduled = By.xpath("//*[@id=\"scheduled\"]");
   // public static final By withinLastDaysCount = By.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[3]/div/workspace-administration/div/div[1]/workspace-widget/div/fh-widget/div/div/div[2]/div/a[1]/div");
    public static final By withinLastDaysCount = By.xpath("//*[@id=\"workspace-widgets\"]/div[5]/workspace-administration/div/div[1]/workspace-widget/div/fh-widget/div/div/div[2]/div/a[1]/div");
    
    //public static final By scheduledCount = By.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[3]/div/workspace-administration/div/div[1]/workspace-widget/div/fh-widget/div/div/div[2]/div/a[2]/div");
   public static final By scheduledCount = By.xpath("//*[@id=\"workspace-widgets\"]/div[5]/workspace-administration/div/div[1]/workspace-widget/div/fh-widget/div/div/div[2]/div/a[2]/div");
                                                      //*[@id="workspace-widgets"]/div[5]/workspace-administration/div/div[1]/workspace-widget/div/fh-widget/div/div/div[2]/div/a[2]/div
    
    //public static final By organizationsStarted = By.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[3]/div/workspace-administration/div/div[1]/workspace-widget/div/fh-widget/div/div/div[2]/div/a[1]");
    public static final By organizationsStarted = By.xpath("//*[@id=\"workspace-widgets\"]/div[5]/workspace-administration/div/div[1]/workspace-widget/div/fh-widget/div/div/div[2]/div/a[1]");
    
    public static final By organizations = By.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[3]/div/workspace-administration/div/div[1]/workspace-widget/div/fh-widget/div/div/div[2]/div/a[2]");
    public static final By organizationsEventsResults = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div[3]/div[2]/list-results-message");
    
    public static final By workspace = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div[1]/div/a");
    public static final By createDept1 = By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[1]/button"); 
    //public static final By scheduledToStart = By.xpath("//*[@id=\"main-container\"]/ng-component/page/div/div/div[3]/div/workspace-administration/div/div[1]/workspace-widget/div/fh-widget/div/div/div[2]/div/a[1]");
    
    //public static final By scheduledToStart = By.xpath("//*[@id=\"workspace-widgets\"]/div[5]/workspace-administration/div/div[1]/workspace-widget/div/fh-widget/div/div/div[2]/div/a[2]");
    
    public static final By scheduledToStart = By.xpath("//*[@id=\"workspace-widgets\"]/div[5]/workspace-administration/div/div[1]/workspace-widget/div/fh-widget/div/div/div[2]/div/a[2]");
                                                      
    
    
    public static final By scheduledToStartCount = By.xpath("//*[@id=\"workspace-widgets\"]/div[5]/workspace-administration/div/div[1]/workspace-widget/div/fh-widget/div/div/div[2]/div/a[2]/div");
    
    
  //*[@id="workspace-widgets"]/div[5]/workspace-administration/div/div[1]/workspace-widget/div/fh-widget/div/div/div[2]/div/a[1]/div
  }
