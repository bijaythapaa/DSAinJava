package ooppatterns.relationship.composition;

public class HouseWithDefinitionRoomInMethod {
    public interface Room {
        void doInRoom();
    }

    public Room createAnonymousRoom() {
        return new Room() {
            @Override
            public void doInRoom() {
            }
        };
    }

    public Room createInLineRoom() {
        class InLineRoom implements Room {
            @Override
            public void doInRoom() {
            }
        }
        return new InLineRoom();
    }

    public Room createLambdaRoom() {
        return () -> {
        };
    }
}
