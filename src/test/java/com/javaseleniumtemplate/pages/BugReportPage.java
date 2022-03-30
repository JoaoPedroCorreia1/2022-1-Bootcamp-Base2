package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.GlobalParameters;
import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

import java.util.Arrays;

public class BugReportPage extends PageBase {
    //Mapping
    // select project page
    By chooseProjectDropDownList = By.name("project_id");
    By selectProjectButton = By.cssSelector("input[value='Select Project']");

    //report issue page
    By categoryDropDownList = By.name("category_id");
    By reproducibilityDropDownList = By.name("reproducibility");
    By severityDropDownList = By.name("severity");
    By priorityDropDownList = By.name("priority");
    By selectProfileDropDownList = By.name("profile_id");
    By assignToDropDownList = By.name("handler_id");

    By summaryTextLabel = By.name("summary");

    By descriptionTextArea = By.name("description");
    By stepsToReproduceTextArea = By.name("steps_to_reproduce");
    By additionalInformationTextArea = By.name("additional_info");

    By chooseFileButton = By.id("ufile[]");

    By viewStatusRadioPublic = By.cssSelector("input[name='view_state'][value='10']");
    By viewStatusRadioPrivate = By.cssSelector("input[name='view_state'][value='50']");

    By reportStayCheckBox = By.id("report_stay");

    By submitReportButton = By.className("button");

    //sucess page
    By operationSuccesfulMessage = By.cssSelector("div[align='center']");
    By issueIdMessage = By.partialLinkText("View Submitted Issue");

    //Actions
    // select project page
    public void clicarEmSelectProject() {
        click(selectProjectButton);
    }

    public void selecionarProject(String text) {
        comboBoxSelectByVisibleText(chooseProjectDropDownList, text);
    }

    //report issue page
    public void selecionarCategory(String text) {
        comboBoxSelectByVisibleText(categoryDropDownList, text);
    }

    public void selecionarReproducibility(String text) {
        comboBoxSelectByVisibleText(reproducibilityDropDownList, text);
    }

    public void selecionarSeverity(String text) {
        comboBoxSelectByVisibleText(severityDropDownList, text);
    }

    public void selecionarPriority(String text) {
        comboBoxSelectByVisibleText(priorityDropDownList, text);
    }

    public void selecionarProfile(String text) {
        comboBoxSelectByVisibleText(selectProfileDropDownList, text);
    }

    public void selecionarAssingTo(String text) {
        comboBoxSelectByVisibleText(assignToDropDownList, text);
    }

    public void preencherSummary(String text) {
        sendKeys(summaryTextLabel, text);
    }

    public void preecherDescription(String text) {
        sendKeys(descriptionTextArea, text);
    }

    public void preecherStepsToReproduce(String text) {
        sendKeys(stepsToReproduceTextArea, text);
    }

    public void preecherAdditionalInformation(String text) {
        sendKeys(additionalInformationTextArea, text);
    }

    public void subirArquivo(String filePath) {
        filePath = GlobalParameters.RESOURCES_PATH + filePath;
        sendKeys(chooseFileButton, filePath);
    }

    public void selecionarViewStatus(String opcao) {
        clickButtonByOptions(
                new By[]{viewStatusRadioPublic, viewStatusRadioPrivate},
                Arrays.asList("publico", "privado"),
                opcao
        );
    }

    public void selecionarReportStay(String opcao) {
        clickButtonIfOpcaoAtivado(reportStayCheckBox, opcao);
    }

    public void clicarEmSubmitReport() {
        click(submitReportButton);
    }

    //sucess page
    public String getMensagemDeSucesso() {
        return getText(operationSuccesfulMessage);
    }

    public int getIssueId() {
        String idMessage = getText(issueIdMessage);
        idMessage.replace("View Submitted Issue ", "");

        int id = Integer.parseInt(idMessage);

        return id;
    }
}
