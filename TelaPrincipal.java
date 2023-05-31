package services;

import java.util.Scanner;

public class TelaPrincipal {
    private Scanner scanner;
    private TelaAluno telaAluno;
    private TelaDisciplina telaDisciplina;

    public TelaPrincipal() {
        scanner = new Scanner(System.in);
        telaAluno = new TelaAluno();
        telaDisciplina = new TelaDisciplina();
    }

    public void exibirMenu() {
        boolean sair = false;

        while (!sair) {
            System.out.println("----- Menu Principal -----");
            System.out.println("1. Aluno");
            System.out.println("2. Disciplina");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do Scanner

            switch (opcao) {
                case 1:
                    telaAluno.exibirMenu();
                    break;
                case 2:
                    telaDisciplina.exibirMenu();
                    break;
                case 3:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static void main(String[] args) {
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        telaPrincipal.exibirMenu();
    }
}

