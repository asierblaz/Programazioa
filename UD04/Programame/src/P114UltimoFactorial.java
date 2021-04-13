
import java.util.Scanner;

public class P114UltimoFactorial {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int num;

        for (int i = 0; i < n; i++) {
            num = in.nextInt();
            System.out.println(factorial(num));
        }
    }

    public static int factorial(int n) {
        int multi = 1;
        if (n > 5) {
            return 0;
        }
        for (int i = 1; i <= n; i++) {

            multi = (multi * i) % 10;
        }

        return multi;

    }

}
