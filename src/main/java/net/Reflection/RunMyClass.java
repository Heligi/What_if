package net.Reflection;


import java.lang.reflect.Field;

public class RunMyClass {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.setEge(25);
        int age = myClass.getEge();
        String name = null;
        System.out.println(age + name);

        try {
            Field field = myClass.getClass().getDeclaredField("name");
            field.setAccessible(true);
            name = (String) field.get(myClass);
        }catch (NoSuchFieldException |IllegalAccessException e){
            e.printStackTrace();
        }
        System.out.println(age + name);

        TestProtected testProtected = new TestProtected();
        System.out.println( testProtected.getNumber());
    }
}
