package reflection;

import java.lang.reflect.Field;

public class ReflectionFun {
    public static void main(String[] args) throws Exception {
        Cat myCat = new Cat("bili", 2);
        Field[] catFields = myCat.getClass().getDeclaredFields();
        for (Field field : catFields) {
//            System.out.println(field.getName());
            if (field.getName().equals("name")){
                field.setAccessible(true);
                field.set(myCat, "sane");
            }
        }
        System.out.println(myCat.getName());
    }
}
