package org.example.example3;

public class Kedi {

    private String name;

    public Kedi(String name) {
        this.name = name;
    }

    @Dongu(sayi = 7)
    public void sesCikar() {
        System.out.println("Meow!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
