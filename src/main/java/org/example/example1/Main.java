package org.example.example1;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> exampleClass = Class.forName("org.example.example1.ExampleClass");

        if (exampleClass.isAnnotationPresent(Example.class)) {
            System.out.println("İşlem başarılı");
        }
    }
}
