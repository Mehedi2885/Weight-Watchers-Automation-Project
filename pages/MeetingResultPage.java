package com.ww.qa.pages;

import com.ww.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MeetingResultPage extends TestBase {

    MeetingResultPage meetingResultPage;


    @FindBy(className = "location__distance")
    WebElement locationDistance;

    @FindBy(xpath = "//*[@href=\"/us/find-a-meeting/1180510/ww-studio-flatiron-new-york-ny\"]")
    WebElement firstLocation;


    public MeetingResultPage(){
        PageFactory.initElements(driver, this);
    }

    public void printTitleAndDistance(){

        String getTextValue = firstLocation.getText();
        System.out.println("Title of meeting page: " + getTextValue);


    }

    public FirstLinkPage clickOnFirstlink(){
        //locationDistance.click();
        firstLocation.click();
        return new FirstLinkPage();

    }
}
