package duke.choice;

/**
 * @Author Bijay Thapa
 * @Project DSAinJava
 * @created 1/30/22 - 9:14 PM
 */
public class ShopApp {
    public class ShopApp {
        public static void main(String[] args) {
            // double tax = 0.2, total = 0.0;
            Customer c1 = new Customer("Pinky", 3);
    
            System.out.println("Min Price: " + Clothing.MIN_PRICE);
    
            Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
            Clothing item2 = new Clothing("Orange T-shirt", 10.5, "S");
    
            Clothing[] clothing = { item1, item2, new Clothing("Green Scarf", 5.0, "S"),
                    new Clothing("Blue T-Shirt", 10.5, "S") };
    
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
}
