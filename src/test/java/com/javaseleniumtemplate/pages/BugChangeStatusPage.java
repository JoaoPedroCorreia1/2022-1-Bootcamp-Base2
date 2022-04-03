package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class BugChangeStatusPage extends PageBase {
    //Mapping
    By addNoteTextArea = By.name("bugnote_text");
    By newIssueButton = By.cssSelector("input[value='New Issue']");
    By requestFeedbackButton = By.cssSelector("input[value='Request Feedback']");
    By acknowledgeIssueButton = By.cssSelector("input[value='Acknowledge Issue']");
    By confirmIssueButton = By.cssSelector("input[value='Confirm Issue']");
    By resolveIssueButton = By.cssSelector("input[value='Resolve Issue']");
    By closeIssueButton = By.cssSelector("input[value='Close Issue']");

    //Actions
    public void preencherAdicionarNota(String text) {
        sendKeys(addNoteTextArea, text);
    }

    public void clicarNoBotaoNewIssue() {
        click(newIssueButton);
    }

    public void clicarNoBotaoRequestFeedback () {
        click(requestFeedbackButton);
    }

    public void clicarNoBotaoAcknowledgeIssue() {
        click(acknowledgeIssueButton);
    }

    public void clicarNoBotaoConfirmIssue() {
        click(confirmIssueButton);
    }

    public void clicarNoBotaoResolveIssue() {
        click(resolveIssueButton);
    }

    public void clicarNoBotaoCloseIssue() {
        click(closeIssueButton);
    }
}
