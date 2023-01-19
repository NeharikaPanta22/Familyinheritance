package models;

public class Cat extends Animal{

    public String color;

    public Cat(String color, boolean vaccinated, int age){
        super(vaccinated,age);
        this.color =color;
    }
}