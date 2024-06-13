package Proyect_13_RESPALDO;

public class Concierto {
    private double valorBase;
    private double valorSeguridad;
    private double valorComida;


    public Concierto(double valorBase, double valorSeguridad, double valorComida){
        this.valorBase=valorBase;
        this.valorSeguridad=valorSeguridad;
        this.valorComida=valorComida;
    }

    public double getValorBase() {
        return valorBase;
    }

    public double getValorComida() {
        return valorComida;
    }

    public double getValorSeguridad() {
        return valorSeguridad;
    }

    public void mostrar(){

    }
    public void calcularCosto(){
        System.out.println("El costo total es de: ");
    }
}
