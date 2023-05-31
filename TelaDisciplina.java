package services;

import entities.Aluno;
import entities.Disciplina;
import interfaces.DisciplinaDAO;

import java.util.Scanner;

public class TelaDisciplina {
    private DisciplinaDAO disciplinaDAO;
    private Scanner scanner;

    public void DisciplinaDAO() {
        //    disciplinaDAO = DAOFactory.createDisciplinaDAO();
        scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        boolean sair = false;

        while (!sair) {
            System.out.println("----- Menu Aluno -----");
            System.out.println("1. Cadastrar Disciplina");
            System.out.println("2. Listar Disciplina");
            System.out.println("3. Alterar Disciplina");
            System.out.println("4. Excluir Disciplina");
            System.out.println("5. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do Scanner

            switch (opcao) {
                case 1:
                    cadastrarDisciplina();
                    break;
                case 2:
                    listarDisciplina();
                    break;
                case 3:
                    alterarDisciplinas();
                    break;
                case 4:
                    excluirDisciplina();
                    break;
                case 5:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }



    private void cadastrarDisciplina() {
        System.out.println("----- Cadastro de Sisciplina -----");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Codigo: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do Scanner

        Disciplina disciplina = new Disciplina();
        disciplinaDAO.adicionarDisciplina(disciplina);
        System.out.println("Disciplina cadastrado com sucesso!");
    }

    private void listarDisciplina() {
        System.out.println("----- Lista de Disciplinas -----");
        for (Disciplina disciplina : disciplinaDAO.listarDisciplinas()) {
            System.out.println(disciplina);
        }
    }

    private void alterarDisciplinas() {
        System.out.println("----- Alterar Disciplinas -----");
        System.out.print("Digite o codigo da disciplina a ser alterado: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do Scanner

        Disciplina disciplina = disciplinaDAO.buscarDisciplina(codigo);
        if (disciplina != null) {
            System.out.print("Novo nome: ");
            String nome = scanner.nextLine();
            disciplina.setNome(nome);
            disciplinaDAO.atualizarDisciplina(disciplina);
            System.out.println("DISCIPĹIMA alterado com sucesso!");
        } else {
            System.out.println("DISCIPLINA não encontrado!");
        }
    }

    private void excluirDisciplina() {
        System.out.println("----- Excluir Disciplina -----");
        System.out.print("Digite o codigo da disciplina a ser excluído: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do Scanner

        Disciplina disciplina = disciplinaDAO.buscarDisciplina(codigo);
        if (disciplina != null) {
            disciplinaDAO.deletarDisciplina(codigo);
            System.out.println("disciplina excluído com sucesso!");
        } else {
            System.out.println("disciplina não encontrado!");
        }
    }
}

