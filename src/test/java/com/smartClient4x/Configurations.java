package com.smartClient4x;


import org.openqa.selenium.By;

/**
 * Created by cdzebisov on 12/5/17.
 *
 * THIS CLASS IS NOT BEING USED AT THIS TIME
 */
public enum Configurations {

    ID,
    XPATH,
    CLASSNAME,
    CSSSELECTOR,
    PARTIALLINKTEXT,
    LINKTEXT,
    NAME,
    TAGNAME;

    String selectorType(){
        String type = null;
        switch (this){
            case ID: type = "id";
            case CLASSNAME: type = "className";
            case CSSSELECTOR: type = "cssSelector";
            case LINKTEXT: type = "linkText";
            case PARTIALLINKTEXT: type = "partialLinkText";
            case NAME: type = "name";
            case TAGNAME: type = "tagName";
            case XPATH: type = "xpath";

        }
    return type;
    }

}
