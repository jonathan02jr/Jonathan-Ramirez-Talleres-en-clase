package Proyect_4_Semana4;

public class Principal {
    public static void main (String[] args){

        Vivienda v1 = new Vivienda(123, "Fernando");
        v1.imprimir();

        Departamento d1 = new Departamento(56,"Jonathan",2);
        d1.imprimirDe();

        Casa c1 = new Casa(56,"Jose",34,"Tumbaco");
        c1.imprimirCasa();

    }
}
