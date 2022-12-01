import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        double height, weight;
        Scanner scn = new Scanner(System.in);
        System.out.println("Please Enter height");
        height = scn.nextDouble();
        System.out.println("Please Enter weight");
        weight = scn.nextDouble();


         Calculator obj = new Calculator();
         obj.BMI(height,weight);


    }

}

