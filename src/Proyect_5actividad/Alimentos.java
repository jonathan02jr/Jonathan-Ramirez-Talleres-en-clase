package Proyect_5actividad;

//23 de mayo, crear el primer git

public class Alimentos {
    String nombre;
    String color;
    String tamanio;

    public Alimentos( String nombre, String color, String tamanio){
        this.nombre = nombre;
        this.color = color;
        this.tamanio = tamanio;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Color: "+color);
        System.out.println("Tamaño: "+tamanio+'\n');
    }
}

class Frutas extends Alimentos{
    String sabor;

    public Frutas(String nombre, String color, String tamanio, String sabor){
        super(nombre, color, tamanio);
        this.sabor=sabor;
    }

    public void mostrarFru(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Color: "+color);
        System.out.println("Tamaño: "+tamanio);
        System.out.println("Su sabor es: "+sabor);

    }
}
