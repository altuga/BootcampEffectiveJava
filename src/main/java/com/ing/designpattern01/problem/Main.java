package com.ing.designpattern01.problem;

public class Main {

    public static void main(String[] args) {
        YarimBursluCiftAnadalOgrenci yarimBursluCiftAnadalOgrenci =
                new YarimBursluCiftAnadalOgrenci("Kemal", "Urkmez", 89);

        System.out.println(yarimBursluCiftAnadalOgrenci.anaDalBilgisiniVer());
        System.out.println(yarimBursluCiftAnadalOgrenci.burslulukOraniniVer());

        // Burslu degilsin
    }
}
