package com.softserve.edu.opencart.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.softserve.edu.opencart.data.IUser;
import com.softserve.edu.opencart.data.UserRepository;
import com.softserve.edu.opencart.pages.user.HomePage;
import com.softserve.edu.opencart.pages.user.account.EditAccountPage;

public class LoginTest extends RemoteTestRunner {

    @DataProvider //(parallel = true)
    public Object[][] customers() {
        return new Object[][] {
                { UserRepository.get().getDefault() },
                //{ UserRepository.get().getHahaha() },
        };
    }

    @Test(dataProvider = "customers")
    public void checkSuccessful(IUser validUser) {
        // Test Data
        // User validUser = UserRepository.getDefault();
        //
        // Steps
        EditAccountPage editAccountPage = loadApplication()
                .gotoLoginPage()
                .successfulLogin(validUser)
                .gotoEditAccountRight();
        presentationSleep();
        //
        // Check
        Assert.assertEquals(editAccountPage.getFirstNameFieldText(),
                validUser.getFirstname());
        //
        // Return to Previous State
        HomePage homePage = editAccountPage
                .gotoContinue() // optional
                .gotoLogoutRight()
                .gotoContinue();
        //
        // Check (optional)
        //Assert.assertFalse(ApplicationStatus.get().isLogged());
        Assert.assertTrue(homePage
                .getSlideshow0FirstImageAttributeSrcText()
                .contains(HomePage.EXPECTED_IPHONE6));
        presentationSleep();
    }

}
