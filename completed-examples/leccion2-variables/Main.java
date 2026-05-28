// ============================================
//  LECCIÓN 2: Variables y Tipos de Datos
//  EJEMPLO COMPLETO
//  Curso: Fundamentos de Java para Principiantes
// ============================================

public class Main {

    public static void main(String[] args) {

        // int: números enteros (sin decimales)
        int edad = 15;

        // String: texto (siempre entre comillas dobles)
        String nombre = "Ana García";

        // double: números con decimales
        double promedio = 17.5;

        // boolean: solo puede ser true (verdadero) o false (falso)
        boolean aprobado = true;

        // Imprimir variables combinadas con texto
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Promedio: " + promedio);
        System.out.println("¿Aprobó el curso? " + aprobado);

        // También puedes cambiar el valor de una variable después de crearla
        edad = 16; // cumpleaños!
        System.out.println("Nueva edad: " + edad);

    }
}

// SALIDA ESPERADA:
// Nombre: Ana García
// Edad: 15 años
// Promedio: 17.5
// ¿Aprobó el curso? true
// Nueva edad: 16
