package models;

public class Animal {

    public int no_of_legs =4;
    private String breed ="Animal";

    public boolean vaccinated;
    public int age;

    public Animal(boolean vaccinated, int age){
        this.vaccinated = vaccinated;
        this.age = age;
    }
}
