/**
 * Module 6 Critical Thinking
 * Megan M. Wright
 * Colorado State Univeristy Global
 * CSC372-1: Computer Programming II
 * Dr. Luis Gonzales
 * November 17, 2024
 */

// This is the class to represent a student with a name, roll number, and street address attributes. 
public class Option2Student {
    private int rollNumber;
    private String fullName;
    private String residentialAddress;

    public Option2Student(int rollNumber, String fullName, String residentialAddress) {
        this.rollNumber = rollNumber;
        this.fullName = fullName;
        this.residentialAddress = residentialAddress;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    @Override
    public String toString() {
        return "Roll Number: " + rollNumber + ", Name: " + fullName + ", Address: " + residentialAddress;
    }
}
