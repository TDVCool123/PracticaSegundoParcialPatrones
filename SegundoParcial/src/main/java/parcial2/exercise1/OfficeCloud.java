package parcial2.exercise1;

import java.util.HashMap;
import java.util.Map;

public class OfficeCloud {
    private Map<String,Memento> commitMap = new HashMap<>();

    public void createGuardado(String hashCodeGuardado, Memento memento){
        commitMap.put(hashCodeGuardado,memento);
    }

    public Memento getGuardado(String hashCodeGuardado) throws Exception {
        if ( !commitMap.containsKey(hashCodeGuardado))
            throw new Exception("ERROR! no se puede guardar: "+hashCodeGuardado);
        return commitMap.get(hashCodeGuardado);
    }
}
