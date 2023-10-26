package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo {
    public static void main(String[] args) throws Exception{
        Cat c = new Cat("catName", 10);
        Class<?> catReflect = c.getClass();
        
        //class name
        System.out.println(c.getName());

        Method[] catMethods = catReflect.getDeclaredMethods();
        Field[] catFields = catReflect.getDeclaredFields();        
        
        for(Method m:catMethods) {
            // System.out.println(m.getName());
            // c.isPrivateMethod(); -- not accessible
            if(m.getName().equals("isPrivateMethod")) {
                m.setAccessible(true);
                m.invoke(c);
            }

            if(m.getName().equals("publicStatic")) {
                m.setAccessible(true);
                m.invoke(c);
            }

        }

        //change final private variable here

        for(Field f:catFields) {
            if(f.getName().equals("name")) {
                f.setAccessible(true);
                f.set(c, "catNameIsChanged");
                System.out.println("changed name is :" + f.get(c)) ;
            }
        }   
    }
}
