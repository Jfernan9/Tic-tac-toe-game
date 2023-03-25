package SBA_01;

public class Football {

    private int[] playersIDs;

    public Football(){
        playersIDs = new int[11];
        for (int i = 0; i<11; i++){
            playersIDs[i] = 1;
        }
        System.out.println("A new Football team has been formed");
    }
    public void calculatAvgAge(int [] age) {
        int totalAge = 0;
        for (int i = 0; i<age.length;i++){
            totalAge += age[i];
        }
        double avgAge = (double)  totalAge / age.length;
        System.out.printf("The average age of the team is %.2f\n", avgAge);
    }
    public void retirePlayer(int id) {
        if(playersIDs[id-1]==-1);
        System.out.println("Player with id " + id + " has retired");
    }
    public void playerTransfer(int fee, int id) {
        if(playersIDs[id - 1] == -1){
            System.out.println("Player with id " + id + "has been transferred with a fee of " + fee );
        }
    }
}
