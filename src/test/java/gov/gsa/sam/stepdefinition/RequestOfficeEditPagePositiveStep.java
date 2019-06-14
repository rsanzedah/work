package gov.gsa.sam.stepdefinition;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;

//import org.asciidoctor.ast.TableImpl.Rows;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

import net.thucydides.core.annotations.Managed;
import gov.gsa.sam.utils.OfficeType;

public class RequestOfficeEditPagePositiveStep {
	//
	@Managed
	public static WebDriver driver;
	Scenario scenario;

	private static Logger logger = LoggerFactory.getLogger(RequestOfficeEditPagePositiveStep.class);
	static Map<String, OfficeType> officeTypeMap = new HashMap<String, OfficeType>();
	String officeTypeNameFromProfilePage;

	@Before({ "@Browser" })
	public void setUp(Scenario scenario) {
		System.out.println("****Before******" + scenario.getName());
	}

	@Given("^Reading office type values from Profile Page$")
	public void Reading_office_type_values_from_Profile_Page() throws Throwable {
		// OfficeType officeType = new OfficeType();

		Thread.sleep(3000);

		List<WebElement> row = driver
				.findElements(By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div"));
		logger.info("row:" + row.size());
		int rowSize = row.size();
		List<WebElement> col = driver.findElements(
				By.xpath("//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[" + rowSize + "]/div"));
		logger.info("col:" + col.size());
		int col1 = col.size();

		for (int i = 2; i <= rowSize; i++) {
			OfficeType officeType = new OfficeType();
			for (int j = 1; j <= col1; j++) {
				String value = driver.findElement(By.xpath(
						"//*[@id=\"primary-content\"]/ng-component/div/div[1]/div[5]/div[" + i + "]/div[" + j + "]"))
						.getText();

				logger.info("value:" + i + j + value);

				if (j == 2) { // Start Date

					officeType.setOfficeTypeStartDate(value);
				} else if (j == 3) { // End Date

					officeType.setOfficeTypeEndDate(value);
				} else if (j == 4) { // Status

					officeType.setOfficeTypeStatus(value);

				} else if (j == 1) { // officeType
					officeTypeNameFromProfilePage = value;
					officeType.setOfficeTypeName(officeTypeNameFromProfilePage);
				}

				officeTypeMap.put(officeTypeNameFromProfilePage, officeType);
			}
		}

		Set<String> keys = officeTypeMap.keySet();
		System.out.println(keys);
		//System.out.println("*********");

		Set<String> keySet = officeTypeMap.keySet();
		Iterator<String> keySetItr = keySet.iterator();
		while (keySetItr.hasNext()) {
			String currentKey = keySetItr.next();
			OfficeType s2 = officeTypeMap.get(currentKey);
			logger.info(currentKey + ":" + s2);
			//s1.getOfficeTypeStartDate();		
		}
		
		OfficeType s1 = officeTypeMap.get("Financial Assistance Awards");
		logger.info("StartDate FAA: "+s1.getOfficeTypeStartDate());
		OfficeType s2 = officeTypeMap.get("Contract Awards");
		logger.info("CA Status:" +s2.getOfficeTypeStatus());
	}
}
