// ============================================
//  LECCIÓN 6: Clases y Objetos — Intro POO
//  Archivo: Estudiante.java — EJEMPLO COMPLETO
//  Curso: Fundamentos de Java para Principiantes
// ============================================

public class Estudiante {

    // ATRIBUTOS: información que tiene cada estudiante
    String nombre;
    int edad;
    String grado;

    // CONSTRUCTOR: se llama automáticamente al crear el objeto con "new"
    public Estudiante(String nombre, int edad, String grado) {
        this.nombre = nombre; // "this.nombre" = el atributo de la clase
        this.edad   = edad;   // "nombre"      = el parámetro recibido
        this.grado  = grado;
    }

    // MÉTODO: acción que puede realizar el objeto
    public void presentarse() {
        System.out.println("Hola, soy " + nombre +", tengo " + edad + " años" +" y estoy en " + grado + ".");
    }

    // Otro método: mostrar si es mayor de edad
    public void verificarEdad() {
        if (edad >= 18) {
            System.out.println(nombre + " es mayor de edad.");
        } else {
            System.out.println(nombre + " es menor de edad.");
        }
    }

}
