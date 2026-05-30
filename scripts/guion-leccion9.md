# Lección 9 — Proyecto Final: Registro de Estudiantes con POO
 
## Introducción (1 min)
 
Ha llegado el momento de unir todo. En esta lección construirás paso a paso una aplicación real: un **registro de estudiantes** que usa clases, encapsulamiento, arrays y métodos. No te preocupes si algo se siente nuevo; iremos despacio y explicando cada parte. Abre el Replit del proyecto final.
 
---
 
## Desarrollo (8 min)
 
### Paso 1 — Diseñar la clase `Estudiante`
 
Primero pensamos: ¿qué información tiene un estudiante? Nombre y nota. Los atributos serán `private` y usaremos getters y setters.
 
```java
class Estudiante {
    private String nombre;
    private double nota;
 
    // Constructor
    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
 
    // Getters
    public String getNombre() {
        return nombre;
    }
 
    public double getNota() {
        return nota;
    }
 
    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " | Nota: " + nota);
    }
}
```
 
### Paso 2 — Crear el array de estudiantes en `main`
 
Ahora en el método `main` creamos varios objetos `Estudiante` y los guardamos en un array:
 
```java
public class RegistroEstudiantes {
    public static void main(String[] args) {
 
        Estudiante[] registro = new Estudiante[4];
 
        registro[0] = new Estudiante("Ana", 18.5);
        registro[1] = new Estudiante("Luis", 14.0);
        registro[2] = new Estudiante("María", 20.0);
        registro[3] = new Estudiante("Carlos", 11.5);
 
        System.out.println("=== Lista de Estudiantes ===");
        for (Estudiante e : registro) {
            e.mostrarInfo();
        }
    }
}
```
 
### Paso 3 — Calcular el promedio general
 
Agregamos la lógica para calcular el promedio de todas las notas:
 
```java
double suma = 0;
for (Estudiante e : registro) {
    suma = suma + e.getNota();
}
double promedio = suma / registro.length;
System.out.println("\nPromedio general: " + promedio);
```
 
### Paso 4 — Encontrar al estudiante con la nota más alta
 
```java
Estudiante mejor = registro[0];  // empezamos asumiendo que el primero es el mejor
 
for (Estudiante e : registro) {
    if (e.getNota() > mejor.getNota()) {
        mejor = e;  // encontramos uno con nota más alta, actualizamos
    }
}
 
System.out.println("Mejor estudiante: " + mejor.getNombre()
                   + " con " + mejor.getNota());
```
 
### Código completo
 
```java
class Estudiante {
    private String nombre;
    private double nota;
 
    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
 
    public String getNombre() { return nombre; }
    public double getNota()   { return nota;   }
 
    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " | Nota: " + nota);
    }
}
 
public class RegistroEstudiantes {
    public static void main(String[] args) {
 
        Estudiante[] registro = new Estudiante[4];
        registro[0] = new Estudiante("Ana",    18.5);
        registro[1] = new Estudiante("Luis",   14.0);
        registro[2] = new Estudiante("María",  20.0);
        registro[3] = new Estudiante("Carlos", 11.5);
 
        // Mostrar todos
        System.out.println("=== Lista de Estudiantes ===");
        for (Estudiante e : registro) {
            e.mostrarInfo();
        }
 
        // Promedio
        double suma = 0;
        for (Estudiante e : registro) {
            suma += e.getNota();
        }
        System.out.println("\nPromedio general: " + (suma / registro.length));
 
        // Mejor estudiante
        Estudiante mejor = registro[0];
        for (Estudiante e : registro) {
            if (e.getNota() > mejor.getNota()) {
                mejor = e;
            }
        }
        System.out.println("Mejor estudiante: " + mejor.getNombre()
                           + " con " + mejor.getNota());
    }
}
```
 
---
 
## Práctica (1 min)
 
Modifica el proyecto en tu Replit:
1. Agrega un quinto estudiante con tu nombre y nota favorita
2. Agrega un método `estaAprobado()` a la clase `Estudiante` que devuelva `true` si la nota es mayor o igual a 11
3. Muestra en el listado si cada estudiante está aprobado o no
Cuando termines, guarda tu Replit y copia el enlace — ¡ese es tu primer proyecto POO completo!
 
---
 
## Cierre (30 seg)
 
Acabas de construir una aplicación real que usa clases, objetos, encapsulamiento, arrays y métodos. Eso es exactamente lo que hacen los programadores profesionales, solo que a mayor escala. En la última lección cerraremos el curso con consejos para seguir mejorando.

---
 
> **Equipo Los 5 Suyos** · Universidad Peruana de Ciencias Aplicadas  
> Ingeniería de Software · 1ASI0729 Desarrollo de Aplicaciones Open Source · 202610