import java.util.Scanner;

public class PrintStars {
    public static void printStars(int times) {
        for(int i=0; i<times; i++) {
            System.out.print("*");
        }
    }

    public static void printSquare(int size) {
        for(int i=0; i<size;i++) {
            printStars(size);
            System.out.println();
        }
    }

    public static void printRectangle(int height, int width) {
        for(int i=0; i<height; i++) {
            printStars(width);
            System.out.println();
        }
    }

    public static void rightTriangle(int height) {
        for(int i=1; i<=height; i++) {
            printStars(i);
            System.out.println();
        }
    }

    public static void printSpace(int spaces) {
        for(int i=0; i<spaces; i++) {
            System.out.print(" ");
        }
    }

    public static void leftTriangle(int height) {
        for(int i=1; i<=height; i++) {
            printSpace(height-i);
            printStars(i);
            System.out.println();
        }
    }



}
