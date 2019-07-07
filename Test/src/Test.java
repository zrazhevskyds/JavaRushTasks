

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/*
Сравниваем модификаторы
*/
public class Test {
    public static void main(String[] args) {
        Test obj = new Test();
        Class c = obj.getClass();
        int mod = c.getModifiers();
        System.out.println(mod);

        if (Modifier.isPublic(mod)){
            System.out.println("YES");
        }
    }




}
