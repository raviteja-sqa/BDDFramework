$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/ravitejaburugupalli/LearnBitch/FreeCRMBDDFramework/src/main/java/Feature/deals.feature");
formatter.feature({
  "line": 1,
  "name": "Deal Data Creation",
  "description": "",
  "id": "deal-data-creation",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "# Scenario outline only for examples"
    }
  ],
  "line": 5,
  "name": "FreeCRM Login Test Scenario",
  "description": "",
  "id": "deal-data-creation;freecrm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User enters username and password",
  "rows": [
    {
      "cells": [
        "ravi",
        "test123"
      ],
      "line": 11
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User is on HomePage",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User moves to new deals page",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User types deals details",
  "rows": [
    {
      "cells": [
        "testdeal",
        "1000",
        "5",
        "10"
      ],
      "line": 16
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Close Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DealStepDefinition.user_already_on_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DealStepDefinition.title_of_login_page_is_Free_CRM()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DealStepDefinition.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DealStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DealStepDefinition.user_is_on_HomePage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DealStepDefinition.user_moves_to_new_deals_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DealStepDefinition.user_types_deals_details(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DealStepDefinition.close_browser()"
});
formatter.result({
  "status": "skipped"
});
});