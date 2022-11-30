package org.example.example5;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Class.forName("org.example.example5.CustomExample");

        if (clazz.isAnnotationPresent(CustomTypeAnnotation.class)) {

        }
    }
}
