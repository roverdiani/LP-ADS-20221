import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        System.out.println("Digite o primeiro número: ");
        a = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        b = sc.nextInt();

        int divisor, dividendo, c;
        if (b > a) {
            dividendo = b;
            divisor = a;
        } else {
            dividendo = a;
            divisor = b;
        }

        while (dividendo % divisor != 0) {
            c = dividendo % divisor;
            dividendo = divisor;
            divisor = c;
        }

        System.out.println("MDC: " + divisor);
    }

}
