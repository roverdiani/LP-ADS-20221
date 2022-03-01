import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da prestação: ");
        double valor = sc.nextDouble();

        System.out.println("Digite a taxa: ");
        double taxa = sc.nextDouble();

        System.out.println("Digite o tempo: ");
        double tempo = sc.nextDouble();

        double prest = valor + (valor * (taxa / 100) * tempo);

        System.out.println("O valor da prestação em atraso é: " + prest);
    }

}
