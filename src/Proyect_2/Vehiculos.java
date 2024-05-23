package Proyect_2;

class Vehiculos {
    private String marca;
    private String color;
    private String tipo;

    /*public Vehiculos() {
        this.marca="Chevrolet";
        this.color="Negro";
        this.tipo="Familiar";
    }*/

    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }

    public Vehiculos(){
    }

    public Vehiculos(String marca, String color, String tipo){
        this.marca=marca;
        this.color=color;
        this.tipo=tipo;
    }

    public void mostrar(){
        System.out.println("El nombre de la marca es: "+marca+", el color "+color+" y el tipo es "+tipo);
    }


}
