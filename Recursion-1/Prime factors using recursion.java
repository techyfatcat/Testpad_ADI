import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main {
    static void primeFactors(int n, int divisor) {
        if (n == 1)
            return;
        if (n % divisor == 0) {
            System.out.println(divisor);
            primeFactors(n / divisor, divisor);
        } else {
            primeFactors(n, divisor + 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primeFactors(n, 2);
    }
}
