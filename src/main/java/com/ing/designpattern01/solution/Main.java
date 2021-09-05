package com.ing.designpattern01.solution;

public class Main {
    public static void main(String[] args) {
        Ogrenci kemal = new Ogrenci("Kemal", "Urkmez", 89);
        kemal.setBursluluk(new TamBurs());
        kemal.setAnadallilik(new TekAnadal());
        System.out.println(kemal);

        kemal.setAnadallilik(new CiftAnadal());
        System.out.println(kemal);

        kemal.setBursluluk(new HicBursYok());
        System.out.println(kemal);

    }
}
