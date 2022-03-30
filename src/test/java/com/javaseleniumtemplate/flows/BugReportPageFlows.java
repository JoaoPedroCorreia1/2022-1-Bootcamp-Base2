package com.javaseleniumtemplate.flows;

import com.javaseleniumtemplate.dto.IssueDTO;
import com.javaseleniumtemplate.pages.BugReportPage;

public class BugReportPageFlows {
    //Objects and constructor
    BugReportPage bugReportPage;

    public BugReportPageFlows() {
        //Page and Steps Objects
        bugReportPage = new BugReportPage();
    }

    //Flows
    public int criarIssueRetornaId(IssueDTO issueDTO) {
        //select project
        bugReportPage.selecionarProject(issueDTO.getProject());
        bugReportPage.clicarEmSelectProject();

        //enter report details
        bugReportPage.selecionarCategory(issueDTO.getCategory());
        bugReportPage.selecionarReproducibility(issueDTO.getReproducibility());
        bugReportPage.selecionarSeverity(issueDTO.getSeverity());
        bugReportPage.selecionarPriority(issueDTO.getPriority());
        bugReportPage.selecionarProfile(issueDTO.getSelectProfile());

        bugReportPage.selecionarAssingTo(issueDTO.getAssignTo());
        bugReportPage.preencherSummary(issueDTO.getSummary());
        bugReportPage.preecherDescription(issueDTO.getDescription());
        bugReportPage.preecherStepsToReproduce(issueDTO.getStepsToReproduce());
        bugReportPage.preecherStepsToReproduce(issueDTO.getAdditionalInformation());

        bugReportPage.subirArquivo(issueDTO.getChosenFile());

        bugReportPage.selecionarViewStatus(issueDTO.getViewStatus());
        bugReportPage.selecionarReportStay(issueDTO.getReportStay());

        bugReportPage.clicarEmSubmitReport();

        return bugReportPage.getIssueId();
    }
}
