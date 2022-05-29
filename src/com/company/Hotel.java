package com.company;

public class Hotel extends AbstractHouse {
    public Hotel(String adres) {
        super(adres);
    }

    @Override
    public void live() {
        super.live();
    }

    @Override
    public void pay() {
        System.out.println("The family pay rent");
    }
}
