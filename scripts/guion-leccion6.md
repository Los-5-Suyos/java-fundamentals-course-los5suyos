# Lección 6 — Introducción a la POO: Clases y Objetos

## Introducción (1 min)

¡Bienvenido de nuevo!

Hasta ahora hemos creado programas utilizando variables, operadores, estructuras de control y métodos.

Pero cuando los programas crecen, necesitamos una mejor forma de organizar la información y el código.

Aquí es donde aparece la **Programación Orientada a Objetos**, o simplemente **POO**.

La POO es utilizada para desarrollar videojuegos, aplicaciones móviles, sistemas empresariales y prácticamente cualquier software moderno.

Hoy aprenderás dos conceptos fundamentales:

- Las **clases**
- Los **objetos**

Abre en JDoodle de esta lección y empecemos.

<br>

---

## Desarrollo (8 min)

### ¿Qué es la Programación Orientada a Objetos?

La Programación Orientada a Objetos organiza el código utilizando elementos que representan cosas del mundo real.

**Por ejemplo:**

- Un estudiante
- Un automóvil
- Un producto de una tienda
- Un personaje de un videojuego

Cada uno tiene características y comportamientos.

Por ejemplo, un estudiante puede tener:

- Nombre
- Edad
- Código de estudiante

Y puede realizar acciones como:

- Estudiar
- Presentar exámenes
- Inscribirse en cursos

La POO nos permite representar estas situaciones dentro de nuestros programas.

<br>

---

### ¿Qué es una clase?

Una clase es como un molde o plantilla.

Piensa en un molde para hacer galletas.

El molde define la forma, pero todavía no es una galleta real.

En programación ocurre algo parecido.

La clase define qué información tendrá un objeto.

**Por ejemplo:**

```java
class Estudiante {
    String nombre;  // atributo
    int edad;       // atributo
}
```

Aquí hemos creado una clase llamada:

> Estudiante

Y tiene dos atributos:

```java
String nombre;
int edad;
```

Los atributos son las características que tendrá cada estudiante.

<br>

---

### ¿Qué es un objeto?

Un objeto es una instancia de una clase.

Siguiendo el ejemplo del molde:

- La clase es el molde.
- El objeto es la galleta ya creada.

Para crear un objeto utilizamos la palabra:

> new

**Ejemplo:**

```java
Estudiante e1 = new Estudiante();
```

Aquí estamos creando un estudiante real a partir del molde.

<br>

---

### ¿Qué significa new?

La palabra:

> new

le indica a Java que cree un nuevo objeto en memoria.

Cada vez que usamos `new`, obtenemos un objeto completamente independiente.

<br>

---

### Asignar valores a los atributos

Ahora podemos guardar información dentro del objeto.

```java
Estudiante e1 = new Estudiante();

e1.nombre = "Ana García";
e1.edad = 15;
```

Observa que usamos el punto (`.`) para acceder a los atributos.

<br>

---

### Mostrar información del objeto

También podemos leer los valores almacenados:

```java
System.out.println(e1.nombre);
System.out.println(e1.edad);
```

**Resultado:**

```text
Ana García
15
```

Ahora el objeto contiene información propia.

<br>

---

### Crear varios objetos

Lo interesante es que podemos crear muchos objetos usando la misma clase.

```java
Estudiante e1 = new Estudiante();
e1.nombre = "Ana García";
e1.edad = 15;

Estudiante e2 = new Estudiante();
e2.nombre = "Luis Ramos";
e2.edad = 16;
```

**Resultado:**

```java
System.out.println(e1.nombre);
System.out.println(e2.nombre);
```

**Salida:**

```text
Ana García
Luis Ramos
```

Aunque ambos fueron creados usando la misma clase, cada objeto tiene sus propios datos.

<br>

---

### Ejemplo del mundo real

Imagina un videojuego.

La clase podría ser:

```java
class Personaje {
    String nombre;
    int vidas;
}
```

Y los objetos podrían ser:

```java
Personaje jugador1 = new Personaje();
Personaje jugador2 = new Personaje();
```

Cada jugador tendría:

- Su propio nombre
- Su propia cantidad de vidas

Aunque ambos provienen del mismo molde.

<br>

---

### Error común de principiantes

Muchos estudiantes creen que una clase ya contiene datos.

**Por ejemplo:**

```java
class Estudiante {
    String nombre;
    int edad;
}
```

Esta clase define la estructura, pero todavía no existe ningún estudiante real.

Los datos aparecen recién cuando creamos objetos usando:

```text
new Estudiante();
```

Por eso es importante recordar:

- Clase = plantilla o molde.
- Objeto = instancia creada a partir del molde.

<br>

---

## Práctica (1 min)

🏆 **Reto 6: Registro de estudiantes**

Realiza las siguientes actividades:

**Parte 1: Crear la clase**

Crea una clase llamada:

> Estudiante

Con los atributos:

```text
String nombre;
int edad;
```
<br>

**Parte 2: Crear dos objetos**

Crea dos estudiantes:

```java
Estudiante e1 = new Estudiante();
Estudiante e2 = new Estudiante();
```

Asigna nombres y edades diferentes.

<br>

**Parte 3: Mostrar la información**

Imprime los datos de ambos estudiantes.

**Resultado esperado:**

```text
Ana García - 15
Luis Ramos - 16
```

Ejecuta tu programa y verifica que cada objeto tenga información diferente.

<br>

---

## Cierre (30 seg)

¡Excelente trabajo!

Hoy diste tus primeros pasos en la Programación Orientada a Objetos.

Aprendiste que:

- Una clase es un molde.

- Un objeto es una instancia creada a partir de ese molde.

- Los atributos almacenan información.

- Cada objeto posee sus propios datos.

Estos conceptos son la base de prácticamente todas las aplicaciones modernas desarrolladas en Java.

En la siguiente lección aprenderemos cómo proteger los datos de nuestros objetos utilizando el encapsulamiento.

¡Nos vemos en la próxima clase!

<br>

---
 
> **Equipo Los 5 Suyos** · Universidad Peruana de Ciencias Aplicadas  
> Ingeniería de Software · 1ASI0729 Desarrollo de Aplicaciones Open Source · 202610