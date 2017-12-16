package com.smartClient4x;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by cdzebisov on 12/11/17.
 */
public enum Props {

   INSTANCE;


    /** -------------------------------------------------------------------------------------------------
     * This method gets the variables from the property file "project-settings.properties"
     */
    public String props(String propertyKey) {
        java.util.Properties prop = new java.util.Properties();
        InputStream input = null;
        String a=null;
        try {
            input = new FileInputStream("project-settings.properties");
            prop.load(input);
            a = prop.getProperty(propertyKey);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return (a);
    }







}
