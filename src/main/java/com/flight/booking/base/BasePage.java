package com.flight.booking.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage extends Base{
    
    public <TPage extends BasePage> TPage As(Class<TPage> pageInstance)
    {
        try
        {
            return (TPage)this;
        }
        catch (Exception e)
        {
            e.getStackTrace();
        }

        return null;
    }

    public void ExplicitWaitForWebElement(WebElement el) {

        WebDriverWait wait = new WebDriverWait(DriverContext.Driver,10);
        wait.until(ExpectedConditions.visibilityOf(el));
    }
}
