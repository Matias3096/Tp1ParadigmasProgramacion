package Clases;

public class Actividad {
    private int idAct;
    private String tituloAct;
    private int cupoMaximo;

    //Estaticos
    public static final int cupoMinimo;
    static {
        cupoMinimo =0;
    }

    //Relaciones
    private Estudiante estudiante;
    private Inscripcion inscripcion;

    //Metodos
    public void inscribir(Estudiante estudiante , Inscripcion inscripcion) {

    }
    public void mostrarInscripciones(){
        System.out.println("Las inscripciones son: ");
    }

    //Constructor
    public Actividad(int idAct, String tituloAct, int cupoMaximo){
        this.idAct = idAct;
        this.tituloAct = tituloAct;
        this.cupoMaximo = cupoMaximo;
    }


}
