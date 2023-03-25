package SBA_01;

public class CricketPlayer {
    public static void main(String[] args) {

    Cricket team = new Cricket();
    int [] ages ={25,19,21,23,20,27,30,32,35,16,18,};
    team.calculateAvgAge(ages);
    team.retiredPlayer(3);
    }
}


