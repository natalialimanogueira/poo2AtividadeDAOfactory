package interfaces;

import entities.Disciplina;

import java.util.List;

import java.util.List;

public interface DisciplinaDAO {

    void adicionarDisciplina(Disciplina disciplina);
    void atualizarDisciplina(Disciplina disciplina);
    void deletarDisciplina(int codigo);
    Disciplina buscarDisciplina(int codigo);
    List<Disciplina> listarDisciplinas();
}
