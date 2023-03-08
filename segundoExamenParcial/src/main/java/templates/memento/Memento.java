package templates.memento;

public class Memento {
    private Project project;

    public Memento(Project project){
        this.project = project;
    }

    public Project getProjectState(){
        return project;
    }
}
