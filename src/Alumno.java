import java.util.List;
import java.util.ArrayList;
public class Alumno {
    private String nombre;
    private int edad;
    private List<Double> calificaciones;
    public Alumno(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        this.calificaciones = new ArrayList<Double>();
    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public List<Double> getCalificaciones() {
        return calificaciones;
    }
    public void setCalificacion(double calificacion) {
        calificaciones.add(calificacion);
    }
    public double calcularPromedio(){
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        double promedio = suma / calificaciones.size();
        return promedio;
    }
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nEdad: " + edad + "\nCalificaciones: " + calificaciones;
    }
}
