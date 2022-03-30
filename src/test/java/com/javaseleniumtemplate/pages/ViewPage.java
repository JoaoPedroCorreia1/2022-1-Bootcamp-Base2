package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class ViewPage extends PageBase {
    //Mapping
    By issueSummary = By.cssSelector(
            "table:nth-child(6) > tbody > tr:nth-child(11) > td:nth-child(2)");

    //Actions
    public String getSummary() {
        return getText(issueSummary);
    }
}
