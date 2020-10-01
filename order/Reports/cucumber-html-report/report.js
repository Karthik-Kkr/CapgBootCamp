$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/OrderMs.feature");
formatter.feature({
  "name": "To Test the OrderMs Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To Test the Order Function of OrderMs",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "To launch the browser and Navigate to the Url",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "To Enter the Order Details",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "To Click the Submit button",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});