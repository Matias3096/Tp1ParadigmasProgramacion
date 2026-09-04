package Clases;

<<<<<<< HEAD
import java.time.LocalDate;
=======
>>>>>>> a1e988410fe23de2ef3988f390c55f8c34d636d1
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

<<<<<<< HEAD
    //cero a muchos
    private List<Estudiante> inscribe = new ArrayList<>();

=======
>>>>>>> a1e988410fe23de2ef3988f390c55f8c34d636d1

    //Metodos
    public Inscripcion inscribir(Estudiante estudiante ) {
        //Validacion si hay cupo disponible
        if (inscripciones.size()>= cupoMaximo){
            System.out.println("Ya no hay mas cupo en la actividad "+ tituloAct);
            return null;
        }
        //Si se crea una nueva inscripcion
<<<<<<< HEAD
        Inscripcion inscripcion = new Inscripcion(estudiante,  LocalDate.now(), "Inscripcion Registrada", this);
=======
        Inscripcion inscripcion = new Inscripcion(estudiante, this);
>>>>>>> a1e988410fe23de2ef3988f390c55f8c34d636d1
        inscripciones.add(inscripcion);

        System.out.println("Estudiante " + estudiante.getNombre() +
                "Inscripto en actividad " + tituloAct);

        return inscripcion;
    }
    public void mostrarInscripciones(){

        System.out.println("Las inscripciones son: " );
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
