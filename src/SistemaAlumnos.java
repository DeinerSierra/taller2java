import java.util.List;
import java.util.ArrayList;
public class SistemaAlumnos {
    private List<Alumno> alumnos;
    public SistemaAlumnos(){
        this.alumnos = new ArrayList<>();
    }
    public void agregarAlumno(Alumno alumno){
        alumnos.add(alumno);
    }
    public void agregarCalificacion(Alumno alumno, double calicacion){
        alumno.setCalificacion(calicacion);
    }
    public void mostrarInformacionAlumnos(){
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
            System.out.println("Promedio de calificaciones: " + alumno.calcularPromedio() + "\n");
        }
    }

}
