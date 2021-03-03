package interfacestaticdefaultmethod;

public interface Vehicle {
    static String producer() {
        return "N&F Vehicles.";
    }

    default String getOverView() {
        return "ATV made by " + producer();
    }

    public static void main(String[] args) {
        String produce = Vehicle.producer();
        System.out.println(produce);

    }
}
