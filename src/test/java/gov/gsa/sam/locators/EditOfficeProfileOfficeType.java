package gov.gsa.sam.locators;

import org.openqa.selenium.By;

import gov.gsa.sam.fields.CreateOfficeLocators;

public class EditOfficeProfileOfficeType {
	public static final By  ContractAwards =By.xpath("//*[@id=\"Contract_Awards\"]");
	public static final By  ContractAwardsStart =By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[2]/div[2]");
	public static final By  ContractAwardsEnd =By.xpath("//*[@id=\\\"primary-content\\\"]/ng-component/div/div[1]/div[5]/div[2]/div[3]");
	public static final By  ContractAwardsStatus =By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[2]/div[4]/span");
	
	public static final By   FinancialAssistanceAwards =By.xpath("//*[@id=\"Financial_Assistance_Awards\"]");
	public static final By   FinancialAssistanceAwardsStart =By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[3]/div[2]");
	public static final By   FinancialAssistanceAwardsEnd =By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[3]/div[3]");
	public static final By   FinancialAssistanceAwardsStatus =By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[3]/div[4]/span");
	
	public static final By  ContractFunding =By.xpath("//*[@id=\"Contract_Funding\"]");
	public static final By  ContractFundingStart =By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[4]/div[2]");
	public static final By  ContractFundingEnd =By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[4]/div[3]");
	public static final By  ContractFundingStatus  =By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[4]/div[4]/span");
	
	
	public static final By   FinancialAssistanceFunding =By.xpath("//*[@id=\"Financial_Assistance_Funding\"]");
	public static final By   FinancialAssistanceFundingStart =By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[5]/div[2]");
	public static final By   FinancialAssistanceFundingEnd =By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[5]/div[3]");
	public static final By   FinancialAssistanceFundingStatus =By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[5]/div[4]/span");
	public static final By   EditofficeName =By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[2]/title-and-section/div/h1");
	
	public static final By   EditEndMonth =By.xpath("//*[@id=\"ofc-end-date_month\"]");  
	                                                  //*[@id="ofc-end-date_month"]
	public static final By   EditEndDate =By.xpath("//*[@id=\"ofc-end-date_day\"]");
	public static final By   EditEndYear =By.xpath("//*[@id=\"ofc-end-date_year\"]");
	public static final By   OfficeRegion =By.xpath("//*[@id=\"ofcRegion-input\"]");
	public static final By   ShortName =By.xpath("//*[@id=\"ofcShortName-input\"]");
	
	public static final By   editStreet2 =By.xpath("//*[@id=\"street2-Billing-Address\"]");
	public static final By   officeProfileStreet2 = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[7]/div[2]/div/span[2]");
	
	public static final By ConfirmationMailingAddress =  By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[2]/div[1]/span[2]/div[1]");	
	public static final By ConfirmationMailingCity =  By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[2]/div[1]/span[2]/div[2]");	
	public static final By ConfirmationMailingCountry =  By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[2]/div[1]/span[2]/div[3]");	
	
	public static final By ConfirmationShippingAddress =  By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/span[2]/div[1]");
	public static final By  ConfirmationShippingCity =  By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/span[2]/div[2]");
	public static final By  ConfirmationShippingCountry =  By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/span[2]/div[3]");
	
	
	public static final By ConfirmationBillingAddress  =  By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[2]/div[3]/span[2]/div[1]");
	public static final By ConfirmationBillingCity =  By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[2]/div[3]/span[2]/div[2]");
	public static final By ConfirmationBillingCountry  =  By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div/div[2]/div[3]/span[2]/div[3]");
		
}
