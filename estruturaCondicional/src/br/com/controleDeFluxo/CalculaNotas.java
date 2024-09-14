package br.com.controleDeFluxo;
import java.util.Scanner;

public class CalculaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta;

        do {
            System.out.print("Digite o nome do(a) aluno(a): ");
            String nomeAluno = scanner.nextLine();

            float nota1, nota2, nota3, nota4, media;

            System.out.print("Digite a primeira nota: ");
            nota1 = scanner.nextFloat();

            System.out.print("Digite a segunda nota: ");
            nota2 = scanner.nextFloat();

            System.out.print("Digite a terceira nota: ");
            nota3 = scanner.nextFloat();

            System.out.print("Digite a quarta nota: ");
            nota4 = scanner.nextFloat();

            media = (nota1 + nota2 + nota3 + nota4) / 4;

            System.out.printf("Média do(a) aluno(a) %s: %.2f\n", nomeAluno, media);

            if (media >= 7) {
                System.out.println("Aluno(a) aprovado(a)!");
            } else if (media >= 5) {
                System.out.println("Aluno(a) em recuperação!");
            } else {
                System.out.println("Aluno(a) reprovado(a)!");
            }

            System.out.print("Deseja calcular a média de outro(a) aluno(a)? (sim/não): ");
            resposta = scanner.next();

        } while (resposta.equalsIgnoreCase("sim"));
        scanner.close();
    }
}