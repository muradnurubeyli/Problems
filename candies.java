import java.util.Scanner;
import java.util.Set;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
 
        int t = s.nextInt();
 
        while (t-- > 0) {
            int n = s.nextInt();
            for (int k = 2; k < 30; k++) {
                if (n % ((1 << k) - 1) == 0) {
                    System.out.println((n / ((1 << k) - 1)));
                    break;
                }
 
            }
        }
    }
}