package com.javaseleniumtemplate.flows;

import com.javaseleniumtemplate.pages.ViewAllBugsPage;

public class ViewAllBugsPageFlows {
    //Objects and constructor
    ViewAllBugsPage viewAllBugsPage;

    public ViewAllBugsPageFlows() {
        //Page and Steps Objects
        viewAllBugsPage = new ViewAllBugsPage();
    }

    //Flows
    public void localizarIssue(String filtro) {
        viewAllBugsPage.preencherCampoSearch(filtro);
        viewAllBugsPage.clicarNoFilterButton();
        viewAllBugsPage.clicarNaPrimeiraIssueListada();
    }
}
