package com.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {
    private Properties properties;

    public PropertiesUtil(String path) {
        try {
            properties = new Properties();
            InputStream inputStream = this.getClass().getResourceAsStream(path);
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getProperties(String key) {
        return properties.getProperty(key);
    }

    public static void main(String[] args) {
        System.out.println(new PropertiesUtil("/jdbc.properties").getProperties("password"));
    }
}
