# Lección 2 — Variables y Tipos de Datos

## Introducción (1 min)

¡Bienvenido de nuevo!

En la lección anterior aprendiste a mostrar mensajes en pantalla usando System.out.println(). Pero los programas reales hacen mucho más que mostrar texto fijo.

Piensa en una red social, un videojuego o una aplicación de compras. Todos necesitan almacenar información que cambia constantemente: nombres, edades, puntajes, precios y mucho más.

Para guardar esa información usamos variables.

Hoy aprenderás qué son las variables, cómo crearlas y cuáles son los tipos de datos más utilizados en Java.

Abre el Replit de esta lección y empecemos.

<br>

---

## Desarrollo (6 min)

### ¿Qué es una variable?

Imagina que tienes varias cajas etiquetadas.

Una caja puede guardar tu nombre, otra tu edad y otra tu color favorito.

Cada caja tiene una etiqueta para que puedas encontrar rápidamente lo que guardaste dentro.

En programación, esas cajas son las variables.

Las variables nos permiten guardar información para utilizarla más adelante en nuestro programa.

<br>

### Cómo declarar una variable en Java

La estructura básica es:

```java
tipo nombre = valor;
```
**Por ejemplo:**
```java
int edad = 15;
```

Aquí:

- `int` es el tipo de dato.

- `edad` es el nombre de la variable.

- `15` es el valor almacenado.

<br>

---

## Los tipos de datos más utilizados

### 1. int — Números enteros

Se utiliza para números sin decimales.

```java
int edad = 15;
int año = 2025;
int puntos = 100;
```
Puedes usarlo para edades, puntajes o cantidades.

### 2. double — Números con decimales
Se utiliza cuando necesitamos mayor precisión.

```java
double estatura = 1.65;
double precio = 9.99;
double temperatura = 23.5;
```
Puedes usarlo para precios, alturas o mediciones.

### 3. String — Texto

Siempre va entre comillas dobles.

```java
String nombre = "Ana";
String ciudad = "Lima";
String videojuego = "Minecraft";
```

Se utiliza para guardar palabras o frases.

### 4. boolean — Verdadero o falso

Solo puede almacenar dos valores:

```java
boolean meGustaProgamar = true;
boolean estaLloviendo = false;
```
Es muy útil cuando necesitamos responder preguntas con sí o no.

---

## Mostrar variables en pantalla

Las variables pueden combinarse con texto usando el símbolo `+`.

**Por ejemplo:**

```java

String nombre = "Ana";
int edad = 15;

System.out.println("Hola, me llamo " + nombre);
System.out.println("Tengo " + edad + " años");

```
**Resultado:**

```text
Hola, me llamo Ana
Tengo 15 años
```

De esta forma, el programa puede mostrar información diferente dependiendo de los valores almacenados.

<br>

---

## Práctica (1 min)

### 🏆 Reto 2: Crea tu perfil digital

Crea las siguientes variables:

1. Declara una variable `int` con tu edad
2. Declara una variable `String` con tu nombre
3. Declara una variable `double` con tu estatura
4. Declara una variable `boolean` sobre si te gusta programar
5. Imprime todas las variables

Luego muestra toda la información usando `System.out.println()`.

**Resultado esperado:**

```text

Hola, me llamo Carlos
Tengo 16 años
Mido 1.72 metros
¿Me gusta programar? true

```

Cuando termines, presiona **Run (▶)** para ver tu perfil en la consola.

<br>

---

## Cierre (30 seg)

¡Excelente trabajo!

Hoy aprendiste qué son las variables y cómo utilizarlas para almacenar información dentro de un programa.

También conociste los tipos de datos más importantes en Java: `int`, `double`, `String` y `boolean`.

Ahora tus programas ya pueden recordar información y trabajar con datos reales.

En la siguiente lección aprenderemos a realizar cálculos y comparaciones utilizando operadores.

¡Nos vemos en la próxima clase!

---
 
> **Equipo Los 5 Suyos** · Universidad Peruana de Ciencias Aplicadas  
> Ingeniería de Software · 1ASI0729 Desarrollo de Aplicaciones Open Source · 202610