class Konstanta {
    static int radius;
    static final double PI = 3.14;

    public static void main(String[] args) {
        Konstanta.radius = 7;

        double luas = (Konstanta.radius * Konstanta.radius) * Konstanta.PI;

        System.out.print(luas);
    }
}