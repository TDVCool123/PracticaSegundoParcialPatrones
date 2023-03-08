package templates.memento;

import java.util.HashMap;
import java.util.Map;

public class GitHub {
    private Map<String,Memento> commitMap = new HashMap<>();

    public void createCommit(String hashCodeCommit, Memento memento){
        commitMap.put(hashCodeCommit,memento);
    }

    public Memento getCommit(String hashCodeCommit) throws Exception {
        if ( !commitMap.containsKey(hashCodeCommit))
            throw new Exception("ERROR! el commit no existe: "+hashCodeCommit);
        return commitMap.get(hashCodeCommit);
    }
}
