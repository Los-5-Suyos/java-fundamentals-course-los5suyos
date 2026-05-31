# Lección 9 — Proyecto Final: Registro de Estudiantes con POO

## Introducción (1 min)

¡Bienvenido a tu proyecto final!

Durante este curso has aprendido:

* Variables
* Operadores
* Estructuras de control
* Métodos
* Clases y objetos
* Encapsulamiento
* Arrays

Ahora llegó el momento de unir todo en una sola aplicación.

Hoy construiremos un **Sistema de Registro de Estudiantes**.

Nuestro programa podrá:

* Almacenar estudiantes.
* Mostrar sus datos.
* Calcular el promedio general.
* Encontrar al estudiante con la nota más alta.

No te preocupes si alguna parte parece difícil.

Avanzaremos paso a paso y explicaremos cada sección.

Abre el Replit del proyecto final y comencemos.

---

## Desarrollo (8 min)

# Paso 1: Diseñar la clase Estudiante

Antes de programar debemos pensar qué información tiene un estudiante.

Por ejemplo:

* Nombre
* Nota

Entonces creamos la clase:

```java
class Estudiante {

    private String nombre;
    private double nota;

    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNota() {
        return nota;
    }

    public void mostrarInfo() {
        System.out.println(
            "Estudiante: " + nombre +
            " | Nota: " + nota
        );
    }
}
```

---

## ¿Qué estamos usando aquí?

Observa que aparecen varios conceptos que ya conoces:

### Encapsulamiento

```java
private String nombre;
private double nota;
```

Los atributos están protegidos mediante `private`.

---

### Constructor

```java
public Estudiante(String nombre, double nota)
```

El constructor se ejecuta automáticamente cuando creamos un objeto.

Sirve para inicializar sus datos.

---

### Getters

```java
getNombre()
getNota()
```

Permiten acceder a la información de forma segura.

---

### Método personalizado

```java
mostrarInfo()
```

Nos ayuda a reutilizar código y mantener el programa organizado.

---

# Paso 2: Crear los estudiantes

Ahora vamos al método principal.

Creamos un array para almacenar varios objetos.

```java
Estudiante[] registro = new Estudiante[4];
```

Visualmente:

```text
[ ] [ ] [ ] [ ]
```

Todavía está vacío.

---

### Crear los objetos

```java
registro[0] = new Estudiante("Ana", 18.5);
registro[1] = new Estudiante("Luis", 14.0);
registro[2] = new Estudiante("María", 20.0);
registro[3] = new Estudiante("Carlos", 11.5);
```

Ahora cada posición contiene un estudiante.

Visualmente:

```text
[ Ana ] [ Luis ] [ María ] [ Carlos ]
```

---

# Paso 3: Mostrar todos los estudiantes

Utilizamos un `for-each` para recorrer el array.

```java
System.out.println("=== Lista de Estudiantes ===");

for (Estudiante e : registro) {
    e.mostrarInfo();
}
```

Resultado:

```text
=== Lista de Estudiantes ===
Estudiante: Ana | Nota: 18.5
Estudiante: Luis | Nota: 14.0
Estudiante: María | Nota: 20.0
Estudiante: Carlos | Nota: 11.5
```

Aquí estamos combinando:

* Arrays
* Objetos
* Métodos

---

# Paso 4: Calcular el promedio general

Ahora queremos saber cómo le fue al grupo completo.

Primero acumulamos las notas.

```java
double suma = 0;

for (Estudiante e : registro) {
    suma = suma + e.getNota();
}
```

Luego calculamos el promedio.

```java
double promedio = suma / registro.length;
```

Finalmente mostramos el resultado.

```java
System.out.println(
    "Promedio general: " + promedio
);
```

---

## ¿Por qué usamos registro.length?

Porque devuelve automáticamente la cantidad de estudiantes.

Si mañana agregamos más estudiantes, el cálculo seguirá funcionando.

---

# Paso 5: Encontrar al mejor estudiante

Ahora resolveremos un problema muy común en programación:

Encontrar el valor más alto.

---

### Empezamos suponiendo que el primero es el mejor

```java
Estudiante mejor = registro[0];
```

---

### Recorremos todos los estudiantes

```java
for (Estudiante e : registro) {

    if (e.getNota() > mejor.getNota()) {
        mejor = e;
    }

}
```

Cada vez que encontramos una nota mayor, actualizamos la variable.

---

### Mostrar el resultado

```java
System.out.println(
    "Mejor estudiante: "
    + mejor.getNombre()
    + " con "
    + mejor.getNota()
);
```

Resultado:

```text
Mejor estudiante: María con 20.0
```

---

## Error común de principiantes

Muchos estudiantes intentan empezar así:

```java
Estudiante mejor;
```

Y luego comparan valores.

Esto puede generar errores porque la variable aún no apunta a ningún objeto.

Por eso es mejor comenzar con:

```java
Estudiante mejor = registro[0];
```

Así siempre tenemos una referencia válida.

---

## ¿Qué aprendimos en este proyecto?

Este proyecto utiliza prácticamente todo lo visto durante el curso:

✅ Variables

✅ Métodos

✅ Condiciones (`if`)

✅ Arrays

✅ Clases

✅ Objetos

✅ Encapsulamiento

✅ Getters

✅ Bucles (`for-each`)

---

## Práctica (1 min)

### 🏆 Reto Final

Modifica el proyecto para agregar nuevas funcionalidades.

### Parte 1: Agrega un quinto estudiante

Por ejemplo:

```java
registro[4] = new Estudiante("TuNombre", 19.0);
```

Recuerda aumentar el tamaño del array.

---

### Parte 2: Crear el método estaAprobado()

Dentro de la clase:

```java
public boolean estaAprobado() {
    return nota >= 11;
}
```

---

### Parte 3: Mostrar si aprobó

Modifica `mostrarInfo()` para incluir el resultado.

Ejemplo:

```text
Estudiante: Ana | Nota: 18.5 | Aprobado: true
```

---

### 🌟 Desafío Extra

Calcula también:

* La nota más baja.
* Cuántos estudiantes aprobaron.
* Cuántos desaprobaron.

---

## Cierre (30 seg)

¡Felicitaciones!

Acabas de construir una aplicación completa utilizando Programación Orientada a Objetos.

Aunque es un proyecto pequeño, utiliza exactamente las mismas bases que emplean los desarrolladores para crear sistemas reales.

Ya sabes cómo:

* Crear clases y objetos.
* Proteger información con encapsulamiento.
* Almacenar múltiples elementos en arrays.
* Procesar datos utilizando bucles y condiciones.

Has completado tu primer proyecto orientado a objetos en Java.

En la siguiente y última lección cerraremos el curso con recomendaciones, recursos y los siguientes pasos para continuar tu camino como programador.

¡Nos vemos en la última clase!


---
 
> **Equipo Los 5 Suyos** · Universidad Peruana de Ciencias Aplicadas  
> Ingeniería de Software · 1ASI0729 Desarrollo de Aplicaciones Open Source · 202610