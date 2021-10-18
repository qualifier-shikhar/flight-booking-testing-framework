/**
 * @author: Shikhar Joshi
 * @date: 10/11/2021
 */

package com.flight.booking.pages;

import com.flight.booking.utilities.Base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage extends Base{
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

    public void register(String firstname, String lastname, String phone, String username, String email, String password, String passwordConfirm) {
        Base.waitForElement(selectCountry);
        Select select = new Select(selectCountry);
        this.firstname.sendKeys(firstname);
        this.lastname.sendKeys(lastname);
        this.phone.sendKeys(phone);
        this.username.sendKeys(username);
        select.selectByValue("INDIA");
        this.email.sendKeys(email);
        this.password.sendKeys(password);
        this.passwordConfirm.sendKeys(passwordConfirm);
        submit.click();
    }

    public void registrationConfirm() {
        Base.waitForElement(flights);
        flights.click();
    }
}
