package com.serli.dojo.supertut;

public interface SimpleFactoryInterface {

    SimpleDataClass from(String string);
    SimpleDataClass from(Integer integer);
    SimpleDataClass from(String string, Integer integer);
}
