$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("newtour_page_verification.feature");
formatter.feature({
  "line": 1,
  "name": "Newtour Login Window",
  "description": "",
  "id": "newtour-login-window",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5109697703,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verify Login field is displayed",
  "description": "",
  "id": "newtour-login-window;verify-login-field-is-displayed",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@MT001"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "the user on the newtour homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters \"username\" and \"password\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user clicks sign-in button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "verify Find a Flight page title",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDefs.the_user_on_the_newtour_homepage()"
});
formatter.result({
  "duration": 888484472,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 13
    },
    {
      "val": "password",
      "offset": 28
    }
  ],
  "location": "HomePageStepDefs.user_enters_and(String,String)"
});
formatter.result({
  "duration": 845821380,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefs.user_clicks_sign_in_button()"
});
formatter.result({
  "duration": 15368919026,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefs.verify_Find_a_Flight_page_title()"
});
formatter.result({
  "duration": 24640827,
  "status": "passed"
});
formatter.after({
  "duration": 138348,
  "status": "passed"
});
});