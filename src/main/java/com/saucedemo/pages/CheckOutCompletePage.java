package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutCompletePage extends Utility {
    private static final Logger log = LogManager.getLogger(CheckOutCompletePage.class.getName());

    //to initialise webelements @findby annotations for this page
    public CheckOutCompletePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='THANK YOU FOR YOUR ORDER']")
    WebElement thankYouMessageLink;

    public void verifyingMessage() {
        log.info("Verifying the message: " + thankYouMessageLink.getText());
        Assert.assertTrue(thankYouMessageLink.getText().equalsIgnoreCase("Thank you for your order"));
    }
}
