package Clases;

import java.util.ArrayList;
import java.util.List;

public class EventoUniversitario {

    //Atributos
    private final String idEU;
    private String tituloEU;
    private double costoBaseEU;
    private boolean gratuitoEU;
    private static int cantidadEventosEu;//Subrayado es estatico

    //Inicializacion de la variable static
    static {
        cantidadEventosEu =0;
    }
    //Relaciones
<<<<<<< HEAD
    private List<Actividad> actividadesComposicion;
    public Sala agrega;

    //Constructor original
    public EventoUniversitario(String id, String titulo, double costoBase, boolean gratuito) {
        this.idEU= id;
        this.tituloEU = titulo;
        this.costoBaseEU = costoBase;
        this.gratuitoEU = gratuito;
        this.actividadesComposicion = new ArrayList<>();
        cantidadEventosEu++;  //Incrementa el contador de cantidad de eventos
    }

    //Otro constructor que sale en el tp. Constructor de copia
    public EventoUniversitario(EventoUniversitario otro){
        this.idEU = otro.idEU;
        this.tituloEU= otro.tituloEU;
        this.costoBaseEU = otro.costoBaseEU;
        this.gratuitoEU = otro.gratuitoEU;

        //Inicializamos la lista
        this.actividadesComposicion = new ArrayList<>();
        cantidadEventosEu++; //Incrementa la cantidad de eventos

=======
    public Actividad compone;
    public Sala sala;

    public EventoUniversitario(String Id, String titulo, double costoBase, boolean gratuito, int id, String titulo1, int cupoMaximo) {
        this.Id = Id;
        this.titulo = titulo;
        this.costoBase = costoBase;
        this.gratuito = gratuito;
        this.compone = new Actividad(id, titulo1, cupoMaximo);
        cantidadEventos++;  //Incrementa el contador de cantidad de eventos
>>>>>>> a1e988410fe23de2ef3988f390c55f8c34d636d1
    }


    //Getters and setters
    public void setTitulo(String titulo) {

        this.tituloEU = titulo;
    }

    public String getTitulo() {

        return tituloEU;
    }
     public void setCostoBase(double costoBase1){

        this.costoBaseEU = costoBase1;
     }

    public double getCostoBase() {

        return costoBaseEU;
    }

    public void setGratuito(boolean gratuito){

        this.gratuitoEU = gratuito;
    }
    public boolean getGratuito(){

        return gratuitoEU;
    }
<<<<<<< HEAD
        //Get y set de la relacion de composicion, sino me marca warning
    public List<Actividad> getActividades() {
        return actividadesComposicion;
    }

    public void setActividades(List<Actividad> actividades) {
        this.actividadesComposicion = actividades;
    }


    public static int getCantidadEventos() { // Consultar si es correcto
        //System.out.println("\nLa cantidad de eventos creados es: " + cantidadEventos);
        return cantidadEventosEu;
=======
    public static int getCantidadEventos() { // Consultar si es correcto
        //System.out.println("\nLa cantidad de eventos creados es: " + cantidadEventos);
        return cantidadEventos;
>>>>>>> a1e988410fe23de2ef3988f390c55f8c34d636d1
    }

    public static void setCantidadEventos(int cantidadEventos) {
        EventoUniversitario.cantidadEventosEu = cantidadEventos;
    }

    //ver validaciones posibles
    public double calcularCostoEstimado(){
        if (gratuitoEU){
            return 0.0;
        }
        return costoBaseEU;
    }

<<<<<<< HEAD
    public void asignarSala(Sala salaAsignada){
        this.agrega = salaAsignada;
        System.out.println("La sala asignada al evento: "+ tituloEU +"es: "+ salaAsignada);
    }

    public void crearActividad(int id, String titulo, int cupo){
        //Actividad act = new Actividad(id, titulo, cupo);  //Es correcto hacerlo asi? como en el constructor
        Actividad actividadDelMetodo = new Actividad(id, titulo, cupo );
        this.actividadesComposicion.add(actividadDelMetodo);
=======
    public void asignarSala(Sala sala){
        this.sala = sala;
        System.out.println("La sala asignada al evento: "+ titulo +"es: "+ sala);
    }

    public void crearActividad(int id, String titulo, int cupo){
        Actividad act = new Actividad(id, titulo, cupo);  //Es correcto hacerlo asi? como en el constructor
>>>>>>> a1e988410fe23de2ef3988f390c55f8c34d636d1
        System.out.println("Actividad creada. \n Id:" + id +
                ",\n Titulo: "+titulo +
                ",\n Cupo: " + cupo);
    }
    /*
       HACER COMO UN SEGUN CASO, POR SI ES CHARLA O EVENTO
     */


    public void mostrarDatos(){
<<<<<<< HEAD
        System.out.println("\n***DATOS DEL EVENTO***"+"\nId numero:" + this.idEU + "" +
                "titulo :" + this.tituloEU +
=======
        System.out.println("\n***DATOS DEL EVENTO***"+"\nId numero:" + Id + "" +
                "titulo :" + titulo +
>>>>>>> a1e988410fe23de2ef3988f390c55f8c34d636d1
                "\n ¿Es gratuito? : " + getGratuito() +
                "\n Cantidad de eventos creados: " + getCantidadEventos());
    }
}