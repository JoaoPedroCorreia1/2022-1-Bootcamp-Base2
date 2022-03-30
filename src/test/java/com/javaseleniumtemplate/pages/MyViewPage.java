package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class MyViewPage extends PageBase {
    //Mapping
    By logedInAsLabel = By.cssSelector("td.login-info-left > span.italic");
    By reportIssuesButton = By.linkText("Report Issue");
    By viewIssuesButton = By.linkText("View Issues");

    By projectDropDownList = By.name("project_id");
    By projectSelectedOption = By.cssSelector("option[selected='selected']");
    By projectSwitchButton = By.cssSelector("input[value='Switch']");

    //Actions
    public String getUsuario() {
        return getText(logedInAsLabel);
    }

    public void clicarEmReportIssues() {
        click(reportIssuesButton);
    }

    public void clicarEmViewIssues() {
        click(viewIssuesButton);
    }

    public void selecionarProject(String text) {
        comboBoxSelectByVisibleText(projectDropDownList, text);
    }

    public void clicarNoBotaoSwitchProject() {
        click(projectSwitchButton);
    }

    public String getProjetoSelecionado() {
        return getText(projectSelectedOption);
    }
}
