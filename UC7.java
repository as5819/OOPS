import java.util.Collections;

public class UC7 {

    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern   = pattern;
        }

        char getCharacter() { return character; }

        String[] getPattern() { return pattern; }

        String getRow(int row) { return pattern[row]; }
    }

    public static void main(String[] args) {

        CharacterPatternMap[] maps = {

            new CharacterPatternMap('O', new String[] {
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
            }),

            new CharacterPatternMap('P', new String[] {
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
            }),

            new CharacterPatternMap('S', new String[] {
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
            })
        };

        // Look up patterns for O, O, P, S
        CharacterPatternMap o = maps[0];
        CharacterPatternMap p = maps[1];
        CharacterPatternMap s = maps[2];

        // Build and print each of the 7 banner rows
        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();
            line.append(o.getRow(row)).append(" ")
                .append(o.getRow(row)).append(" ")
                .append(p.getRow(row)).append(" ")
                .append(s.getRow(row));
            System.out.println(line);
        }
    }
}