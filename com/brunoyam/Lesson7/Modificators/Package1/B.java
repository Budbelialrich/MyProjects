package com.brunoyam.Lesson7.Modificators.Package1;

public class B extends A{

    public void test(){
        System.out.println(publicVariable);
        publicMethod();

//        System.out.println(privatVariable);
//        privatMethod();

        System.out.println(defaultVariable);
        defaultMethod();

        System.out.println(protectedVariable);
        protectedMethod();
    }
}
