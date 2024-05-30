package Proyect_7_semana6;

public class Main {
    public static void main(String[] args){

        JugadorFutbol persona1 = new JugadorFutbol(1754443057,"Ariel",12);
        System.out.println("-------- CLASE PADRE --------");
        persona1.info();

        Defensa persona2 = new Defensa(1787144789,"James",10,"Derecho","Roja",2,1);
        System.out.println("\n-------- SUBCLASE HIJA --------");
        persona2.mostrarInfo();


    }
}
