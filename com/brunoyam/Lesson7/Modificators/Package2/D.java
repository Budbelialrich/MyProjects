package com.brunoyam.Lesson7.Modificators.Package2;

import com.brunoyam.Lesson7.Modificators.Package1.A;

public class D {

    public void test(){
        A a = new A();

        System.out.println(a.publicVariable);
        a.publicMethod();

//        System.out.println(a.privatVariable);
//        a.privatMethod();

//        System.out.println(a.defaultVariable);
//        a.defaultMethod();

//        System.out.println(a.protectedVariable);
//        a.protectedMethod();
    }
}
