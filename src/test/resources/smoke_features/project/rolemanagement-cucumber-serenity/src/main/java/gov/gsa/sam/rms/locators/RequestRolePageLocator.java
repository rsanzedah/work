package gov.gsa.sam.rms.locators;

import org.openqa.selenium.By;

public class RequestRolePageLocator {
	public static final By COMMENT_TEXTBOX = By.className("sam-text-area");
	public static final By SUPERVISOR_NAME_TEXTBOX = By.id("supervisor-name");
	public static final By SUPERVISOR_EMAIL_TEXTBOX = By.id("supervisor-email");
	public static final By ROLE_SELECTOR = By.id("role-select");
	public static final By ORGPICKER_TEXTAREA = By.id("request-access-org-pickerpicker");
	public static final By ORG_SELECTOR = By.className("multiple-values");
	public static final By CONTAINER = By
			.xpath("//*[@id=\"main-container\"]/ng-component/form-only/div/div/div/div[3]");
	public static final By DOMAINDROPDOWN_ICON = By.className("fa-chevron-down");
	public static final By DOMAIN_SELECTOR = By.className("category-item");
	public static final By SUBMIT_BUTTON = By.id("done-button");
	public static final By PENDING_REQUESTS = By.linkText("1 pending role request");
	public static final By PENDING = By.linkText("Pending");
	public static final By ERRORMESSAGE_SUPERVISOR_NAME = By.id("supervisor-name-error");
	public static final By ERRORMESSAGE_SUPERVISOR_EMAIL = By.id("supervisor-email");
	public static final By ERRORMESSAGE_ORG = By.id("request-access-org-pickerpicker-error");
	public static final By ERRORMESSAGE_ROLE = By.id("role-select-error");
	public static final By ERRORMESSAGE_DOMAIN = By.id("domain-ac-textarea-error");
	public static final By ERRORMESSAGE_ADDITIONALDETAILS = By.id("additional-details-error");
}
