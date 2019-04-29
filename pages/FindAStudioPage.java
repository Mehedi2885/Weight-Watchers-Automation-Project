package com.ww.qa.pages;

import com.ww.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindAStudioPage extends TestBase {

    FindAStudioPage findStudiopage;

    @FindBy(id="meetingSearch")
    WebElement clickOnSearch;

    @FindBy(xpath="//button[@class=\"btn spice-translated\"]")
    WebElement clickOnButton;

     public FindAStudioPage(){
        PageFactory.initElements(driver, this);
    }
    public String varifyFindStudioPageTitle(){
        return driver.getTitle();
    }

    public MeetingResultPage searchMetting(){
         clickOnSearch.sendKeys("10011");
         clickOnButton.click();
         return new MeetingResultPage();

    }
}
