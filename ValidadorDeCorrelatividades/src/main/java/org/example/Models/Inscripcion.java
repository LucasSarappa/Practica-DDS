package org.example.Models;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materias;

    public boolean aprobada() {
        for (Materia materia : materias) {
            List<Materia> correlativas = materia.getMateriasCorrelativas();
            if (correlativas != null) {
                for (Materia correlativa : correlativas) {
                    if (!alumno.getMateriasAprobadas().contains(correlativa)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
