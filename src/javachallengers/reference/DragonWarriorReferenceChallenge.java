package javachallengers.reference;

/**
 * @author : bijay.thapa
 * @created : 4/10/23, Monday
 * @Description :
 **/
public class DragonWarriorReferenceChallenge {
    public static void main(String[] args) {
        StringBuilder warriorProfession = new StringBuilder("Dragon ");
        String warriorWeapon = "Sword";
        changeWarriorClass(warriorProfession, warriorWeapon);
        System.out.println("warriorProfession = " + warriorProfession + ", Weapon = " + warriorWeapon);
    }

    private static void changeWarriorClass(StringBuilder warriorProfession, String weapon) {
        warriorProfession.append("Knight");
//        weapon = "Dragon " + weapon;
        weapon = "Dragon " + weapon;
        weapon = null;
        warriorProfession = null;
    }
}
