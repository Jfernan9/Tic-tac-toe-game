package SBA_01;

import java.util.Arrays;

public class AirlineSeat {
    final int NO_OF_SEATS = 11;
    int[] seatIDs;

    AirlineSeat()
    {
        seatIDs = new int[NO_OF_SEATS + 1];
        Arrays.fill(this.seatIDs, 1);
        this.seatIDs[0] = -1;
        System.out.println("A new Airline seating has been formed");
    }


    public void calculatePassengersAvgAge(int[] ages)
    {

        float avg,sum= 0;
        for(int i :ages)
        sum += i;
        avg = sum/ages.length;
        System.out.format("The average age of the passenger is %.2f\n",avg);
    }
    public void transitPassengers(int seatID)
    {
        if(this.seatIDs[seatID] == 1)
        {
            System.out.println("The Passenger with id: "+seatID+" has is transiting");
            this.seatIDs[seatID] = -1;
        }
        else System.out.println("This Passenger has already transitted");
    }



}
