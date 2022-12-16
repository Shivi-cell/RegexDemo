package Testing;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Class cls = Class.forName("Testing.TestClass");
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method m:declaredMethods)
        {
            System.out.println(m);
        }
    }
}
