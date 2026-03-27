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

    public static void main(String[] args) {
        init();
        slowPrintln("Hello after " + 1 + " second");
        slowPrintln("Wait");
        slowPrint("... ");
        slowPrintln("Spagetii Spagetii Spagetii Spagetii Spagetii Spagetii Spagetii Spagetii Spagetii Spagetii");
        slowPrintln("You waited");
        slowPrintln("For me.");
        slowPrintln("You must wait. Every. Time. I. Put any punctuation, even comma; semi colons too.");
    }
}