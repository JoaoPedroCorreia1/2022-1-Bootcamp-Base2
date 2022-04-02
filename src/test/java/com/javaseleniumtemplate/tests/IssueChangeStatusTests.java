package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.flows.BugReportFlows;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.flows.ViewAllBugsFlows;
import com.javaseleniumtemplate.pages.BugChangeStatusPage;
import com.javaseleniumtemplate.pages.MyViewPage;
import com.javaseleniumtemplate.pages.ViewPage;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class IssueChangeStatusTests {
    //Objects
    LoginFlows loginFlows;
    BugReportFlows bugReportFlows;
    ViewAllBugsFlows viewAllBugsFlows;

    MyViewPage myViewPage;
    ViewPage viewPage;
    BugChangeStatusPage bugChangeStatusPage;

    @Test
    public void mudarDeEstadoDeAssignedAteClosedComMensagemComSucesso() {
        //Massa de dados
        List<String> changeStatusIssue = Arrays.asList(
                "Daniella Maleski's Project",

                "[All Projects] Teste JoaoSilva",
                "always",
                "feature",
                "low",
                "Desktop Windows 10",

                "joao.silva",
                "Feature not working",
                "Feature does not shows web page when clicked",
                "1. Open main page."
                + "\n" + "2. Scroll to feature."
                + "\n" + "3. Click on 'Go To Main Page' button.",
                "Feature locks after clicking"
                ,"/files/anexoExemplo.PNG",
                "public",
                "desativado"
        );

        //Objects instances
        loginFlows = new LoginFlows();
        bugReportFlows = new BugReportFlows();
        viewAllBugsFlows = new ViewAllBugsFlows();

        myViewPage = new MyViewPage();
        viewPage = new ViewPage();
        bugChangeStatusPage = new BugChangeStatusPage();

        //Parameteres
        String usuario = "joao.silva";
        String senha = "09111999";

        String newMensagem = "Changed status to new";
        String feedbackMensagem = "Changed status to feedback";
        String acknowledgedMensagem = "Changed status to acknowledged";
        String confirmedMensagem = "Changed status to confirmed";
        String assignedMensagem = "Changed status to assigned";
        String resolvedMensagem = "Changed status to resolved";
        String closedMensagem = "Changed status to closed";

        //Before
        loginFlows.efetuarLogin(usuario, senha);
        myViewPage.clicarEmReportIssues();
        int issueId = bugReportFlows.criarIssueRetornaId(changeStatusIssue);
        myViewPage.navegateToPage();
        myViewPage.clicarEmViewIssues();
        viewAllBugsFlows.localizarIssue(String.valueOf(issueId));

        //Test
    }
}
