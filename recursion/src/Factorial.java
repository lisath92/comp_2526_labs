public class Factorial {
    public static int factorial(int n) {
        int result = factorial(n, 1);
        return result;
    }

    public static int factorial(int n, int result) {
        if (n == 0) return 1;
        result *= factorial(n-1, result) * n;
        return result;
    }

    public static void main(String[] args) {
        int result = factorial(6);
        System.out.println("" + result);
    }
}