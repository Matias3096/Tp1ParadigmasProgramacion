package Clases;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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

    //Getters y setters
    public String getTituloEU() {
        return tituloEU;
    }

    public void setTituloEU(String tituloEU) {
        this.tituloEU = tituloEU;
    }

    public String getIdEU() {
        return idEU;
    }

    public double getCostoBaseEU() {
        return costoBaseEU;
    }

    public void setCostoBaseEU(double costoBaseEU) {
        this.costoBaseEU = costoBaseEU;
    }

    public boolean isGratuitoEU() {
        return gratuitoEU;
    }

    public void setGratuitoEU(boolean gratuitoEU) {
        this.gratuitoEU = gratuitoEU;
    }

    public static int getCantidadEventosEu() {
        return cantidadEventosEu;
    }

    public static void setCantidadEventosEu(int cantidadEventosEu) {
        EventoUniversitario.cantidadEventosEu = cantidadEventosEu;
    }

    public List<Actividad> getActividadesComposicion() {

        return Collections.unmodifiableList(actividadesComposicion);
    }

    public void setActividadesComposicion(List<Actividad> actividadesComposicion) {
        this.actividadesComposicion = actividadesComposicion;
    }

    public Sala getAgrega() {
        return agrega;
    }

    public void setAgrega(Sala agrega) {
        this.agrega = agrega;
    }

    //Otro constructor que sale en el tp. Constructor de copia
    public EventoUniversitario(EventoUniversitario otro) {
        this.idEU = otro.idEU;
        this.tituloEU = otro.tituloEU;
        this.costoBaseEU = otro.costoBaseEU;
        this.gratuitoEU = otro.gratuitoEU;

        //Inicializamos la lista
        this.actividadesComposicion = new ArrayList<>();
        cantidadEventosEu++; //Incrementa la cantidad de eventos
    }

    //ver validaciones posibles
    public double calcularCostoEstimado(){
        if (gratuitoEU){
            return 0.0;
        }
        return costoBaseEU;
    }

    public void asignarSala(Sala salaAsignada){
        this.agrega = salaAsignada;
        System.out.println("La sala asignada al evento: "+ tituloEU +"es: "+ salaAsignada);
    }

    public void crearActividad(int id, String titulo, int cupo){
        Actividad act = new Actividad(id,titulo, cupo);  //Es correcto hacerlo asi? como en el constructor
        this.actividadesComposicion.add(act);
        System.out.println("Actividad creada. \n Id:" + id +
                ",\n Titulo: "+titulo +
                ",\n Cupo: " + cupo);
    }
    /*
       HACER COMO UN SEGUN CASO, POR SI ES CHARLA O EVENTO
     */


    public void mostrarDatos(){
        System.out.println("\n***DATOS DEL EVENTO***"+"\nId numero:" + getIdEU() + "" +
                "titulo :" + getTituloEU() +
                "\n ¿Es gratuito? : " + isGratuitoEU()+
                "\n Cantidad de eventos creados: "+ getCantidadEventosEu());
    }
}
