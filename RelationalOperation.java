import java.util.*;

class RelationalOperation {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("----------------------");
        System.out.println(" Relational Operation ");
        System.out.println("----------------------");

        int x, y;

        System.out.print("Input Number X : ");
        x = in.nextInt();
        System.out.print("Input Number Y : ");
        y = in.nextInt();

        System.out.println("----------------------------");
        System.out.println("This Is X == Y Operation : " + (x == y));
        System.out.println("This Is Y == X Operation : " + (y == x));
        System.out.println("This Is X != Y Operation : " + (x != y));
        System.out.println("This Is Y != X Operation : " + (y != x));
        System.out.println("This Is X > Y Operation : " + (x > y));
        System.out.println("This Is Y > X Operation : " + (y > x));
        System.out.println("This Is X < Y Operation : " + (x < y));
        System.out.println("This Is Y == X Operation : " + (y < x));
        System.out.println("This Is X >= Y Operation : " + (x >= y));
        System.out.println("This Is Y >= X Operation : " + (y >= x));
        System.out.println("This Is X <= Y Operation : " + (x <= y));
        System.out.println("This Is Y <= X Operation : " + (y <= x));
        System.out.println("----------------------------");
    }
}