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
    // This is the Recursion method that will be getting the sum of elements
     public static int calculateSum(int[] values, int position) {
        // This is the 'base case' and signifies the end of the array of numbers
         if (position == values.length) {
             return 0;
         }
         // This is the 'recursion case' which will continue to add the number it's on and the next to the sum value
         return values[position] + calculateSum(values, position + 1);
     }
 
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         System.out.println("Greetings!");
         System.out.println("This program will ask you to provide five numbers and then will calculate their sum using recursion.");
        // This is where we initialize the array that the user's numbers will go into
         int[] values = new int[5];
        // This is the prompt to the user
         System.out.println("Please enter five integers:");
 
         for (int i = 0; i < 5; i++) {
             System.out.print("Enter number " + (i + 1) + ": ");
             values[i] = input.nextInt();
         }
         // This is the call to the method to find the sum
         int total = calculateSum(values, 0);
         // Here the sum is provided to the user
         System.out.println("The total sum of the numbers you entered is: " + total);
 
         input.close();
     }
 }
 
