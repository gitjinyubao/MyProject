package com.augmentum.oes.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyUtil {
    private static Properties properties = null;
    private static InputStream in = null;

    static{
        try {
            InputStream in = PropertyUtil.class.getClassLoader().getResourceAsStream("app.properties");
            properties = new Properties();
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if ( in != null ) {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static String getProperty(String key){
        return properties.getProperty(key);
    }

    public static String getStaticUrl() {
        return properties.getProperty("static_url");
    }
}
