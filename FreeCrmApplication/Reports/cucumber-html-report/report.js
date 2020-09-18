$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/FreeCrm.feature");
formatter.feature({
  "name": "To test the FreeCrm Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To test the login functionality of FreeCrm",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "To launch the browser and Navigate to the Url",
  "keyword": "Given "
});
formatter.match({
  "location": "com.step_definition.FreeCrmLoginSteps.to_launch_the_browser_and_Navigate_to_the_Url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To Enter Username and Password",
  "keyword": "When "
});
formatter.match({
  "location": "com.step_definition.FreeCrmLoginSteps.to_Enter_Username_and_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To Click the Submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.step_definition.FreeCrmLoginSteps.to_Click_the_Submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To Take the Screenshot and the Title",
  "keyword": "Then "
});
formatter.match({
  "location": "com.step_definition.FreeCrmLoginSteps.to_Take_the_Screenshot_and_the_Title()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To open home page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.step_definition.FreeCrmLoginSteps.to_open_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To open calender page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.step_definition.FreeCrmLoginSteps.to_open_calender_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To open contacts page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.step_definition.FreeCrmLoginSteps.to_open_contacts_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To open companies page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.step_definition.FreeCrmLoginSteps.to_open_companies_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To open deals page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.step_definition.FreeCrmLoginSteps.to_open_deals_page()"
});
formatter.result({
  "status": "passed"
});
});