package Proyect_1;

public class Principal {

    public static void main(String[] args) {

        //Guardamos los datos
        Persona persona=new Persona();
        persona.setNombre("Linda");
        persona.setApellidoPaterno("Gómez");
        persona.setApellidoMaterno("Pérez");
        persona.setSexo('M');
        persona.setEdad(28);
        persona.setDireccion("Calle Ariban, Madrid");

        //Obtenemos los datos y los imprimimos
        String nombre=persona.getNombre();
        String app=persona.getApellidoPaterno();
        String apm=persona.getApellidoMaterno();
        char sexo=persona.getSexo();
        int edad=persona.getEdad();
        String direccion=persona.getDireccion();

        System.out.println("Los datos de la persona son: "+nombre+", "+app+", "+apm+", "+sexo+", "+edad+", "+direccion);
    }


}



