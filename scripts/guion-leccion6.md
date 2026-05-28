# Lección 6 — Introducción a la POO: Clases y Objetos

## Introducción (1 min)

Hasta ahora hemos programado de forma secuencial. Hoy entramos a la Programación Orientada a Objetos, que es la forma en que se construyen la mayoría de aplicaciones del mundo real. Abre tu Replit.

---

## Desarrollo (8 min)

### ¿Qué es la POO?

La Programación Orientada a Objetos (POO) organiza el código en torno a objetos del mundo real. Por ejemplo: un estudiante, un auto, un producto.

### ¿Qué es una clase?

Una clase es como un molde o plantilla. Define qué datos (atributos) y qué acciones (métodos) tendrá cada objeto creado a partir de ella.

```java
class Estudiante {
    String nombre;  // atributo
    int edad;       // atributo
}
```

### ¿Qué es un objeto?

Un objeto es una instancia de la clase, es decir, una versión concreta del molde:

```java
Estudiante e1 = new Estudiante();
```

`new Estudiante()` crea un nuevo objeto en memoria.

### Asignar y leer atributos

```java
e1.nombre = "Ana García";
e1.edad = 15;

System.out.println(e1.nombre); // Ana García
System.out.println(e1.edad);   // 15
```

### Crear múltiples objetos

Cada objeto es independiente, tiene sus propios datos:

```java
Estudiante e2 = new Estudiante();
e2.nombre = "Luis Ramos";
e2.edad = 16;
```

Cambiar `e2.nombre` no afecta a `e1.nombre`.

---

## Práctica (1 min)

En tu Replit:
1. Define la clase `Estudiante` con atributos `nombre` y `edad`
2. Crea dos objetos con datos distintos
3. Imprime los datos de cada objeto

---

## Cierre (30 seg)

Las clases y los objetos son la base de la POO. En la próxima lección aprenderemos a proteger los datos de nuestros objetos con encapsulamiento.