Feature:SignUp

Scenario: The user signup with wrong email address
Given User opens the browser and browse Amazon website
Then User click on SignIn button
Then User click on create your account button
Then User try to signup by filling name, mobile number,email and password
Then User verify the error message
And Close the browser