package smartHomeSystem;

import java.util.Scanner;

public class Utility {
    Scanner sc = new Scanner(System.in);
    // return user input as a string
    public String getUserInput(String prompt) {
        IO.print(prompt);
        return sc.nextLine();
    }
    // return user input as a double, with error handling for invalid input
    public double getUserInputDouble(String prompt) {
        while (true) {
            try {
                return Double.parseDouble(getUserInput(prompt));
            } catch (NumberFormatException e) {
                IO.print("Invalid input. Please enter a valid number: ");
            }
        }
    }
    // return user input as an int, with error handling for invalid input
    public int getUserInputInt(String prompt) {
        while (true) {
            try {
                return Integer.parseInt(getUserInput(prompt));
            } catch (NumberFormatException e) {
                IO.print("Invalid input. Please enter a valid number: ");
            }
        }
    }
    // return user input as a string, with leading and trailing whitespace removed and converted to lowercase
    public String getUserInputString(String prompt) {
        return getUserInput(prompt).trim().toLowerCase();
    }

    public void space() {
        IO.println("-----------------------------");
    }
}
