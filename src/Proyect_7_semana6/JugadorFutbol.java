package Proyect_7_semana6;

public class JugadorFutbol {
    public int cedula;
    public String nombre;
    public int camiseta;

    public JugadorFutbol(int cedula, String nombre,int camiseta){
        this.cedula=cedula;
        this.nombre=nombre;
        this.camiseta=camiseta;
    }

    public void info(){
        System.out.println("---- DATOS ----");
        System.out.println("Cédula: "+cedula);
        System.out.println("Nombre: "+nombre);
        System.out.println("N° de camiseta: "+camiseta);

    }
}

class Defensa extends JugadorFutbol{
    public String posicion;
    public String tarjetas;
    public int goles;
    public int faltas;

    public Defensa(int cedula, String nombre,int camiseta, String posicion, String tarjetas, int goles, int faltas){
        super(cedula, nombre, camiseta);
        this.posicion=posicion;
        this.tarjetas=tarjetas;
        this.goles=goles;
        this.faltas=faltas;
    }

    public void mostrarInfo(){
        System.out.println("---- INFORMACIÓN DE LA DEFENSA ----");
        super.info();
        System.out.println("Posición: "+posicion);
        System.out.println("Tarjeta: "+tarjetas);
        System.out.println("N° Goles: "+goles);
        System.out.println("N° Faltas: "+faltas);
    }
}
