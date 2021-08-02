import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();

        if (isPalindrome(n)) {
            System.out.print("Yes");
        }else {
            System.out.print("No");
        }
    }

    private static boolean isPalindrome(String n) {
        int i = 0, j = n.length() - 1;
        while (i < j) {
            if (n.charAt(i) != n.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;



    }


}

