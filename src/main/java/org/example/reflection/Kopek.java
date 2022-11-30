package org.example.reflection;

public class Kopek {

    private String isim;
    private String cinsi;
    private String yas;

    public Kopek() {
    }

    public Kopek(String isim) {
        this.isim = isim;
    }

    public Kopek(String isim, String cinsi) {
        this.isim = isim;
        this.cinsi = cinsi;
    }

    public Kopek(String isim, String cinsi, String yas) {
        this.isim = isim;
        this.cinsi = cinsi;
        this.yas = yas;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getCinsi() {
        return cinsi;
    }

    public void setCinsi(String cinsi) {
        this.cinsi = cinsi;
    }

    public String getYas() {
        return yas;
    }

    public void setYas(String yas) {
        this.yas = yas;
    }
}
