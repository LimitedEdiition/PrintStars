import java.util.Scanner;

public class PrintStars {
    public static void printStars(int times) {
        for(int i=0; i<times; i++) {
            System.out.print("*");
        }
    }

    public static void printSquare(int size) {
        for(int i=0; i<size;i++) {
            for(int j=0; j<size; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
