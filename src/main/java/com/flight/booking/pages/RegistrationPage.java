/**
 * @author: Shikhar Joshi
 * @date: 10/11/2021
 */

package com.flight.booking.pages;

import com.flight.booking.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage extends BasePage{

    @FindBy(name="firstName")
    private WebElement firstname;
    
    @FindBy(name="lastName")
    private WebElement lastname;
    
    @FindBy(name="phone")
    private WebElement phone;
    
    @FindBy(id="userName")
    private WebElement username;

    @FindBy(id="register-btn")
    private WebElement submit;
    
    @FindBy(id="email")
    private WebElement email;

    @FindBy(name="password")
    private WebElement password;

    @FindBy(name="confirmPassword")
    private WebElement passwordConfirm;
    
    @FindBy(name="country")
    private WebElement selectCountry;
 
    @FindBy(id="flight-link")
    private WebElement flights;

    @FindBy(xpath = "/html/body/form/div[1]/ul/li[5]/div/table/tbody/tr[1]/td/h1")
    private WebElement registrationConfirmationHeading;

    public boolean isRegister() {

        ExplicitWaitForWebElement(firstname);
        return firstname.isDisplayed();
    }

    public void register(String firstName, String lastName, String phoneNumber, String userName, String e_mail, String pass_word, String password_Confirm) {
        
        Select select = new Select(selectCountry);
        firstname.sendKeys(firstName);
        lastname.sendKeys(lastName);
        phone.sendKeys(phoneNumber);
        username.sendKeys(userName);
        select.selectByValue("INDIA");
        email.sendKeys(e_mail);
        password.sendKeys(pass_word);
        passwordConfirm.sendKeys(password_Confirm);
        submit.click();
    }

    public String registrationConfirm() {

        ExplicitWaitForWebElement(flights);
		return registrationConfirmationHeading.getText();
    }

    public void lnkFlights() {

        ExplicitWaitForWebElement(flights);
        flights.click();
    }
}
