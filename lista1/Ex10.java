import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aluno[] alunos = new Aluno[10];

        double menorMedia = 10, maiorMedia = 0, somaMedias = 0;
        int aprovados = 0, reprovados = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "º aluno:");

            Aluno aluno = new Aluno();

            System.out.print("\tDigite o número de matrícula: ");
            aluno.setNumMatricula(sc.nextInt());

            System.out.print("\tDigite a frequência (em porcentagem): ");
            aluno.setFrequencia(sc.nextInt());

            double somaNotas = 0;
            System.out.print("\tDigite a primeira nota: ");
            somaNotas += sc.nextDouble();
            System.out.print("\tDigite a segunda nota: ");
            somaNotas += sc.nextDouble();
            System.out.print("\tDigite a terceira nota: ");
            somaNotas += sc.nextDouble();
            aluno.setNotaFinal(somaNotas / 3.0);

            somaMedias += aluno.getNotaFinal();

            if (menorMedia > aluno.getNotaFinal())
                menorMedia = aluno.getNotaFinal();
            if (maiorMedia < aluno.getNotaFinal())
                maiorMedia = aluno.getNotaFinal();

            if (aluno.getNotaFinal() >= 6.0 && aluno.getFrequencia() > 75) {
                aluno.setAprovado(true);
                aprovados++;
            }
            else
                reprovados++;

            alunos[i] = aluno;
        }

        System.out.println("\n---------------------------------------------------------\n");

        for (int i = 0; i < 10; i++)
        {
            System.out.println((i + 1) + "º aluno: ");
            System.out.println("\tNúmero de matrícula: " + alunos[i].getNumMatricula());
            System.out.println("\tFrequência: " + alunos[i].getFrequencia() + "%");
            System.out.println("\tNota Final: " + alunos[i].getNotaFinal());
            System.out.println("\t--> " + (alunos[i].isAprovado() ? "APROVADO" : "REPROVADO"));
        }

        System.out.println("Maior média da turma: " + maiorMedia);
        System.out.println("Menor média da turma: " + menorMedia);
        System.out.println("Nota média da turma: " + somaMedias / 10.0);
        System.out.println("Número de alunos aprovados: " + aprovados);
        System.out.println("Número de alunos reprovados: " + reprovados);
    }

    public static class Aluno {
        private int numMatricula = 0;
        private int frequencia = 0;
        private double notaFinal = 0;
        private boolean aprovado = false;

        public int getNumMatricula() {
            return numMatricula;
        }

        public void setNumMatricula(int numMatricula) {
            this.numMatricula = numMatricula;
        }

        public int getFrequencia() {
            return frequencia;
        }

        public void setFrequencia(int frequencia) {
            this.frequencia = frequencia;
        }

        public double getNotaFinal() {
            return notaFinal;
        }

        public void setNotaFinal(double notaFinal) {
            this.notaFinal = notaFinal;
        }

        public boolean isAprovado() {
            return aprovado;
        }

        public void setAprovado(boolean aprovado) {
            this.aprovado = aprovado;
        }
    }

}
