// ============================================
//  LECCIÓN 7: Encapsulamiento, Getters y Setters
//  Archivo: Estudiante.java (la CLASE protegida)
//  Curso: Fundamentos de Java para Principiantes
// ============================================

// ENCAPSULAMIENTO: proteger los datos de acceso directo
// Se usa "private" para que nadie pueda cambiar el dato sin control
// Los GETTERS permiten LEER el valor  → getNombre()
// Los SETTERS permiten MODIFICAR el valor → setNombre("nuevo")

public class Estudiante {

    // 1. Declara los atributos como "private"
    //   private String nombre;
    //   private int edad;
    //   private double promedio;
    

    // 2: Crea el constructor que inicialice los tres atributos


    // 3. Crea los GETTERS (métodos para leer cada atributo)
    // Formato: public TipoDato getNombreAtributo() { return atributo; }

    

    // 4. Crea los SETTERS (métodos para modificar cada atributo)
    // Formato: public void setNombreAtributo(TipoDato valor) { this.atributo = valor; }
    // Agrega una validación en setEdad: la edad no puede ser negativa
    // Agrega una validación en setPromedio: debe estar entre 0 y 20
    

    // 5. Crea un método "mostrarInfo()" que imprima todos los datos
    

}
