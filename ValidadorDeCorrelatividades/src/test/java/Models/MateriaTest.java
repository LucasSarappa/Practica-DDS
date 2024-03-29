package Models;

import org.example.Models.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MateriaTest {

    @Test
    public void testCrearMateria() {
        List<Materia> correlativas = new ArrayList<>();
        Materia materia = new Materia("Algoritmos", correlativas);
        assertEquals("Algoritmos", materia.getNombreMateria());
        assertEquals(correlativas, materia.getMateriasCorrelativas());
    }
}
