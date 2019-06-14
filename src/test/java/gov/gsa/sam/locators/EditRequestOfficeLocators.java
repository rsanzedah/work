
package gov.gsa.sam.locators;

import org.openqa.selenium.By;

public class EditRequestOfficeLocators {
	public static final By departmentName = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[2]/title-and-section/div/h1");
	public static final By cgac = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[3]/span[2]/span");
	public static final By agencyName = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[2]/title-and-section/div/h1");
	public static final By agencyCode = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[2]/span[2]/span");
	public static final By SearchFederalHierarchyAdministrative = By.xpath("//*[@id=\\\"main-container\\\"]/ng-component/div/div/div[2]/div/input");
	
	
	public static  final By deptName = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[2]/title-and-section/div/h1");
	public static  final By OfficeDetails = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div[1]/h2");
	public static final By FirstLink = By.xpath("//*[@id=\\\"main-container\\\"]/ng-component/div/div/div[2]/div/i");
	
	//public static  final By  officeDetails = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[2]/title-and-section/div/h1");
	
	public static  final By  EditAAC = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div[2]/span[1]/b");
	public static  final By  EditAACText = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div[2]/span[2]");
	public static  final By EditDepartment = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div[3]/span[1]/b");
	public static  final By EditDepartmentText = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div[3]/span[2]");
	
	public static  final By EditSubTier = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div[4]/span[1]/b") ;
	public static  final By EditSubTierText = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div[4]/span[2]");
	public static  final By EditStartDate = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div[5]/span[1]/b") ;
	public static  final By EditStartDateText = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div[5]/span[2]") ;
	public static  final By EditEndDate = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div[6]/span[1]/b");
	public static  final By EditEndDateText = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div[6]/span[2]");
	
	public static  final By EditShortname = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div[7]/span[1]/b") ;
	//public static  final By EditShortnameText = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div[7]/span[2]/em") ;
	public static  final By EditShortnameText = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div[7]/span[2]") ;
	
	public static  final By EditRegion= By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div[8]/span[1]/b") ;
	//public static  final By EditRegionText = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div[8]/span[2]/em") ;
	public static  final By EditRegionText = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div[8]/span[2]");
	public static  final By OfficeTypes = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[4]/h2");
	public static  final By EndDateText = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[1]/div[3]/b");
	public static  final By  StartDateText = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[1]/div[2]/b");
	public static  final By  EditStatus = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[1]/div[4]/b");
	public static  final By  EditType = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[1]/div[1]/b");

	
	public static  final By EditContractAwards11= By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[2]/div[1]") ;
	public static  final By EditContractAwardsStart11 = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[2]/div[2]") ;
	public static  final By EditContractFundingEnd = By.xpath("");
	public static  final By  EditContractAwardsStartStatus11 = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[2]/div[4]/span");
	
	public static  final By EditContractAwards = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[3]/div[1]");
	public static  final By EditContractAwardsStartDate = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[3]/div[2]");
	public static  final By EditContractAwardsEndDate = By.xpath("");
	public static  final By EditContractAwardsStatus = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[3]/div[4]/span");
	
	public static  final By EditFinancialAssistanceAwards = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[4]/div[1]");
	public static  final By EditFinancialAssistanceAwardsStattDate = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[3]/div[2]");
	public static  final By EditFinancialAssistanceAwardsEndDate = By.xpath("");
	public static  final By EditFinancialAssistanceAwardsStatus = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[4]/div[4]/span");
	public static  final By EditFinancialAssistanceFunding = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[5]/div[1]");
	public static  final By EditFinancialAssistanceFundingStartDate = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[5]/div[2]");
	public static  final By EditFinancialAssistanceFundingEndDate = By.xpath("");
	public static  final By EditFinancialAssistanceFundingStatus = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[5]/div[4]/span");
	public static  final By mailingAddress = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[7]/div[2]/div/span[1]/b"); 
	public static  final By EditmailingAddress1 = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[7]/div[2]/div/span[2]/div[1]");
	public static  final By EditmailingAddress2 = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[7]/div[2]/div/span[2]/div[2]");
	public static  final By EditmailingAddress3 = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[7]/div[2]/div/span[2]/div[3]");
	public static  final By EditmailingAddress4 = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[7]/div[2]/div/span[2]/div[4]");

	public static  final By OfficeAddress = By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[7]/div[1]/h3");
	
	public static final By ACC1  =  By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[6]/div/p[1]");
	public static final By ACC2  =  By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[6]/div/p[2]");
	public static final By  ACC2Text =   By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[6]/div/span");
	
	public static final By  startMonth =   By.xpath("//*[@id=\"ofc-start-date_month\"]");
	public static final By  startDay =   By.xpath("//*[@id=\"ofc-start-date_day\"]");
	public static final By  startYear =   By.xpath("//*[@id=\"ofc-start-date_year\"]");
	public static final By  EditRequest =   By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/div/h1");
	public static final By  EditRequestbody  =   By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/div/div[1]");
	public static final By  EditRequestbody2  =   By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/div/div[2]");
	
	public static final By  CAEndDate  =   By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[2]/div[3]");
	public static final By  FAAEndDate  =   By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[3]/div[3]");
	public static final By  CFEndDate  =   By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[4]/div[3]");
	public static final By  FAFEndDate  =   By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[5]/div[3]");
	public static final By  listOfficeType  =   By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[4]");
	public static final By  listOfficeType1  =   By.className("usa-width-one-whole m_T-4x ng-star-inserted");
	public static final By  EditEnddate  =   By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[3]/div[6]/span[2]");
	
	///////////////////////////////////////////////
	
	public static final By editStartDate1   =   By.xpath("//*[@id=\"ofc-start-date_day\"]");
	public static final By editStartMonth   =   By.xpath("//*[@id=\"ofc-start-date_month\"]");
	public static final By  editStartYear  =   By.xpath("//*[@id=\"ofc-start-date_year\"]");
	public static final By   editAAC =   By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div[6]/div/span");
	public static final By   editName =   By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/section[2]/div[1]/span[2]");
	public static final By   editEmail =   By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/section[2]/div[2]/span[2]");
	public static final By   editPhone =   By.xpath("//*[@id=\"main-container\"]/ng-component/div/div/div[2]/page/div/div/div[2]/div/div[1]/div[2]/div/div[1]/form/section[2]/div[3]/span[2]");
	
	
		
}
