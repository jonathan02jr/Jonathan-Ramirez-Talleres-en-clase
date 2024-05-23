package Proyect_1;

// Ejercicio 2: Crear una clase jugador y sus datos ingresados
import java.util.Scanner;
class Jugadores {
    public String nombre;
    public String posicion;
    public int edad;
    public int Num_camiseta;
    public Jugadores(String nombre,String posicion, int edad,int
            Num_camiseta) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.edad = edad;
        this.Num_camiseta = Num_camiseta;
    }
    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Posicion: " + posicion);
        System.out.println("Edad: " + edad);
        System.out.println("Numero de camiseta: " + Num_camiseta+'\n');
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++) {
            System.out.print("Ingresa el nombre del jugador: ");
            String nombre1 = sc.nextLine();
            System.out.print("Ingresa la posicion del jugador: ");
            String posicion1 = sc.nextLine();
            System.out.print("Ingresa la edad del jugador: ");
            int edad1 = sc.nextInt();
            System.out.print("Ingresa el numero de camiseta del jugador: ");
            int num_camiseta1 = sc.nextInt();
            Jugadores jugador1 = new Jugadores(nombre1, posicion1,edad1, num_camiseta1);
            jugador1.mostrar();
            sc.nextLine();
        }

        sc.close();
    }
}