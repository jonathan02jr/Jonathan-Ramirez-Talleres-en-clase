package Proyect_11;

public class Inmueble {
    private String direccion;
    private double tamano;
    private int numHabitaciones;
    private double precio;

    public Inmueble(String direccion, double tamano, int numHabitaciones, double precio){
        this.direccion=direccion;
        this.tamano=tamano;
        this.numHabitaciones=numHabitaciones;
        this.precio=precio;
    }

    public String getDireccion(){
        return direccion;
    }
    public double getTamano(){
        return tamano;
    }
    public int getNumHabitaciones(){
        return numHabitaciones;
    }
    public double getPrecio(){
        return precio;
    }

    public void mostrarInformacion(){
        System.out.println("Direccion: "+direccion);
        System.out.println("Tamaño: "+tamano);
        System.out.println("N° de Habitaciones: "+numHabitaciones);
        System.out.println("Precio: "+precio);
    }
}
