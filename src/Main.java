public class Main {
    public static void main(String[] args) {
        int n = 11;
        int sum = 0;

        while (n != 0) {
            sum += n;
            n--;
        }

        System.out.printf("%nsum= %d%n", sum);
    }
}