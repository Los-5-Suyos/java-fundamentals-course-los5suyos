# Lección 3 — Operadores y Expresiones

## Introducción (1 min)

¡Bienvenido de nuevo!

Hasta ahora hemos aprendido a mostrar mensajes en pantalla y a guardar información usando variables.

Pero los programas reales no solo almacenan datos: también realizan cálculos, comparan valores y toman decisiones.

Por ejemplo:

Un videojuego suma puntos.
Una tienda calcula precios y descuentos.
Una red social verifica si una contraseña es correcta.

Todo esto es posible gracias a los operadores.

Hoy aprenderás a realizar operaciones matemáticas, comparaciones y combinaciones lógicas usando Java.

Abre tu Replit y empecemos.

<br>

---

## Desarrollo (5 min)

### Operadores aritméticos

Los operadores aritméticos sirven para realizar cálculos matemáticos.

Imaginemos dos variables:

```java
int a = 10;
int b = 3;
```

<br>

### Suma (+)

```java
System.out.println(a + b);
```

**Resultado:**

> 13

La suma se utiliza para contar puntos, dinero, vidas y muchas otras cosas.

<br>

### Resta (-)

```java
System.out.println(a - b);
```

**Resultado:**

> 7

La resta puede utilizarse para disminuir vidas o calcular cuánto dinero queda después de una compra.

<br>

### Multiplicación (*)

```java
System.out.println(a * b);
```

**Resultado:**

> 30

<br>

### División (/)

```java
System.out.println(a / b);
```

**Resultado:**

> 3

Observa que el resultado no tiene decimales.

Esto ocurre porque ambas variables son de tipo int.

Java elimina la parte decimal cuando divide números enteros.

<br>

### División (/)

```java
System.out.println(a / b);
```

**Resultado:**

> 3

Observa que el resultado no tiene decimales.

Esto ocurre porque ambas variables son de tipo int.

Java elimina la parte decimal cuando divide números enteros.

<br>

### Residuo (%)

```java
System.out.println(a % b);
```

**Resultado:**

> 1

El operador % devuelve el residuo o sobrante de una división.

**Por ejemplo:**
> 10 % 3

10 dividido entre 3 da 3 y sobra 1.

Este operador es muy útil para saber si un número es par o impar:

```java
int numero = 8; 
System.out.println(numero % 2 == 0);
```

**Resultado:**

> true

Porque 8 es un número par.

<br>

---

### Operadores de comparación

Los operadores de comparación comparan dos valores y devuelven:

- true (verdadero)
- false (falso)

Veamos algunos ejemplos:

```java
System.out.println(a > b);
```

**Resultado:**

> true

Porque 10 es mayor que 3.

<br>

```java
System.out.println(a < b);
```

**Resultado:**

> false

Porque 10 no es menor que 3.

<br>

```java
System.out.println(a == b);
```

**Resultado:**

> false

⚠️ Importante:

Para comparar usamos doble signo igual:

==

Un error muy común es escribir solo:

=

Pero ese símbolo se utiliza para asignar valores, no para compararlos.

<br>

### Otros operadores útiles:

```java
System.out.println(a != b);
```

**Resultado:**

> true

Significa "distinto de".

```java
System.out.println(a >= b);
```

**Resultado:**

> true

Significa "mayor o igual".

<br>

---
 
### Operadores lógicos

Los operadores lógicos permiten combinar varias condiciones.

Imaginemos:

```java
boolean tieneInternet = true;
boolean tieneComputadora = false;
```
<br>

### AND (&&)

Significa "Y".

Ambas condiciones deben ser verdaderas.

```java
System.out.println(tieneInternet && tieneComputadora);
```

**Resultado:**

> false

Porque una de las dos condiciones es falsa.

### OR (||)

Significa "O".

Basta con que una condición sea verdadera.

```java
System.out.println(tieneInternet || tieneComputadora);
```

**Resultado:**

> true

Porque al menos una condición es verdadera.

### NOT (!)

Invierte el valor.

```java
System.out.println(!tieneInternet);
```

**Resultado:**

> false

Porque `tieneInternet` era `true`.

<br>

---

## Práctica (1 min)

🏆 **Reto 3: Calculadora y verificador**

Crea dos variables numéricas:

```java
int numero1 = 20; 
int numero2 = 5;
```

Luego:

1. Muestra la suma.
2. Muestra la multiplicación.
3. Muestra el residuo.
4. Comprueba si numero1 es mayor que numero2.
5. Crea dos variables boolean y combínalas usando && y | |.

Ejemplo:

```java
boolean tieneCuenta = true; 
boolean esMayorEdad = false;
```

Finalmente ejecuta tu programa y observa los resultados.

<br>

---

## Cierre (30 seg)

¡Excelente trabajo!

Hoy aprendiste a utilizar operadores para realizar cálculos, comparar valores y combinar condiciones.

Estos operadores son fundamentales porque permiten que los programas procesen información y tomen decisiones.

En la siguiente lección utilizaremos esas comparaciones para que nuestro programa pueda decidir qué hacer mediante estructuras como `if-else` y los bucles.

¡Nos vemos en la próxima clase!


<br>

---
 
> **Equipo Los 5 Suyos** · Universidad Peruana de Ciencias Aplicadas  
> Ingeniería de Software · 1ASI0729 Desarrollo de Aplicaciones Open Source · 202610