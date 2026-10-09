import java.util.Scanner;

public class PrintEvenRecursion {
    static void printEven(int n) {
        if (n == 0) return;
        printEven(n - 1);
        if (n % 2 == 0) System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printEven(n);
    }
}
