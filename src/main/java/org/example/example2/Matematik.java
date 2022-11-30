package org.example.example2;

public class Matematik {

    private int sayi1;
    private int sayi2;
    private int sayi3;

    public Matematik(int sayi1, int sayi2, int sayi3) {
        this.sayi1 = sayi1;
        this.sayi2 = sayi2;
        this.sayi3 = sayi3;
    }

    @MatematikAnnotation
    public void topla() {
        System.out.println("Toplama işleminin sonucu: " + (sayi1 + sayi2 + sayi3));
    }

    @MatematikAnnotation(enable = false)
    public void cikar() {
        System.out.println("Cikarm işleminin sonucu: " + (sayi1 - sayi2 - sayi3));
    }

    @MatematikAnnotation
    public void carp() {
        System.out.println("Toplama işleminin sonucu: " + (sayi1 * sayi2 * sayi3));
    }

    public void bol() {
        System.out.println("Toplama işleminin sonucu: " + (sayi1 / sayi2 / sayi3));
    }
}
