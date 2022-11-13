package com.talentlms.UI.utils;

import com.talentlms.UI.dataProvider.ConfigReader;
import org.openqa.selenium.WebDriver;

public class Driver {

    //чтоб этот класс был едиственным
    private Driver(){
        //Singleton pattern(shablon)
    }
    //создаем instance of webdriver
    private static WebDriver driver;


    //создаем спец метод к-й вызывает наш метод?, когда будем запускать автотест вызываем это
    public static WebDriver getDriver(){
        if(driver==null){
            switch (ConfigReader.getProperties("browser").toLowerCase()){
                case "chrome":
                driver=ChromeWebDriver.loadChromeDriver();
                break;
                case "firefox":
                 driver=FireFoxWebDriver.loadFireFoxDriver();
                 break;
                case "edge":
                  driver=EdgeWebDriver.loadEdgeDriver();
                  break;
                default:
                    driver=ChromeWebDriver.loadChromeDriver();
            }
        }
        return driver;
    }
    //создаем метод к-й закрывает браузер
    public static void closeDriver(){

    }


}
