package Proyect_9_Cta_bancaria;

public class CtaBancaria {
    private int cedula;
    private String nombre;
    private double monto;

    public  CtaBancaria(int cedula, String nombre, double monto){
        this.cedula=cedula;
        this.nombre=nombre;
        this.monto=monto;
    }

    public double getMonto(){
        return monto;
    }
    public void setMonto(double monto){
        this.monto=monto;
    }

    public void mostrar(){
        System.out.println("Cedula: "+cedula);
        System.out.println("Nombre: "+nombre);
        System.out.println("Monto: "+monto);
    }
}

class CtaAhorros extends CtaBancaria{
    public String direccion;

    public CtaAhorros(int cedula, String nombre, double monto, String direccion){
        super(cedula, nombre, monto);
        this.direccion=direccion;
    }

    public void depositar(){
        super.mostrar();
        System.out.println("Direccion: "+direccion);
        double suma;
        System.out.println("Dinero depositado: 100");
        suma = getMonto()+100;
        System.out.println("Monto actual: "+suma);
    }
}
