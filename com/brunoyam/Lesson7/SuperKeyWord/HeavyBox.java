package com.brunoyam.Lesson7.SuperKeyWord;

public class HeavyBox extends Box {
    double weight;

    HeavyBox(double width, double height, double depth, double weight){
        super(width, height, depth);
        this.weight = weight;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "HeavyBox{" +
                "width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                ", weight=" + weight +
                '}';
    }
}
