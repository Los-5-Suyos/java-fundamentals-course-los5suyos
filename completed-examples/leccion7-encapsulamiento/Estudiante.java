// ============================================
//  LECCIÓN 7: Encapsulamiento, Getters y Setters
//  Archivo: Estudiante.java — EJEMPLO COMPLETO
//  Curso: Fundamentos de Java para Principiantes
// ============================================

public class Estudiante {

    // "private" = solo esta clase puede acceder directamente
    private String nombre;
    private int edad;
    private double promedio;

    // Constructor
    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre  = nombre;
        this.edad    = edad;
        this.promedio = promedio;
    }

    // ── GETTERS (leer el valor) ──────────────────────────

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPromedio() {
        return promedio;
    }

    // ── SETTERS (modificar el valor con validación) ──────

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            System.out.println("Error: la edad no puede ser negativa.");
        } else {
            this.edad = edad;
        }
    }

    public void setPromedio(double promedio) {
        if (promedio < 0 || promedio > 20) {
            System.out.println("Error: el promedio debe estar entre 0 y 20.");
        } else {
            this.promedio = promedio;
        }
    }

    // ── MÉTODO INFORMATIVO ───────────────────────────────

    public void mostrarInfo() {
        System.out.println("──────────────────────────");
        System.out.println("Nombre:   " + nombre);
        System.out.println("Edad:     " + edad + " años");
        System.out.println("Promedio: " + promedio);
        System.out.println("──────────────────────────");
    }

}
