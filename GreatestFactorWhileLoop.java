import java.util.*;

public class GreatestFactorWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), greatestFactor = 1, counter = num - 1;
        while (counter >= 1) {
            if (num % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }
        System.out.println(greatestFactor);
    }
}
