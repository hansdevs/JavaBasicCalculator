import java.util.Scanner;

public class MathCalculator {

    public static void main(String[] args) {
        System.out.println("Loading................");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("----------------------");
        System.out.println("----------------------");
        System.out.println("|  ERROR             |");
        System.out.println("|          ERROR     |");
        System.out.println("----------------------");
        System.out.println("----------------------");
        System.out.println("---[7][8][8][<-] [^]--");
        System.out.println("---[4][5][6][->] [(]--");
        System.out.println("---[1][2][3][Etr][)]--");
        System.out.println("---[0][.][+][-][/]----");
        System.out.println("----------------------");
        System.out.println("----------------------");
        System.out.println("----------------------");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double firstNumber = scanner.nextDouble();

        System.out.println("Choose an operation: add, subtract, multiply, divide");
        String operation = scanner.next();

        System.out.println("Enter the second number:");
        double secondNumber = scanner.nextDouble();

        double result = 0;
        boolean validOperation = true;

        while (true) {
            switch (operation) {
            case "multiply":
                result = firstNumber * secondNumber;
                break;
            case "divide":
                if (secondNumber != 0) {
                result = firstNumber / secondNumber;
                } else {
                System.out.println("Cannot divide by zero.");
                validOperation = false;
                }
                break;
            case "subtract":
                result = firstNumber - secondNumber;
                break;
            case "add":
                result = firstNumber + secondNumber;
                break;
            default:
                System.out.println("Invalid operation.");
                validOperation = false;
                break;
            }
            if (validOperation) {
            System.out.println("Result: " + result);
            }

            System.out.println("Enter the first number:");
            firstNumber = scanner.nextDouble();

            System.out.println("Choose an operation: multiply, divide, subtract, add");
            operation = scanner.next();

            System.out.println("Enter the second number:");
            secondNumber = scanner.nextDouble();

            validOperation = true;
        }
        }
    }
