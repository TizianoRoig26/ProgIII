package Tp1;

public class estudiante extends Persona {
    private String carrera;
    public estudiante(String nombre, int edad,String carrera) {
        super(nombre, edad);
        this.carrera = carrera;
    }



    @Override
    public String toString() {
        return "estudiante{" +
                "nombre='" + getNombre() + '\'' +
                ", edad=" + getEdad() +
                "carrera=" + carrera +
                '}';
    }
}
