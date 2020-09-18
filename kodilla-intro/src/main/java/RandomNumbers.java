import java.util.Random;

public class RandomNumbers {
    private int[] randomNumbers;
    private int min;
    private int max;
    private int sum = 0;

    public RandomNumbers() {
        this.randomNumbers = new int[5000];
    }

    public void randomizeNumbers() {
        int low = 0;
        int high = 30;
        for (int i = 0; i < 5000; i++) {
            Random r = new Random();
            randomNumbers[i] = r.nextInt((high - low) + 1);
            sum = sum + randomNumbers[i];
        }
    }

    public void isSumTheEnd() {
            if (sum <= 5000) {
            this.randomizeNumbers ();
            }

        }
    public int minValue () {
        min = randomNumbers[0];
        for (int i=0; i < randomNumbers.length; i++) {
            if (randomNumbers[i] < min) {
                min = randomNumbers[i];
            }
        }
        return min;
    }

    public int maxValue () {
        max = randomNumbers[0];
        for (int i=0; i < randomNumbers.length; i++) {
            if (randomNumbers[i] > max) {
                max = randomNumbers[i];
            }
        }
        return max;
    }

    public static void main (String[] args) {
        RandomNumbers numberTable = new RandomNumbers();
        numberTable.randomizeNumbers();
        numberTable.isSumTheEnd();
        System.out.println("Minimal randomize number is: " + numberTable.minValue());
        System.out.println("Maximal randomize number is: " + numberTable.maxValue());
    }

}


