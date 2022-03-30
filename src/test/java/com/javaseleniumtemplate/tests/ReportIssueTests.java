package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.BugReportPage;
import com.javaseleniumtemplate.pages.LoginPage;
import com.javaseleniumtemplate.pages.MyViewPage;
import org.junit.Assert;
import org.junit.Test;

public class ReportIssueTests extends TestBase {
    //Objects
    LoginPage loginPage;
    MyViewPage myViewPage;
    private String description;

    //Tests
    @Test
    public void criarIssueComSucesso() {
        //Objects instances
        LoginFlows loginFlows = new LoginFlows();
        MyViewPage myViewPage = new MyViewPage();
        BugReportPage bugReportPage = new BugReportPage();

        //Parameteres
        String project = "Daniella Maleski's Project";

        String category = "[All Projects] Teste JoaoSilva";
        String reproducibility = "always";
        String severity = "feature";
        String priority = "low";
        String selectProfile = "Desktop Windows 10";

        String assignTo = "joao.silva";
        String summary = "Feature not working";
        String description = "Feature does not shows web page when clicked";
        String stepsToReproduce = "1. Open main page."
                         + "\n" + "2. Scroll to feature."
                         + "\n" + "3. Click on 'Go To Main Page' button.";
        String additionalInformation = "Feature locks after clicking";

        String chosenFile = "/files/anexoExemplo.PNG";

        String viewStatus = "public";
        String reportStay = "desativado";

        //Before
        loginFlows.efetuarLogin("joao.silva", "09111999");
        myViewPage.clicarEmReportIssues();

        //Test
        //select project
        bugReportPage.selecionarProject(project);
        bugReportPage.clicarEmSelectProject();

        //enter report details
        bugReportPage.selecionarCategory(category);
        bugReportPage.selecionarReproducibility(reproducibility);
        bugReportPage.selecionarSeverity(severity);
        bugReportPage.selecionarPriority(priority);
        bugReportPage.selecionarProfile(selectProfile);
        bugReportPage.selecionarAssingTo(assignTo);

        bugReportPage.preencherSummary(summary);
        bugReportPage.preecherDescription(description);
        bugReportPage.preecherStepsToReproduce(stepsToReproduce);
        bugReportPage.preecherAdditionalInformation(additionalInformation);

        bugReportPage.subirArquivo(chosenFile);

        bugReportPage.selecionarViewStatus(viewStatus);
        bugReportPage.selecionarReportStay(reportStay);

        bugReportPage.clicarEmSubmitReport();

        //sucess page
        Assert.assertTrue(bugReportPage.getMensagemDeSucesso()
                .contains("Operation successful."));
    }
}
