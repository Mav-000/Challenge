import java.util.Scanner;

public class TheYear {
    public static void main (String[] args) {
        int year = 2026;
        System.out.println("I was made in " + year);
        System.out.println("Activating time machine...");
        waitForTheFuture(args);
        System.out.println("The future is here! It's the year " + (year + 4) + "!");
    }

    private static void waitForTheFuture(String[] args) {
        // Simulate waiting for the future
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of seconds to wait for the future: ");
        int time = scanner.nextInt();
        try { 
            Thread.sleep(time * 1000); // Wait for the specified number of seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


// This program is a tsmoe thinng thin o to ehfmrotjgit