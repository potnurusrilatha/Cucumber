package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutOverViewPage extends Utility {
    private static final Logger log = LogManager.getLogger(CheckOutOverViewPage.class.getName());

    //to initialise webelements @findby annotations for this page
    public CheckOutOverViewPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[@id='finish']")
    WebElement finishButton;

    public void clickOnFinish() {
        log.info("Clicking on finish button: " + finishButton.getText());
        pmClickOnElement(finishButton);
    }

}
