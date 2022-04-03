package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.BugReportFlows;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.flows.ViewAllBugsFlows;
import com.javaseleniumtemplate.pages.BugChangeStatusPage;
import com.javaseleniumtemplate.pages.MyViewPage;
import com.javaseleniumtemplate.pages.ViewPage;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class IssueChangeStatusTests extends TestBase {
    //Objects
    LoginFlows loginFlows;
    BugReportFlows bugReportFlows;
    ViewAllBugsFlows viewAllBugsFlows;

    MyViewPage myViewPage;
    ViewPage viewPage;
    BugChangeStatusPage bugChangeStatusPage;

    @Test
    public void mudarDeEstadoDeAssignedAteClosedComNoteMessageComSucesso() {
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

        String newStatus = "new";
        String feedbackStatus = "feedback";
        String acknowledgedStatus = "acknowledged";
        String confirmedStatus = "confirmed";
        String resolvedStatus = "resolved";
        String closedStatus = "closed";

        String newNoteMessage = "Changed status to new";
        String feedbackNoteMessage = "Changed status to feedback";
        String acknowledgedNoteMessage = "Changed status to acknowledged";
        String confirmedNoteMessage = "Changed status to confirmed";
        String resolvedNoteMessage = "Changed status to resolved";
        String closedNoteMessage = "Changed status to closed";

        //Before
        loginFlows.efetuarLogin(usuario, senha);
        myViewPage.clicarEmReportIssues();
        int issueId = bugReportFlows.criarIssueRetornaId(changeStatusIssue);
        myViewPage.navegateToPage();
        myViewPage.clicarEmViewIssues();
        viewAllBugsFlows.localizarIssue(String.valueOf(issueId));

        //Test
        viewPage.selecionarNovoStatus(newStatus);
        viewPage.clicarEmMudarDeEstado();
        bugChangeStatusPage.preencherAdicionarNota(newNoteMessage);
        bugChangeStatusPage.clicarNoBotaoNewIssue();

        viewPage.selecionarNovoStatus(feedbackStatus);
        viewPage.clicarEmMudarDeEstado();
        bugChangeStatusPage.preencherAdicionarNota(feedbackNoteMessage);
        bugChangeStatusPage.clicarNoBotaoRequestFeedback();

        viewPage.selecionarNovoStatus(acknowledgedStatus);
        viewPage.clicarEmMudarDeEstado();
        bugChangeStatusPage.preencherAdicionarNota(acknowledgedNoteMessage);
        bugChangeStatusPage.clicarNoBotaoAcknowledgeIssue();

        viewPage.selecionarNovoStatus(confirmedStatus);
        viewPage.clicarEmMudarDeEstado();
        bugChangeStatusPage.preencherAdicionarNota(confirmedNoteMessage);
        bugChangeStatusPage.clicarNoBotaoConfirmIssue();

        viewPage.selecionarNovoStatus(resolvedStatus);
        viewPage.clicarEmMudarDeEstado();
        bugChangeStatusPage.preencherAdicionarNota(resolvedNoteMessage);
        bugChangeStatusPage.clicarNoBotaoResolveIssue();

        viewPage.selecionarNovoStatus(closedStatus);
        viewPage.clicarEmMudarDeEstado();
        bugChangeStatusPage.preencherAdicionarNota(closedNoteMessage);
        bugChangeStatusPage.clicarNoBotaoCloseIssue();

        Assert.assertTrue(viewPage.getStatus().equals(closedStatus));

        Assert.assertTrue(viewPage.getFirstNote().equals(newNoteMessage));
        Assert.assertTrue(viewPage.getSecondNote().equals(feedbackNoteMessage));
        Assert.assertTrue(viewPage.getThirdNote().equals(acknowledgedNoteMessage));
        Assert.assertTrue(viewPage.getFourthNote().equals(confirmedNoteMessage));
        Assert.assertTrue(viewPage.getFifthNote().equals(resolvedNoteMessage));
        Assert.assertTrue(viewPage.getSixthNote().equals(closedNoteMessage));
    }
}
