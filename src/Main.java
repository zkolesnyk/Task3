public class Main {
    public static void main(String[] args) {
        int x = 15;
        int y = 4;
        System.out.println(resultToStr(x, y));
    }

    public static float prog(int x, int y) {
        if (x % 2 == 0) {
            return ((float) x) * y;
        } else if (x % 2 != 0 && y != 0) {
            return ((float) x) / y;
        } else return 0;
    }

    public static String resultToStr(int x, int y) {
        if (Math.abs(prog(x, y)) == 0.00) {
            return String.format("%.0f", prog(x, y));
        } else return String.format("%.2f", prog(x, y));
    }
}