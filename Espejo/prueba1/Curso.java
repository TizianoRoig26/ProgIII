package prueba1;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data

public class Curso {
    private String nombre;
    private List<Alumno> alumnos;

    @Override
   public String toString() {
        return "Curso \n nombre= " + nombre + "\n alumnos=" + alumnos + "\nCantidad de alumnos: " +  alumnos.size();
    }
}
