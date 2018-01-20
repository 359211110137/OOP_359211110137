package midterm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class mid3_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        int age;
        int check;
        int a=1;
        String i;
        do {
            do {
                System.out.print("Enter Year" + a + ":");
                i = reader.readLine();
                check = Integer.parseInt(i);
                age = 2561 - check;
                System.out.print("Age"+a+":" + age);
                System.out.println(" ");
                a++;
            }
            while (a <= 3);
        }
        while (a == 1);
                System.out.println("Thank you.");
    }//main
}//class
