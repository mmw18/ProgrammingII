/**
 * Module 6 Critical Thinking
 * Megan M. Wright
 * Colorado State Univeristy Global
 * CSC372-1: Computer Programming II
 * Dr. Luis Gonzales
 * November 17, 2024
 */

import java.util.ArrayList;

//This is a utility class used to sort the roster of students by roll number using merge sort. 
public class Option2MergeSort {

    // @param students > the ArrayList of Student objects to sort.

    public static void sort(ArrayList<Option2Student> students) {
        if (students.size() < 2) {
            return;
        }

        int midIndex = students.size() / 2;
        ArrayList<Option2Student> LittleList1 = new ArrayList<>(students.subList(0, midIndex));
        ArrayList<Option2Student> LittleList2 = new ArrayList<>(students.subList(midIndex, students.size()));

        sort(LittleList1);
        sort(LittleList2);

        merge(students, LittleList1, LittleList2);
    }

    
     // This will merge the 2 sorted lists back into single list
     // @param originalList > the list to store merged results.
     // @param LittleList1 > the left half of sorted elements.
     // @param LittleList2 > the right half of sorted elements.
     
    private static void merge(ArrayList<Option2Student> originalList, ArrayList<Option2Student> LittleList1, ArrayList<Option2Student> LittleList2) {
        int i = 0, j = 0, k = 0;

        while (i < LittleList1.size() && j < LittleList2.size()) {
            if (LittleList1.get(i).getRollNumber() <= LittleList2.get(j).getRollNumber()) {
                originalList.set(k++, LittleList1.get(i++));
            } else {
                originalList.set(k++, LittleList2.get(j++));
            }
        }
        // This will add little list 1 back into the original list
        while (i < LittleList1.size()) {
            originalList.set(k++, LittleList1.get(i++));
        }
        // this will add little list 2 back into the original list
        while (j < LittleList2.size()) {
            originalList.set(k++, LittleList2.get(j++));
        }
    }
}
