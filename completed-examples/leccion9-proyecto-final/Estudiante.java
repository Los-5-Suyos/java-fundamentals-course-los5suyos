// ============================================
//  LECCIÓN 9: PROYECTO FINAL — Registro de Estudiantes
//  Archivo: Estudiante.java — EJEMPLO COMPLETO
//  Curso: Fundamentos de Java para Principiantes
// ============================================

public class Estudiante {

    private String nombre;
    private int    edad;
    private double promedio;

    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre  = nombre;
        this.edad    = edad;
        this.promedio = promedio;
    }

    // Getters
    public String getNombre()   { return nombre; }
    public int    getEdad()     { return edad; }
    public double getPromedio() { return promedio; }

    // Mostrar ficha completa del estudiante
    public void mostrarFicha() {
        System.out.println("┌─────────────────────────────┐");
        System.out.println("│ Nombre:   " + nombre);
        System.out.println("│ Edad:     " + edad + " años");
        System.out.println("│ Promedio: " + promedio);
        System.out.println("│ Estado:   " + (estaAprobado() ? "Aprobado ✅" : "Desaprobado ❌"));
        System.out.println("└─────────────────────────────┘");
    }

    // Devuelve true si el promedio es aprobatorio
    public boolean estaAprobado() {
        return promedio >= 14.5;
    }

}
