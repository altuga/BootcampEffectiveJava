package com.ing.designpattern01.problem;

public abstract class Ogrenci {

    protected String ad;
    protected String soyad;
    protected double not;

    protected double notlariniVer(){
        return not;
    }

    protected abstract String burslulukOraniniVer();
    protected abstract String anaDalBilgisiniVer();

}
