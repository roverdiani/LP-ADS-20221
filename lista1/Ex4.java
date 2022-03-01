import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double n1 = sc.nextDouble();

        System.out.println("Digite o segundo número: ");
        double n2 = sc.nextDouble();

        System.out.println("Operações:");
        System.out.println("1 - Média entre os dois números");
        System.out.println("2 - Diferença do maior pelo menor");
        System.out.println("3 - Produto entre os dois números");
        System.out.println("Escolha uma das opções (1-3): ");
        int opcao = sc.nextInt();

        double resultado;
        switch (opcao) {
            case 1: {
                resultado = (n1 + n2) / 2.0;
                break;
            }
            case 2: {
                if (n2 > n1) {
                    double tmp = n2;
                    n2 = n1;
                    n1 = tmp;
                }

                resultado = n1 - n2;
                break;
            }
            case 3: {
                resultado = n1 * n2;
                break;
            }
            default: {
                System.out.println("Opção inválida!");
                return;
            }
        }

        System.out.println("O resultado da operação é: " + resultado);
    }

}
