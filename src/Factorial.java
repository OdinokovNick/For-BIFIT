import java.util.Scanner;

public class Factorial {
    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.print("Please, enter number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number < 0) {
            System.out.println("Please, enter not negative number ");
        } else {
            System.out.println("Factorial of number = " + factorial(number));
        }
    }
}
