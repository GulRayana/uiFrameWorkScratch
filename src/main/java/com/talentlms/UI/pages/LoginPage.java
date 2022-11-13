package com.talentlms.UI.pages;

import com.talentlms.UI.helpers.Helper;
import com.talentlms.UI.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);//без этого нижний не работают
    }

    Helper helper=new Helper();//создали чтобы оттуда читать
    @FindBy(xpath = "//input[@id='231226674']")
    public WebElement domainInput;

    @FindBy(xpath = "//input[@id='489837193']")
    public WebElement userNameOrEmailInput;

    @FindBy(xpath ="//input[@id='1581843511']" )
    public WebElement passwordInput;

    @FindBy(xpath ="//input[@id='1796946306']" )
    public WebElement loginButton;

    public LoginPage domainInput(String domain){
    helper.sendKeys(domainInput,domain);

    return this;
    }
    public LoginPage inputUserNameOrEmail(String userNameOrEmail){

        helper.sendKeys(userNameOrEmailInput,userNameOrEmail);
        return this;
    }
    public LoginPage inputPassword(String password){
        helper.sendKeys(passwordInput,password);
        return this;
    }
    public LoginPage  clickLoginButton(){
        helper.click(loginButton);
        return this;
    }




}
