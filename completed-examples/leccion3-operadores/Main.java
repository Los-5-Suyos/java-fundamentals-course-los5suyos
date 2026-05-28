// ============================================
//  LECCIÓN 3: Operadores y Expresiones
//  EJEMPLO COMPLETO
//  Curso: Fundamentos de Java para Principiantes
// ============================================

public class Main {

    public static void main(String[] args) {

        int notaExamen1 = 16;
        int notaExamen2 = 18;
        int notaExamen3 = 14;

        // Operador aritmético: suma
        int suma = notaExamen1 + notaExamen2 + notaExamen3;
        System.out.println("Suma de notas: " + suma);

        // División: (double) convierte el resultado a decimal
        double promedio = (double) suma / 3;
        System.out.println("Promedio: " + promedio);

        // Operador de comparación: ¿aprobó?
        boolean aprobado = promedio >= 14.5;
        System.out.println("¿Aprobó? " + aprobado);

        // Operador módulo: saber si un número es par o impar
        int numero = 17;
        int resto = numero % 2;
        System.out.println(numero + " es par: " + (resto == 0));

        // Operadores lógicos
        boolean tienePromedio    = promedio >= 14.5;
        boolean tieneAsistencia  = true;
        boolean puedeGraduar     = tienePromedio && tieneAsistencia; // ambas deben ser true
        System.out.println("¿Puede graduarse? " + puedeGraduar);

    }
}

// SALIDA ESPERADA:
// Suma de notas: 48
// Promedio: 16.0
// ¿Aprobó? true
// 17 es par: false
// ¿Puede graduarse? true
