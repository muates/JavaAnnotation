package org.example.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> kopekClass = Class.forName("org.example.reflection.Kopek");

        Constructor<?>[] kopekDeclaredConstructors = kopekClass.getDeclaredConstructors();
        Method[] kopekDeclaredMethods = kopekClass.getDeclaredMethods();
        Field[] kopekDeclaredFields = kopekClass.getDeclaredFields();

        for (Constructor<?> cons : kopekDeclaredConstructors)
            System.out.println(cons.getName());

        System.out.println("**************************************");

        for (Method method : kopekDeclaredMethods)
            System.out.println(method.getName());

        System.out.println("**************************************");

        for (Field field : kopekDeclaredFields)
            System.out.println(field.getName());

    }
}
