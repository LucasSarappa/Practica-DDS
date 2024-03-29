package org.example;

import org.example.Models.Alumno;
import org.example.Models.Inscripcion;
import org.example.Models.Materia;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        // Creo materias sin correlativas
        Materia algoritmos = new Materia("Algoritmos", null);
        Materia discreta = new Materia("Matemática Discreta", null);

        // creo las correlativas de Diseño
        List<Materia> correlativasDisenio = new ArrayList<>();
        correlativasDisenio.add(algoritmos);
        correlativasDisenio.add(discreta);
        Materia disenio = new Materia("Diseño", correlativasDisenio);

        // Creo alumnos con listas de materias aprobadas
        List<Materia> materiasAprobadasEdinson = new ArrayList<>();
        Alumno alumno3 = new Alumno(123, "Edinson", materiasAprobadasEdinson);

        List<Materia> materiasAprobadasKevin = new ArrayList<>();
        Alumno alumno1 = new Alumno(123, "Kevin", materiasAprobadasKevin);

        List<Materia> materiasAprobadasSergio = new ArrayList<>();
        Alumno alumno2 = new Alumno(456, "Sergio", materiasAprobadasSergio);

        // Agrego materias aprobadas a Kevin
        materiasAprobadasKevin.add(algoritmos);
        materiasAprobadasKevin.add(discreta);

        // Creo instancias de Inscripcion
        Inscripcion inscripcionKevin = new Inscripcion(alumno3, List.of(algoritmos, discreta, disenio)); // Edinson se quiere anotar a todas las materias sin tener aprobadas las correlativas de una de ellas
        Inscripcion inscripcionSergio = new Inscripcion(alumno1, List.of(disenio)); // Kevin tiene las correlativas aprobadas para Diseño
        Inscripcion inscripcionEdinson = new Inscripcion(alumno2, List.of(disenio)); // Sergio no tiene las correlativas aprobadas para Diseño

        // Realizo las inscripciones (antes de realizarlas, chequeo si tiene las correlativas aprobadas)
        System.out.println("Inscripción de " + alumno3.getNombreAlumno() + ": " + inscripcionKevin.aprobada());
        System.out.println("Inscripción de " + alumno1.getNombreAlumno() + ": " + inscripcionSergio.aprobada());
        System.out.println("Inscripción de " + alumno2.getNombreAlumno() + ": " + inscripcionEdinson.aprobada());

    }


}
