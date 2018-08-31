package com.test;

/**
 * Created by Kuexun on 2018/4/22.
 */
@SuppressWarnings("all")
public class User {
    @MyAnno(name="aaa")
    public String name;

    @MyAnno(name="fff")
    public void setName(String aa)
    {
        this.name = aa;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
