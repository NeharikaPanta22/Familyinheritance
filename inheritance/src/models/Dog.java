package models;

public class Dog extends Animal{

    public String color;

    public Dog(String color, boolean vaccinated, int age){
        super(vaccinated,age);
        this.color =color;
    }
}