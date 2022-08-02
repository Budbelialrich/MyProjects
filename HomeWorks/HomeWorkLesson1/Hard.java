package HomeWorks.HomeWorkLesson1;

public class Hard {
    public static void main(String[] args) {
        int priceA = 1000;
        int priceB = 500;
        double price = (priceA + priceB);
        double wad = price * 0.9;
        // при скидке 10 процентов (0.1) сумма будет составлять 90 процентов т.е 0.9
        double dis = price * 0.1;
        System.out.println("Цена со скидкой " + wad + " руб.");
        System.out.println("Размер скидки " + dis + " руб.");
    }
}
