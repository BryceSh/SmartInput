/*

This is just a simple project I've made to make user input and validation easier.
This includes,
 - Error handling
 - User Inputs

 */

import java.util.Scanner;

public class SInput {

    Scanner scanner = new Scanner(System.in);

    public String inputString(String prompt) {
        System.out.print(prompt);
        return scanner.next();
    }

    public String inputString(String prompt, boolean displayErrors) {
        System.out.println("Note, SInput.inputString does not support displayErrors");
        return this.inputString(prompt);
    }

    public String inputString() { // 0-arity
        return inputString("");
    }

    public int inputInteger(String prompt, boolean displayErrors) {
        boolean valid = false;
        int x = 0;
        while (!valid) {
            try {
                System.out.print(prompt);
                String input = scanner.next();
                x = Integer.parseInt(input);
                valid = true;
            } catch (NumberFormatException e) {
                if (displayErrors)
                    System.out.println("Invalid Numeric Integer! Please try again.");
            }
        }
        return x;
    }

    public int inputInteger(String prompt) {
        return this.inputInteger(prompt, false);
    }

    public int inputInteger() {
        return this.inputInteger("", false);
    }

    public double doubleInput(String prompt, boolean displayErrors) {
        boolean valid = false;
        double a = 0; // This is what will be parsed the value into
        while (!valid) {
            try {
                System.out.print(prompt);
                String input = scanner.next();
                a = Double.parseDouble(input);
                valid = true;
            } catch (NumberFormatException e) {
                if (displayErrors) {
                    System.out.println("Invalid Numeric Double! Please try again.");
                }
            }
        }
        return a;
    }

    public double doubleInput(String prompt) {return this.doubleInput(prompt, false);}

    public double doubleInput() { return this.doubleInput("", false); }

}
