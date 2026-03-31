import java.util.Scanner;

public class Testing {
    static Scanner input = new Scanner(System.in);

    private static final String RESET = "\u001B[0m";
    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String YELLOW = "\u001B[33m";
    private static final String BLUE = "\u001B[34m";
    private static final String PURPLE = "\u001B[35m";
    private static final String CYAN = "\u001B[36m";
    private static final String WHITE = "\u001B[37m";

    public static void main(String[] args) {
        System.out.print(RED);
        System.out.println("This is red text.");
        System.out.print(GREEN);
        System.out.println("This is green text.");
        System.out.print(RESET);
        System.out.println("This is normal text.");
        }
    }
    