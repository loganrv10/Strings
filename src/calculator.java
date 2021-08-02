import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int j = scanner.nextInt();
        sum(n,j);
        sub(n,j);
        div(n,j);
        multiply(n,j);


    }

    private static void multiply(int n, int j) {
        System.out.println("Multiply = "+ (n * j));
    }

    private static void div(int n, int j) {
        System.out.println("divide = "+ (n / j));
    }

    private static void sub(int n, int j) {
        System.out.println("sub = "+ (n - j));
    }

    private static void sum(int n, int j) {
        System.out.println("sum = "+ (n + j));
    }


}
