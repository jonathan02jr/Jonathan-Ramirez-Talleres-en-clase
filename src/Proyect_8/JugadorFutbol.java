package Proyect_8;

//acceder a metodos privados
public class JugadorFutbol {
    private int cedula;
    private String nombre;
    private int camiseta;

    public JugadorFutbol(int cedula, String nombre,int camiseta){
        this.cedula=cedula;
        this.nombre=nombre;
        this.camiseta=camiseta;
    }

    private void info(){
        System.out.println("---- DATOS ----");
        System.out.println("Cédula: "+cedula);
        System.out.println("Nombre: "+nombre);
        System.out.println("N° de camiseta: "+camiseta);
    }

    //acceder al metodo privado
    public void accederInfo(){
        info();
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
        super.accederInfo(); //llamamos a la funcion publica que contiene el metodo privado
        System.out.println("Posición: "+posicion);
        System.out.println("Tarjeta: "+tarjetas);
        System.out.println("N° Goles: "+goles);
        System.out.println("N° Faltas: "+faltas);
    }
}
