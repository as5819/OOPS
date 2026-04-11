public class UC7_2 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            String greeting = String.join(", ", args);
            System.out.println("Hello, " + greeting + "!");
        }
    }
}