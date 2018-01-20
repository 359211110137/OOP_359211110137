package midterm;


import java.util.Scanner;

public class mid3_2 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String ID = getID();
        String Name = getname();
        float Salary = getSalary();
        float OverTime = getOverTime();
        calculateTex(Salary,OverTime);
        ShowDataInfo(ID,Name,Salary,OverTime);

    }//main

    private static void ShowDataInfo(String ID, String Name, float Salary, float OverTime) {
        mid3_2 a = new mid3_2();
        System.out.println("ID: "+ID);
        System.out.println("Name: "+Name);
        System.out.println("Salary: "+Salary);
        System.out.println("OverTime: "+OverTime);
        System.out.println("Tex is: "+a.calculateTex(Salary,OverTime));

    }

    private static float calculateTex(float a, float b) {

        float sum = a+b;
        System.out.println("Salary Total: "+sum);
        if (sum>=100000)
        {
             return (sum*10)/100;
        }


        else if (sum>=70000){
            return (sum*7)/100;
        }
        else if (sum>=50000) {
            return (sum*5)/100;
        }
        else if (sum>=30000) {
            return (sum*3)/100;
        }
        else{
            return (sum*1)/100;
        }

    }


    private static Float getOverTime() {
        System.out.print("Enter your OverTime: ");
        Float OverTime = scan.nextFloat();
        return OverTime;
    }

    private static int getSalary() {
        System.out.print("Enter your Salary: ");
        int Salary = scan.nextInt();
        return Salary;
    }

    private static String getname() {
        System.out.print("Enter your Name: ");
        String Name = scan.nextLine();
        return Name;
    }

    private static String getID() {
    System.out.print("Enter your ID: ");
        String ID = scan.nextLine();
        return ID;
    }


}//class
