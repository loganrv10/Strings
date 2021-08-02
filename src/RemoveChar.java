import java.util.ArrayList;
import java.util.Scanner;

public class RemoveChar {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        String n = scanner.next();

        char m = 'a';
        for (int i =0; i < n.length(); i++){
                if (n.charAt(i) == m){
                    continue;
                }else{
                    System.out.println(n.charAt(i));
                }
        }



    }
}
