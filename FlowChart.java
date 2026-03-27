import java.util.Scanner;

public class FlowChart {
    
    public static void main(String[] args) {


            // Varibles 
            static boolean askYesNo(Scanner input, String question) { SP.slowPrint(question + " (yes/no) "); 
            String answer = input.nextLine(); 
            if (answer.equals("yes")) return true; 
            if (answer.equals("no")) return false; 
            SP.slowPrintln("Invalid input."); 
            return askYesNo(input, question); // recursion retry

            // this how you use that ^^. ONLY YES/NO QUESTION!!
            /*  if (askYesNo(input, "Do you understand?")) {
                        i = 19; // or wherever you want to send them
                    } else {
                        i = 6700; // kills loop
                    }                                             */

            /* Table of contents  
            for i = 
            1-9 is the start
            
            
            */ 

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
            Scanner third = new Scanner(System.in);
            SP.slowPrint("More of a dog person or cat? (dog/cat/bird) ");
            String threeanswer = third.nextLine();
            if (threeanswer.equals("dog")) {
                SP.slowPrintln("Woof! You like dogs, cool!");
            } else if (threeanswer.equals("cat")) {
                i = 9; // this sends them down the "cat" route, 10-19
            }
        } else if (i == 3) { SP.slowPrintln("filler");
        } else if (i == 4) { SP.slowPrintln("filler");
        } else if (i == 5) { SP.slowPrintln("still filler");
        } else if (i == 6) { SP.slowPrintln("yeah, i haven't made these ones yet");
        } else if (i == 7) { SP.slowPrintln("filler");
        } else if (i == 8) { SP.slowPrintln("filler");
        } else if (i == 9) { }
        // 0-9 is the first 'family' of paths.
        //so it'd make sence for '10' to come after '9' but it doesnt, cause '9' is an ending, every i ending with '9' must be an ending
        // that being said, any i can contain one or more or no endings, but anything ending in '9' MUST end. at least for now. as to be less confusing.

       
        }
         SP.slowPrintln("End of the flowchart program.");
    }
}