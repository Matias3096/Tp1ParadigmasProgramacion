package Clases;

import java.time.LocalDate;


public class Inscripcion {
    private LocalDate fecha;
    private String estado;


    //Asociativa
    private Estudiante estudiante;
    private Actividad actividad;


    public Inscripcion (Estudiante estudiante, Actividad actividad){
        this.estudiante = estudiante;
        this.actividad = actividad;
        this.fecha = LocalDate.now();
        this.estado = "Confirmada"; //COmo hacemos para parametrizar?

    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void confirmar() {
        this.estado = "Inscripcion confirmada";
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Actividad getActividad() {
        return actividad;
    }

    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
    }
}
