package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class ViewPage extends PageBase {
    //Mapping
    //first block
    By issueProject = By.cssSelector(
            "table:nth-child(6) > tbody > tr:nth-child(3) > td:nth-child(2)");
    By issueCategory = By.cssSelector(
            "table:nth-child(6) > tbody > tr:nth-child(3) > td:nth-child(3)");
    By issueViewStatus = By.cssSelector(
            "table:nth-child(6) > tbody > tr:nth-child(3) > td:nth-child(4)");
    By issueDateSubmitted = By.cssSelector(
            "table:nth-child(6) > tbody > tr:nth-child(3) > td:nth-child(5)");
    By issueLastUpdate = By.cssSelector(
            "table:nth-child(6) > tbody > tr:nth-child(3) > td:nth-child(6)");

    //second block
    By issueReporter = By.cssSelector(
            "table:nth-child(6) > tbody > tr:nth-child(5) > td:nth-child(2)");
    By issueAssignedTo = By.cssSelector(
            "table:nth-child(6) > tbody > tr:nth-child(6) > td:nth-child(2)");
    By issuePriority = By.cssSelector("tr:nth-child(7) > td:nth-child(2)");
    By issueSeverity = By.cssSelector("tr:nth-child(7) > td:nth-child(4)");
    By issueReproducibility = By.cssSelector("tr:nth-child(7) > td:nth-child(6)");
    By issueStatus = By.cssSelector("tr:nth-child(8) > td:nth-child(2)");
    By issueResolution = By.cssSelector("tr:nth-child(8) > td:nth-child(4)");
    By issuePlatform = By.cssSelector("tr:nth-child(9) > td:nth-child(2)");
    By issueOS = By.cssSelector("tr:nth-child(9) > td:nth-child(4)");
    By issueOSVersion = By.cssSelector("tr:nth-child(9) > td:nth-child(6)");

    //third block
    By issueSummary = By.cssSelector("tr:nth-child(11) > td:nth-child(2)");
    By issueDescription = By.cssSelector("tr:nth-child(12) > td:nth-child(2)");
    By issueStepsToReproduce = By.cssSelector("tr:nth-child(13) > td:nth-child(2)");
    By issueAdditionalInformation = By.cssSelector("tr:nth-child(14) > td:nth-child(2)");
    By issueTags = By.cssSelector("tr:nth-child(15) > td:nth-child(2)");

    //fourth block
    By issueAttachedFiles = By.cssSelector("td:nth-child(2) > a:nth-child(2)");

    By statusDropDownList = By.name("new_status");
    By changeStatusToButton = By.cssSelector("input[value='Change Status To:']");

    //upload file
    By chooseFileButton = By.name("ufile[]");
    By uploadFileButton = By.cssSelector("input[value='Upload File']");

    //notes
    By firstNote = By.cssSelector(
            "tr[class='bugnote']:nth-child(2) > td[class='bugnote-note-public']");
    By secondNote = By.cssSelector(
            "tr[class='bugnote']:nth-child(4) > td[class='bugnote-note-public']");
    By thirdNote = By.cssSelector(
            "tr[class='bugnote']:nth-child(6) > td[class='bugnote-note-public']");
    By fourthNote = By.cssSelector(
            "tr[class='bugnote']:nth-child(8) > td[class='bugnote-note-public']");
    By fifthNote = By.cssSelector(
            "tr[class='bugnote']:nth-child(10) > td[class='bugnote-note-public']");
    By sixthNote = By.cssSelector(
            "tr[class='bugnote']:nth-child(12) > td[class='bugnote-note-public']");
    By seventhNote = By.cssSelector(
            "tr[class='bugnote']:nth-child(14) > td[class='bugnote-note-public']");

    //Actions
    //first block
    public String getProject() {
        return getText(issueProject);
    }

    public String getCategory() {
        return getText(issueCategory);
    }

    public String getViewStatus() {
        return getText(issueViewStatus);
    }

    public String getDateSubmitted() {
        return getText(issueDateSubmitted);
    }

    public String getLastUpdate() {
        return getText(issueLastUpdate);
    }

    //second block
    public String getReporter() {
        return getText(issueReporter);
    }

    public String getAssignedTo() {
        return getText(issueAssignedTo);
    }

    public String getPriority() {
        return getText(issuePriority);
    }

    public String getSeverity() {
        return getText(issueSeverity);
    }

    public String getReproducibility() {
        return getText(issueReproducibility);
    }

    public String getStatus() {
        return getText(issueStatus);
    }

    public String getResolution() {
        return getText(issueResolution);
    }

    public String getPlatform() {
        return getText(issuePlatform);
    }

    public String getOS() {
        return getText(issueOS);
    }

    public String getOSVersion() {
        return getText(issueOSVersion);
    }

    //third block
    public String getSummary() {
        return getText(issueSummary);
    }

    public String getDescription() {
        return getText(issueDescription);
    }

    public String getStepsToReproduce() {
        return getText(issueStepsToReproduce);
    }

    public String getAdditionalInformation() {
        return getText(issueAdditionalInformation);
    }

    public String getTags() {
        return getText(issueTags);
    }

    //fourth block
    public String getAttachedFiles() {
        return getText(issueAttachedFiles);
    }

    public void selecionarNovoStatus(String text) {
        comboBoxSelectByVisibleText(statusDropDownList, text);
    }

    public void clicarEmMudarDeEstado() {
        click(changeStatusToButton);
    }

    //upload file
    public void escolherArquivo(String filePath) {
        sendKeys(chooseFileButton, filePath);
    }

    public void clicarEmFazerUpload() {
        click(uploadFileButton);
    }

    //notes
    public String getFirstNote() {
        return getText(firstNote);
    }

    public String getSecondNote() {
        return getText(secondNote);
    }

    public String getThirdNote() {
        return getText(thirdNote);
    }

    public String getFourthNote() {
        return getText(fourthNote);
    }

    public String getFifthNote() {
        return getText(fifthNote);
    }

    public String getSixthNote() {
        return getText(sixthNote);
    }

    public String getSeventhNote() {
        return getText(seventhNote);
    }
}
