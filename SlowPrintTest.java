import java.util.Random;



public class SlowPrintTest {
    // Track slow print state between calls
    private static int lastSlowWordCount = 0;
    private static boolean lastPrintWasSlow = false;

    //Milla seceonds it takes to print each character
    private static final int minMsBetweenChars = 5, maxMsBetweenChars = 15;
    // call this once at class init if you want setup
    private static int msBetweenChars() {
    return new Random().nextInt(maxMsBetweenChars - minMsBetweenChars + 1) + minMsBetweenChars;
}
    private static final int msForEachWord = 601;

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
            for (char c : s.toCharArray()) {
                System.out.print(c);
                System.out.flush();
                Thread.sleep(msBetweenChars());
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
            for (char c : s.toCharArray()) {
                System.out.print(c);
                System.out.flush();
                Thread.sleep(msBetweenChars());
            }
            System.out.println();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // update shared state for the next slow print call
        lastSlowWordCount = words;
        lastPrintWasSlow = true;
    }

    public static void main(String[] args) {
        init();
        slowPrintln("Hello after 1 second");
        slowPrint("Wait");
        slowPrintln("... ");
        slowPrintln("Spagetii Spagetii Spagetii Spagetii Spagetii Spagetii Spagetii Spagetii Spagetii Spagetii");
        slowPrintln("You waited");
        slowPrintln("For me.");
    }
}