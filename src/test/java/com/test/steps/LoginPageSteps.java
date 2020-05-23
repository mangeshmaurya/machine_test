package com.test.steps;

import com.test.pages.LoginPage;
import com.test.util.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class LoginPageSteps extends TestBase {

    LoginPage loginpage;
    @Given("User opens the browser and browse Amazon website")
    public void user_opens_the_browser_and_browse_Amazon_website() throws FileNotFoundException {
        // Write code here that turns the phrase above into concrete actions
        TestBase.intialization();
        loginpage= new LoginPage();
    }

    @Then("User click on SignIn button")
    public void user_click_on_SignIn_button() {
        // Write code here that turns the phrase above into concrete actions
        loginpage.clickSingIn();
    }

    @Then("User click on create your account button")
    public void user_click_on_create_your_account_button()  {
        // Write code here that turns the phrase above into concrete actions
        loginpage.clickSignUp();
    }

    @Then("User try to signup by filling name, mobile number,email and password")
    public void user_try_to_signup_by_filling_name_mobile_number_email_and_password() throws Throwable  {
        // Write code here that turns the phrase above into concrete actions

        File src=new File("F:\\Test\\TestData\\TestData.xls");
        FileInputStream fis=new FileInputStream(src);
        HSSFWorkbook wb=new HSSFWorkbook(fis);

        HSSFSheet sheet1=wb.getSheetAt(0);

        String name=sheet1.getRow(1).getCell(0).getStringCellValue();
        double mobilenu=sheet1.getRow(1).getCell(1).getNumericCellValue();
        String mobilenumber=String.valueOf(mobilenu);
        String emailaddress=sheet1.getRow(1).getCell(2).getStringCellValue();
        String password=sheet1.getRow(1).getCell(3).getStringCellValue();
        loginpage.signUp(name, mobilenumber, emailaddress, password);
    }

    @Then("User verify the error message")
    public void user_verify_the_error_message()  {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue("Your provided Email m@m.com has already been used. Please use another Email address.",loginpage.validateErrorMessage());
    }

    @And("^Close the browser$")
    public void close_the_browser() {
        driver.close();
    }


    public LoginPageSteps() throws FileNotFoundException {
    }
}
