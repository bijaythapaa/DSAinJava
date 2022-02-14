package duke.choice;

/**
 * @Author Bijay Thapa
 * @Project DSAinJava
 * @created 1/30/22 - 10:02 PM
 */
public class Clothing implements Comparable<Clothing> {
    private String description;
    private double price;
    private String size = "M";

    public final static double MIN_PRICE = 10.0;
    public final static double TAX_RATE = .2;

    public Clothing() {
    }

    public Clothing(String description, double price, String size) {
        this.description = description;
        this.price = price;
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price + (price * TAX_RATE);
    }

    public void setPrice(double price) {
        this.price = (MIN_PRICE < price) ? MIN_PRICE : price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return getDescription() + ", "+ getSize() + ", " +getPrice();
    }

    @Override
    public int compareTo(Clothing c) {
        return this.description.compareTo(c.description);
    }
}
