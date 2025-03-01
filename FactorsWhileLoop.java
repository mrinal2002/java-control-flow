import java.util.*;

public class FactorsWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), i = 1;
        if (num > 0) {
            while (i <= num) {
                if (num % i == 0) System.out.println(i);
                i++;
            }
        }
    }
}
