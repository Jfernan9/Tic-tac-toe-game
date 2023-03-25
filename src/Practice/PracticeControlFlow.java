package Practice;

import java.util.Scanner;

public class PracticeControlFlow {

    public static void main(String[] args) {
        Ex1();
    }
   public static void Ex1() {
        int x = 7;
        if (x < 10) {
            System.out.println("Less than 10");

        }
        x = 15;
    }
    public void EX2(){
        int x = 7;
        if(x<10){
            System.out.print("Less than 10");
        }
        else{
            System.out.print("Greater than 10");
            x = 15;
        }

    }
    public void EX3(){
        int x = 15;
        if(x<10) {
            System.out.print("Less than 10");}

            else if((x>10)&(x<20)){
                System.out.print("Between 10 and 20");
        }
        else if((x>20)){
            System.out.println("Greater than or equal 10 or 20");
        }

        }
        public void ex4(){
        int x = 15;
        if((x<10)&(x>20)){
            System.out.println("Out of range");

            }
        else if((x<=10)||(x>=20) )
        {
            System.out.println("In range");

            }
          }
          public void ex5(){
        double grade;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your grade:");
        grade = sc.nextDouble();
        if (grade<=100 & grade>=90){ //(true)
            System.out.print("Your grade is A");
        } else if ((grade<=89)& (grade>=80)) {
            System.out.print("Your grade is B");
        } else if((grade<=79)&(grade>=70)) {
            System.out.print("Your grade is C");
        } else if ((grade<=69)&(grade>=60)) {
            System.out.println("Your grade is D");
        } else if((grade<=60)&(grade>=0)){
         System.out.println("Your grade is F");
        }
        }
          public void ex6(){

    }











}