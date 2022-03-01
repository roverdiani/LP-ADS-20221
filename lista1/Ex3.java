import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2.0;

        System.out.print("Média: " + media + " - ");

        if (media <= 3.9)
            System.out.println("Reprovado");
        else if (media <= 6.9)
            System.out.println("Exame");
        else
            System.out.println("Aprovado");
    }

}