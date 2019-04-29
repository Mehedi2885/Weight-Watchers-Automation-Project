package com.ww.qa.pages;

import com.ww.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    @FindBy(className = "find-a-meeting")
    WebElement clickOnFindStudio;



    //Initializing the Page Objects:
    public HomePage(){
        PageFactory.initElements(driver, this);
    }


    // Actions
    public String validateHomePageTitle()  {
        return driver.getTitle();

    }
    public FindAStudioPage  clickStudioButton(){
        clickOnFindStudio.click();
        return new FindAStudioPage();

    }
}
