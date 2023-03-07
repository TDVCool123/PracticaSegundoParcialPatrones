package parcial2.exercise3;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private List<Celular> celularList = new ArrayList<>();
    private String name;
    private IStrategyAlgorithm strategyGame;

    public Tienda(String name) {
        this.name = name;
    }

    public List<Celular> getJugadorList() {
        return celularList;
    }

    public Tienda addCelular(Celular celular) {
        this.celularList.add(celular);
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

    public void vender(){
        this.strategyGame.algoritmo(this.celularList);
    }
}
