package SBA_01;

public class FootballPlayer {
    public static void main(String[] args) {
        Football football = new Football();
        int [] age = {17,16,18,20,22,24,23,26,29,32,21};
        football.calculatAvgAge(age);
        football.retirePlayer(10);
        football.playerTransfer(50000000,2);
    }
}
