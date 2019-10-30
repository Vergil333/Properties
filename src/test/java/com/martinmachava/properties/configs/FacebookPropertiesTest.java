package com.martinmachava.properties.configs;

import com.martinmachava.properties.configs.properties.LoadConfigProperties;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.ConfigFileApplicationContextInitializer;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/*
* Credits to Andrew Wong
* https://andrewzc.com/loading-configuration-properties-in-spring-boot-test/
* and Sayan Mukherjee
* https://stackoverflow.com/a/49194132
*/

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = LoadConfigProperties.class, initializers = ConfigFileApplicationContextInitializer.class)
public class FacebookPropertiesTest {

    @Autowired
    private FacebookProperties fbProperties;

    @Test
    public void getHost() {
        String expectedHost = "https://graph.facebook.com";
        String actualHost = fbProperties.getHost();

        System.out.println(fbProperties.toString());

        Assert.assertEquals(expectedHost, actualHost);
    }

    @Test
    public void testPropsNotNull() {
        ArrayList<String> getters = facebookPropertiesGettersResultList(fbProperties);

        getters.forEach(getter -> Assert.assertNotNull(getter));
    }

    private ArrayList<String> facebookPropertiesGettersResultList(FacebookProperties testModelObject) {

        ArrayList<String> getterResults = new ArrayList<>();

        try {
            Class testModelClass = Class.forName("com.martinmachava.properties.configs.FacebookProperties");
            Method[] methods = testModelClass.getDeclaredMethods();
            for (Method method :
                    methods) {
                if (method.getName().startsWith("get")){
                    getterResults.add(String.valueOf(method.invoke(testModelObject)));
                }
            }
            System.out.println("sayanReflextion ==>: "+getterResults.toString());
        } catch (ClassNotFoundException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        return getterResults;
    }

}
