package com.company;

public class Main {

    public static void main(String[] args) {
        Person [] members = new Person[] {new Person(), new Person ()};
        Person []member1 = new Person[] {new Person(),new Person(), new Person()};
        Person [] members2 = new Person[] {new Person(), new Person(), new Person()};
        AbstractHouse flat = new Flat("Bishkek city 5-10-18");
        AbstractHouse hostel = new Hostel ("Bishkek city Osh street 49");
        AbstractHouse hotel = new Hotel("Bishkek city Sovet street 100");
	Famile famile = new Famile(members,flat);
    Famile famile1 = new Famile(member1,hostel);
    Famile famile2 = new Famile(members2,hotel);
        famile.house.live();
        famile.house.pay();
        System.out.println();
        famile1.house.live();
        famile1.house.pay();
        System.out.println();
        famile2.house.live();
        famile2.house.pay();
    }
}
