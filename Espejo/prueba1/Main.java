package prueba1;


import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Alumno a1 = new Alumno("Gabriel", 2.5, "Java");
        Alumno a2 = new Alumno("Lucia", 7.7, "Python");
        Alumno a3 = new Alumno("Martin", 3.8, "Bases de Datos");
        Alumno a4 = new Alumno("Sofia", 8.2, "Java+");
        Alumno a5 = new Alumno("Diego", 7.0, "C++");

        List<Alumno> alumnos = Arrays.asList(a1, a2, a3, a4, a5);


        List<String> nombresAprobados = alumnos.stream()
                .filter(a -> a.getNota() >= 7)   // Filtra los que tienen nota >= 7
                .map(Alumno::getNombre)
                .map(String::toUpperCase)
                .sorted()
                .toList();                       // Convierte el Stream<String> en List<String>

        System.out.println(nombresAprobados);

        double suma = alumnos.stream()
                .map(Alumno::getNota)
                .reduce(0.0, Double::sum);

        double promedio1 = suma / alumnos.size();

        System.out.println(promedio1);

        Curso c1 = new Curso("Java", alumnos);
        System.out.println(c1);

    }
}