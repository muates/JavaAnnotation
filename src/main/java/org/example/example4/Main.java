package org.example.example4;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        LordOfRings lordOfRings = new LordOfRings(
                "Lord Of Rings, Return Of The King", "250", "Dehşet");

        Class<?> lorClass = lordOfRings.getClass();

        Field lorField = lorClass.getDeclaredField("author");
        AuthorAnnotation annotation = lorField.getAnnotation(AuthorAnnotation.class);

        System.out.println("AuthorName: " + annotation.authorName() + "\n" +
                        "Date of Birth: " + annotation.dateOfBirth());

        /*
        if (lorClass.isAnnotationPresent(AuthorAnnotation.class)) {
            AuthorAnnotation annotation = lorClass.getAnnotation(AuthorAnnotation.class);

            Field[] lorDeclaredFields = lorClass.getDeclaredFields();

            List<Object> fieldNames = getFieldNames(lorDeclaredFields, lordOfRings);

            System.out.println(
                    "AuthorName: " + annotation.authorName() + "\n"
                    + "Author Date Of Birth: " + annotation.dateOfBirth() + "\n"
                    + "------------------------------------------\n"
                    + "BookName: " + fieldNames.get(0) + "\n"
                    + "Page Of Name: " + fieldNames.get(1) + "\n"
                    + "Subject of The Book: " + fieldNames.get(2)
            );
        }
         */
    }

    public static List<Object> getFieldNames(Field[] fields, LordOfRings lor) throws IllegalAccessException {
        List<Object> fieldNames = new ArrayList<>();
        for (var field : fields) {
            field.setAccessible(true);
            fieldNames.add(field.get(lor));
        }

        return fieldNames;
    }
}
