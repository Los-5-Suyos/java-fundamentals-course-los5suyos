// ============================================
//  LECCIÓN 5: Métodos y Entrada/Salida
//  EJEMPLO COMPLETO
//  Curso: Fundamentos de Java para Principiantes
// ============================================

import java.util.Scanner;

public class Main {

    // Método que no devuelve valor (void) y recibe un parámetro
    static void saludar(String nombre) {
        System.out.println("¡Hola, " + nombre + "! Bienvenido al curso de Java.");
    }

    // Método que recibe parámetros y devuelve un valor (double)
    static double calcularPromedio(double nota1, double nota2, double nota3) {
        double suma = nota1 + nota2 + nota3;
        return suma / 3;
    }

    // Método que clasifica el promedio
    static String clasificar(double promedio) {
        if (promedio >= 18) return "Sobresaliente 🌟";
        if (promedio >= 14) return "Aprobado ✅";
        return "Desaprobado ❌";
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Leer nombre del usuario
        System.out.print("¿Cuál es tu nombre? ");
        String nombre = entrada.nextLine();

        // Llamar al método saludar
        saludar(nombre);

        // Leer tres notas
        System.out.print("Ingresa tu primera nota: ");
        double nota1 = entrada.nextDouble();

        System.out.print("Ingresa tu segunda nota: ");
        double nota2 = entrada.nextDouble();

        System.out.print("Ingresa tu tercera nota: ");
        double nota3 = entrada.nextDouble();

        // Llamar al método y mostrar resultado
        double promedio = calcularPromedio(nota1, nota2, nota3);
        System.out.println("Tu promedio es: " + promedio);
        System.out.println("Resultado: " + clasificar(promedio));

        entrada.close();
    }
}

// EJEMPLO DE EJECUCIÓN:
// ¿Cuál es tu nombre? Carlos
// ¡Hola, Carlos! Bienvenido al curso de Java.
// Ingresa tu primera nota: 16
// Ingresa tu segunda nota: 18
// Ingresa tu tercera nota: 15
// Tu promedio es: 16.333333333333332
// Resultado: Aprobado ✅
