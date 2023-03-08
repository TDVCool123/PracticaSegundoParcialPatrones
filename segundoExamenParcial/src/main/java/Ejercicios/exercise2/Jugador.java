package Ejercicios.exercise2;

public abstract class Jugador {
    protected ICanalComunication canalComunication;
    private String alias;
    private String name;
    private String rank;
    private String equipo;

    public Jugador(ICanalComunication canalComunication){
        this.canalComunication=canalComunication;
    }

    public String getAlias() {
        return alias;
    }

    public Jugador setAlias(String alias) {
        this.alias = alias;
        return this;
    }

    public String getName() {
        return name;
    }

    public Jugador setName(String name) {
        this.name = name;
        return this;
    }

    public String getRank() {
        return rank;
    }

    public Jugador setRank(String rank) {
        this.rank = rank;
        return this;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public void showInfo(){
        System.out.println("-------------------------");
        System.out.println("alias: "+ alias);
        System.out.println("name: "+name);
        System.out.println("rango: "+ rank);
        System.out.println("-------------------------");

    }
    public abstract void send(String msg);
    public abstract void received(String msg);

}
