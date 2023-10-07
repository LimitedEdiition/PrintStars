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

            // STARS
            if((printRequest.equalsIgnoreCase("Stars"))||(printRequest.equalsIgnoreCase("Star"))) {
                System.out.println("Enter how many stars to print:");
                int timesToPrint = Integer.valueOf(scanner.nextLine());
                if(validInput(timesToPrint)) {
                    PrintStars.printStars(timesToPrint);
                } else {
                    continue;
                }

                // SQUARE
            } else if(printRequest.equalsIgnoreCase("Square")) {
                System.out.println("How big is the square?");
                int sizeOfSquare = Integer.valueOf(scanner.nextLine());
                if(validInput(sizeOfSquare)) {
                    PrintStars.printSquare(sizeOfSquare);
                } else {
                    continue;
                }

                // RECTANGLE
            } else if(printRequest.equalsIgnoreCase("Rectangle")) {
                System.out.println("What is the height of the rectangle?");
                int height = Integer.valueOf(scanner.nextLine());
                if(validInput(height)) {
                    System.out.println("What is the width of the rectangle?");
                    int width = Integer.valueOf(scanner.nextLine());
                    if(validInput(width)) {
                        PrintStars.printRectangle(height, width);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            } else if(printRequest.equalsIgnoreCase("Triangle")) {
                System.out.println("Is this a LEFT or RIGHT leaning triangle?");
                String triangleType = scanner.nextLine();
                if(triangleType.equalsIgnoreCase("Right")) {
                    System.out.println("What is the height of the right leaning triangle?");
                    int height = Integer.valueOf(scanner.nextLine());
                    if(validInput(height)) {
                        PrintStars.rightTriangle(height);
                    } else {
                        continue;
                    }
                } else if(triangleType.equalsIgnoreCase("Left")) {
                    System.out.println("What is the height of the left leaning triangle?");
                    int height = Integer.valueOf(scanner.nextLine());
                    if(validInput(height)) {
                        PrintStars.leftTriangle(height);
                    } else {
                        continue;
                    }
                } else {
                    System.out.println("INVALID INPUT\n");
                    continue;
                }

                // END
            } else if(printRequest.equalsIgnoreCase("End")){
                System.out.println("Thank you.");
                break;

                //INVALID INPUT
            } else {
                System.out.println("INVALID INPUT - TRY AGAIN\n");
                continue;
            }


            // New Line to clean up GUI
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
