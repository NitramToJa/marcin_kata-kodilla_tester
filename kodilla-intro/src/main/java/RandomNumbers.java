import java.util.Random;

public class RandomNumbers {

    public static int getRandom(int rangeMin, int rangeMax) {
        Random r = new Random();
        int randomNumber = r.nextInt((rangeMax - rangeMin) + 1);
        return randomNumber;
    }


    public static void main(String[] args) {
        int sum = 0;
        int highValue = 0;
        int lowValue = 30;
        while (sum <= 5000) {
            int randomNr = getRandom(0, 30);
            sum = sum + randomNr;
            if (highValue < randomNr) highValue = randomNr;
            if (lowValue > randomNr) lowValue = randomNr;
        }

        System.out.println("Minimal randomize number is: " + lowValue);
        System.out.println("Maximal randomize number is: " + highValue);

    }

}
