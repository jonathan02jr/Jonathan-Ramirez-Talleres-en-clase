package Proyect_10_Calculos_suma;

public class Calculos {
    private double valor1;
    private double valor2;
    private double valor3;

    public Calculos(double valor1, double valor2, double valor3){
        this.valor1=valor1;
        this.valor2=valor2;
        this.valor3=valor3;
    }

    public double getValor1(){
        return valor1;
    }
    public double getValor2(){
        return valor2;
    }

    public double getValor3(){
        return valor3;
    }


    public void mostrar(){
        System.out.println("----- VALORES -----");
        System.out.println("Valor 1: "+valor1);
        System.out.println("Valor 2: "+valor2);
        System.out.println("Valor 3: "+valor3);
    }
}

class Sumar extends Calculos{

    public Sumar(double valor1, double valor2, double valor3){
        super(valor1, valor2, valor3);
    }

    public void sumatoria(){
        super.mostrar();
        System.out.println("----- Sumatoria -----");
        double total;
        total= getValor1()+getValor2()+getValor3();
        System.out.println("La suma total de los valores es: "+total);
    }
}
