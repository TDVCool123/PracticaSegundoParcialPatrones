package parcial2.exercise1;

public class Word {
    private Tesis tesis;

    public void setProject(Tesis tesis){
        this.tesis = new Tesis(tesis.getName());
        this.tesis.setRedaccion(tesis.getRedaccion());
    }

    public Memento createCommitProject(){
        return new Memento (this.tesis);
    }

    public Tesis checkoutCommit(Memento memento){
        this.tesis =memento.getProjectState();
        return this.tesis;
    }
}
