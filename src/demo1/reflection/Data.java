package demo1.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Data {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        User user =  new User();
        Class<? extends User> aClass = user.getClass();
//        Field[] fields = aClass.getDeclaredFields();
//        for (Field field : fields) {
//            field.setAccessible(true);
//            System.out.println(field.getName() + " " + field.getType());
//
//        }

//        Method[] declaredMethods = aClass.getDeclaredMethods();
//        for (Method declaredMethod : declaredMethods) {
//            declaredMethod.setAccessible(true);
////            System.out.println(declaredMethod.getName() + " " + declaredMethod.getParameterCount());
//            Parameter[] parameters = declaredMethod.getParameters();
//            for (Parameter parameter : parameters) {
//                System.out.println(parameter.getName() + " " + parameter.getType());
//            }

//        Field id = aClass.getDeclaredField("id");
//        id.setAccessible(true);
//        id.set(user, 200);
//        Field name = aClass.getDeclaredField("name");
//        name.setAccessible(true);
//        name.set(user, "Mykola");
//        System.out.println(user);




    }
}
