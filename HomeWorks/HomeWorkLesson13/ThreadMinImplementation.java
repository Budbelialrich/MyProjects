package HomeWorks.HomeWorkLesson13;

public class ThreadMinImplementation implements Runnable{

    int [] array;

    public ThreadMinImplementation(int[] array) {
        this.array = array;
    }

    int minNum;

    public int getMinNum() {
        return minNum;
    }

    @Override
    public void run() {

        for (int mass : array) {

            if (mass < minNum) {
                minNum = mass;
            }
        }
    }
}
