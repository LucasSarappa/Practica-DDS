package Models;

import org.example.Models.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class AlumnoTest {

    @Test
    @BeforeEach
    public void testCrearAlumno() {
        List<Materia> materiasAprobadas = new ArrayList<>();
        Alumno alumno = new Alumno(123, "Juan", materiasAprobadas);
        assertEquals(123, alumno.getLegajo());
        assertEquals("Juan", alumno.getNombreAlumno());
        assertEquals(materiasAprobadas, alumno.getMateriasAprobadas());
    }
}
