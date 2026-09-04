package Clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Actividad {
    private int idAct;
    private String tituloAct;
    private int cupoMaximo;

    //Estaticos
    public static final int cupoMinimo;
    static {
        cupoMinimo =0;
        System.out.println("Se cargo la clase actividad");
    }

    //Relaciones
    //private Estudiante inscribe;
    private List<Inscripcion> inscripciones;

    //cero a muchos
    private List<Estudiante> inscribe = new ArrayList<>();

    //Metodos
    public Inscripcion inscribir(Estudiante estudiante ) {
        //Validacion si hay cupo disponible
        if (inscripciones.size()>= cupoMaximo){
            System.out.println("Ya no hay mas cupo en la actividad "+ tituloAct);
            return null;
        }
        //Si se crea una nueva inscripcion
        Inscripcion inscripcion = new Inscripcion(estudiante,  LocalDate.now(), "Inscripcion Registrada", this);
        inscripciones.add(inscripcion);

        System.out.println("Estudiante " + estudiante.getNombre() +
                "Inscripto en actividad " + tituloAct);

        return inscripcion;
    }
    public void mostrarInscripciones(){

        System.out.println("Las inscripciones son: " + inscripciones);
    }

    //Constructor
    public Actividad(int idAct, String tituloAct, int cupoMaximo){
        this.idAct = idAct;
        this.tituloAct = tituloAct;
        this.cupoMaximo = cupoMaximo;
        this.inscripciones = new ArrayList<>(); //en esta linea inicializa la lista
    }

    // No lo vamos a usar ahora, sino para la proxima iteracionpublic abstract double calcularCostoMateriales();



}
