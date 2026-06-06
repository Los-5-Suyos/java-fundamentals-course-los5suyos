# Lección 8 — Arrays: Guardar Muchos Datos a la Vez
 
## Introducción (1 min)
 
¡Bienvenido de nuevo!

Imagina que eres profesor y necesitas guardar las notas de 30 estudiantes.

¿Crearías algo así?

```text
int nota1 = 15;
int nota2 = 18;
int nota3 = 12;
...
```

Eso sería muy largo y difícil de administrar.

Por suerte, Java tiene una solución mucho más práctica: los arrays.

Los arrays permiten almacenar muchos datos del mismo tipo dentro de una sola variable.

Hoy aprenderás a:

- Crear arrays.

- Guardar información en ellos.

- Acceder a sus elementos.

- Recorrerlos usando bucles.

- Resolver problemas sencillos utilizando arrays.

Abre en JDoodle de esta lección y empecemos.

<br>

---
 
## Desarrollo (5 min)
 
### ¿Qué es un array?
 
Un array es una colección ordenada de datos del mismo tipo.

Por ejemplo, podemos guardar varias notas en una sola variable:
 
```java
int[] notas = {15, 18, 12, 20, 16};
```
Visualmente podemos imaginarlo así:

```text
Índice: 0 1 2 3 4 
Valor: 15 18 12 20 16
```

Observa algo importante:

⚠️ Los índices siempre comienzan en **0**.

Este es uno de los errores más comunes cuando se empieza a programar.

<br>

---
### Acceder a un elemento
 
Podemos acceder a cualquier posición utilizando corchetes:

```java
System.out.println(notas[0]);
```

**Resultado:**

`15`
 
```java
System.out.println(notas[2]);
```
**Resultado:**

`12`

Porque el índice 2 corresponde al tercer elemento.

<br>

---
### Crear un array vacío
 
A veces conocemos el tamaño del array, pero todavía no los valores.

**Por ejemplo:**

```java
String[] nombres = new String[3];
```

Aquí Java reserva espacio para tres nombres.

Luego podemos asignarlos:

```text
nombres[0] = "Ana";
nombres[1] = "Luis";
nombres[2] = "María";
```

<br>

---

### Conocer el tamaño del array

Podemos averiguar cuántos elementos tiene usando:

```java
System.out.println(notas.length);
```

**Resultado:**

```text
5
```
La propiedad:

```text
length
```

devuelve la cantidad de elementos almacenados.

<br>

---

### Recorrer un array con for

Muchas veces necesitamos visitar todos los elementos.

Para ello utilizamos un bucle `for`.

```java
for (int i = 0; i < notas.length; i++) {
    System.out.println("Nota " + i + ": " + notas[i]);
}
```

**Resultado:**

```text
Nota 0: 15
Nota 1: 18
Nota 2: 12
Nota 3: 20
Nota 4: 16
```

<br>

---

### ¿Por qué usamos notas.length?

Porque así el programa funciona aunque el tamaño del array cambie.

Si mañana agregamos más notas, no tendremos que modificar el bucle.

<br>

---

### Recorrer con for-each

Cuando solo queremos leer los valores, existe una forma más sencilla.

```java
for (int nota : notas) {
    System.out.println(nota);
}
```

Se lee como:

> Para cada nota dentro del array notas, imprime la nota.

**Resultado:**

```text
15
18
12
20
16
```

<br>

---

### Ejemplo práctico: calcular el promedio

Supongamos que queremos obtener el promedio de varias notas.

```java
int[] notas = {15, 18, 12, 20, 16};

int suma = 0;

for (int nota : notas) {
    suma = suma + nota;
}

double promedio = (double) suma / notas.length;

System.out.println("Promedio: " + promedio);
```

**Resultado:**

> Promedio: 16.2

<br>

---                    

### Error común de principiantes

Observa este código:

```java
System.out.println(notas[5]);
```
 
Si el array tiene cinco elementos:

> Índice: 0 1 2 3 4

El índice 5 no existe.

Java mostrará un error porque intentamos acceder a una posición fuera del array.

Por eso siempre debemos recordar:

- Primer índice → 0
- Último índice → length - 1

<br>

---
 
## Práctica (1 min)

🏆 **Reto 8: Lista de amigos**

**Parte 1: Crear un array de nombres**

Crea un array con cuatro nombres:

```java
String[] amigos = {
    "Ana",
    "Luis",
    "María",
    "Carlos"
};
```

**Parte 2: Saludar a todos**

Utiliza un `for-each` para mostrar:

```text
Hola, Ana!
Hola, Luis!
Hola, María!
Hola, Carlos!
```
<br>

---

## 🌟 Reto extra: Encontrar el número mayor

Crea un array de cinco números:

```java
int[] numeros = {8, 15, 3, 20, 11};
```

Recorre el array y muestra cuál es el número más grande.

**Resultado esperado:**

> El número mayor es: 20

<br>

---
 
## Cierre (30 seg)
 
¡Excelente trabajo!

Hoy aprendiste a utilizar arrays para almacenar múltiples datos dentro de una sola variable.

Ahora sabes:

Qué es un array.
Cómo acceder a sus elementos.
Cómo recorrerlo usando `for` y `for-each`.
Cómo resolver problemas como calcular promedios.

Los arrays son una de las estructuras más utilizadas en programación y sirven como base para trabajar con colecciones de datos más avanzadas.

En la próxima lección combinaremos clases, encapsulamiento y arrays para construir nuestro proyecto final: un sistema de registro de estudiantes.

¡Nos vemos en la próxima clase!
 
<br>

---
 
> **Equipo Los 5 Suyos** · Universidad Peruana de Ciencias Aplicadas  
> Ingeniería de Software · 1ASI0729 Desarrollo de Aplicaciones Open Source · 202610