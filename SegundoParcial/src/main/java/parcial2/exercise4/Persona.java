package parcial2.exercise4;

public abstract class Persona {
    protected ICanalComunication canalComunication;
    private String num;
    private String name;
    private String grupo;

    public Persona(ICanalComunication canalComunication){
        this.canalComunication=canalComunication;
    }

    public String getNum() {
        return num;
    }

    public Persona setNum(String num) {
        this.num = num;
        return this;
    }

    public String getName() {
        return name;
    }

    public Persona setName(String name) {
        this.name = name;
        return this;
    }

    public String getGrupo() {
        return grupo;
    }

    public Persona setGrupo(String grupo) {
        this.grupo = grupo;
        return this;
    }

    public void showInfo(){
        System.out.println("-------------------------");
        System.out.println("numero: " + num);
        System.out.println("name: "+name);

        System.out.println("-------------------------");

    }
    public abstract void send(String msg);
    public abstract void received(String msg);

}
