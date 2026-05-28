// ============================================
//  LECCIÓN 8: Arrays y Estructuras de Datos Simples
//  EJEMPLO COMPLETO
//  Curso: Fundamentos de Java para Principiantes
// ============================================

public class Main {

    public static void main(String[] args) {

        // Declarar array con 5 notas
        int[] notas = {15, 18, 12, 20, 16};

        // Primer y último elemento
        System.out.println("Primera nota: " + notas[0]);
        System.out.println("Última nota:  " + notas[notas.length - 1]);

        // Recorrer con for clásico
        System.out.println("\nTodas las notas:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("  Lección " + (i + 1) + ": " + notas[i]);
        }

        // Calcular promedio
        int suma = 0;
        for (int nota : notas) {
            suma += nota; // equivale a: suma = suma + nota
        }
        double promedio = (double) suma / notas.length;
        System.out.println("\nPromedio: " + promedio);

        // Encontrar la nota más alta
        int maxima = notas[0];
        for (int nota : notas) {
            if (nota > maxima) {
                maxima = nota;
            }
        }
        System.out.println("Nota más alta: " + maxima);

        // Array de Strings con for-each
        String[] nombres = {"Ana", "Luis", "Carla"};
        System.out.println("\nCompañeros del salón:");
        for (String nombre : nombres) {
            System.out.println("  - " + nombre);
        }

    }
}

// SALIDA ESPERADA:
// Primera nota: 15
// Última nota:  16
// Todas las notas: Lección 1: 15 ... Lección 5: 16
// Promedio: 16.2
// Nota más alta: 20
// Compañeros del salón: - Ana  - Luis  - Carla
