import java.util.*;

class InstanceVariable2 {
    String text1 = "Hello World From Java";
    String text2 = "This Is Instance Variable";
    String text3 = "I Learn In Java Language";

    public static void main(String args[]) {
        InstanceVariable2 text = new InstanceVariable2();
        System.out.println(text.text1);
        System.out.println(text.text2);
        System.out.println(text.text3);
    }
}