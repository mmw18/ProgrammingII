/**
 * Module 6 Critical Thinking
 * Megan M. Wright
 * Colorado State Univeristy Global
 * CSC372-1: Computer Programming II
 * Dr. Luis Gonzales
 * November 17, 2024
 */
import java.util.ArrayList;

/**
 * This is the main class that will be managing and sorting a list of student objects. 
 * It will sort the students in order of their roll number, using a custom merge sort
 * application that is defined in a separate file.
 */
public class Option2SortArray {

    public static void main(String[] args) {
        // This is the array list which will hold the student information
        ArrayList<Option2Student> roster = new ArrayList<>();

        roster.add(new Option2Student(358462, "Rachel Green", "15 Bloomingdale Lane"));
        roster.add(new Option2Student(845155, "Monica Geller", "10 Clean Sweep Avenue"));
        roster.add(new Option2Student(659323, "Ross Geller", "112 Fossil Lane"));
        roster.add(new Option2Student(764985, "Chandler Bing", "17 Sarcasm Sreet"));
        roster.add(new Option2Student(104625, "Joey Tribbiani", "532 Meatball Drive"));
        roster.add(new Option2Student(399764, "Phoebe Buffay", "32 Smelly Cat Lane"));
        roster.add(new Option2Student(429216, "Gunther", "712 Coffee Brew Court"));
        roster.add(new Option2Student(748851, "Janice Hosenstein", "434 OH-MY-GOD Boulevard"));
        roster.add(new Option2Student(549276, "Richard Burke", "882 Stache Lane"));
        roster.add(new Option2Student(933581, "Mike Hannigan", "97 Piano Key Way"));

        System.out.println("Here is the unsorted Roster:");
        for (Option2Student student : roster) {
            System.out.println(student);
        }

        // Here we will sort the student roster by roll number, using custom 
        Option2MergeSort.sort(roster);

        System.out.println("\nHere is the roster, now sorted by roll number");
        for (Option2Student student : roster) {
            System.out.println(student);
        }
    }
}
