import java.util.Random;



public class SP {
    // Track slow print state between calls
    private static int lastSlowWordCount = 0;
    private static boolean lastPrintWasSlow = false;

    //Milla seceonds it takes to print each character
    private static final int minMsBetweenChars = 15, maxMsBetweenChars = 30;
    // call this once at class init if you want setup
    private static int msBetweenChars() {
    return new Random().nextInt(maxMsBetweenChars - minMsBetweenChars + 1) + minMsBetweenChars;
}
    private static final int msForEachWord = 80;

    private static final int msForPunctuation = 400;
    
    public static String getColorCode(String colorName) {
        return switch (colorName.toUpperCase()) {
            case "RED"    -> "\u001B[31m";
            case "GREEN"  -> "\u001B[32m";
            case "YELLOW" -> "\u001B[33m";
            case "BLUE"   -> "\u001B[34m";
            case "PURPLE" -> "\u001B[35m";
            case "CYAN"   -> "\u001B[36m";
            case "WHITE"  -> "\u001B[37m";
            case "RESET"  -> "\u001B[0m";
            case "DEFAULT" -> "\u001B[0m";
            case "BLACK"  -> "\u001B[30m";
            case "BRIGHTBLACK" -> "\u001B[90m";
            case "BRIGHTRED" -> "\u001B[91m";
            case "BRIGHTGREEN" -> "\u001B[92m";
            case "BRIGHTYELLOW" -> "\u001B[93m";
            case "BRIGHTBLUE" -> "\u001B[94m";
            case "BRIGHTPURPLE" -> "\u001B[95m";
            case "BRIGHTCYAN" -> "\u001B[96m";
            case "BRIGHTWHITE" -> "\u001B[97m";
            default       -> "\u001B[0m"; // Reset/Default if input is unknown
        };
    }

    // call this once at class init if you want setup
    static void init() { 
        // any setup code
    }

    static void slowPrint(String s) {
        int words = 0;
        if (s != null && !s.isBlank()) {
            words = s.trim().split("\\s+").length;
        }
        long delaySeconds = lastPrintWasSlow ? lastSlowWordCount : words;
        try {
            Thread.sleep(delaySeconds * msForEachWord);
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == ',' || c == '.' || c == '!' || c == '?' || c == ';' || c == ':') { 
                    if ( i != 0 && (s.charAt(i-1) != ' ' && s.charAt(i-1) != ',' && s.charAt(i-1) != '.' && s.charAt(i-1) != '!' && s.charAt(i-1) != '?' && s.charAt(i-1) != ';' && s.charAt(i-1) != ':')) {
                         // longer pause before punctuation if previous char was not punctuation or space
                        System.out.print(c);
                        System.out.flush();
                        Thread.sleep(msForPunctuation); // longer pause for punctuation
                    } else { // skip printing punctuation if it directly follows another punctuation or space
                        Thread.sleep(msForPunctuation); // longer pause for punctuation
                        System.out.print(c);
                        System.out.flush();
                        Thread.sleep(msForPunctuation); // longer pause for punctuation
                    }
                } else {
                    System.out.print(c);
                    System.out.flush();
                    Thread.sleep(msBetweenChars()); }
            
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // update shared state for the next slow print call
        lastSlowWordCount = words;
        lastPrintWasSlow = true;

        
    }

