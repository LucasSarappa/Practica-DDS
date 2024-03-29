package org.example.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Materia {

    private String nombreMateria;
    private List<Materia> materiasCorrelativas;



}
