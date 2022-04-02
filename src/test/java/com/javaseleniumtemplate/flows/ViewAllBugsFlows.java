package com.javaseleniumtemplate.flows;

import com.javaseleniumtemplate.pages.ViewAllBugsPage;

public class ViewAllBugsFlows {
    //Objects and constructor
    ViewAllBugsPage viewAllBugsPage;

    public ViewAllBugsFlows() {
        //Page and Steps Objects
        viewAllBugsPage = new ViewAllBugsPage();
    }

    //Flows
    public void localizarIssue(String filter) {
        viewAllBugsPage.preencherCampoSearch(filter);
        viewAllBugsPage.clicarNoFilterButton();
        viewAllBugsPage.clicarNaPrimeiraIssueListada();
    }
}
