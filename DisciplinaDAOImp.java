package services;
import entities.Aluno;
import entities.Disciplina;
import interfaces.DisciplinaDAO;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DisciplinaDAOImp implements DisciplinaDAO {
    private Map<Integer, Disciplina> disciplinas;

    public DisciplinaDAOImp() {
        disciplinas = new HashMap<>();
    }

    @Override
    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.put(disciplina.getCodigo(), disciplina);
    }

    @Override
    public void atualizarDisciplina(Disciplina disciplina) {
        disciplinas.put(disciplina.getCodigo(), disciplina);
    }

    @Override
    public void deletarDisciplina(int codigo) {
        disciplinas.remove(codigo);
    }

    @Override
    public Disciplina buscarDisciplina(int codigo) {
        return disciplinas.get(codigo);
    }

    @Override
    public List<Disciplina> listarDisciplinas() {
        return new ArrayList<>(disciplinas.values());
    }
}
