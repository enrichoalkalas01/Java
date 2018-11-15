import java.util.*;

class Variable {
    public static void main(String[] args) {
        String text;

        Scanner in = new Scanner(System.in);

        System.out.println("This Is Variable On Java");
        System.out.print("Input Some Text : ");
        text = in.nextLine();

        System.out.println();
        System.out.println("Variable Text = " + text);
    }
}