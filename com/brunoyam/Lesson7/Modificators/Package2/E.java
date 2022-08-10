package com.brunoyam.Lesson7.Modificators.Package2;

import com.brunoyam.Lesson7.Modificators.Package1.A;

public class E extends A {

    public void test(){
        System.out.println(publicVariable);
        publicMethod();

//        System.out.println(privatVariable);
//        privatMethod();
//
//        System.out.println(a.defaultVariable);
//        a.defaultMethod();

        System.out.println(protectedVariable);
        protectedMethod();
    }
}
