# Lección 2 — Variables y Tipos de Datos

## Introducción (1 min)

En la lección anterior imprimimos texto fijo. Pero en la mayoría de programas necesitamos guardar información que puede cambiar. Para eso usamos variables. Abre el Replit de esta lección.

---

## Desarrollo (6 min)

### ¿Qué es una variable?

Una variable es como una caja con nombre donde guardas un dato. Cada vez que necesitas ese dato, usas el nombre de la caja.

### Cómo declarar una variable en Java

```java
tipo nombre = valor;
```

### Los 4 tipos más usados

**int** — números enteros (sin decimales):
```java
int edad = 15;
int año = 2025;
```

**double** — números con decimales:
```java
double estatura = 1.65;
double precio = 9.99;
```

**String** — texto (siempre entre comillas dobles):
```java
String nombre = "Ana";
String ciudad = "Lima";
```

**boolean** — solo puede ser `true` o `false`:
```java
boolean meGustaProgamar = true;
boolean estaLloviendo = false;
```

### Usar variables en un println

Puedes combinar texto y variables con el signo `+`:

```java
String nombre = "Ana";
int edad = 15;
System.out.println("Hola, me llamo " + nombre + " y tengo " + edad + " años.");
```

---

## Práctica (1 min)

En tu Replit:
1. Declara una variable `int` con tu edad
2. Declara una variable `String` con tu nombre
3. Declara una variable `double` con tu estatura
4. Declara una variable `boolean` sobre si te gusta programar
5. Imprime todas las variables

---

## Cierre (30 seg)

Ahora ya sabes cómo guardar información en tu programa. En la próxima lección aprenderemos a hacer cálculos y comparaciones con operadores.