// ============================================
//  LECCIÓN 10: Buenas Prácticas y Errores Comunes
//  Curso: Fundamentos de Java para Principiantes
//  Practicar en: https://replit.com
// ============================================

// Esta lección muestra ejemplos de código MAL escrito
// y cómo mejorarlos siguiendo buenas prácticas

public class Main {

    public static void main(String[] args) {

        // ❌ MAL: nombre de variable sin sentido
        int x = 15;
        // ✅ BIEN: nombre descriptivo
        int edadEstudiante = 15;

        // ❌ MAL: número mágico sin explicación
        if (edadEstudiante > 17) {
            System.out.println("Mayor de edad");
        }
        // ✅ BIEN: usar una constante con nombre claro
        final int EDAD_MAYORIA = 18;
        if (edadEstudiante >= EDAD_MAYORIA) {
            System.out.println("Mayor de edad");
        }

        // ❌ MAL: código duplicado
        System.out.println("Hola Ana, bienvenida.");
        System.out.println("Hola Luis, bienvenido.");
        // ✅ BIEN: usar un método reutilizable
        saludar("Ana");
        saludar("Luis");

        // ❌ MAL: no validar datos
        int nota = -5; // ¡imposible!
        // ✅ BIEN: validar antes de usar
        nota = ingresarNota(-5);
        System.out.println("Nota válida registrada: " + nota);

        // ERRORES COMUNES y cómo entenderlos:
        mostrarErroresComunes();

    }

    // Método reutilizable ✅
    static void saludar(String nombre) {
        System.out.println("Hola " + nombre + ", bienvenido/a al curso.");
    }

    // Validación de datos ✅
    static int ingresarNota(int nota) {
        if (nota < 0 || nota > 20) {
            System.out.println("Nota inválida. Se registra 0.");
            return 0;
        }
        return nota;
    }

    // Explicación de errores comunes
    static void mostrarErroresComunes() {
        System.out.println("\n── Errores comunes en Java ──");

        // 1. NullPointerException
        System.out.println("1. NullPointerException:");
        System.out.println("   Ocurre cuando usas una variable que no tiene valor asignado.");
        System.out.println("   Solución: siempre inicializa tus variables.");

        // 2. ArrayIndexOutOfBoundsException
        System.out.println("2. ArrayIndexOutOfBoundsException:");
        System.out.println("   Ocurre cuando accedes a un índice que no existe en el array.");
        System.out.println("   Solución: verifica que el índice esté entre 0 y array.length-1.");

        // 3. Error de compilación típico
        System.out.println("3. ';' expected:");
        System.out.println("   Olvidaste el punto y coma al final de una instrucción.");
        System.out.println("   Solución: revisa la línea indicada en el error.");
    }
}
