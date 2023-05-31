package services;

import entities.Aluno;
import interfaces.AlunoDAO;


import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlunoDAOImp implements AlunoDAO {
    private Map<Integer, Aluno> alunos;

    public AlunoDAOImp() {
        alunos = new HashMap<>();
    }

    @Override
    public void adicionarAluno(Aluno aluno) {
        alunos.put(aluno.getMatricula(), aluno);
    }

    @Override
    public void atualizarAluno(Aluno aluno) {
        alunos.put(aluno.getMatricula(), aluno);
    }

    @Override
    public void deletarAluno(int matricula) {
        alunos.remove(matricula);
    }

    @Override
    public Aluno buscarAluno(int matricula) {
        return alunos.get(matricula);
    }

    @Override
    public List<Aluno> listarAlunos() {
        return new ArrayList<>(alunos.values());
    }
}
