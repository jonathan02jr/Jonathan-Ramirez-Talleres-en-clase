package Proyect_14_Respaldo;

class Concierto extends Evento {

    private double valorSeguridad;
    private double valorComida;

    public Concierto (){
    }

    public Concierto(double costoEvento){
        super(costoEvento);
    }

    public Concierto(String tipoEvento, double valorSeguridad, double valorComida){
        super(tipoEvento);
        this.valorSeguridad=valorSeguridad;
        this.valorComida=valorComida;
    }


    public double getValorComida() {
        return valorComida;
    }

    public double getValorSeguridad() {
        return valorSeguridad;
    }

    public void mostrarDatos(){
        super.mostrarDatos();
    }

    public void calcularCosto(){
        System.out.println("El costo total es de: ");
    }
}
