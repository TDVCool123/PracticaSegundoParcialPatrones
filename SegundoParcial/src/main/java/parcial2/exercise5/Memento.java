package parcial2.exercise5;

public class Memento {
    private Proyecto project;

    public Memento(Proyecto project) {
        this.project = project;
    }

    public Proyecto getProjectState() {
        return project;
    }
}
