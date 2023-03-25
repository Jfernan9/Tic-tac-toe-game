package myinheritance;

public class MountainBike extends Bicycle {

    // the mountainbike subclass adds one more field
    public  int seatHeight;
    public MountainBike(int gear, int speed, int startHeight)
    {
        // invoking base-class(Bicycle) constructor
        super(gear, speed);
        seatHeight = startHeight;

    }
    // the MountainBike subclass add one more method
    public void setSeatHeight(int newValue)
    {
        seatHeight = newValue;
    }
    //overridding toString()method
    // of Bicycle to print more info
    @Override public  String toString()
    {
        return (super.toString() + "\nseat height is" + seatHeight);

    }
}
