package Ejercicio1;

public class EventoUniversitario {
    private final String id = "1";
    private String titulo;
    private double costoBase;
    private boolean gratuito;

    public EventoUniversitario (String tit, double costoB, boolean gratis){
        this.titulo = tit;
        this.costoBase= costoB;
        this.gratuito = gratis;
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
    //Otro constructor que sale en el tp
    public EventoUniversitario(){
        
    }
}
