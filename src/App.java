import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int k = 0; k < a; k++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int soma = 0;
            if (x > y) {
                int temp = y;
                y = x;
                x = temp;
            }
            if (x % 2 != 0 && y != x) {
                x += 1;
            }
            for (int i = x; i < y; i++) {

                if (i % 2 != 0) {
                    soma += i;
                }

            }
            System.out.println(soma);
        }

        sc.close();

    }
}
