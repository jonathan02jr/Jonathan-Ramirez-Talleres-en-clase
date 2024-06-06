package Proyect_11;

class Suite extends Inmueble {
    private boolean tieneJacuzzi;

    public Suite(String direccion, double tamano, int numHabitaciones, double precio, boolean tieneJacuzzi){
        super(direccion, tamano, numHabitaciones, precio);
        this.tieneJacuzzi=tieneJacuzzi;
    }

    public boolean getTieneJacuzzi(){
        return tieneJacuzzi;
    }
    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Tiene Jacuzzi: "+tieneJacuzzi);
    }
}
