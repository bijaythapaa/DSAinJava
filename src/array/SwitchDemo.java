package array;

/**
 * @Author Bijay Thapa
 * @Project DSAinJava
 * @created 8/25/21 - 9:52 PM
 */
public class SwitchDemo {

    static String exampleOfSwitch(String animal) {
        String result;
        switch (animal) {
            case "Dog":
                result = "Dog barks.";
                break;
            case "Cat":
                result = "Cat meow";
                break;
            case "Tiger":
                result = "Tiger roars";
                break;
            default:
                result = "No animal given";
//                break;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(exampleOfSwitch("Tiger"));
    }
}
