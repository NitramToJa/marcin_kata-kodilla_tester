public class Notebook {
    String weight;
    int price;
    int year;


    public Notebook(String weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");

        } else if ((this.price >= 600) && (this.price <= 1000)) {
            System.out.println("The price is good.");

        } else if (this.price > 1000) {
            System.out.println("This notebook is expensive.");

        }
    }

    public void checkWeight() {

        int weight = Integer.parseInt("5");

        if (this.weight < 1000) {
            System.out.println("This notebook is light.");

        } else if ((this.weight >= 1000) && (this.weight <= 1700)) {
            System.out.println("This notebook is OK.");

        } else if (this.weight > 1700) {
            System.out.println("This notebook heavy.");

        }
    }
}
