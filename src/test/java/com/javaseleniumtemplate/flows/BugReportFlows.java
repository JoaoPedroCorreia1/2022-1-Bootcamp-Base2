package com.javaseleniumtemplate.flows;

import com.javaseleniumtemplate.pages.BugReportPage;

import java.util.List;

public class BugReportFlows {
    //Objects and constructor
    BugReportPage bugReportPage;

    public BugReportFlows() {
        //Page and Steps Objects
        bugReportPage = new BugReportPage();
    }

    //Flows
    public int criarIssueRetornaId(List<String> issue) {
        //select project
        bugReportPage.selecionarProject(issue.get(0));
        bugReportPage.clicarEmSelectProject();

        //enter report details
        bugReportPage.selecionarCategory(issue.get(1));
        bugReportPage.selecionarReproducibility(issue.get(2));
        bugReportPage.selecionarSeverity(issue.get(3));
        bugReportPage.selecionarPriority(issue.get(4));
        bugReportPage.selecionarProfile(issue.get(5));

        bugReportPage.selecionarAssingTo(issue.get(6));
        bugReportPage.preencherSummary(issue.get(7));
        bugReportPage.preecherDescription(issue.get(8));
        bugReportPage.preecherStepsToReproduce(issue.get(9));
        bugReportPage.preecherAdditionalInformation(issue.get(10));

        bugReportPage.subirArquivo(issue.get(11));

        bugReportPage.selecionarViewStatus(issue.get(12));
        bugReportPage.selecionarReportStay(issue.get(13));

        bugReportPage.clicarEmSubmitReport();

        return bugReportPage.getIssueId();
    }
}
