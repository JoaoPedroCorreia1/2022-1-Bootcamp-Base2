package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class BugUpdatePage extends PageBase {
    //Mapping
    //ID block
    By categoryDropDownList = By.name("category_id");

    //Reporter block
    By priorityDropDownList = By.name("priority");
    By severityDropDownList = By.name("severity");
    By reproducibilityDropDownList = By.name("reproducibility");
    By resolutionDropDownList = By.name("resolution");
    By plataformTextInput = By.id("platform");
    By osTextInput = By.id("os");
    By osVersionTextInput = By.id("os_build");

    //Summary block
    By summaryTextInput = By.name("summary");
    By descriptionTextArea = By.name("description");
    By stepsToReproduceTextArea = By.name("steps_to_reproduce");
    By additionalInformationTextArea = By.name("additional_information");

    //Add note block
    By addNoteTextArea = By.name("bugnote_text");

    By updateInformationButton = By.className("button");

    //Actions
    //ID block
    public void selecionarCategory(String text) {
        comboBoxSelectByVisibleText(categoryDropDownList, text);
    }

    //Reporter block
    public void selecionarPriority(String text) {
        comboBoxSelectByVisibleText(priorityDropDownList, text);
    }

    public void selecionarSeverity(String text) {
        comboBoxSelectByVisibleText(severityDropDownList, text);
    }

    public void selecionarReproducibility(String text) {
        comboBoxSelectByVisibleText(reproducibilityDropDownList, text);
    }

    public void selecionarResolution(String text) {
        comboBoxSelectByVisibleText(resolutionDropDownList, text);
    }

    public void preencherPlataform(String text) {
        clearKeys(plataformTextInput);
        sendKeys(plataformTextInput, text);
    }

    public void preencherOS(String text) {
        clearKeys(osTextInput);
        sendKeys(osTextInput, text);
    }

    public void preencherOSVersion(String text) {
        clearKeys(osVersionTextInput);
        sendKeys(osVersionTextInput, text);
    }

    //Summary block
    public void preencherSummary(String text) {
        clearKeys(summaryTextInput);
        sendKeys(summaryTextInput, text);
    }

    public void preecherDescription(String text) {
        clearKeys(descriptionTextArea);
        sendKeys(descriptionTextArea, text);
    }

    public void preecherStepsToReproduce(String text) {
        clearKeys(stepsToReproduceTextArea);
        sendKeys(stepsToReproduceTextArea, text);
    }

    public void preecherAdditionalInformation(String text) {
        clearKeys(additionalInformationTextArea);
        sendKeys(additionalInformationTextArea, text);
    }

    //Add note block
    public void preencherAddNote(String text) {
        sendKeys(addNoteTextArea, text);
    }

    public void clicarNoBotaoUpdateInformation() {
        click(updateInformationButton);
    }


}
