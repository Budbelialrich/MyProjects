package HomeWorks.HomeWorkLesson6;

public class Main {
    public static void main(String[] args) {

        Flower [] Flowers = new Rose[10];
        for (int i = 0; i < Flowers.length; i++){
            Flowers[i] = new Rose();
            Flower.numberOfFlowers++;
            System.out.println("Number of flowers: " + Flower.numberOfFlowers);
        }



    }
}
