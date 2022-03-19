package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.pages.LoginPage;
import com.javaseleniumtemplate.pages.MyViewPage;
import org.junit.Assert;
import org.junit.Test;

public class LoginTests extends TestBase {
    //Objects
    LoginPage loginPage;
    MyViewPage myViewPage;

    //Tests
    @Test
    public void efetuarLoginUsuarioValido(){

        //Objects instances
        loginPage = new LoginPage();
        myViewPage = new MyViewPage();

        //Parameteres
        String usuario = "joao.silva";
        String senha = "09111999";

        //Test
        loginPage.preencherUsuario(usuario);
        loginPage.preencherSenha(senha);
        loginPage.clicarEmLogin();

        Assert.assertEquals(myViewPage.getUsuario(), usuario);
    }
}
