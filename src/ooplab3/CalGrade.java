package ooplab3;
//0-49 = F
//50-59 = D
//60-69 = C
//70-79 = B
//80-100 = A

import java.util.Scanner;

public class CalGrade {
    public static void main(String[] args) {
//        Scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your score: ");
        int score = scan.nextInt();
//        test condition

        if(score <= 80)
            System.out.println("Your grade is F");
            else if (score<=59) System.out.println("Your grade is D");
            else if (score<=69) System.out.println("Your grade is C");
            else if (score<=79) System.out.println("Your grade is B");
            else
                System.out.println("Your grade is A");


    }//main

}//class
