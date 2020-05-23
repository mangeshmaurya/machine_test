$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\java\\com\\test\\feature\\AmazonTest.feature");
formatter.feature({
  "name": "SignUp",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "The user signup with wrong email address",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User opens the browser and browse Amazon website",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_opens_the_browser_and_browse_Amazon_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on SignIn button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.user_click_on_SignIn_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on create your account button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.user_click_on_create_your_account_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User try to signup by filling name, mobile number,email and password",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.user_try_to_signup_by_filling_name_mobile_number_email_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify the error message",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.user_verify_the_error_message()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});