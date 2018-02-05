public class Main {
    public static void main(String[] args) {
        int x = 15;
        int y = 4;
        System.out.println(prog(x, y));
    }

    private static String prog(int x, int y) {
        if (x % 2 == 0) {
            return resultToStr(((float) x) * y);
        } else if (x % 2 != 0 && y != 0) {
            return resultToStr(((float) x) / y);
        } else return null;
    }

    private static String resultToStr(float z) {
        if (Math.abs(z) == 0.00) {
            return String.format("%.0f", z);
        } else return String.format("%.2f", z);
    }
}