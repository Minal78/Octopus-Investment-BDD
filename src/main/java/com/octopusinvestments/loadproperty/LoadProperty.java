package com.octopusinvestments.loadproperty;

import java.io.FileInputStream;
import java.util.Properties;

public class LoadProperty {
    FileInputStream fileInputStream;
    Properties properties;

    public String getMyProperty(String key) {
        try {
            fileInputStream = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\java\\resources\\properties\\config.properties");
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (Exception e) {
            System.out.println(e);
        }
        return properties.getProperty(key);
    }
}
