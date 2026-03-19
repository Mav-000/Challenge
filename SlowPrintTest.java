public class SlowPrintTest {
    // call this once at class init if you want setup
    static void init() { 
        // any setup code
    }

    static void slowPrint(String s) {
        try {
            for (char c : s.toCharArray()) {
                System.out.print(c);
                System.out.flush();
                Thread.sleep(150); // wait 0.05 second between characters
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    static void slowPrintln(String s) {
        int words = 0;
        if (s != null && !s.isBlank()) {
            words = s.trim().split("\\s+").length;
        }
        try {
            Thread.sleep(words * 1000L); // wait 1 second per word before printing
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        init();
        slowPrintln("Hello after 1 second");
        slowPrint("Wait");
        slowPrint("... ");
        slowPrintln("Spagetii Spagetii Spagetii Spagetii Spagetii Spagetii Spagetii Spagetii Spagetii Spagetii");
    }
}