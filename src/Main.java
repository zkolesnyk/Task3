import org.javatuples.Triplet;

public class Main {
    public static void main(String[] args) {
        int x = 15;
        int y = 3;
        System.out.println(resultToStr(x, y));
    }

    public static Triplet<Integer, Float, Boolean> prog(int x, int y) {

        if (x % 2 == 0) {
            return new Triplet<Integer, Float, Boolean>(x * y, 0f, true);
        } else if (x % 2 != 0 && y != 0) {
            return new Triplet<Integer, Float, Boolean>(0, (float) x / y, false);
        }
        return new Triplet<Integer, Float, Boolean>(0, 0f, true);
    }

    public static String resultToStr(int x, int y) {

        if (prog(x, y).getValue2()) {
            return String.format("%s", prog(x, y).getValue0());
        } else {
            if (prog(x, y).getValue1() % 1 != 0) return String.format("%s", prog(x, y).getValue1()).replace(".", ",");
            else return String.format("%.0f", prog(x, y).getValue1()).replace(".", ",");
        }
    }
}