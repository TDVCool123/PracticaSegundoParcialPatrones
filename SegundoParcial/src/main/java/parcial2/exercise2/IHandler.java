package parcial2.exercise2;

public interface IHandler {
    void setNext(IHandler handler);
    IHandler next();

    void orden(Ordenes ordenes);
}
