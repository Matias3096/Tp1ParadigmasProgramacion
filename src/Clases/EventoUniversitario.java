package Clases;

public class EventoUniversitario {
    private final String Id;
    private String titulo;
    private double costoBase;
    private boolean gratuito;
    private static int cantidadEventos;//Subrayado es estatico

    //Inicializacion de la variable static
    static {
        cantidadEventos =0;
    }
    //Relaciones
    public Actividad compone;
    public Sala sala;

    public EventoUniversitario(String Id, String titulo, double costoBase, boolean gratuito, int id, String titulo1, int cupoMaximo) {
        this.Id = Id;
        this.titulo = titulo;
        this.costoBase = costoBase;
        this.gratuito = gratuito;
        this.compone = new Actividad(id, titulo1, cupoMaximo);
        cantidadEventos++;  //Incrementa el contador de cantidad de eventos
    }


    //Getters and setters
    public void setTitulo(String titulo) {

        this.titulo = titulo;
    }

    public String getTitulo() {

        return titulo;
    }
     public void setCostoBase(double costoBase1){

        this.costoBase = costoBase1;
     }

    public double getCostoBase() {

        return costoBase;
    }

    public void setGratuito(boolean gratuito){

        this.gratuito = gratuito;
    }
    public boolean getGratuito(){

        return gratuito;
    }
    public static int getCantidadEventos() { // Consultar si es correcto
        //System.out.println("\nLa cantidad de eventos creados es: " + cantidadEventos);
        return cantidadEventos;
    }

    public static void setCantidadEventos(int cantidadEventos) {
        EventoUniversitario.cantidadEventos = cantidadEventos;
    }
    //Otro constructor que sale en el tp. Constructor de copia
    public EventoUniversitario(EventoUniversitario otro){
        this.Id = otro.Id;
        this.titulo= otro.titulo;
        this.costoBase = otro.costoBase;
        this.gratuito = otro.gratuito;
        cantidadEventos++; //Incrementa la cantidad de eventos

    }
    //ver validaciones posibles
    public double calcularCostoEstimado(){
        if (gratuito){
            return 0;
        }
        return costoBase;
    }

    public void asignarSala(Sala sala){
        this.sala = sala;
        System.out.println("La sala asignada al evento: "+ titulo +"es: "+ sala);
    }

    public void crearActividad(int id, String titulo, int cupo){
        Actividad act = new Actividad(id, titulo, cupo);  //Es correcto hacerlo asi? como en el constructor
        System.out.println("Actividad creada. \n Id:" + id +
                ",\n Titulo: "+titulo +
                ",\n Cupo: " + cupo);
    }
    public void mostrarDatos(){
        System.out.println("\n***DATOS DEL EVENTO***"+"\nId numero:" + Id + "" +
                "titulo :" + titulo +
                "\n ¿Es gratuito? : " + getGratuito() +
                "\n Cantidad de eventos creados: " + getCantidadEventos());
    }
}