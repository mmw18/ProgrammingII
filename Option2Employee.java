/**
 * Module 1 Critical Thinking
 * Megan M. Wright
 * Colorado State Univeristy Global
 * CSC372-1: Computer Programming II
 * Dr. Luis Gonzales
 * October 9, 2024
 */

public class Option2Employee {
    // These are fields for storing the information we need about the employee
    private String employeeFirstName;
    private String employeeLastName;
    private int employeeId;
    private double employeeSalary;

    // This is a constructor, which will intialize a new employee with the needed details (salary is set to 0)
    public Option2Employee(String employeeFirstName, String employeeLastName, int employeeId) {
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
        this.employeeId = employeeId;
        this.employeeSalary = 0.0; 
    }
    // This is a getter for the first name of the employee
    public String getEmployeeFirstName() {
        return employeeFirstName;
    }
    // This is a setter for the first name of the employee (allows for update)
    public void setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }
    // This is a getter for the last name of the employee
    public String getEmployeeLastName() {
        return employeeLastName;
    }
    // This is a setter for the last name of employee (allows for update)
    public void setEmployeeLastName(String employeeLastName) {
        this.employeeLastName = employeeLastName;
    }
    // This is a getter for the Id of the employee
    public int getEmployeeId() {
        return employeeId;
    }
    // This is a setter for the Id of the employee (allows for update even though this one probably won't change)
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    // This is a method to display a all the employee information, along with friendly greetings. 
    public void employeeSummary() {
        System.out.println("Greetings! Let's introduce you to one of our fantastic team members:");
        System.out.println("Meet " + employeeFirstName + " " + employeeLastName + "!");
        System.out.println("Their Employee ID is: " + employeeId);
        System.out.println("Their current Salary is: $" + employeeSalary);
        System.out.println("We're oh so lucky to have such a dedicated individual on our team!");
    }

   // This is the main method to for screenshot purposes and to test the Option2Employee and Option2Manager classes
   public static void main(String[] args) {
    // This will create an Option2Employee object
    Option2Employee employee = new Option2Employee("Megan", "Wright", 604827);
    employee.employeeSummary();
    System.out.println();

    //This will create an Option2Manager object
    Option2Manager manager = new Option2Manager("Rachel", "Green", 587125, "HR");
    manager.employeeSummary();
}
    
}
