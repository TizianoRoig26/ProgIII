package prueba1;

import lombok.*;

@Data
@AllArgsConstructor      // Constructor con todos los campos
@NoArgsConstructor       // Constructor vacío
@Builder

public class Persona {
    private String nombre;
    private int edad;
}