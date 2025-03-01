import java.util.*;

public class PowerForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), power = sc.nextInt(), result = 1;
        for (int i = 1; i <= power; i++) {
            result *= num;
        }
        System.out.println(result);
    }
}
