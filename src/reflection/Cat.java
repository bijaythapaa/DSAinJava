package reflection;

public class Cat {

    private final String name;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void meow() {
        System.out.println("MEOW");
    }

    private void heyThisIsPrivate() {
        System.out.println("hey, how do you call this private method?");
    }

    public static void thisIsPublicStaticMethod() {
        System.out.println("Im public and static !!");
    }
}
