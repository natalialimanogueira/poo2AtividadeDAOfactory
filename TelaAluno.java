package services;
import entities.Aluno;
import factories.DAOFactory;
import interfaces.AlunoDAO;


import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;

public class TelaAluno {
    private AlunoDAO alunoDAO;
    private Scanner scanner;

    public TelaAluno() {
    //    alunoDAO = DAOFactory.createAlunoDAO();
        scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        boolean sair = false;

        while (!sair) {
            System.out.println("----- Menu Aluno -----");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Listar Alunos");
            System.out.println("3. Alterar Aluno");
            System.out.println("4. Excluir Aluno");
            System.out.println("5. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do Scanner

            switch (opcao) {
                case 1:
                    cadastrarAluno();
                    break;
                case 2:
                    listarAlunos();
                    break;
                case 3:
                    alterarAluno();
                    break;
                case 4:
                    excluirAluno();
                    break;
                case 5:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private void cadastrarAluno() {
        System.out.println("----- Cadastro de Aluno -----");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Matrícula: ");
        int matricula = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do Scanner

        Aluno aluno = new Aluno(nome, matricula);
        alunoDAO.adicionarAluno(aluno);
        System.out.println("Aluno cadastrado com sucesso!");
    }

    private void listarAlunos() {
        System.out.println("----- Lista de Alunos -----");
        for (Aluno aluno : alunoDAO.listarAlunos()) {
            System.out.println(aluno);
        }
    }

    private void alterarAluno() {
        System.out.println("----- Alterar Aluno -----");
        System.out.print("Digite a matrícula do aluno a ser alterado: ");
        int matricula = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do Scanner

        Aluno aluno = alunoDAO.buscarAluno(matricula);
        if (aluno != null) {
            System.out.print("Novo nome: ");
            String nome = scanner.nextLine();
            aluno.setNome(nome);
            alunoDAO.atualizarAluno(aluno);
            System.out.println("Aluno alterado com sucesso!");
        } else {
            System.out.println("Aluno não encontrado!");
        }
    }

    private void excluirAluno() {
        System.out.println("----- Excluir Aluno -----");
        System.out.print("Digite a matrícula do aluno a ser excluído: ");
        int matricula = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do Scanner

        Aluno aluno = alunoDAO.buscarAluno(matricula);
        if (aluno != null) {
            alunoDAO.deletarAluno(matricula);
            System.out.println("Aluno excluído com sucesso!");
        } else {
            System.out.println("Aluno não encontrado!");
        }
    }
}

