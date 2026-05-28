// ============================================
//  LECCIÓN 7: Encapsulamiento, Getters y Setters
//  Archivo: Main.java — EJEMPLO COMPLETO
//  Curso: Fundamentos de Java para Principiantes
// ============================================

public class Main {

    public static void main(String[] args) {

        // Crear objeto con datos iniciales
        Estudiante est = new Estudiante("María López", 15, 14.0);
        est.mostrarInfo();

        // Actualizar promedio con setter
        est.setPromedio(17.5);
        System.out.println("Promedio actualizado: " + est.getPromedio());

        // Intentar poner valor inválido → la validación lo rechaza
        est.setEdad(-5);

        // Getter: obtener solo un dato específico
        System.out.println("Nombre del estudiante: " + est.getNombre());

        // Ver info final
        est.mostrarInfo();

    }
}

// SALIDA ESPERADA:
// ──────────────────────────
// Nombre:   María López
// Edad:     15 años
// Promedio: 14.0
// ──────────────────────────
// Promedio actualizado: 17.5
// Error: la edad no puede ser negativa.
// Nombre del estudiante: María López
// ──────────────────────────
// Nombre:   María López
// Edad:     15 años
// Promedio: 17.5
// ──────────────────────────
