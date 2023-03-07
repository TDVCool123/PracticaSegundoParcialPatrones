package parcial2.exercise5;

public class Git {
    private Proyecto project;

    public void setProject(Proyecto project) {
        this.project = new Proyecto(project.getName());
        this.project.setComment(project.getComment());
        this.project.setCode(project.getCode());
    }

    public Memento createCommit() {
        return new Memento(project);
    }

    public Proyecto checkoutCommit(Memento memento) {
        this.project = memento.getProjectState();
        return project;
    }
}
