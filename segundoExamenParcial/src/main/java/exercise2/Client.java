package exercise2;

public class Client {
    public static void main (String args[]){

        ChatJuegos chatJuegos = new ChatJuegos();

        Jugadores p1 =  new Jugadores(chatJuegos);
        p1.setAlias("TDVCool123").setName("Luis").setRank("Oro").setEquipo("Alfa");
        Jugadores dev2 =  new Jugadores(chatJuegos);
        dev2.setAlias("Limoncello").setName("Sebas").setRank("Diamante").setEquipo("Alfa");
        Jugadores dev3 =  new Jugadores(chatJuegos);
        dev3.setAlias("CrimzonFox978").setName("Fer").setRank("Platino").setEquipo("Alfa");


        Jugadores d1 = new Jugadores(chatJuegos);
        d1.setAlias("Alex15_Ecl1ps3").setName("Alexis").setRank("Oro").setEquipo("Gamma");
        Jugadores d2 = new Jugadores(chatJuegos);
        d2.setAlias("Paul_Walker").setName("Paul").setRank("Oro").setEquipo("Gamma");
        Jugadores d3 = new Jugadores(chatJuegos);
        d3.setAlias("Huawei").setName("Rene").setRank("Oro").setEquipo("Gamma");



        chatJuegos.addProfesionalToTheChat(p1)
                .addProfesionalToTheChat(dev2)
                .addProfesionalToTheChat(dev3)
                .addProfesionalToTheChat(d1)
                .addProfesionalToTheChat(d2)
                .addProfesionalToTheChat(d3);



        p1.send("Amigos, defiendan");
        d2.send("Docententes, ataquen!");
        d3.send(" >> Hola a Todos <<");


    }
}
