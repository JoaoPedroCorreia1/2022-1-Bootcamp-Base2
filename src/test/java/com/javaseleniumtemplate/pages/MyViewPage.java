package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class MyViewPage extends PageBase {
    //Mapping
    By logedInAs = By.xpath("//td[@class='login-info-left']/span[1]");

    //Actions
    public String getUsuario(){
        return getText(logedInAs);
    }
}
