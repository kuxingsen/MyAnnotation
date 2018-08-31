package com.test;

import com.test.MyAnno;
import com.test.User;
import org.junit.Test;

import java.lang.reflect.Method;

/**
 * Unit test for simple App.
 */
public class MyAnnoTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testMyAono()
    {
        Class clazz = User.class;
        try {
            Method method = clazz.getMethod("setName", String.class);
            MyAnno myAnno = method.getAnnotation(MyAnno.class);
            System.out.println(myAnno);
            User user = new User();
            user.setName(myAnno.name());
            System.out.println(user);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
