package HomeWorks.HomeWorkLesson13;

public class ThreadMaxImplementation implements Runnable {

    int [] array;

    public ThreadMaxImplementation(int[] array) {
        this.array = array;
    }

    int maxNum;

    public int getMaxNum() {
        return maxNum;
    }

    @Override
    public void run() {

        for (int mass : array) {

            if (mass > maxNum) {
                maxNum = mass;
            }
        }
    }
}

