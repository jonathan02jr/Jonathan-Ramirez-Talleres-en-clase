package Proyect_11;

import Proyect_1.Persona;

public class Main {
    public static void main(String[] args){

        Inmueble vivienda1 = new Inmueble("Tumbaco",120,12,100);
        System.out.println("INMUEBLE");
        vivienda1.mostrarInformacion();

        Departamento vivienda2 = new Departamento("Puembo",130,2,350,3);
        System.out.println("\n");
        System.out.println("DEPARTAMENTO");
        vivienda2.mostrarInformacion();

        CasaIndividual vivienda3 = new CasaIndividual("Cumbaya",125,5,500,36);
        System.out.println("\n");
        System.out.println("CASA INDIVIDUAL");
        vivienda3.mostrarInformacion();

        Suite vivienda4 = new Suite("Tumbaco",120,12,500,true);
        System.out.println("\n");
        System.out.println("SUITE");
        vivienda4.mostrarInformacion();

    }
}
