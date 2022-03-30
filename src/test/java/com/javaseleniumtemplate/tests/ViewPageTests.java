package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.flows.ViewAllBugsPageFlows;
import com.javaseleniumtemplate.pages.MyViewPage;
import com.javaseleniumtemplate.pages.ViewPage;
import org.junit.Assert;
import org.junit.Test;

public class ViewPageTests extends TestBase {
    //Objects
    LoginFlows loginFlows;
    MyViewPage myViewPage;
    ViewAllBugsPageFlows viewAllBugsPageFlows;
    ViewPage viewPage;

    //Tests
    @Test
    public void visualizarIssueComSucesso() {
        //Objects instances
        loginFlows = new LoginFlows();
        myViewPage = new MyViewPage();
        viewAllBugsPageFlows = new ViewAllBugsPageFlows();
        viewPage = new ViewPage();

        //Before
        loginFlows.efetuarLogin("joao.silva", "09111999");
        myViewPage.clicarEmViewIssues();
        viewAllBugsPageFlows.localizarIssue("9136");

        //Test
        Assert.assertTrue(viewPage.getSummary()
                .equals("0009136: Feature not working"));
    }
}
