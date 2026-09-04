package Clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Inscripcion {
    private LocalDate fecha;
    private String estado;

    //Asociativa
    private Estudiante estudiante;
    private Actividad actividad;

    public Inscripcion (Estudiante estudiante, LocalDate fecha, String estado, Actividad actividad){
        this.estudiante = estudiante;
        this.fecha = fecha;
        this.estado = estado; //Como hacemos para parametrizar?
        this.actividad = actividad;
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
