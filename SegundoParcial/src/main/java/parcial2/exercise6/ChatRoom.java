package parcial2.exercise6;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements IComunication {

    private List<Desarrollador> group = new ArrayList<>();

    public ChatRoom addToChat(Desarrollador p) {
        group.add(p);
        return this;
    }

    @Override
    public void send(String message, Desarrollador dev) {
        for (Desarrollador p:group) {
            if(!dev.getNombre().equals(p.getNombre())) {
                if(dev.isGroupMode()==false && p.isGroupMode()==false) {
                    p.recieved(message);
                }else if (dev.isGroupMode()==true) {
                    p.recieved(message);
                }
            }
        }

    }

}
