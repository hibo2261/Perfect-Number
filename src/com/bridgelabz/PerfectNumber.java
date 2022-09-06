package com.bridgelabz;
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args){

        System.out.println("********************************************");
        System.out.println(" Welcome to Perfect Number....");   //Printing Welcome Meassage
        System.out.println("********************************************");


        System.out.println("Please Enter A Number --->");
        Scanner sc = new Scanner(System.in); // Created a Scanner object
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        for (int i = 1; i < temp; i++)
            if (num % i == 0)
            {
                sum = sum + i;
            }
           if (sum == num) {
               System.out.println(num+" Is A Perfect Number.");
           }
           else
               System.out.println(num+" Is Not A Perfect Number.");


    }



}
