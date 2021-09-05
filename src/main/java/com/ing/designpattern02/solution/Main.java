package com.ing.designpattern02.solution;

public class Main {

    public static void main(String[] args) {
        Icecek latte = new Latte();
        System.out.println(latte.fiyatHesapla());

        latte = new BolSutlu(latte);
        System.out.println(latte.getAciklama() + " " + latte.fiyatHesapla());

        latte  = new Buzlu(latte);
        System.out.println(latte.getAciklama() + " " + latte.fiyatHesapla());
    }
}
