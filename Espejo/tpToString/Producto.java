package tpToString;

import lombok.Builder;
import lombok.Data;

import java.util.Objects;

@Data
@Builder

public class Producto {
    private Integer codigo;
    private String nombre;
    private double precio;
    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

}
