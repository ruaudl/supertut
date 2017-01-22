package com.serli.dojo.supertut;

import java.lang.reflect.InvocationTargetException;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

public class TestFunctionalProgramming {

    /**
     * First, you should be familiar with Java classes. Start by creating a new instance of the com.serli.dojo.supertut.SimpleDataClass.
     */
    @Test
    public void create_an_instance() {
        Object tested = null;

        assertThat("Your instance is still null", tested, notNullValue());
        assertThat("Your instance must be of type com.serli.dojo.supertut.SimpleDataClass", tested, instanceOf(SimpleDataClass.class));
        assertThat("Your instance must be concrete", tested.getClass().isAnonymousClass(), equalTo(false));
    }

    @Test
    public void implement_an_interface() throws Exception {
        Object tested = null;

        assertThat("Your implementation should not be null", tested, notNullValue());
        assertThat("Your class must implement com.serli.dojo.supertut.SimpleInterface", tested, instanceOf(SimpleInterface.class));
        assertThat("Yout class must be concrete", tested.getClass().isAnonymousClass(), equalTo(false));
        SimpleInterface.class.getMethod("doSomething").invoke(tested);
    }

}
