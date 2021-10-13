package GlobalLogic;

import java.util.Scanner;

//Write a program that accepts three numbers from the user and prints "increasing" if the numbers are in increasing order, "decreasing" if the 
//numbers are in decreasing order, and "Neither increasing or decreasing order" otherwise.
10
public class EX7 {
   public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        double num1 = in.nextDouble();
        System.out.print("Input second number: ");
        double num2 = in.nextDouble();
       System.out.print("Input third number: ");
        double num3 = in.nextDouble();
        if (num1 < num2 && num2 < num3)
        {
            System.out.println("Numbers are in Increasing order");
        }
        else if (num1 > num2 && num2 > num3)
        {
            System.out.println("Numbers are in Decreasing order");
        }
        else
        {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}