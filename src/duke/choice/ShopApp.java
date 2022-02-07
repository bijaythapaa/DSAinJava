package duke.choice;

/**
 * @Author Bijay Thapa
 * @Project DSAinJava
 * @created 1/30/22 - 9:14 PM
 */
public class ShopApp {
    public static void main(String[] args) {
        double tax = 0.2, total = 0.0;
        Customer c1 = new Customer();
        c1.setName("Pinky");
        c1.setSize("S");

        Clothing item1 = new Clothing();
        item1.setDescription("Blue Jacket");
        item1.setPrice(20.9);
        Clothing item2 = new Clothing();
        item2.setDescription("Orange T-shirt");
        item2.setPrice(10.5);
        item2.setSize("S");

        Clothing[] clothing = { item1, item2, new Clothing(), new Clothing() };
        clothing[2].setDescription("Green Scarf");
        clothing[2].setPrice(5.0);
        clothing[2].setSize("S");
        clothing[3].setDescription("Blue T-Shirt");
        clothing[3].setPrice(10.5);
        clothing[3].setSize("S");

        int measurement = 3;
        c1.setSize(measurement);

        c1.addItems(clothing);

        System.out.println("Customer is: " + c1.getName() + ", Size: " + c1.getSize() + ", Total Price: "
                + c1.getTotalClothingCloths());
        for (Clothing item : c1.getItems()) {
            System.out.println("Item: " + item.getDescription());
        }
    }
}
