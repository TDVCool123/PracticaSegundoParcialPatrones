package Ejercicios.exercise4;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private List<Estudiante> estudianteList = new ArrayList<>();
    private String name;
    private IStrategyAlgorithm strategyGame;

    public DataBase(String name) {
        this.name = name;
    }

    public List<Estudiante> getJugadorList() {
        return estudianteList;
    }

    public DataBase addEstudiante(Estudiante estudiante) {
        this.estudianteList.add(estudiante);
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IStrategyAlgorithm getStrategyGame() {
        return strategyGame;
    }

    public void setStrategyAlgorithm(IStrategyAlgorithm strategyGame) {
        this.strategyGame = strategyGame;
    }

    public void ordenar(){
        this.strategyGame.algoritmo(this.estudianteList);
    }
}
