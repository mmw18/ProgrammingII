import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

// This is the vehicle class, which will hold the information entered by the user
class Vehicle {
    private String brand, type;
    private double efficiency;

    public Vehicle(String brand, String type, double efficiency) {
        this.brand = brand;
        this.type = type;
        this.efficiency = efficiency;
    }

    public double getEfficiency() {
        return efficiency;
    }

    @Override
    public String toString() {
        return "Make: " + brand + ", Model: " + type + ", MPG: " + efficiency;
    }
}
// This is the main class of the program, handling the user's input, data storage, sorting, and file writing
public class Option2Final {
    public static void main(String[] args) {
        LinkedList<Vehicle> vehicleList = new LinkedList<>();
        Scanner userInput = new Scanner(System.in);

        System.out.println("Welcome to the Vehicle Data Entry Program!");
        boolean continueEntry = true;

        // This is the loop to gather vehicle data from the user
        while (continueEntry) {
            System.out.print("Enter vehicle make (brand): ");
            String enteredMake = userInput.nextLine();

            System.out.print("Enter vehicle model (type): ");
            String enteredModel = userInput.nextLine();

            double fuelEfficiency; // Variable to store MPG.
            while (true) {
                System.out.print("Enter vehicle miles per gallon (efficiency): ");
                String mpgInput = userInput.nextLine();
                try {
                    fuelEfficiency = Double.parseDouble(mpgInput);
                    if (fuelEfficiency <= 0) {
                        throw new NumberFormatException("MPG must be positive.");
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid positive number for MPG.");
                }
            }

            // Here it is adding the new Vehicle object to the LinkedList.
            vehicleList.add(new Vehicle(enteredMake, enteredModel, fuelEfficiency));

            // This is a prompt for the user to continue or stop data entry
            System.out.print("Would you like to enter another vehicle? (yes/no): ");
            if (!userInput.nextLine().trim().equalsIgnoreCase("yes")) continueEntry = false;
        }

        System.out.println("Sorting vehicles by MPG...");
        vehicleList.sort((v1, v2) -> Double.compare(v1.getEfficiency(), v2.getEfficiency()));

        System.out.println("Writing sorted vehicle data to vehicles_output.txt...");
        // Here it's writing the data to a text file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("vehicles_output.txt"))) {
            for (Vehicle vehicle : vehicleList) {
                writer.write(vehicle.toString() + System.lineSeparator());
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        System.out.println("Data successfully written to vehicles_output.txt. Program complete!");
        userInput.close();
    }
}
