package parcial2.exercise4;

public class Client {
    public static void main (String args[]){

        Whatsapp upbWhatsapp = new Whatsapp();

        Usuarios gr1 =  new Usuarios(upbWhatsapp);
        gr1.setNum("111").setName("Michael").setGrupo("Patrones1");
        Usuarios gr2 =  new Usuarios(upbWhatsapp);
        gr2.setNum("222").setName("Pablo").setGrupo("Patrones1");
        Usuarios gr3 =  new Usuarios(upbWhatsapp);
        gr3.setNum("333").setName("Pedro").setGrupo("Patrones1");
        Usuarios gr4 =  new Usuarios(upbWhatsapp);
        gr4.setNum("777777").setName("Juana").setGrupo("Patrones1");

        Usuarios gr5 = new Usuarios(upbWhatsapp);
        gr5.setNum("444").setName("Miranda").setGrupo("Patrones1");
        Usuarios gr6 = new Usuarios(upbWhatsapp);
        gr6.setNum("666").setName("Natalia").setGrupo("Patrones1");
        Usuarios gr7 = new Usuarios(upbWhatsapp);
        gr7.setNum("888").setName("Brenda").setGrupo("Patrones1");

        Usuarios gr8 = new Usuarios(upbWhatsapp);
        gr8.setNum("00022").setName("Sebastian").setGrupo("Patrones1");
        Usuarios gr9 = new Usuarios(upbWhatsapp);
        gr9.setNum("00055").setName("Luciana").setGrupo("Patrones1");

        upbWhatsapp.addUsersToTheChat(gr1)
                .addUsersToTheChat(gr2)
                .addUsersToTheChat(gr3)
                .addUsersToTheChat(gr5)
                .addUsersToTheChat(gr6)
                .addUsersToTheChat(gr7)
                .addUsersToTheChat(gr8)
                .addUsersToTheChat(gr4)
                .addUsersToTheChat(gr9);


        gr1.send("hola persona2");

        gr8.send(" >> Hola a Todos <<");


    }
}
