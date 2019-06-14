$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/createDepartment.feature");
formatter.feature({
  "name": "Create and Editing department and sub tier",
  "description": "\t1) Create department\n         2) Editing department\n         3) Create sub tier\n         4) Editing sub tier",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@DepartmentCreated"
    }
  ]
});
formatter.scenario({
  "name": "Log into the GSA website",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@DepartmentCreated"
    },
    {
      "name": "@otp"
    }
  ]
});
formatter.step({
  "name": "The user enters environment department COMP_HOME_PAGE",
  "keyword": "And "
});
formatter.match({
  "location": "CreateDepartmentStepDef.the_user_enters_a_URL1(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user click on department sign in link",
  "keyword": "And "
});
formatter.match({
  "location": "CreateDepartmentStepDef.the_user_click_on_sign_in_link1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Then click on department accept button",
  "keyword": "And "
});
formatter.match({
  "location": "CreateDepartmentStepDef.then_click_accept_button1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enters the department email id createDepartment",
  "keyword": "And "
});
formatter.match({
  "location": "CreateDepartmentStepDef.the_user_enters_the_email_id1(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enters the department password alertadminPassword",
  "keyword": "And "
});
formatter.match({
  "location": "CreateDepartmentStepDef.the_user_enters_the_password1(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user click on department sign in button",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateDepartmentStepDef.the_user_click_on_sign_in_button1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user want to receive your one time department password myEmail",
  "keyword": "And "
});
formatter.match({
  "location": "CreateDepartmentStepDef.the_user_want_to_receive_your_one_time_password1(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enters department one time access code",
  "keyword": "And "
});
formatter.match({
  "location": "CreateDepartmentStepDef.the_user_enters_one_time_access_code1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user click on department one time submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateDepartmentStepDef.the_user_click_on_one_time_submit_button1()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Account name",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@DepartmentCreated"
    },
    {
      "name": "@profile"
    }
  ]
});
formatter.step({
  "name": "Go to profile page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginDepartmentSubTierOfficeAdminStepDef.Go_to_profile_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Reading details in account details page",
  "keyword": "And "
});
formatter.match({
  "location": "CreateDepartmentStepDef.Reading_details_in_account_details_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on the workspace",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateDepartmentStepDef.Click_on_the_workspace()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Create department",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@createDepartment"
    }
  ]
});
formatter.step({
  "name": "Click on above Go to Federal Hierarchy link",
  "keyword": "Given "
});
formatter.step({
  "name": "The user click on create department button",
  "keyword": "Then "
});
formatter.step({
  "name": "The user enters department name \u003cDepartmentName\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "The user enters start month \u003cstartMonth\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "The user enters start day \u003cstartDay\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "The user enters start year \u003cstartYear\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "The user enters end month \u003cendMonth\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "The user enters end day \u003cendDay\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "The user enters end year \u003cendYear\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "The user enters fh Description data \u003cDescriptionData\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "The user enters short Name \u003cshortName\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "The user enters fh Agency codes \u003cAgencyCode\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "The user enters fh CGAC code \u003cCGAC\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "The user enters CFDA code \u003cCFDA\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "The user enters fh TAS code \u003cTAS\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "The User click on the department confirm button",
  "keyword": "Then "
});
formatter.step({
  "name": "The User click on the confirmation department Submit button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "DepartmentName",
        "startMonth",
        "startDay",
        "startYear",
        "endMonth",
        "endDay",
        "endYear",
        "DescriptionData",
        "shortName",
        "AgencyCode",
        "CGAC",
        "CFDA",
        "TAS"
      ]
    },
    {
      "cells": [
        "Test33",
        "01",
        "08",
        "2021",
        "01",
        "09",
        "2023",
        "testdesc",
        "ShortBoll",
        "2345",
        "345",
        "12",
        "12"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Create department",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@DepartmentCreated"
    },
    {
      "name": "@createDepartment"
    }
  ]
});
formatter.step({
  "name": "Click on above Go to Federal Hierarchy link",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateDepartmentStepDef.click_on_above_go_to_Federal_Hierarchy_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user click on create department button",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateDepartmentStepDef.the_User_Click_On_Create_Department_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enters department name Test33",
  "keyword": "And "
});
formatter.match({
  "location": "CreateDepartmentStepDef.the_User_Enters_Department_Name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enters start month 01",
  "keyword": "And "
});
formatter.match({
  "location": "CreateDepartmentStepDef.the_User_Enter_Start_Month(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enters start day 08",
  "keyword": "And "
});
formatter.match({
  "location": "CreateDepartmentStepDef.The_User_Enters_Start_Day(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enters start year 2021",
  "keyword": "And "
});
formatter.match({
  "location": "CreateDepartmentStepDef.The_User_Enters_Start_Year(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enters end month 01",
  "keyword": "And "
});
formatter.match({
  "location": "CreateDepartmentStepDef.the_User_Enters_End_Month(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enters end day 09",
  "keyword": "And "
});
formatter.match({
  "location": "CreateDepartmentStepDef.the_User_Enters_End_Day(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enters end year 2023",
  "keyword": "And "
});
formatter.match({
  "location": "CreateDepartmentStepDef.the_User_Enters_End_Year(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enters fh Description data testdesc",
  "keyword": "And "
});
formatter.match({
  "location": "CreateDepartmentStepDef.the_User_Enters_Description_data(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enters short Name ShortBoll",
  "keyword": "And "
});
formatter.match({
  "location": "CreateDepartmentStepDef.the_User_Enters_Short_Name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enters fh Agency codes 2345",
  "keyword": "And "
});
formatter.match({
  "location": "CreateDepartmentStepDef.the_User_Enters_Agency_Code(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enters fh CGAC code 345",
  "keyword": "And "
});
formatter.match({
  "location": "CreateDepartmentStepDef.the_User_Enters_CGAC_Code(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enters CFDA code 12",
  "keyword": "And "
});
formatter.match({
  "location": "CreateDepartmentStepDef.the_User_Enters_CFDA_Code(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enters fh TAS code 12",
  "keyword": "And "
});
formatter.match({
  "location": "CreateDepartmentStepDef.the_User_Enters_TAS_Code(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The User click on the department confirm button",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateDepartmentStepDef.the_User_Click_On_The_Department_Confirm_Buttone()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The User click on the confirmation department Submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateDepartmentStepDef.the_User_Click_On_The_Confirmation_Department_Submit_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Edit Department",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@editDepartment"
    }
  ]
});
formatter.step({
  "name": "User click on edit agency details button",
  "keyword": "Given "
});
formatter.step({
  "name": "The user enters edit end month \u003ceditEndMonth\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "The user enters edit end day \u003ceditEndDay\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "The user enters edit end year \u003ceditEndYear\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "The user enters edit Description data \u003ceditDescriptionData\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "The user enters edit short Name \u003cshortName\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User click on edit agency details submit button",
  "keyword": "Then "
});
formatter.step({
  "name": "User click on edit agency code button",
  "keyword": "Then "
});
formatter.step({
  "name": "The user enters edit Agency codes \u003cAgency\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "The user enters edit CGAC code \u003cCGAC\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "The user enters edit CFDA code \u003cCFDA\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User click on edit agency code submit button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "editEndMonth",
        "editEndDay",
        "editEndYear",
        "editDescriptionData",
        "shortName",
        "CGAC",
        "Agency",
        "CFDA"
      ]
    },
    {
      "cells": [
        "01",
        "09",
        "2022",
        "Second Test11",
        "Second Name",
        "987",
        "VFGH",
        "6"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Edit Department",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@DepartmentCreated"
    },
    {
      "name": "@editDepartment"
    }
  ]
});
formatter.step({
  "name": "User click on edit agency details button",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateDepartmentStepDef.user_Click_On_Edit_Agency_Details_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enters edit end month 01",
  "keyword": "And "
});
formatter.match({
  "location": "CreateDepartmentStepDef.the_User_Enters_Edit_End_Month(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enters edit end day 09",
  "keyword": "And "
});
formatter.match({
  "location": "CreateDepartmentStepDef.the_User_Enters_Edit_End_Day(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enters edit end year 2022",
  "keyword": "And "
});
formatter.match({
  "location": "CreateDepartmentStepDef.the_User_Enters_Edit_End_Year(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enters edit Description data Second Test11",
  "keyword": "And "
});
formatter.match({
  "location": "CreateDepartmentStepDef.the_User_Enters_Edit_Description_data(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enters edit short Name Second Name",
  "keyword": "And "
});
formatter.match({
  "location": "CreateDepartmentStepDef.the_User_Enters_Edit_Short_Name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on edit agency details submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateDepartmentStepDef.user_Click_On_Edit_Agency_Details_Submit_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on edit agency code button",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateDepartmentStepDef.user_Click_On_Edit_Agency_Code_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enters edit Agency codes VFGH",
  "keyword": "And "
});
formatter.match({
  "location": "CreateDepartmentStepDef.the_User_Enters_Edit_Agency_Codes(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enters edit CGAC code 987",
  "keyword": "And "
});
formatter.match({
  "location": "CreateDepartmentStepDef.the_User_Enters_Edit_CGAC_Code(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enters edit CFDA code 6",
  "keyword": "And "
});
formatter.match({
  "location": "CreateDepartmentStepDef.the_User_Enters_Edit_CFDA_Codes(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on edit agency code submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateDepartmentStepDef.user_Click_On_Edit_Agency_Code_Submit_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Create Sub Tier",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@createSubTier"
    }
  ]
});
formatter.step({
  "name": "Click on Create Sub Tier",
  "keyword": "Given "
});
formatter.step({
  "name": "The user enters sub Tier details \u003cSubTierName\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "The user enters sub tier start month \u003cstartMonth\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "The user enters sub tier start day \u003cstartDay\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "The user enters sub tier start year \u003cstartYear\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "The user enters sub tier end month \u003cendMonth\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "The user enters sub tier end day \u003cendDay\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "The user enters sub tier end year \u003cendYear\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "The user enters sub tier short name \u003cshortName\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "The user enters sub tier Agency codes \u003cagencyCode\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "The User click on the sub tier confirm button",
  "keyword": "Then "
});
formatter.step({
  "name": "The User click on the sub tier edit button",
  "keyword": "Then "
});
formatter.step({
  "name": "The User click on the sub tier submit button",
  "keyword": "Then "
});
formatter.step({
  "name": "The User click on the confirmation sub tier Submit button",
  "keyword": "When "
});
formatter.step({
  "name": "User navigate to sub Tier profile page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "SubTierName",
        "startMonth",
        "startDay",
        "startYear",
        "endMonth",
        "endDay",
        "endYear",
        "shortName",
        "agencyCode"
      ]
    },
    {
      "cells": [
        "Test13",
        "01",
        "08",
        "2022",
        "1",
        "09",
        "2019",
        "ShortBoll",
        "103"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Create Sub Tier",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@DepartmentCreated"
    },
    {
      "name": "@createSubTier"
    }
  ]
});
formatter.step({
  "name": "Click on Create Sub Tier",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateDepartmentStepDef.click_on_create_subTier()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enters sub Tier details Test13",
  "keyword": "And "
});
formatter.match({
  "location": "CreateDepartmentStepDef.the_user_enters_sub_tier_detail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enters sub tier start month 01",
  "keyword": "And "
});
formatter.match({
  "location": "CreateDepartmentStepDef.the_user_enters_sub_tier_start_month(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enters sub tier start day 08",
  "keyword": "And "
});
formatter.match({
  "location": "CreateDepartmentStepDef.the_user_enters_sub_tier_start_day(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enters sub tier start year 2022",
  "keyword": "And "
});
formatter.match({
  "location": "CreateDepartmentStepDef.the_user_enters_sub_tier_start_year(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enters sub tier end month 1",
  "keyword": "And "
});
formatter.match({
  "location": "CreateDepartmentStepDef.the_user_enters_sub_tier_end_month(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enters sub tier end day 09",
  "keyword": "And "
});
formatter.match({
  "location": "CreateDepartmentStepDef.the_user_enters_sub_tier_end_day(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enters sub tier end year 2019",
  "keyword": "And "
});
formatter.match({
  "location": "CreateDepartmentStepDef.the_user_enters_sub_tier_end_year(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enters sub tier short name ShortBoll",
  "keyword": "And "
});
formatter.match({
  "location": "CreateDepartmentStepDef.the_user_enters_sub_tier_short_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enters sub tier Agency codes 103",
  "keyword": "And "
});
formatter.match({
  "location": "CreateDepartmentStepDef.the_user_enters_sub_tier_Agency_codes(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The User click on the sub tier confirm button",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateDepartmentStepDef.the_user_click_on_the_sub_tier_confirm_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The User click on the sub tier edit button",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateDepartmentStepDef.the_User_click_on_the_sub_tier_edit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The User click on the sub tier submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateDepartmentStepDef.the_user_click_on_the_sub_tier_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The User click on the confirmation sub tier Submit button",
  "keyword": "When "
});
