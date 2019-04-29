package com.ww.qa.pages;

import com.ww.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstLinkPage extends TestBase {


    FirstLinkPage firstLinksPage;



    @FindBy(className ="location__top")
    WebElement linkName;

    @FindBy(className ="schedule-detailed-day")
    WebElement dailySchedule;

    public FirstLinkPage(){

        PageFactory.initElements(driver, this);
    }

    public String verifyLinkName(){

        String linkNameCheck = linkName.getText();
        System.out.println("Name of the link: " + linkNameCheck);
        return linkNameCheck;
    }

    public void todayOperation(){

        String dailyschedule = dailySchedule.getText();
        System.out.println("Todays schedule: " + dailyschedule);

    }


}
