package Clases;

import java.time.LocalDate;
<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;
=======
>>>>>>> a1e988410fe23de2ef3988f390c55f8c34d636d1

public class Inscripcion {
    private LocalDate fecha;
    private String estado;
<<<<<<< HEAD

    //Asociativa
    private Estudiante estudiante;
    private Actividad actividad;

    public Inscripcion (Estudiante estudiante, LocalDate fecha, String estado, Actividad actividad){
        this.estudiante = estudiante;
        this.fecha = fecha;
        this.estado = estado; //Como hacemos para parametrizar?
=======
    private Estudiante estudiante;
    private Actividad actividad;

    public Inscripcion (Estudiante estudiante, Actividad actividad){
        this.fecha = LocalDate.now();
        this.estado = "Confirmada"; //COmo hacemos para parametrizar?
        this.estudiante = estudiante;
>>>>>>> a1e988410fe23de2ef3988f390c55f8c34d636d1
        this.actividad = actividad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
<<<<<<< HEAD

=======
>>>>>>> a1e988410fe23de2ef3988f390c55f8c34d636d1
        this.fecha = fecha;
    }

    public String getEstado() {
<<<<<<< HEAD

        return estado;
    }

    public void confirmar() {

        this.estado = "Inscripcion confirmada";
    }

    public Estudiante getEstudiante() {

=======
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Estudiante getEstudiante() {
>>>>>>> a1e988410fe23de2ef3988f390c55f8c34d636d1
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
<<<<<<< HEAD

=======
>>>>>>> a1e988410fe23de2ef3988f390c55f8c34d636d1
        this.estudiante = estudiante;
    }

    public Actividad getActividad() {
<<<<<<< HEAD

=======
>>>>>>> a1e988410fe23de2ef3988f390c55f8c34d636d1
        return actividad;
    }

    public void setActividad(Actividad actividad) {
<<<<<<< HEAD

        this.actividad = actividad;
    }


=======
        this.actividad = actividad;
    }
>>>>>>> a1e988410fe23de2ef3988f390c55f8c34d636d1
}
