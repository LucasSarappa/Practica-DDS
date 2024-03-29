package Models;

import org.example.Models.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class InscripcionTest {

    @Test
    public void testCrearInscripcion() {
        List<Materia> materiasAprobadas = new ArrayList<>();
        Alumno alumno = new Alumno(123, "Juan", materiasAprobadas);
        Materia materia = new Materia("Algoritmos", materiasAprobadas);

        // Corrección: Pasar la materia en lugar de la lista de materias aprobadas
        Inscripcion inscripcion = new Inscripcion(alumno, List.of(materia));

        assertEquals(alumno, inscripcion.getAlumno());
        assertTrue(inscripcion.getMaterias().contains(materia));
    }
}
