package org.example.example5;

@CustomTypeAnnotation(
        priority = CustomTypeAnnotation.Priority.HIGH,
        tags = {"java", "annotation", "spring"},
        createdBy = "BilgeAdam"
)
public class CustomExample {

    @CustomMethodAnnotation
    public String m1() {
        return "Hi!";
    }

    @CustomMethodAnnotation
    public String m2() {
        throw new RuntimeException("Boom");
    }

    @CustomMethodAnnotation(enable = false)
    public String m3() {
        throw new RuntimeException("Boom");
    }
}
