/**
 * Module 5 Critical Thinking
 * Megan M. Wright
 * Colorado State Univeristy Global
 * CSC372-1: Computer Programming II
 * Dr. Luis Gonzales
 * November 5th, 2024
 */

 import java.util.Scanner;

 public class Option2RecursionSum {
 
     public static int calculateSum(int[] values, int position) {
         if (position == values.length) {
             return 0;
         }
         return values[position] + calculateSum(values, position + 1);
     }
 
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         System.out.println("Greetings!");
         System.out.println("This program will ask you to provide five numbers and then will calculate their sum using recursion.");

         int[] values = new int[5];

         System.out.println("Please enter five integers:");
 
         for (int i = 0; i < 5; i++) {
             System.out.print("Enter number " + (i + 1) + ": ");
             values[i] = input.nextInt();
         }

         int total = calculateSum(values, 0);

         System.out.println("The total sum of the numbers you entered is: " + total);
 
         input.close();
     }
 }
 
