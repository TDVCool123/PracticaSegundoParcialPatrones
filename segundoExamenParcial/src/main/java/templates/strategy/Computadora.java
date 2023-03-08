package templates.strategy;

public class Computadora {

    private MemoryRam memoryRam;
    private CPU cpu;
    // IState
    private IStateComputer stateComputer;


    public Computadora(MemoryRam memoryRam, CPU cpu) {
        this.memoryRam = memoryRam;
        this.cpu = cpu;
    }

    public MemoryRam getMemoryRam() {
        return memoryRam;
    }

    public void setMemoryRam(MemoryRam memoryRam) {
        this.memoryRam = memoryRam;
    }

    public CPU getCPU() {
        return cpu;
    }

    public void setCPU(CPU cpu) {
        this.cpu = cpu;
    }

    public IStateComputer getStateComputer() {
        return stateComputer;
    }

    public void setStateComputer(IStateComputer stateComputer) {
        this.stateComputer = stateComputer;
    }

    public void useComputer(){
        this.stateComputer.computerBehavior(this);
    }
}
