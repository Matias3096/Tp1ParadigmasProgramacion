import Clases.*;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        //EventoUniversitario ev4 = new Scanner(in);

        //Para ejercicio 1
        // (a)-Creando eventos universitarios
        EventoUniversitario ev1 = new EventoUniversitario("Id001","choripaneada", 3000.0, false);
        EventoUniversitario ev2 = new EventoUniversitario("Id002","Lanzamiento de impresoras",0,true);
        EventoUniversitario ev3 = new EventoUniversitario("Id003","Fulbito de la uni",1500,false);

        // (b)-Eventos de copia
        EventoUniversitario eventoCopia1 = new EventoUniversitario(ev1);
        EventoUniversitario eventoCopia2 = new EventoUniversitario(ev2);
        EventoUniversitario eventoCopia3 = new EventoUniversitario(ev3);

        // (c)
        System.out.println("\nEventos Creados");
        ev1.mostrarDatos();
        ev2.mostrarDatos();
        ev3.mostrarDatos();

        System.out.println("\nCopia de eventos");
        eventoCopia1.mostrarDatos();
        eventoCopia2.mostrarDatos();
        eventoCopia3.mostrarDatos();

        //d. Se muestre el contador de eventos con la totalidad de eventos creados
        //EventoUniversitario.getCantidadEventos();
        System.out.println("La cantidad de eventos creados es: " + EventoUniversitario.getCantidadEventosEu());

        //COnsultar si el println lo puedo dejar aca o en el get, que es lo correcto como buena practica?

        System.out.println("\nCopia de eventos");
        eventoCopia1.mostrarDatos();
        eventoCopia2.mostrarDatos();
        eventoCopia3.mostrarDatos();

        //d. Se muestre el contador de eventos con la totalidad de eventos creados
        //EventoUniversitario.getCantidadEventos();
        System.out.println("La cantidad de eventos creados es: " + EventoUniversitario.getCantidadEventosEu());

        //COnsultar si el println lo puedo dejar aca o en el get, que es lo correcto como buena practica?


        System.out.println("*** EJERCICIO 2 ***");
        //Creacion de lista de estudiantes inciso a
        ArrayList <Estudiante> estudianteslista = new ArrayList<>();

        //creacion de estudiantes
        Estudiante est1 = new Estudiante("Legajo1", "Matias Lulunta");
        Estudiante est2 = new Estudiante("Legajo 2", "Santino Loos");
        Estudiante est3 = new Estudiante("Legajo11", "Roberto Rangol");
        Estudiante est4 = new Estudiante("Legajo 22", "Monica Moyano");
        Estudiante est5 = new Estudiante("Legajo12", "Andina Fernandez");
        Estudiante est6 = new Estudiante("Legajo 24", "Hugo Roberto");
        Estudiante est7 = new Estudiante("Legajo14", "Mariela Vera");
        Estudiante est8 = new Estudiante("Legajo 23", "Alejandro Velazquez");



        //Agregacion de estudiantes a una lista
        estudianteslista.add(est1);
        estudianteslista.add(est2);
        estudianteslista.add(est3);
        estudianteslista.add(est4);
        estudianteslista.add(est5);
        estudianteslista.add(est6);
        estudianteslista.add(est7);
        estudianteslista.add(est8);

        //b- se construyan eventos
        EventoUniversitario ev4 = new EventoUniversitario("Id04","Hackaton", 0.0, true);
        EventoUniversitario ev5 = new EventoUniversitario("Id05","Charla pps",0,true);

        //Pero ademas, para luego recorrerlos, cree una lista de eventos, para simplificar el mostrar datos
        ArrayList <EventoUniversitario> listaDeEventos = new ArrayList<>();
        listaDeEventos.add(ev1);
        listaDeEventos.add(ev2);
        listaDeEventos.add(ev3);
        listaDeEventos.add(ev4);
        listaDeEventos.add(ev5);
        listaDeEventos.add(eventoCopia1);
        listaDeEventos.add(eventoCopia2);
        listaDeEventos.add(eventoCopia3);


        //c. se asigne una sala a cada evento
        Sala sala1 = new Sala(1,"Salon de usos multiples");
        Sala sala2 = new Sala(2,"Salon de usos multiples al lado de la cancha");
        Sala sala3 = new Sala(3, "Anfiteatro cuerpo central");
        ev1.asignarSala(sala1);
        ev2.asignarSala(sala2);
        ev3.asignarSala(sala3);
        ev4.asignarSala(sala2);
        ev5.asignarSala(sala3);
        ev5.asignarSala(sala1);

        //d. se creen actividades propias de cada evento
        ev1.crearActividad(1,"Actividad 1",15);
        ev1.crearActividad(2,"Actividad 2", 20);
        ev2.crearActividad(21,"Actividad 1 evento 2",15);
        ev2.crearActividad(22,"Actividad 2 evento 2", 20);
        //ev2.crearActividad(new Actividad());


        //Si lo hago asi, la actividad queda huerfana, no esta en ningun evento universitario
        /*
        Actividad act1 = new Actividad(1,"Actividad 1",14 );
        act1.inscribir(est1);
         */



        //e) se inscriban estudiantes en cada actividad
        ev1.getActividadesComposicion().get(0).inscribir(est1);
        ev1.getActividadesComposicion().get(1).inscribir(est2);
        ev2.getActividadesComposicion().get(0).inscribir(est3);
        ev2.getActividadesComposicion().get(1).inscribir(est4);
        ev2.getActividadesComposicion().get(0).inscribir(est5);
        ev1.getActividadesComposicion().get(1).inscribir(est6);
        ev1.getActividadesComposicion().get(1).inscribir(est7);
        ev1.getActividadesComposicion().get(1).inscribir(est8);




        //f)- se muestre el resumen de datos por cada evento creado, ademas muestro la actividad
        for (EventoUniversitario evento : listaDeEventos){
            evento.mostrarDatos();
            for(Actividad act : evento.getActividadesComposicion()){
                act.mostrarInscripciones();
            }
        }

        //g) se muestre el total de eventos creados
        System.out.println("El total de eventos creados es: " + EventoUniversitario.getCantidadEventosEu());




        

    }
}