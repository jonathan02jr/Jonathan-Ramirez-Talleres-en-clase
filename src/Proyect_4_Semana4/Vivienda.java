package Proyect_4_Semana4;

public class Vivienda {
    int numero;
    String propietario;

    public Vivienda(int numero, String propietario){
        this.numero = numero;
        this.propietario = propietario;
    }

    public void imprimir(){
        System.out.println("Numero de vivienda: "+numero);
        System.out.println("Nombre del propietario: "+propietario+'\n');
    }

    public void mensaje(){
    }
}

class Departamento extends Vivienda {
    int piso;

    public Departamento(int numero, String propietario,int piso){
        super(numero,propietario);
        this.piso = piso;
    }

    public void anuncio(){
            System.out.println("Departamento arrendado");
    }

    public void imprimirDe(){
        System.out.println("Numero de vivienda: "+ numero);
        System.out.println("Nombre del propietario: "+propietario);
        System.out.println("El piso es: "+piso+'\n');
    }
}

class Casa extends Vivienda{
    int habitacion;
    String ubicacion;

    public Casa(int numero, String propietario, int habitacion, String ubicacion){
        super(numero, propietario);
        this.habitacion = habitacion;
        this.ubicacion = ubicacion;
    }

    public void imprimirCasa() {
        System.out.println("Numero de vivienda: " + numero);
        System.out.println("Nombre del propietario: " + propietario);
        System.out.println("Numero de habitacion: " + habitacion);
        System.out.println("La ubicacion es: "+ ubicacion);

    }
}