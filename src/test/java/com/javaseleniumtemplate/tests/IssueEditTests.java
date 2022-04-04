package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.BugReportFlows;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.flows.ViewAllBugsFlows;
import com.javaseleniumtemplate.pages.BugUpdatePage;
import com.javaseleniumtemplate.pages.MyViewPage;
import com.javaseleniumtemplate.pages.ViewPage;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class IssueEditTests extends TestBase {
    //Objects
    LoginFlows loginFlows;
    BugReportFlows bugReportFlows;
    ViewAllBugsFlows viewAllBugsFlows;

    MyViewPage myViewPage;
    ViewPage viewPage;
    BugUpdatePage bugUpdatePage;

    //Tests
    @Test
    public void editarIssueComSucesso() {
        //Massa de dados
        List<String> editIssue = Arrays.asList(
                "Daniella Maleski's Project",

                "[All Projects] Teste JoaoSilva",
                "always",
                "feature",
                "low",
                "Desktop Windows 10",

                "joao.silva",
                "Summary to edit",
                "Description to edit",
                "1. Step to edit."
                        + "\n" + "2. Step to edit."
                        + "\n" + "3. Step to edit.",
                "Additional information to edit",
                "/files/anexoExemplo.PNG",
                "public",
                "desativado"
        );

        //Objects instances
        loginFlows = new LoginFlows();
        bugReportFlows = new BugReportFlows();
        viewAllBugsFlows = new ViewAllBugsFlows();

        myViewPage = new MyViewPage();
        viewPage = new ViewPage();
        bugUpdatePage = new BugUpdatePage();

        //Parameteres
        String usuario = "joao.silva";
        String senha = "09111999";

        String categoryEdited = "[All Projects] Teste JoaoSilva Editado";

        String priorityEdited = "normal";
        String severityEdited = "text";
        String reproducibilityEdited = "sometimes";
        String resolutionEdited = "unable to reproduce";
        String plataformEdited = "Notebook";
        String osEdited = "Ubuntu";
        String osVersion = "21.04";

        String summaryEdited = "Summary edited";
        String descriptionEdited = "Description edited";
        String stepsToReproduceEdited = "1. Step edited."
                + "\n" + "2. Step edited."
                + "\n" + "3. Step edited.";
        String additionalInformationEdited = "Additional information edited";

        String addNote = "File has been edited";

        //Before
        loginFlows.efetuarLogin(usuario, senha);
        myViewPage.clicarEmReportIssues();
        int issueId = bugReportFlows.criarIssueRetornaId(editIssue);
        myViewPage.navegateToPage();
        myViewPage.clicarEmViewIssues();
        viewAllBugsFlows.localizarIssue(String.valueOf(issueId));

        //Test
        viewPage.clicarEmEditar();
        bugUpdatePage.selecionarCategory(categoryEdited);

        bugUpdatePage.selecionarPriority(priorityEdited);
        bugUpdatePage.selecionarSeverity(severityEdited);
        bugUpdatePage.selecionarReproducibility(reproducibilityEdited);
        bugUpdatePage.selecionarResolution(resolutionEdited);
        bugUpdatePage.preencherPlataform(plataformEdited);
        bugUpdatePage.preencherOS(osEdited);
        bugUpdatePage.preencherOSVersion(osVersion);

        bugUpdatePage.preencherSummary(summaryEdited);
        bugUpdatePage.preecherDescription(descriptionEdited);
        bugUpdatePage.preecherStepsToReproduce(stepsToReproduceEdited);
        bugUpdatePage.preecherAdditionalInformation(additionalInformationEdited);

        bugUpdatePage.preencherAddNote(addNote);

        bugUpdatePage.clicarNoBotaoUpdateInformation();

        Assert.assertTrue(viewPage.getCategory().equals(categoryEdited));

        Assert.assertTrue(viewPage.getPriority().equals(priorityEdited));
        Assert.assertTrue(viewPage.getSeverity().equals(severityEdited));
        Assert.assertTrue(viewPage.getReproducibility().equals(reproducibilityEdited));
        Assert.assertTrue(viewPage.getResolution().equals(resolutionEdited));
        Assert.assertTrue(viewPage.getPlatform().equals(plataformEdited));
        Assert.assertTrue(viewPage.getOS().equals(osEdited));
        Assert.assertTrue(viewPage.getOSVersion().equals(osVersion));

        Assert.assertTrue(viewPage.getSummary().contains(summaryEdited));
        Assert.assertTrue(viewPage.getDescription().equals(descriptionEdited));
        Assert.assertTrue(viewPage.getStepsToReproduce().equals(stepsToReproduceEdited));
        Assert.assertTrue(viewPage.getAdditionalInformation().equals(additionalInformationEdited));

        Assert.assertTrue(viewPage.getFirstNote().equals(addNote));
    }
}
