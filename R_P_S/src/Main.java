import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("R - P - S");
        System.out.print("User Input: ");
        String userInput = scanner.nextLine();
        String userChoice = userInput.toLowerCase();

        int randomNum = (int)(Math.random() * 3 + 1);
        String cpuChoice = "nul";

        switch (randomNum) {
            case 1 -> cpuChoice = "r";
            case 2 -> cpuChoice = "p";
            case 3 -> cpuChoice = "s";
        }
        System.out.println("Cpu Input: " + cpuChoice);

        if (userChoice.equals(cpuChoice)) {
            System.out.println("It's A Draw!");
        } else if (userChoice.equals("r") && cpuChoice.equals("s") || userChoice.equals("p") && cpuChoice.equals("r") || userChoice.equals("s") && cpuChoice.equals("p")){
            System.out.println("User Wins!");
        } else {
            System.out.println("Cpu Wins!");
        }
    }
}