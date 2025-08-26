package Tp1;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<estudiante> estudiantes = new ArrayList<estudiante>();
        estudiante estudiante = new estudiante("estudiante", 20, "Desarrollo de Software");
        estudiante estudiante2 = new estudiante("estudiante2", 20, "Diseñador Grafico");
        estudiante estudiante3 = new estudiante("estudiante3", 21, "Desarrollo de Software");
        estudiante estudiante4 = new estudiante("estudiante4", 26, "Desarrollo de Software");
        estudiante estudiante5 = new estudiante("estudiante5", 22, "Ingerieria de Software");

        estudiantes.add(estudiante);
        estudiantes.add(estudiante2);
        estudiantes.add(estudiante3);
        estudiantes.add(estudiante4);
        estudiantes.add(estudiante5);

        for (estudiante estudiante1 : estudiantes) {
            System.out.println(estudiante1.toString());
        }



    }
}