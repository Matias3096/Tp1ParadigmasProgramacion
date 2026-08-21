package Clases;

public class Estudiante {

    //Atributos
    private String legajo;  //No nos conviene hacerlo static como el ejemplo de arbol
    private final String nombre;  //En clase vimos que tanto el dni y bueno el nombre no se cambia


    //Constructor
    public Estudiante (String leg, String name){
        this.legajo = leg;
        this.nombre = name;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        if (legajo != null){
            System.out.println("La cadena esta vacia");
        } else {
            this.legajo = legajo;
        }
    }

    public String getNombre(){
        return nombre;
    }


}

