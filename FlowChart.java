import java.util.Scanner;

public class FlowChart {
    
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            if(i == 0) { System.out.println("This is a flowchart program.");
            Scanner first = new Scanner(System.in);
            System.out.println("Your name is? ");
            String name = first.nextLine();
            System.out.println("Hello, " + name + ", I'm gonna flowchart it up now.");
        } else if (i == 1) { 
            Scanner second = new Scanner(System.in);
            System.out.println("Before we start, please type answers exactuly as they are written. Do you understand? (yes/no) ");
            String twoanswer = second.nextLine();
            if (twoanswer.equals("yes")) {
                System.out.println("Cool beef, initializing next question...");
            } else if (twoanswer.equals("no")) {
                Scanner secondTwo = new Scanner(System.in);
                System.out.println("I hope your joking... Please type 'yes' to confirm you understand: ");
                String twoanswerTwo = secondTwo.nextLine();
                if (twoanswerTwo.equals("yes")) {
                    System.out.println("Phew, initializing next question...");
                } else if (twoanswerTwo.equals("no")) {
                    System.out.println("What? You- you still don't undestand? No, c'mon, quit playin around, just type 'yes' to confirm you understand: ");
                    Scanner secondThree = new Scanner (System.in);
                    String twoanswerThree = secondThree.nextLine();
                    if (twoanswerThree.equals("yes")) {
                        System.out.println("Thank heaveans, initializing next question...");
                    } else if (twoanswerThree.equals("no")) {
                        System.out.println("Well, i suppose if you don't understand... Can't really change that can I? Well, I mean, we did get to flow chart a little i guess... but c'mon, I made a whole WORLD of flowchart for you to explore, and you chose this one. It doen't count. Goodbye " + name + ".");
                        i = 67; // This kills the for loop
                    } else {
                        System.out.println("You nitwit! That is not an aceptable answer! Well that's it, I'm not gonna flowchart with you if you can't follow simple instructions! Goodbye!");
                        i = 67; // This kills the for loop
                    }
                } else {
                    System.out.println("You nitwit! That is not an aceptable answer! Well that's it, I'm not gonna flowchart with you if you can't follow simple instructions! Goodbye!");
                    i = 67; // This kills the for loop
                }
            } else {
                System.out.println("You nitwit! That is not an aceptable answer! Well that's it, I'm not gonna flowchart with you if you can't follow simple instructions! Goodbye!");
                i = 67; // This kills the for loop
            }
            }
         else if (i == 2) { System.out.println("filler");
        } else if (i == 3) { System.out.println("filler");
        } else if (i == 4) { System.out.println("filler");
        } else if (i == 5) { System.out.println("still filler");
        } else if (i == 6) { System.out.println("yeah, i haven't made these ones yet");
        } else if (i == 7) { System.out.println("filler");
        } else if (i == 8) { System.out.println("filler");
        } else if (i == 9) { }
        

       
        }
         System.out.println("End of the flowchart program.");
    }
}