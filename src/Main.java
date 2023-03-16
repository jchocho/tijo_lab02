public class Main {
    public static void main(String[] args) {
        int n = 10; // przykładowa wartość n
        int sum = sumOfFirstN(n);

        System.out.println("Suma " + n + " kolejnych liczb naturalnych wynosi " + sum);
    }

    private static int sumOfFirstN(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }
}
