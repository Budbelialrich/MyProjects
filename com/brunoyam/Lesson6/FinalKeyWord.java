package com.brunoyam.Lesson6;

public class FinalKeyWord {
    static final int MY_FINAL_INTEGER = 0;

    public static void main(String[] args) {
        final double PI = 3.14;
//        PI = 1.0;
        System.out.println("PI: " + PI);

//        MY_FINAL_INTEGER = 10;

        System.out.println(MY_FINAL_INTEGER);
    }

    static void printConstant (final String CONSTANT){
//        CONSTANT = "modified";
        System.out.println("Constant: " + CONSTANT);

    }
}
