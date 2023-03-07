package parcial2.exercise2;

public class CuerpoEjercito implements IHandler {
    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public IHandler next() {
        return next;
    }

    @Override
    public void orden(Ordenes ordenes) {


        General general = new General();
        Teniente teniente = new Teniente();
        Coronel coronel = new Coronel();
        Cabo cabo = new Cabo();

        this.setNext(coronel);
        coronel.setNext(general);
        general.setNext(teniente);
        teniente.setNext(cabo);

        this.next.orden(ordenes);

    }
}
