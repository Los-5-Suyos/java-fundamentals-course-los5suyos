// ============================================
//  LECCIÓN 5: Métodos y Entrada/Salida
//  Curso: Fundamentos de Java para Principiantes
//  Practicar en: https://replit.com
// ============================================

// Un MÉTODO es un bloque de código con nombre que puedes reutilizar
// Formato:
//   static tipoDeDato nombreMetodo(parametros) {
//       // código
//       return resultado; // si no devuelve nada, usa void
//   }

// Para LEER lo que escribe el usuario:
//   import java.util.Scanner;
//   Scanner entrada = new Scanner(System.in);
//   String texto = entrada.nextLine();   // leer texto
//   int numero   = entrada.nextInt();    // leer número entero

import java.util.Scanner;

public class Main {

    // TODO 1: Crea un método llamado "saludar" que reciba un String "nombre"
    // y que imprima "¡Hola, [nombre]! Bienvenido al curso de Java."
    // No devuelve nada (void)
    

    // TODO 2: Crea un método llamado "calcularPromedio" que reciba
    // tres notas (double) y devuelva el promedio (double)
    

    public static void main(String[] args) {

        // TODO 3: Crea un Scanner para leer la entrada del usuario
        

        // TODO 4: Pide al usuario que escriba su nombre y léelo
        System.out.print("¿Cuál es tu nombre? ");
        // String nombre = ...
        

        // TODO 5: Llama al método saludar con el nombre ingresado
        

        // TODO 6: Pide tres notas al usuario y calcula su promedio
        System.out.print("Ingresa tu primera nota: ");
        // ...

        System.out.print("Ingresa tu segunda nota: ");
        // ...

        System.out.print("Ingresa tu tercera nota: ");
        // ...

        // TODO 7: Llama a calcularPromedio e imprime el resultado
        

    }
}
