package org.example.example2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Matematik matematik = new Matematik(5, 6, 7);

        Class<?> matClass = matematik.getClass();

        Method[] matDeclaredMethods = matClass.getDeclaredMethods();

        for (var method : matDeclaredMethods) {
            if (method.isAnnotationPresent(MatematikAnnotation.class)) {
                //
                MatematikAnnotation annotation = method.getAnnotation(MatematikAnnotation.class);
                if (annotation.enable()) {
                    method.invoke(matematik);
                }
            }
        }
    }
}
