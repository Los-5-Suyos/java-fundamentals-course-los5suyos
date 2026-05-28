// ============================================
//  LECCIÓN 4: Estructuras de Control
//  EJEMPLO COMPLETO
//  Curso: Fundamentos de Java para Principiantes
// ============================================

public class Main {

    public static void main(String[] args) {

        double promedio = 15.5;

        // IF - ELSE: una decisión simple
        if (promedio >= 14.5) {
            System.out.println("¡Felicidades! Aprobaste el curso.");
        } else {
            System.out.println("No aprobaste. ¡Sigue intentándolo!");
        }

        // IF - ELSE IF - ELSE: múltiples opciones
        if (promedio >= 18) {
            System.out.println("Calificación: Sobresaliente 🌟");
        } else if (promedio >= 14) {
            System.out.println("Calificación: Aprobado ✅");
        } else {
            System.out.println("Calificación: Desaprobado ❌");
        }

        // BUCLE FOR: contar del 1 al 5
        System.out.println("Contando del 1 al 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Número: " + i);
        }

        // BUCLE WHILE: cuenta regresiva
        System.out.println("Cuenta regresiva:");
        int cuenta = 5;
        while (cuenta >= 1) {
            System.out.println(cuenta + "...");
            cuenta--; // resta 1 en cada vuelta
        }
        System.out.println("¡Despegue! 🚀");

    }
}

// SALIDA ESPERADA:
// ¡Felicidades! Aprobaste el curso.
// Calificación: Aprobado ✅
// Contando del 1 al 5:
// Número: 1 ... Número: 5
// Cuenta regresiva: 5... 4... 3... 2... 1...
// ¡Despegue! 🚀
