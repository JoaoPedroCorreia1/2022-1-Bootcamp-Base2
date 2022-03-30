package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.MyViewPage;
import org.junit.Assert;
import org.junit.Test;

public class ProjectTests extends TestBase {
    //Objects
    LoginFlows loginFlows;
    MyViewPage myViewPage;

    //Tests
    @Test
    public void trocarDeProjetoComSucesso() {
        //Objects instances
        loginFlows = new LoginFlows();
        myViewPage = new MyViewPage();

        //Before
        loginFlows.efetuarLogin("joao.silva", "09111999");

        //Test
        myViewPage.selecionarProject("Daniella Maleski's Project");
        myViewPage.clicarNoBotaoSwitchProject();

        Assert.assertTrue(myViewPage.getProjetoSelecionado()
                .equals("Daniella Maleski's Project"));
    }
}
