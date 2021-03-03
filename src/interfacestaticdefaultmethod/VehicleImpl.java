package interfacestaticdefaultmethod;

public class VehicleImpl implements Vehicle {
    public static void main(String[] args) {
        Vehicle vehicle = new VehicleImpl();
        String overView = vehicle.getOverView();
        System.out.println(overView);
    }
}
