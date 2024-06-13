package Proyect_13_RESPALDO;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Concierto evento1 = new Concierto(1500,400,150);
        System.out.println("---CONCIERTO---");
        System.out.println("El valor base es de: "+evento1.getValorBase());

        System.out.println("---- SERVICIOS ADICIONALES ----");
        System.out.println("1. Seguridad adicional- $"+evento1.getValorSeguridad());
        System.out.println("2. Stand de comida - $"+evento1.getValorComida());
        System.out.println("3. Los dos servicios - $550");
        System.out.println("4. No desea ningun servicio / Salir");
        System.out.print("Ingrese una opcion: ");
        int opcion= sc.nextInt();
        switch (opcion){
            case 1:
                double suma1 = evento1.getValorBase()+ evento1.getValorSeguridad();
                System.out.println("Valor total: "+suma1);
                break;
            case 2:
                double suma2 = evento1.getValorBase()+ evento1.getValorComida();
                System.out.println("Valor total: "+suma2);
                break;
            case 3:
                double suma3 = evento1.getValorBase() + 550;
                System.out.println("Valor total: "+ suma3);
                break;
            case 4:
                System.out.println("Saliendo....");
                return;
            default:
                System.out.println("Ingrese valores del 1 al 4");
                break;
        }

    }
}
