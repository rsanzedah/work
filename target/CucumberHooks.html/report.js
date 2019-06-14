$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/smoke_features/federalHierarchy.feature");
formatter.feature({
  "name": "High leavel Smoketing",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.scenario({
  "name": "Log into the GSA website",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeTest"
    },
    {
      "name": "@otp1"
    }
  ]
});
formatter.step({
  "name": "user has an account in login dot gov domain",
  "keyword": "Given "
});
formatter.match({
  "location": "FederalHierarchyStepDef.user_has_an_account_in_login_dot_gov_domain()"
});
formatter.result({
  "error_message": "org.openqa.selenium.SessionNotCreatedException: session not created: This version of ChromeDriver only supports Chrome version 76\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027I04TCC-GF3X120\u0027, ip: \u0027172.28.16.42\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_191\u0027\nDriver info: driver.version: ChromeDriver\nremote stacktrace: Backtrace:\n\tOrdinal0 [0x00FC7B13+1473299]\n\tOrdinal0 [0x00F4AC61+961633]\n\tOrdinal0 [0x00ED41A3+475555]\n\tOrdinal0 [0x00E6F365+62309]\n\tOrdinal0 [0x00E6BC77+48247]\n\tOrdinal0 [0x00E88FD9+167897]\n\tOrdinal0 [0x00E88BAD+166829]\n\tOrdinal0 [0x00E872BB+160443]\n\tOrdinal0 [0x00E70AE6+68326]\n\tOrdinal0 [0x00E71A80+72320]\n\tOrdinal0 [0x00E71A19+72217]\n\tOrdinal0 [0x00F64A27+1067559]\n\tGetHandleVerifier [0x010666F5+506677]\n\tGetHandleVerifier [0x01066490+506064]\n\tGetHandleVerifier [0x0106D038+533624]\n\tGetHandleVerifier [0x01066ECA+508682]\n\tOrdinal0 [0x00F5C116+1032470]\n\tOrdinal0 [0x00F5BF8F+1032079]\n\tOrdinal0 [0x00F6693B+1075515]\n\tOrdinal0 [0x00F66AA3+1075875]\n\tOrdinal0 [0x00F65A55+1071701]\n\tBaseThreadInitThunk [0x760B8494+36]\n\tRtlAreBitsSet [0x773941C8+136]\n\tRtlAreBitsSet [0x77394198+88]\n\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$new$0(W3CHandshakeResponse.java:57)\r\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$getResponseFunction$2(W3CHandshakeResponse.java:104)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$0(ProtocolHandshake.java:123)\r\n\tat java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)\r\n\tat java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:958)\r\n\tat java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:126)\r\n\tat java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:498)\r\n\tat java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)\r\n\tat java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:471)\r\n\tat java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:152)\r\n\tat java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\r\n\tat java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:464)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:126)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:73)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:136)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:209)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:132)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:181)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:168)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\r\n\tat oldpages.LaunchBrowserUtil.openThisBrowser(LaunchBrowserUtil.java:50)\r\n\tat oldpages.SignInUtility.signIntoCommonWorkspaceWithLoginDotGov(SignInUtility.java:51)\r\n\tat gov.gsa.sam.stepdefinition.FederalHierarchyStepDef.user_has_an_account_in_login_dot_gov_domain(FederalHierarchyStepDef.java:70)\r\n\tat ✽.user has an account in login dot gov domain(src/test/resources/smoke_features/federalHierarchy.feature:9)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "Create department",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeTest"
    },
    {
      "name": "@createDept"
    }
  ]
});
formatter.step({
  "name": "User click on above Go to Federal Hierarchy",
  "keyword": "Given "
});
formatter.match({
  "location": "FederalHierarchyStepDef.User_click_on_above_Go_to_Federal_Hierarchy()"
});
formatter.result({
  "error_message": "java.lang.Error: Unresolved compilation problems: \n\tscenario cannot be resolved to a variable\n\tscenario cannot be resolved to a variable\n\r\n\tat gov.gsa.sam.stepdefinition.FederalHierarchyStepDef.User_click_on_above_Go_to_Federal_Hierarchy(FederalHierarchyStepDef.java:215)\r\n\tat ✽.User click on above Go to Federal Hierarchy(src/test/resources/smoke_features/federalHierarchy.feature:24)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "The user click on createdept button",
  "keyword": "And "
});
formatter.match({
  "location": "FederalHierarchyStepDef.The_user_click_on_createdept_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Navigate into create department page",
  "keyword": "Then "
});
formatter.match({
  "location": "FederalHierarchyStepDef.Navigate_into_create_department_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "The user click on cancel button",
  "keyword": "And "
});
formatter.match({
  "location": "FederalHierarchyStepDef.The_user_click_on_cancel_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "The user click on first link",
  "keyword": "Given "
});
formatter.match({
  "location": "FederalHierarchyStepDef.The_user_click_on_first_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Navigate into federal hierarchy deparment page",
  "keyword": "Then "
});
formatter.match({
  "location": "FederalHierarchyStepDef.Navigate_into_federal_hierarchy_deparment_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "The click on edit button",
  "keyword": "And "
});
formatter.match({
  "location": "FederalHierarchyStepDef.The_click_on_edit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "The click on edit cancel button",
  "keyword": "And "
});
formatter.match({
  "location": "FederalHierarchyStepDef.The_click_on_edit_cancel_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "The user click on create sub tier button",
  "keyword": "Given "
});
formatter.match({
  "location": "FederalHierarchyStepDef.The_user_click_on_create_sub_tier_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "The user click on create sub tier cancel button",
  "keyword": "Then "
});
formatter.match({
  "location": "FederalHierarchyStepDef.The_user_click_on_create_sub_tier_cancel_button()"
});
formatter.result({
  "status": "skipped"
});
});