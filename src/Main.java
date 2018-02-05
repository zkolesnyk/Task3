public class Main {
    public static void main(String[] args) {
        int x = 16;
        int y = 4;
        System.out.println(resultToStr(x, y));
    }

    public static float prog(int x, int y) {
        if (x % 2 == 0) {
            return  x * y;
        } else if (x % 2 != 0 && y != 0) {
            return ((float) x) / y;
        } else return 0;
    }

    public static String resultToStr(int x, int y) {
        return String.format("%f", prog(x, y));
    }
}