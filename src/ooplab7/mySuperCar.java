package ooplab7;

import java.util.ArrayList;
import java.util.Scanner;

public class mySuperCar {
    public static void main(String[] args) {
        ArrayList<SuperCar> myCarList = new ArrayList<SuperCar>();

        myCarList = inputData(myCarList);
        System.out.println("== Show Super Car Info ==");
        for (int i = 0; i < myCarList.size(); i++) {
            System.out.println(myCarList.get(i).getSuperCarInfo());
        }

    }//main

    private static ArrayList inputData(ArrayList myCarList) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert Supercar info: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Super car: " + (i + 1));
            System.out.print("Brand: ");
            String b = scanner.nextLine();
            System.out.print("Color: ");
            String c = scanner.nextLine();
            System.out.print("Engine Size: ");
            String e = scanner.nextLine();
            System.out.print("Max Speed: ");
            String m = scanner.nextLine();
            System.out.print("Country of origin: ");
            String o = scanner.nextLine();
            SuperCar car = new SuperCar(b, c, e, m, o);
            myCarList.add(car);
        }
        return myCarList;
    }

}//class
