package com.softserve.edu.opencart.pages.user.common;

import org.openqa.selenium.WebDriver;

public abstract class TopPart {

    protected WebDriver driver;
    //
    private DropdownComponent dropdownComponent;
    private GuestDropdown guestDropdown;
    private LoggedDropdown loggedDropdown;

    public TopPart(WebDriver driver) {
        this.driver = driver;
        initElements();
    }

    private void initElements() {
        // init elements
    }

    // Page Object

    // Functional

    // Business Logic

}
