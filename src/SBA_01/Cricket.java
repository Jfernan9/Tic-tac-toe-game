package SBA_01;

public class Cricket {
    private int [] playersIDs;
    public Cricket(){
        playersIDs = new int[11];
        for (int i =0; i< playersIDs.length;i++) {
            playersIDs[i] = i +1;

        }
        System.out.println("A new cricket team has been formed");

    }
    public void calculateAvgAge(int [] age){
        int sum = 0;
        for (int i = 0; i< age.length; i++){
            sum += age[i];
        }
        double avgAge = sum / age.length;
        System.out.println("The average age of the team is " + String.format("%.2f",avgAge));

    }
    public void retiredPlayer(int id){
        if(playersIDs[id -1]==-1){
            System.out.println("Players with id " + id + "has retired");
        }
    }
}
