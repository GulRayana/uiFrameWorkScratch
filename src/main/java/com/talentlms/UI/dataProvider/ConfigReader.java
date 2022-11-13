package com.talentlms.UI.dataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    //читаем с помощью этого класса данные в файле configurations.properties
    //сначала должны вызвать этот файл ,через class Properties

    private static Properties properties;


    //нужно указать путь к этом файлу, используем static
   static {//1раз объявили  и все переменные будут static
       try {
           String path = "src/main/resources/configurations.properties";
           FileInputStream input = new FileInputStream(path);//если горит тогда нужно создать try catch
       properties =new Properties();
       properties.load(input);//скачали данные
           //после мы должны закрыть
           input.close();

       }catch (IOException e){
           e.printStackTrace();
       }

    }

    public static String getProperties(String key){
       return properties.getProperty(key).trim();
    }

}
