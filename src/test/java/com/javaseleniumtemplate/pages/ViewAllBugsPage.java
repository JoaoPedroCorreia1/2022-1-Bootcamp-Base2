package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class ViewAllBugsPage extends PageBase {
    //Mapping
    By searchTextInput = By.cssSelector(
            "tr:nth-child(11) > td:nth-child(1) > input[name='search']");
    By applyFilterButton = By.cssSelector(
            " tr:nth-child(11) > td:nth-child(1) > input[name='filter']");

    By firstIssueListedLink = By.cssSelector(
            "tr:nth-child(4) > td:nth-child(4) > a");

    //Actions
    public void preencherCampoSearch(String text) {
        sendKeys(searchTextInput, text);
    }

    public void clicarNoFilterButton() {
        click(applyFilterButton);
    }

    public void clicarNaPrimeiraIssueListada() {
        click(firstIssueListedLink);
    }
}
