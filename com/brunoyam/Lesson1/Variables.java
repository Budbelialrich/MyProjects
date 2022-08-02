package com.brunoyam.Lesson1;

public class Variables {
    public static void main(String[] args){
        int intVariable; // объявляем переменную
        intVariable = 2000; // инициализируем переменную
        System.out.println(intVariable);

        /*
        * объявляем и инициализируем переменную
        * в одной строке
        */
        int intVariable2 = 999;
        System.out.println(intVariable2);

        int intVariable3 = intVariable + intVariable2; // сложение
        System.out.println(intVariable3);

        int intVariable4 = intVariable - intVariable2; // вычитание
        System.out.println(intVariable4);

        int intVariable5 = intVariable * intVariable2; // умножение
        System.out.println(intVariable5);

        int intVariable6 = intVariable / intVariable2; // деление на цело так как int
        System.out.println(intVariable6);

        int intVariable7 = intVariable % intVariable2; // оостаток оот деления
        System.out.println(intVariable7);

        int intVariable8 = intVariable + intVariable2;
        System.out.println(intVariable3);

        intVariable3 += 10;
        System.out.println(intVariable3);

        byte b = 127;
        short s = 32766;
        int i = 36452654;
        long l = 362_476_735_567L;

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);

        System.out.println(b + " " + s + " " + i + " " + l);

        float f = 3.14F;
        double d = 234.454356;

        System.out.println(f);
        System.out.println(d);

        int m = 10;
        int sm = m * 100;
        System.out.println(m + " метров = " + sm + " сантиметроов");

        int h = 10;
        int sec = h * 3600;
        System.out.println(h + " часов = " + sec + " секунд");

        int cel = 1;
        double fah = (cel * 9.0/5.0) + 32;
        System.out.println(cel + "C = " + fah + "F");

        char ch = 'a';
        char chr = 345;
        System.out.println(ch);
        System.out.println(chr);

        boolean tr = true;
        boolean fl = false;
        System.out.println(tr);
        System.out.println(fl);

        boolean bool = 5 == 6;
        System.out.println(bool);

    }
}
