package org.example.example3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Kedi kedi = new Kedi("Kedi");

        Class<?> kediClass = kedi.getClass();

        Method[] kediDeclaredMethods = kediClass.getDeclaredMethods();

        for (var method : kediDeclaredMethods) {
            if (method.isAnnotationPresent(Dongu.class)) {
                Dongu annotation = method.getAnnotation(Dongu.class);

                for (int i = 0; i < annotation.sayi(); i++)
                    method.invoke(kedi);
            }
        }
    }
}
