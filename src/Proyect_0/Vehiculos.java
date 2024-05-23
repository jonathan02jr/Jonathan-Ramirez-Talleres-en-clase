package Proyect_0;

//Prueba: Crear una clase llamada Vehiculos que tenga 3 atributos y dos metodos(frenar,acelerar)

import java.awt.*;

class Vehiculos {
    private String marca;
    private String color;
    private String tipo;

    public Vehiculos(String marca,String color, String tipo) {
        this.marca=marca;
        this.color=color;
        this.tipo=tipo;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca)
    {
        this.marca=marca;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color)
    {
        this.color=color;
    }

    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo)
    {
        this.tipo=tipo;
    }


    /*public void frenar(){
        System.out.println("El auto va a frenar");
    }

    public void acelerar(){
        System.out.println("El auto va a acelerar"+'\n');
    }*/

    public static void main(String[] args){
        Vehiculos carro1 = new Vehiculos("Chevrolet","Rojo","Familiar");
        Vehiculos carro2 = new Vehiculos("Honda","Negro","Deportivo");

        System.out.println("La informacion del auto ACTUAL es:");
        System.out.println("Auto 1 - Color: "+ carro1.getColor()+'\n');
        carro1.setColor("Azul");

        System.out.println("El color de auto ACTUALIZADO es:");
        System.out.println("Auto 1 - Color: "+ carro1.getColor());

        /*carro1.frenar();
        carro1.acelerar();

        carro2.frenar();
        carro2.acelerar();*/
    }
}
