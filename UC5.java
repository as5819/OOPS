import java.util.Collections;

public class UC5 {

    public static void main(String[] args) {

        // Banner configuration
        String message = "OOPS";
        int width     = 30;
        int padding   = 1;

        // Reusable join expressions
        String border  = String.join("", Collections.nCopies(width, "*"));
        String blank   = String.join("", Collections.nCopies(width - 2, " "));
        String padded  = String.join("", Collections.nCopies(padding, " "))
                       + message
                       + String.join("", Collections.nCopies(width - 2 - padding - message.length(), " "));

        /*
         * UC5 KEY CONCEPT: Array declaration + initialisation in a single statement.
         * Each element is a String.join() expression evaluated inline —
         * no separate population statements needed.
         */
        String[] lines = {
            border,                          // line 0 — top border
            "*" + blank + "*",               // line 1 — blank row
            "*" + padded + "*",              // line 2 — message row
            "*" + blank + "*",               // line 3 — blank row
            "*" + blank + "*",               // line 4 — blank row
            "*" + padded + "*",              // line 5 — message row (repeat)
            border                           // line 6 — bottom border
        };

        // Enhanced for loop to render the banner
        for (String line : lines) {
            System.out.println(line);
        }
    }
}