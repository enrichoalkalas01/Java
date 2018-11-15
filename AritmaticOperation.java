import java.util.*;

class AritmaticOperation {
    public static void main(String args[]) {
        int x, y;

        Scanner in = new Scanner(System.in);
        System.out.print("Input a First Number : ");
        x = in.nextInt();
        System.out.print("Input a Second Number : ");
        y = in.nextInt();

        int penjumlahan, pengurangan, pembagian, perkalian, increment1, increment2, modulus, decrement1, decrement2;

        // Penjumlahan
        penjumlahan = x + y;

        // Pengurangan
        pengurangan = x - y;

        // Pembagian
        pembagian = x / y;

        // Perkalian
        perkalian = x * y;

        // Modulus
        modulus = x % y;

        // Increment
        increment1 = x++;
        increment2 = y++;

        // Decrement
        decrement1 = x++;
        decrement2 = y++;

        System.out.println("Penjumlahan = " + penjumlahan);
        System.out.println("Pengurangan = " + pengurangan);
        System.out.println("Pembagian = " + pembagian);
        System.out.println("Perkalian = " + perkalian);
        System.out.println("Modulus = " + modulus);
        System.out.println("Increment x = " + increment1);
        System.out.println("Increment y = " + increment2);
        System.out.println("Decrement x = " + decrement1);
        System.out.println("Decrement y = " + decrement2);
    }
}