    static void slowPrintln(String s) {
         int words = 0;
        if (s != null && !s.isBlank()) {
            words = s.trim().split("\\s+").length;
        }
        long delaySeconds = lastPrintWasSlow ? lastSlowWordCount : words;
        try {
            Thread.sleep(delaySeconds * msForEachWord);
            System.out.println(); // start on a new line
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (i != 0 && (c == ',' || c == '.' || c == '!' || c == '?' || c == ';' || c == ':')) { 
                    if (s.charAt(i-1) != ' ' && s.charAt(i-1) != ',' && s.charAt(i-1) != '.' && s.charAt(i-1) != '!' && s.charAt(i-1) != '?' && s.charAt(i-1) != ';' && s.charAt(i-1) != ':') {
                         // longer pause before punctuation if previous char was not punctuation or space
                        System.out.print(c);
                        System.out.flush();
                        Thread.sleep(msForPunctuation); // longer pause for punctuation
                    } else { // skip printing punctuation if it directly follows another punctuation or space
                        Thread.sleep(msForPunctuation); // longer pause for punctuation
                        System.out.print(c);
                        System.out.flush();
                        Thread.sleep(msForPunctuation); // longer pause for punctuation
                    }
                } else {
                    System.out.print(c);
                    System.out.flush();
                    Thread.sleep(msBetweenChars()); }
            
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // update shared state for the next slow print call
        lastSlowWordCount = words;
        lastPrintWasSlow = true;
    }


    // This one is for color prints, its the same, functionality wise



    static void slowPrintln(String s, String color) {
         int words = 0;
        if (s != null && !s.isBlank()) {
            words = s.trim().split("\\s+").length;
        }
        long delaySeconds = lastPrintWasSlow ? lastSlowWordCount : words;
        String ansiCode = getColorCode(color);
        System.out.print(ansiCode); // Set the color
        try {
            Thread.sleep(delaySeconds * msForEachWord);
            System.out.println(); // start on a new line
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (i != 0 && (c == ',' || c == '.' || c == '!' || c == '?' || c == ';' || c == ':')) { 
                    if (s.charAt(i-1) != ' ' && s.charAt(i-1) != ',' && s.charAt(i-1) != '.' && s.charAt(i-1) != '!' && s.charAt(i-1) != '?' && s.charAt(i-1) != ';' && s.charAt(i-1) != ':') {
                         // longer pause before punctuation if previous char was not punctuation or space
                        System.out.print(c);
                        System.out.flush();
                        Thread.sleep(msForPunctuation); // longer pause for punctuation
                    } else { // skip printing punctuation if it directly follows another punctuation or space
                        Thread.sleep(msForPunctuation); // longer pause for punctuation
                        System.out.print(c);
                        System.out.flush();
                        Thread.sleep(msForPunctuation); // longer pause for punctuation
                    }
                } else {
                    System.out.print(c);
                    System.out.flush();
                    Thread.sleep(msBetweenChars()); }
            
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.print(getColorCode("RESET")); // Reset color after printing

        // update shared state for the next slow print call
        lastSlowWordCount = words;
        lastPrintWasSlow = true;
    }



    static void slowPrint(String s, String color) {
            int words = 0;
            if (s != null && !s.isBlank()) {
                words = s.trim().split("\\s+").length;
            }
            long delaySeconds = lastPrintWasSlow ? lastSlowWordCount : words;
            String ansiCode = getColorCode(color);
            System.out.print(ansiCode); // Set the color
            try {
                Thread.sleep(delaySeconds * msForEachWord);
                for (int i = 0; i < s.length(); i++) {
                    char c = s.charAt(i);
                    if (i != 0 && (c == ',' || c == '.' || c == '!' || c == '?' || c == ';' || c == ':')) { 
                        if (s.charAt(i-1) != ' ' && s.charAt(i-1) != ',' && s.charAt(i-1) != '.' && s.charAt(i-1) != '!' && s.charAt(i-1) != '?' && s.charAt(i-1) != ';' && s.charAt(i-1) != ':') {
                            // longer pause before punctuation if previous char was not punctuation or space
                            System.out.print(c);
                            System.out.flush();
                            Thread.sleep(msForPunctuation); // longer pause for punctuation
                        } else { // skip printing punctuation if it directly follows another punctuation or space
                            Thread.sleep(msForPunctuation); // longer pause for punctuation
                            System.out.print(c);
                            System.out.flush();
                            Thread.sleep(msForPunctuation); // longer pause for punctuation
                        }
                    } else {
                        System.out.print(c);
                        System.out.flush();
                        Thread.sleep(msBetweenChars()); }
                
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.print(getColorCode("RESET")); // Reset color after printing

            // update shared state for the next slow print call
            lastSlowWordCount = words;
            lastPrintWasSlow = true;
        }



    public static void main(String[] args) {
        init();
        slowPrintln("Hello after " + 67 + " seconds", "GREEN");
        slowPrintln("Wait", "YELLOW");
        slowPrint("... ", "BLUE");
        slowPrintln("Spagetii Spagetii Spagetii Spagetii Spagetii Spagetii Spagetii Spagetii Spagetii Spagetii", "PURPLE");
        slowPrintln("You waited", "CYAN");
        slowPrintln("For me.", "BRIGHTWHITE");
        slowPrintln("You must wait. Every. Time. I. Put any punctuation, even comma; semi colons too.");
    }
}