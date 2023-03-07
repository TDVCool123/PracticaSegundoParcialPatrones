package parcial2.exercise1;

public class Client {

    public static void main(String[] args) throws Exception {
        OfficeCloud github = new OfficeCloud();
        Word word = new Word();

        Tesis patronesDiseno = new Tesis("Tesis de Grado");

        patronesDiseno.setRedaccion("Titulo e indice");

        patronesDiseno.setRedaccion(patronesDiseno.getRedaccion()+"\nIntroduccion y objetivos");

        word.setProject(patronesDiseno);
        github.createGuardado("guardado1", word.createCommitProject());

        patronesDiseno.setRedaccion(patronesDiseno.getRedaccion()+"\nPlanteamiento del problema");

        word.setProject(patronesDiseno);
        github.createGuardado("guardado2", word.createCommitProject());

        patronesDiseno.setRedaccion(patronesDiseno.getRedaccion()+"\nMarco teorico");

        word.setProject(patronesDiseno);
        github.createGuardado("guardado3", word.createCommitProject());

        patronesDiseno.setRedaccion(patronesDiseno.getRedaccion()+"\nConclusiones y bibliografia");

        word.setProject(patronesDiseno);
        github.createGuardado("guardado4", word.createCommitProject());


        System.out.println("Deberia mostrar el ultimo commit --> 6 linias de codigo");
        patronesDiseno.showInfo();




        patronesDiseno = word.checkoutCommit(github.getGuardado("guardado3"));

        System.out.println("Estado de guardado 3");
        patronesDiseno.showInfo();
    }

}
