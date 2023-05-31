package interfaces;

import entities.Aluno;

import java.util.List;

public interface AlunoDAO {
    void adicionarAluno(Aluno aluno);
    void atualizarAluno(Aluno aluno);
    void deletarAluno(int matricula);
    Aluno buscarAluno(int matricula);
    List<Aluno> listarAlunos();
}
