public class Notebook {
    int weight;
    int price;
    int year;


    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");

        } else if ((this.price > 600) && (this.price <= 1100)) {
            System.out.println("The price is good.");

        } else if (this.price > 1000) {
            System.out.println("This notebook is expensive.");

        }
    }

    public void checkWeight() {

        if (this.weight < 1000) {
            System.out.println("This notebook is light.");

        } else if ((this.weight >= 1000) && (this.weight <= 1700)) {
            System.out.println("This notebook is OK.");

        } else if (this.weight > 1700) {
            System.out.println("This notebook heavy.");

        }
    }
    public void checkYearAndPrice () {
        if (( year >= 2019) && ( price < 2000 ))
            System.out.println("This notebook is New & cheap");
        else if ((price < 2000 ) && (year < 2019))
            System.out.println ("This notebook is older and cheap");
        else System.out.println("Notebook is old and expensive");
    }


}
