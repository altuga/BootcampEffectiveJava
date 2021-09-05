package com.ing.designpattern01.solution;

public class Ogrenci {

    protected String ad;
    protected String soyad;
    protected double not;

    public Ogrenci(String ad, String soyad, double not) {
        this.ad = ad;
        this.soyad = soyad;
        this.not = not;
    }

    protected Bursluluk bursluluk;

    public void setBursluluk(Bursluluk bursluluk) {
        this.bursluluk = bursluluk;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", not=" + not +
                ", bursluluk=" + bursluluk.bursOraniniVer() +
                ", anadallilik=" + anadallilik.anaDalBilgisiniSoyle() +
                '}';
    }

    public void setAnadallilik(Anadallilik anadallilik) {
        this.anadallilik = anadallilik;
    }

    protected Anadallilik anadallilik;

    protected double notlariniVer(){
        return not;
    }



}
