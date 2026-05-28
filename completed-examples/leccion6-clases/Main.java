// ============================================
//  LECCIÓN 6: Clases y Objetos — Intro POO
//  Archivo: Main.java — EJEMPLO COMPLETO
//  Curso: Fundamentos de Java para Principiantes
// ============================================

public class Main {

    public static void main(String[] args) {

        // Crear objetos usando el constructor de la clase Estudiante
        Estudiante est1 = new Estudiante("Ana García", 15, "3ro de secundaria");
        Estudiante est2 = new Estudiante("Luis Pérez", 17, "5to de secundaria");

        // Llamar métodos de cada objeto
        est1.presentarse();
        est1.verificarEdad();

        System.out.println("---");

        est2.presentarse();
        est2.verificarEdad();

        // Acceder directamente a un atributo del objeto
        System.out.println("El nombre del primer estudiante es: " + est1.nombre);

    }
}

// SALIDA ESPERADA:
// Hola, soy Ana García, tengo 15 años y estoy en 3ro de secundaria.
// Ana García es menor de edad.
// ---
// Hola, soy Luis Pérez, tengo 17 años y estoy en 5to de secundaria.
// Luis Pérez es menor de edad.
// El nombre del primer estudiante es: Ana García
