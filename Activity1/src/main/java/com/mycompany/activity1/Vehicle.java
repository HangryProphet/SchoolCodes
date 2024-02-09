package com.mycompany.activity1;

public class Vehicle {
    public int wheels;
    
    public Vehicle (int wheels){
        this.wheels = wheels;
    }
    void display(){
        System.out.println(wheels + " wheels");
    }
}
    
class Car extends Vehicle {
    Car(int wheels){
    super(wheels);
}
    void display() {
    super.display();
}
}
class Bike extends Vehicle {
    Bike(int wheels){
    super(wheels);
}
    void display() {
    super.display();
}
}
class Truck extends Vehicle {
    Truck(int wheels){
    super(wheels);
}
    void display() {
    super.display();
}
}




 