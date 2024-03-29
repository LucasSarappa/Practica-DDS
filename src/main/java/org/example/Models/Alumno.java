package org.example.Models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Alumno {

    private int legajo;
    private String nombreAlumno;
    private List<Materia> materiasAprobadas;


}
