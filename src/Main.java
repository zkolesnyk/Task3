import org.javatuples.Triplet;

public class Main {
    public static void main(String[] args) {
        int x = 15;
        int y = 2;
//        System.out.println();
        System.out.println(resultToStr(x, y));
    }

    private static Triplet<Integer, Float, Boolean> prog(int x, int y) {

        if (x % 2 == 0) {
            return new Triplet<Integer, Float, Boolean>(x * y, (float) x * y, true);
        } else if (x % 2 != 0 && y != 0) {
            return new Triplet<Integer, Float, Boolean>(x / y, (float) x / y, false);
        }
        return new Triplet<Integer, Float, Boolean>(0, 0f, true);
    }

    public static String resultToStr(int x, int y) {

        if (!prog(x, y).getValue2() && prog(x, y).getValue1() % 1 != 0) {
            return String.format("%s", prog(x, y).getValue1()).replace(".", ",");
        } else return String.format("%s", prog(x, y).getValue0());
    }
}