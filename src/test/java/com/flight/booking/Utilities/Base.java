/**
 * @author: Shikhar Joshi
 * @date: 10/11/2021
 */

package com.flight.booking.Utilities;

import org.openqa.selenium.support.PageFactory;

public class Base {
	public Base() {
        PageFactory.initElements(DriverContext.driver, this);
    }
}
