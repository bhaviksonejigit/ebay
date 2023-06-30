$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/QA/SeleniumWorkSpace/Ebay-BDD/src/main/java/features/login.feature");
formatter.feature({
  "name": "ebay Login feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "ebay login Test scenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginstepDefinition.user_is_already_on_Login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "title of loginpage is ebay",
  "keyword": "When "
});
formatter.match({
  "location": "LoginstepDefinition.title_of_loginpage_is_ebay()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "search button is present",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginstepDefinition.search_button_is_present()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters abc in searchwindow",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginstepDefinition.user_enters_abc_in_searchwindow()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on search button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginstepDefinition.user_clicks_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginstepDefinition.user_close_broweser()"
});
formatter.result({
  "status": "passed"
});
});