package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.MyViewPage;
import com.javaseleniumtemplate.pages.ViewAllBugsPage;
import com.javaseleniumtemplate.pages.ViewPage;
import org.junit.Assert;
import org.junit.Test;

public class ViewTests extends TestBase {
    //Objects
    LoginFlows loginFlows;
    MyViewPage myViewPage;
    ViewAllBugsPage viewAllBugsPage;
    ViewPage viewPage;

    //Tests
    @Test
    public void localizarIssueEVisualizarDadosDaIssueComSucesso() {
        //Objects instances
        loginFlows = new LoginFlows();
        myViewPage = new MyViewPage();
        viewAllBugsPage = new ViewAllBugsPage();
        viewPage = new ViewPage();

        //Parameters
        String usuario = "joao.silva";
        String senha = "09111999";

        String localizador = "9136";

        String project = "Daniella Maleski's Project";

        String category = "[All Projects] Teste JoaoSilva";
        String viewStatus = "public";
        String dateSubmitted = "2022-03-29 15:01";
        String lastUpdate = "2022-03-29 15:01";

        String reporter = "joao.silva";
        String assignedTo = "joao.silva";
        String priority = "low";
        String severity = "feature";
        String reproducibility = "always";
        String status = "assigned";
        String resolution = "open";
        String plataform = "Desktop";
        String OS = "Windows";
        String OSVersion = "10";

        String summary = "0009136: Feature not working";
        String description = "Feature does not shows web page when clicked";
        String stepsToReproduce = "1. Open main page."
                + "\n" + "2. Scroll to feature."
                + "\n" + "3. Click on 'Go To Main Page' button.";
        String additionalInformation = "Feature locks after clicking";
        String tags = "No tags attached.";

        String attachedFiles = "anexoExemplo.PNG";

        //Before
        loginFlows.efetuarLogin(usuario, senha);

        //Test
        myViewPage.clicarEmViewIssues();
        viewAllBugsPage.preencherCampoSearch(localizador);
        viewAllBugsPage.clicarNoFilterButton();
        viewAllBugsPage.clicarNaPrimeiraIssueListada();

        Assert.assertTrue(viewPage.getProject().equals(project));

        Assert.assertTrue(viewPage.getCategory().equals(category));
        Assert.assertTrue(viewPage.getViewStatus().equals(viewStatus));
        Assert.assertTrue(viewPage.getDateSubmitted().equals(dateSubmitted));
        Assert.assertTrue(viewPage.getLastUpdate().equals(lastUpdate));

        Assert.assertTrue(viewPage.getReporter().equals(reporter));
        Assert.assertTrue(viewPage.getAssignedTo().equals(assignedTo));
        Assert.assertTrue(viewPage.getPriority().equals(priority));
        Assert.assertTrue(viewPage.getSeverity().equals(severity));
        Assert.assertTrue(viewPage.getReproducibility().equals(reproducibility));
        Assert.assertTrue(viewPage.getStatus().equals(status));
        Assert.assertTrue(viewPage.getResolution().equals(resolution));
        Assert.assertTrue(viewPage.getPlatform().equals(plataform));
        Assert.assertTrue(viewPage.getOS().equals(OS));
        Assert.assertTrue(viewPage.getOSVersion().equals(OSVersion));

        Assert.assertTrue(viewPage.getSummary().equals(summary));
        Assert.assertTrue(viewPage.getDescription().equals(description));
        Assert.assertTrue(viewPage.getStepsToReproduce().equals(stepsToReproduce));
        Assert.assertTrue(viewPage.getAdditionalInformation().equals(additionalInformation));
        Assert.assertTrue(viewPage.getTags().equals(tags));
        Assert.assertTrue(viewPage.getAttachedFiles().equals(attachedFiles));
    }
}
