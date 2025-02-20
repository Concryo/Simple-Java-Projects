import java.util.Scanner;

public class Main {

    // First calculator i made (:

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNum;
        double secondNum;
        double output = 0;

        PRINT((short) 1, output);

        firstNum = Double.parseDouble(INPUT(scanner));
        String operator = INPUT(scanner);
        do {
            secondNum = Double.parseDouble(INPUT(scanner));
            output = MATH(firstNum, secondNum, operator);
            if (secondNum == 0 && operator.equals("/")) {
                System.out.println("Cant Divide 0 by 0. retry");
            }
        } while (operator.equals("/") && secondNum == 0);

        PRINT((short) 2, output);
        scanner.close();
    }

    public static void PRINT(short choice, double output) {
        switch (choice) {
            case 1 -> System.out.println("Input Operation (+,-,*,/)");
            case 2 -> System.out.println("Output: " + output);
        }
    }

    public static String INPUT(Scanner scanner) {
        return scanner.nextLine();
    }

    public static double MATH(double firstNum, double secondNum, String operator) {
        double output = 0;
        switch (operator) {
            case "+" -> output = firstNum + secondNum;
            case "-" -> output = firstNum - secondNum;
            case "*" -> output = firstNum * secondNum;
            case "/" -> {
                try {
                    output = firstNum / secondNum;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return output;
    }
}