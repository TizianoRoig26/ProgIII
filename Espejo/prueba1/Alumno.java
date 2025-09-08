package prueba1;
import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class Alumno {
    private String nombre;
    private Double nota;
    private String curso;


}
