import java.util.*;

public class PowerWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), power = sc.nextInt(), result = 1, counter = 0;
        while (counter < power) {
            result *= num;
            counter++;
        }
        System.out.println(result);
    }
}
