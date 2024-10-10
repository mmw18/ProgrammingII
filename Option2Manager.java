/**
 * Module 1 Critical Thinking
 * Megan M. Wright
 * Colorado State Univeristy Global
 * CSC372-1: Computer Programming II
 * Dr. Luis Gonzales
 * October 9, 2024
 */

/**
 * This is the Option2Manager class that is extending the Option2Employee class.
 * It adds department-specific information.
 */
public class Option2Manager extends Option2Employee {
    // This field stores the department that the manager oversees
    private String department;

    // This is a constructor, which will initialize a new manager with their details, including department
    // It uses the constructor from the Option2Employee class to set common employee attributes
    public Option2Manager(String employeeFirstName, String employeeLastName, int employeeId, String department) {
        super(employeeFirstName, employeeLastName, employeeId); // Calls the parent class constructor
        this.department = department; // Sets the specific department for the manager
    }

    // This is a getter for the department of the manager
    public String getDepartment() {
        return department;
    }

    // This is a setter for the department of the manager (allows for update)
    public void setDepartment(String department) {
        this.department = department;
    }

    // This is a method to display all the manager's information, including their department
    // It overrides the employeeSummary method and adds department information
    @Override
    public void employeeSummary() {
        // This will call the parent class method to display common employee details
        super.employeeSummary();
        // This will add all the department-specific information
        System.out.println("They manage the following department: " + department);
        System.out.println("Their leadership is invaluable to our organization's success!");
    }

    // Main method to test the Option2Manager class directly
    public static void main(String[] args) {
        // Create an Option2Manager object
        Option2Manager manager = new Option2Manager("Rachel", "Green", 587125, "IT");
        manager.employeeSummary();
        System.out.println();
    }
}
