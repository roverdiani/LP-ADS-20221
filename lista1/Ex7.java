import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num, somaNum = 0;
        int quantidade = 0;
        do {
            System.out.println("Digite um número: ");
            num = sc.nextDouble();
            if (num > 0) {
                somaNum += num;
                quantidade++;
            }
        } while (num > 0);

        if (quantidade == 0)
        {
            System.out.println("Nenhum número maior que 0 foi digitado.");
            return;
        }

        System.out.println("Somatório dos valores positivos: " + somaNum);
        System.out.println("Média dos valores positivos: " + somaNum / quantidade);
    }

}
