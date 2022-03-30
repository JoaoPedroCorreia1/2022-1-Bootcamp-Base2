package com.javaseleniumtemplate.flows;

import com.javaseleniumtemplate.pages.ViewPage;

public class MyViewPageFlows {
    //Objects and constructor
    ViewPage viewPage;

    public MyViewPageFlows() {
        //Page and Steps Objects
        viewPage = new ViewPage();
    }

    public void localizarIssuePorId(int id) {
        viewPage.navigateTo("https://mantis-prova.base2.com.br/view.php?id=" + id);
    }
}
