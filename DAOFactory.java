package factories;

import interfaces.AlunoDAO;
import interfaces.DisciplinaDAO;
import services.AlunoDAOImp;
import services.DisciplinaDAOImp;


public class DAOFactory {
    public static AlunoDAO createAlunoDAO() {
        return new AlunoDAOImp();
    }

    public static DisciplinaDAO createDisciplinaDAO() {
        return new DisciplinaDAOImp();
    }
}
