import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int votos1 = 0, votos2 = 0, votos3 = 0, votos4 = 0, votosNulos = 0, votosBrancos = 0, codigo;
        do {
            System.out.println("Digite o seu voto: ");
            codigo = sc.nextInt();

            switch (codigo) {
                case 1: {
                    votos1++;
                    break;
                }
                case 2: {
                    votos2++;
                    break;
                }
                case 3: {
                    votos3++;
                    break;
                }
                case 4: {
                    votos4++;
                    break;
                }
                case 5: {
                    votosNulos++;
                    break;
                }
                case 6: {
                    votosBrancos++;
                    break;
                }
                default: {
                    if (codigo < 0 || codigo > 6)
                        System.out.println("Voto inválido!");
                    break;
                }
            }
        } while (codigo != 0);

        System.out.println("Total de votos para o candidato número 1: " + votos1);
        System.out.println("Total de votos para o candidato número 2: " + votos2);
        System.out.println("Total de votos para o candidato número 3: " + votos3);
        System.out.println("Total de votos para o candidato número 4: " + votos4);
        System.out.println("Total de votos nulos: " + votosNulos);
        System.out.println("Total de votos em branco: " + votosBrancos);
    }

}
