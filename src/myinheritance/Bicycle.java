package myinheritance;

public class Bicycle {
    // the bicycle class has two fields
    public int gear;
    public int speed;

    // the bicycle class has one constructor
    public  Bicycle(int gear, int speed){
        this.gear = gear;
        this.speed = speed;

    }

    // the bicycle class has three methods
    public void applyBreak(int decrement){
        speed -= decrement;
    }
    public void speedUp(int increment){
        speed += increment;

    }
    // toString()method to print info of bicycle
    public String toString(){
        return ( "No of gears are" + gear + "\n" + "speed of bicycle is " + speed);

    }


}
