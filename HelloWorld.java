import java.util.Scanner;

public class HelloWorld {
    public static void main (String[] args) {
        String name = "Mav";
        System.out.println("Hello world!");
        System.out.println("My name is " + name);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your name is? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
    }

}

