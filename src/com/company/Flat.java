package com.company;

public class Flat extends AbstractHouse {

    public Flat(String adres) {
        super(adres);
    }

    @Override
    public void live() {
        super.live();
    }

    @Override
    public void pay() {
     System.out.println("The family pay utility bill");
    }
}
