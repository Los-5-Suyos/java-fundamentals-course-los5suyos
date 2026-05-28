// ============================================
//  LECCIÓN 9: PROYECTO FINAL — Registro de Estudiantes
//  Archivo: Main.java — EJEMPLO COMPLETO
//  Curso: Fundamentos de Java para Principiantes
// ============================================

public class Main {

    public static void main(String[] args) {

        // Crear el salón con 4 estudiantes
        Estudiante[] salon = new Estudiante[4];
        salon[0] = new Estudiante("Ana García",   15, 17.5);
        salon[1] = new Estudiante("Luis Pérez",   16, 13.0);
        salon[2] = new Estudiante("Carla Torres", 15, 19.0);
        salon[3] = new Estudiante("Marco Ruiz",   17, 14.5);

        // Mostrar ficha de cada estudiante
        System.out.println("══════════ REGISTRO DEL SALÓN ══════════");
        for (Estudiante est : salon) {
            est.mostrarFicha();
        }

        // Calcular promedio general
        double sumaPromedios = 0;
        for (Estudiante est : salon) {
            sumaPromedios += est.getPromedio();
        }
        double promedioGeneral = sumaPromedios / salon.length;

        // Encontrar al mejor estudiante
        Estudiante mejor = salon[0];
        for (Estudiante est : salon) {
            if (est.getPromedio() > mejor.getPromedio()) {
                mejor = est;
            }
        }

        // Contar aprobados
        int aprobados = 0;
        for (Estudiante est : salon) {
            if (est.estaAprobado()) aprobados++;
        }

        // Resumen final
        System.out.println("\n══════════ RESUMEN FINAL ══════════");
        System.out.println("Promedio del salón:  " + promedioGeneral);
        System.out.println("Mejor estudiante:    " + mejor.getNombre() + " con " + mejor.getPromedio());
        System.out.println("Estudiantes aprobados: " + aprobados + " de " + salon.length);

    }
}

// SALIDA ESPERADA:
// ══════════ REGISTRO DEL SALÓN ══════════
// ┌─────────────────────────────┐
// │ Nombre:   Ana García
// │ Edad:     15 años
// │ Promedio: 17.5
// │ Estado:   Aprobado ✅
// └─────────────────────────────┘
// ... (resto de fichas)
// ══════════ RESUMEN FINAL ══════════
// Promedio del salón:  16.0
// Mejor estudiante:    Carla Torres con 19.0
// Estudiantes aprobados: 3 de 4
