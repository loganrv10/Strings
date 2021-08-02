import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s= scanner.next();
        int [] arr = new int[n];
        for (int i =0; i < n; i++){
            arr[i] = s.charAt(i);
        }

        HashMap<Character,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++)
            if (hashMap.containsKey(s.charAt(i))){
                int c = hashMap.get(s.charAt(i));
                hashMap.put(s.charAt(i),++c);
            }else{
                hashMap.put(s.charAt(i),1);
            }

        for (Map.Entry<Character,Integer> var: hashMap.entrySet()){
            System.out.println(var.getKey() + "-" + var.getValue());
        }
    }
}

