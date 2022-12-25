package ooppatterns.relationship.composition;

import java.util.List;

public class House {
    private String address;
    private List<Room> rooms;

    public class Room {
        public String getBuildingAddress() {
            return House.this.address;
        }
    }
}
