package Proyect_2;

public class Main {
    public static void main(String[] args) {
        System.out.println("MOSTRAR INFORMACION");
        Vehiculos carro = new Vehiculos();
        carro.mostrar();

        Vehiculos carro1 = new Vehiculos("Chevrolet","negro","Familiar");

        System.out.println(carro1.getMarca());

        carro1.setMarca("Honda");
        carro1.mostrar();




    }
}
