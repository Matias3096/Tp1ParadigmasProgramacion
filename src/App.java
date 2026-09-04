import Clases.Estudiante;
import Clases.EventoUniversitario;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        //EventoUniversitario ev4 = new Scanner(in);

        //Para ejercicio 1
        // (a)-Creando eventos universitarios
        EventoUniversitario ev1 = new EventoUniversitario("Id001","choripaneada", 3000.0, false,36, "año lectivo 2026",3000);
        EventoUniversitario ev2 = new EventoUniversitario("Id002","Lanzamiento de impresoras",0,true, 2, "Lanzamiento de impresoras primer semestre",200);
        EventoUniversitario ev3 = new EventoUniversitario("Id003","Fulbito de la uni",1500,false, 12,"Actividad 2do semestre", 2000);

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
        System.out.println("La cantidad de eventos creados es: " + EventoUniversitario.getCantidadEventos());

        //COnsultar si el println lo puedo dejar aca o en el get, que es lo correcto como buena practica?


        System.out.println("*** EJERCICIO 2 ***");

        ArrayList <Estudiante> estudianteslista = new ArrayList<>();
        

    }
}