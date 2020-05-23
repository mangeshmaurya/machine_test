package com.test.pages;

import com.test.util.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileNotFoundException;

public class LoginPage extends TestBase {

    @FindBy(xpath="//*[text()='Hello, Sign in']")
    WebElement singInButton;

    @FindBy(xpath = "//*[@id='createAccountSubmit' and @class='a-button-text']")
    WebElement createAccountButton;

    @FindBy(xpath="//*[@id='ap_customer_name']")
    WebElement nameTextBox;

    @FindBy(xpath="//*[@id='ap_phone_number']")
    WebElement mobileNoTextBox;

    @FindBy(xpath="//*[@id='ap_email' and @type='email']")
    WebElement emailAddTextBox;

    @FindBy(xpath="//*[@id='ap_password' and @type='password']")
    WebElement passwordTextBox;

    @FindBy(xpath = "//*[@id='continue' and @type='submit']")
    WebElement submitButton;

    @FindBy(xpath = "//*[@class='a-list-item']")
    WebElement errorMessage;

    public LoginPage() throws FileNotFoundException {
        PageFactory.initElements(driver,this);
    }

    public void clickSingIn(){singInButton.click();}

    public void clickSignUp(){createAccountButton.click();}

    public void signUp(String name, String mobilenumber, String emailaddress, String password){
        nameTextBox.sendKeys(name);
        mobileNoTextBox.sendKeys(mobilenumber);
        emailAddTextBox.sendKeys(emailaddress);
        passwordTextBox.sendKeys(password);
        submitButton.click();
    }

    public boolean validateErrorMessage(){
        boolean isUserSignUp = false;

         if (errorMessage != null)
             isUserSignUp = errorMessage.getText().contains("Your provided Email m@m.com has already been used. Please use another Email address.");

        return isUserSignUp;
    }


}
