package com.talentlms.UI.helpers;

import com.talentlms.UI.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Helper {

    public Helper waitElementToBeClickable(WebElement element){
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))//getDriver- подстравивается
                .until(ExpectedConditions.elementToBeClickable(element));
        return this;// чтобы использовать метод чейнинг

    }
    public Helper waitElementToBeDisplayed(WebElement element){
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))//getDriver- подстравивается
                .until(ExpectedConditions.visibilityOf(element));
        return this;// чтобы использовать метод чейнинг

    }
    public Helper click(WebElement element){
        waitElementToBeDisplayed(element);
        waitElementToBeClickable(element);
        element.click();
        return  this;
    }
    public Helper sendKeys(WebElement element,String str){
        waitElementToBeDisplayed(element);
        element.sendKeys(str);
        return this;
    }
    public String getText(WebElement element){
        return element.getText();
    }


}
