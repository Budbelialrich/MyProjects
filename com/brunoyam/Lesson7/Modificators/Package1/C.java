package com.brunoyam.Lesson7.Modificators.Package1;

public class C {

    public void test(){
        A a = new A();

        System.out.println(a.publicVariable);
        a.publicMethod();

//        System.out.println(a.privatVariable);
//        a.privatVariable();

        System.out.println(a.defaultVariable);
        a.defaultMethod();

        System.out.println(a.protectedVariable);
        a.protectedMethod();
    }
}
