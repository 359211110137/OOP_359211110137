package ooplab5;

import java.util.Scanner;

public class InputDatatoArray {
    private static int MAX = 5;
    public static void main(String[] args) {
        int number[] = new int[MAX];
        //System.out.println(number.length);
        //for
        number = inputData(number);
        showarray(number);
        showDataEnchance(number);

    }//main

    private static void showDataEnchance(int[] number) {
        System.out.println("Data in Array: ");
        for (int val:number)
            System.out.print(val+" ");
    }

    private static void showarray(int[] number) {
        System.out.println("Data in Array: ");
        for(int i=0;i<number.length;i++)
            System.out.print(number[i]+" ");
    }//showarray

    private static int[] inputData(int[] number) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an Integer: ");
        for (int i=0;i<number.length;i++) {
            System.out.print("number["+i+"]: ");
            number[i] = scanner.nextInt();
        }
        return number;
    }//inputData

}//class
