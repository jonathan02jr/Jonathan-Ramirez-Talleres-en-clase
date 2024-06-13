package Proyect_14_Respaldo;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenidos al menú de Reservas");

        System.out.println("Selecciona tu tipo de evento a reservar:");
        System.out.println("1.- Boda:");
        System.out.println("2.- Conferencia:");
        System.out.println("3.- Concierto:");
        System.out.println("4.- Salir:");
        Reserva persona1 =new Reserva();
        persona1.calcularCosto(200,1000);



    }
}
