package Ch_Object;

public class LampImpl
{
    public static void main(String[] args)
    {
        /// create objects led and halogen
        Lamp led = new Lamp ();
        Lamp halogen = new Lamp() ;
        // turn on the light by
        // calling method turnon()
        led.turnOn();
        // turn off the light by
        // calling method turnoff()
        halogen.turnOff();


    }
}
