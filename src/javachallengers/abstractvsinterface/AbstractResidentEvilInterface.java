package javachallengers.abstractvsinterface;

/**
 * @author : bijay.thapa
 * @created : 4/10/23, Monday
 * @Description :
 **/
public class AbstractResidentEvilInterface {
    private static int nemesisRaids = 0;

    public static void main(String[] args) {
        Zombie zombie = () -> System.out.println("Graw!!! " + nemesisRaids++);
        System.out.println("Nemesis raids: " + nemesisRaids);
        Nemesis nemesis = new Nemesis() {
            @Override
            public void shoot() {
                shoots = 23;
            }
        };

        Zombie.zombie.shoot();
        zombie.shoot();
        nemesis.shoot();
        System.out.println("Nemesis shoots: " + nemesis.shoots + " and raids: " + nemesisRaids);
    }
}

interface Zombie {
    Zombie zombie = () -> System.out.println("Stars!!!");

    void shoot();
}

abstract class Nemesis implements Zombie {
    int shoots = 5;
}
