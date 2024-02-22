import java.util.Scanner;

class PositiveInteger {
    private int userInput;

    PositiveInteger(int input) {
        this.userInput = input;
    }

    public void setUserInput(int userInput) {
        this.userInput = userInput;
    }

    public int getUserInput() {
        return userInput;
    }

    public int analyzeInput() {
        if (userInput % 2 == 0) {
            userInput /= 2;
        } else {
            userInput = 3 * userInput + 1;
        }

        return userInput;
    }
}

public class PartA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a positive number: ");

        int input = scan.nextInt();

        while (input <= 0) {
            System.out.print("ERROR: Positive numbers only, try again: ");
            input = scan.nextInt();
        }

        PositiveInteger positiveInteger = new PositiveInteger(input);

        while(positiveInteger.getUserInput() > 1) {
            System.out.println(positiveInteger.analyzeInput());
        }
    }
}