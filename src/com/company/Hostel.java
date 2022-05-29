package com.company;

public class Hostel extends AbstractHouse {
    public Hostel(String adres) {
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
