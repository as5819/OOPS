public class Main {
    static int[] getRowColumn(int slot) {
        slot--;
        int row = slot / 3;
        int col = slot % 3;
        return new int[]{row, col};
    }

    public static void main(String[] args) {
        int slot = 5;
        int[] indices = getRowColumn(slot);
        System.out.println("Row: " + indices[0] + ", Column: " + indices[1]);
    }
}