package com.serli.dojo.supertut;

public class SimpleDataClass {

    String stringValue;
    Integer integerValue;

    public SimpleDataClass(String stringValue) {
        this.stringValue = stringValue;
    }

    public SimpleDataClass(Integer integerValue) {
        this.integerValue = integerValue;
    }

    public SimpleDataClass(String stringValue, Integer integerValue) {
        this.stringValue = stringValue;
        this.integerValue = integerValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public Integer getIntegerValue() {
        return integerValue;
    }
}
