package com.company;

public abstract class AbstractHouse implements Payable, Liveable {
    String adres;

    public AbstractHouse(String adres) {
        this.adres = adres;
    }

    @Override
    public void live() {
        System.out.println("The family lives: " + adres);

    }

    @Override
    public void pay() {

    }
}
