import java.util.Scanner;

public class UserInterface {
    private final Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    public void readInput() {
        while(true) {
            System.out.println("What do you want to print?");
            String printRequest = scanner.nextLine();
            if(printRequest.equalsIgnoreCase("Stars")) {
                System.out.println("Enter how many stars to print:");
                int timesToPrint = Integer.valueOf(scanner.nextLine());
                if(validInput(timesToPrint)) {
                    PrintStars.printStars(timesToPrint);
                } else {
                    continue;
                }
            } else if(printRequest.equalsIgnoreCase("Square")) {
                System.out.println("How big is the square?");
                int sizeOfSquare = Integer.valueOf(scanner.nextLine());

            }
            System.out.println();
        }
    }

    public boolean validInput(int input) {
        if((input == 0)||(input < 0)) {
            System.out.println("INVALID INPUT!");
            return false;
        } else {
            return true;
        }
    }
}
