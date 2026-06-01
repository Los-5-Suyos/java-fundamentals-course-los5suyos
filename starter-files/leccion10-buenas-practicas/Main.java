// ============================================
//  LECCIÓN 10: Buenas Prácticas y Próximos Pasos
//  Curso: Fundamentos de Java para Principiantes
//  Practicar en: https://www.jdoodle.com
// ============================================

// Las buenas prácticas hacen que el código sea
// más fácil de leer, mantener y corregir.
//
// Ejemplos:
// ✅ Usar nombres descriptivos
// ✅ Reutilizar código con métodos
// ✅ Validar datos antes de usarlos
// ✅ Leer los mensajes de error con calma

public class Main {

    // 🏆 Reto 10: Mejora el código

    public static void main(String[] args) {

        // 1. Cambia los nombres de variables por otros más descriptivos

        int x = 18;
        double y = 15.5;

        System.out.println(x);
        System.out.println(y);

        // 2. Usa una constante para representar la mayoría de edad
        // Tip: final int MAYORIA_EDAD = 18;


        // 3. Completa el método saludar()
        // y llama al método con tu nombre


        // 4. Valida la nota usando el método validarNota()
        // Prueba con valores como -5, 10 y 25


        // 5. Explica con comentarios qué error produciría cada línea

        // int edad = "15";
        // int[] numeros = {1, 2, 3};
        // System.out.println(numeros[5]);

    }

    // Completa este método para mostrar:
    // Hola [nombre], bienvenido al curso
    static void saludar(String nombre) {


    }

    // Si la nota es menor que 0 o mayor que 20,
    // devuelve 0. Caso contrario devuelve la nota.
    static int validarNota(int nota) {


        return nota;
    }

}