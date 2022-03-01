import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int somaIdades = 0, qtdMaiores = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite a " + i + "ª idade: ");
            int idade = sc.nextInt();

            somaIdades += idade;

            if (idade >= 18)
                qtdMaiores++;
        }

        System.out.println("Quantidade de pessoas com idade maior ou igual a 18 anos: " + qtdMaiores);
        System.out.println("Média de idade do grupo: " + somaIdades / 10.0);
    }

}
