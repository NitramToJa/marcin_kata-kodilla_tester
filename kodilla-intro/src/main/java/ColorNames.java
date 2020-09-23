import java.util.Scanner;

public class ColorNames {

    public static String enterFirstLetter() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter first letter (B-black, Y-yellow, W-white, P-pink, R-red, G-green");
            String firstLetter = scanner.nextLine().trim().toUpperCase();

            switch (firstLetter) {
                case "B": return "Black";
                case "Y": return "Yellow";
                case "W": return "White";
                case "P": return "Pink";
                case "R": return "Red";
                case "G": return "Green";
                default:
                    System.out.println("Wrong letter. Try again.");
            }
        }
    }
    public static void main(String[] args) {
        ColorNames.enterFirstLetter();
        System.out.println("Picked color:" + enterFirstLetter());

    }


    }