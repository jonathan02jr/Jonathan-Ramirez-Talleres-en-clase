package Proyect_7_;

public class Pelicula {
    public String nombre;
    public String genero;
    public int estreno;

    public Pelicula(String nombre, String genero, int estreno){
        this.nombre=nombre;
        this.genero=genero;
        this.estreno=estreno;
    }

    public void mostrar(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Genero: "+genero);
        System.out.println("Año de estreno: "+estreno);
    }
}
