public class SimpleArray {
    public static void main(String[] args) {
        String[] animalsName = new String[5];
        animalsName[0] = "Koza";
        animalsName[1] = "Kot";
        animalsName[2] = "Kon";
        animalsName[3] = "Kret";
        animalsName[4] = "Kura";

        String animal = animalsName[2];
        System.out.println(animal);

        int numberOfElements = animalsName.length;
        System.out.print("Moja tablica zawiera " + numberOfElements + " elementow");

    }
}