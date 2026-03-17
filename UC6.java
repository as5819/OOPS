import java.util.Collections;

public class UC6 {

    /*
     * UC6 KEY CONCEPT: Static helper methods.
     *
     * Each method encapsulates the ASCII pattern for one character and returns
     * a String[] of exactly 7 lines.  main() calls these methods directly
     * inside the array initialiser — no separate population statements needed.
     *
     * DRY benefit: buildO() is defined once but invoked twice (first and
     * second character of "OOPS"), eliminating duplicated pattern strings.
     */

    // ------------------------------------------------------------------ O
    static String[] buildO() {
        return new String[] {
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };
    }

    // ------------------------------------------------------------------ P
    static String[] buildP() {
        return new String[] {
            "**** ",
            "*   *",
            "*   *",
            "**** ",
            "*    ",
            "*    ",
            "*    "
        };
    }

    // ------------------------------------------------------------------ S
    static String[] buildS() {
        return new String[] {
            " ****",
            "*    ",
            "*    ",
            " *** ",
            "    *",
            "    *",
            "**** "
        };
    }

    // ------------------------------------------------------------------ main
    public static void main(String[] args) {

        // Retrieve each character's 7-line pattern
        String[] o1 = buildO();   // first  O
        String[] o2 = buildO();   // second O  (same method — DRY)
        String[] p  = buildP();
        String[] s  = buildS();

        /*
         * Build the banner row by row.
         * Each banner row joins the matching line from every character,
         * separated by a single space, using array initialisation syntax
         * inherited from UC5.
         */
        String[] bannerLines = {
            o1[0] + " " + o2[0] + " " + p[0] + " " + s[0],
            o1[1] + " " + o2[1] + " " + p[1] + " " + s[1],
            o1[2] + " " + o2[2] + " " + p[2] + " " + s[2],
            o1[3] + " " + o2[3] + " " + p[3] + " " + s[3],
            o1[4] + " " + o2[4] + " " + p[4] + " " + s[4],
            o1[5] + " " + o2[5] + " " + p[5] + " " + s[5],
            o1[6] + " " + o2[6] + " " + p[6] + " " + s[6]
        };

        // Enhanced for loop renders the final banner
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}