$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/feature/Automation.feature");
formatter.feature({
  "line": 1,
  "name": "Automation practice",
  "description": "This includes Login and Signup Functionality",
  "id": "automation-practice",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Verify User logins the application",
  "description": "",
  "id": "automation-practice;verify-user-logins-the-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User launches the Automation application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User enters the username",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User enters the password",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user clicks on Signin",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefenetion.user_launches_the_Facebook_application()"
});
formatter.result({
  "duration": 7465996700,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefenetion.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 1703230200,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefenetion.user_enters_the_username()"
});
formatter.result({
  "duration": 1503168300,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefenetion.user_enters_the_password()"
});
formatter.result({
  "duration": 451759800,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefenetion.user_clicks_on_Signin()"
});
formatter.result({
  "duration": 2648708800,
  "status": "passed"
});
});