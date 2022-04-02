package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class BugChangeStatusPage extends PageBase {
    //Mapping
    By addNoteTextArea = By.name("bugnote_text");
    By newIssueButton = By.cssSelector("input[value='New Issue']");

    //Actions
    public void preencherAdicionarNota(String text) {
        sendKeys(addNoteTextArea, text);
    }

    public void clicarNoBotaoNewIssue() {
        click(newIssueButton);
    }
}
