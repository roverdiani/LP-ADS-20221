import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a altura: ");
        double altura = sc.nextDouble();

        System.out.println("Digite o sexo (M/F): ");
        char sexo = sc.next().charAt(0);

        double pesoIdeal;
        if (sexo == 'M')
            pesoIdeal = (72.7 * altura) - 58;
        else if (sexo == 'F')
            pesoIdeal = (62.1 * altura) - 44.7;
        else
        {
            System.out.println("Sexo inválido!");
            return;
        }

        System.out.println("Peso ideal: " + pesoIdeal);
    }

}
