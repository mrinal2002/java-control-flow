import java.util.*;

public class MultiplesBelow100WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), counter = 100;
        if (num > 0 && num < 100) {
            while (counter >= 1) {
                if (counter % num == 0) System.out.println(counter);
                counter--;
            }
        }
    }
}
