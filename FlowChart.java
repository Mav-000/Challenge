import java.util.Scanner;

public class FlowChart {
    static Scanner input = new Scanner(System.in);
     Scanner scan = new Scanner(System.in);
    public static int annoyance = 0;
    public static int boring = 0;
    // methods 
            public static boolean askYesNo(Scanner input, String question) { SP.slowPrint(question + " (yes/no) "); 
            String answer = input.nextLine(); 
            if (answer.equals("yes")) return true; 
            if (answer.equals("no")) return false; 
            SP.slowPrintln("Invalid input."); 
            return askYesNo(input, question); // recursion retry
    }
            // this how you use that ^^. ONLY YES/NO QUESTION!!
            /*  if (askYesNo(input, "Do you understand?")) {
                        i = 19; // or wherever you want to send them
                    } else {
                        i = 6700; // kills loop
                    }                                             */

    public static void main(String[] args) {

            
            
            /* Table of contents  
            1 is start, checks understanding
            2 info and yap 
            3 animal choice
            20 cat
            40 bird
            100 heaven 
            
            
            */ 
        // Varibles 
        
            SP.slowPrintln("This is a flowchart program.");
            Scanner first = new Scanner(System.in);
            SP.slowPrint(" Your name is? ");
            String name = first.nextLine();
            SP.slowPrintln("Hello, " + name + ", I'm gonna flowchart it up now.");
        for(int i = 1; i < 1000; i++) {
            
         if (i == 1) { 
            Scanner second = new Scanner(System.in);
            SP.slowPrintln("Before we start, please type answers exactuly as they are written. Do you understand? (yes/no) ");
            String twoanswer = second.nextLine();
            if (twoanswer.equals("yes")) {
                SP.slowPrintln("Cool beef, initializing next question...");
            } else if (twoanswer.equals("no")) {
                Scanner secondTwo = new Scanner(System.in);
                SP.slowPrintln("I hope your joking... Please type 'yes' to confirm you understand: ");
                String twoanswerTwo = secondTwo.nextLine();
                if (twoanswerTwo.equals("yes")) {
                    SP.slowPrintln("Phew, initializing next question...");
                } else if (twoanswerTwo.equals("no")) {
                    SP.slowPrintln("What? You- you still don't undestand? No, c'mon, quit playin around, just type 'yes' to confirm you understand: ");
                    Scanner secondThree = new Scanner (System.in);
                    String twoanswerThree = secondThree.nextLine();
                    if (twoanswerThree.equals("yes")) {
                        SP.slowPrintln("Thank heaveans, initializing next question...");
                    } else if (twoanswerThree.equals("no")) {
                        SP.slowPrintln("Well, i suppose if you don't understand... Can't really change that can I? Well, I mean, we did get to flow chart a little i guess... but c'mon, I made a whole WORLD of flowchart for you to explore, and you chose this one. It doen't count. Guh'bye " + name + ".");
                        i = 6700; // This kills the for loop
                    } else {
                        SP.slowPrintln("You nitwit! That is not an aceptable answer! Well that's it, I'm not gonna flowchart with you if you can't follow simple instructions! Goodbye!");
                        i = 6700; // This kills the for loop
                    }
                } else {
                    SP.slowPrintln("You nitwit! That is not an aceptable answer! Well that's it, I'm not gonna flowchart with you if you can't follow simple instructions! Goodbye!");
                    i = 6700; // This kills the for loop
                }
            } else {
                SP.slowPrintln("You nitwit! That is not an aceptable answer! Well that's it, I'm not gonna flowchart with you if you can't follow simple instructions! Goodbye!");
                i = 6700; // This kills the for loop
            }
            }
         else if (i == 2) { SP.slowPrintln("You just flowcharted! There were several paths you could've took, or maybe you already did some! But really there was only one way to progress, saying  'yes' at any point would bring you here, and if you said 'no' too many times you'd die. Well from here on out, there WILL be multimple paths! I promise!");
            SP.slowPrintln("Here we go!"); }

        else if (i == 3) {
            Scanner third = new Scanner(System.in);
            SP.slowPrintln("More of a dog person or cat? (dog/cat/bird) ");
            String threeanswer = third.nextLine().toLowerCase().trim();
            if (threeanswer.equals("dog")) {
                SP.slowPrintln("Woof! You like dogs, cool!");
            } else if (threeanswer.equals("cat")) {
                i = 19; // this sends them down the "cat" route, 10-19
            } else if (threeanswer.equals("bird")) {
                SP.slowPrintln("Chirp! You like birds, cool!");
                i = 40; // this sends them down the "bird" route, 20-39
            } else {
                SP.slowPrintln("Haha, I have no clue what you just said!!! HAHAHA, oh man, you're funny! Oh haha, lets try that again!");
                i = 2; // retry 
            }
        

        } else if (i == 4) { SP.slowPrintln("filler");
        } else if (i == 5) { SP.slowPrintln("still filler");
        } else if (i == 6) { SP.slowPrintln("yeah, i haven't made these ones yet");
        } else if (i == 7) { SP.slowPrintln("filler");
        } else if (i == 8) { SP.slowPrintln("filler");
        } else if (i == 9) { SP.slowPrintln("filler");

        } else if (i == 10) { SP.slowPrintln("You are on the poop path! Meow!"); 
        } else if (i == 11) { SP.slowPrintln("filler");
        } else if (i == 12) { SP.slowPrintln("filler");
        } else if (i == 13) { SP.slowPrintln("filler");
        } else if (i == 14) { SP.slowPrintln("filler");
        } else if (i == 15) { SP.slowPrintln("filler");
        } else if (i == 16) { SP.slowPrintln("filler");
        } else if (i == 17) { SP.slowPrintln("filler");
        } else if (i == 18) { SP.slowPrintln("filler");
        } else if (i == 20) { SP.slowPrintln("Cats huh? well-"); 
            for (int j = 0; j < 1; j++) {
                System.out.print("BOOM");
            
            SP.slowPrintln("MEAOW MEAOW MEAOW YOU HAVE SUMMONED CAT MEAOW!", "YELLOW");
            String catAns1 = input.nextLine();
            SP.slowPrintln("AHH! a giant cat just broke in! "); System.out.print("(run, fight, friend) ");
            switch (catAns1) {
                case "run":
                    System.out.println("You ran.");
                    System.out.println("The cat playfully chases you, it pounced and crushed you by mistake. You died.");
                    i = 100; 
                case "fight": 
                case "friend":
                     SP.slowPrintln("filler");
                default:
                    System.out.println(")");
                    SP.slowPrint("...");
                    j--;

             }
         }

        } else if (i == 21) { SP.slowPrintln("filler");
        } else if (i == 22) { SP.slowPrintln("filler");
        } else if (i == 23) {}
       
       
    }
         SP.slowPrintln("End of the flowchart program.");
    }
}
