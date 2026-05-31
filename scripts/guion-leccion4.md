# Lección 4 — Estructuras de Control: Decisiones y Bucles

## Introducción (1 min)

¡Bienvenido de nuevo!

Hasta ahora nuestros programas podían mostrar información, guardar datos y realizar cálculos.

Pero todavía tienen una limitación: siempre hacen exactamente lo mismo.

Piensa en un videojuego.

Si un jugador tiene 0 vidas, el juego debería terminar.

Si tiene vidas disponibles, debería seguir jugando.

Para tomar este tipo de decisiones necesitamos las estructuras de control.

Hoy aprenderemos a:

Tomar decisiones con `if` y `else`.
Repetir acciones con `for`.
Repetir acciones con `while`.

Abre tu Replit y comencemos.

<br>

---

## Desarrollo (8 min)

### Tomar decisiones con if-else

Las computadoras toman decisiones evaluando condiciones.

**Por ejemplo:**

```java
int edad = 15;

if (edad >= 18) {
    System.out.println("Eres mayor de edad");
} else {
    System.out.println("Eres menor de edad");
}
```

La condición es:

> edad >= 18

Si la condición es verdadera (`true`), Java ejecuta el primer bloque.

Si es falsa (`false`), ejecuta el bloque `else`.

<br>

---
### Ejemplo de la vida real

Imagina que un videojuego verifica si tienes  suficiente energía para jugar:

**Por ejemplo:**

```java
int energia = 80; 

if (energia > 50) { 
    System.out.println("Puedes continuar"); 
    } 
else { 
    System.out.println("Necesitas recargar energía"); 
    }

```
El programa toma una decisión dependiendo del valor almacenado.

<br>

---
### Usar varias condiciones con else if

A veces necesitamos más de dos opciones.

Por ejemplo, para clasificar una nota:

```java
int nota = 14; 
if (nota >= 18) { 
    System.out.println("Excelente"); 
    } else if (nota >= 14) { 
    System.out.println("Bueno"); 
    } else if (nota >= 11) { 
    System.out.println("Regular"); 
    } else { 
    System.out.println("Desaprobado"); 
    }
```
Java evalúa las condiciones de arriba hacia abajo hasta encontrar una que sea verdadera.

<br>

---
### Repetir acciones con for

Imagina que quieres mostrar cinco veces un mensaje.

Podrías escribir:

```java
System.out.println("Hola"); 
System.out.println("Hola"); 
System.out.println("Hola"); 
System.out.println("Hola"); 
System.out.println("Hola");
```
Pero eso sería muy repetitivo.

Para eso existe el bucle `for`.

```java
for (int i = 1; i <= 5; i++) { 
    System.out.println(i); 
    }
```
Resultado:

```text
1
2
3
4
5
```

<br>

### ¿Cómo funciona?

```java
for (int i = 1; i <= 5; i++)
```

Se compone de tres partes:

**Inicio**

```java
int i = 1
```
La variable comienza en 1.

**Condición**

```java
i <= 5
```

El ciclo continúa mientras la condición sea verdadera.

**Incremento**

```java
i++
```

Después de cada repetición, aumenta 1.

<br>

---

### Ejemplo práctico

Mostrar cinco vidas de un videojuego:

```java
for (int vida = 1; vida <= 5; vida++) {
    System.out.println("❤️ Vida " + vida);
}
```
<br>

---

### Repetir acciones con while

El bucle `while` funciona de forma diferente.

Se ejecuta mientras una condición sea verdadera.

```java
int contador = 5;

while (contador >= 1) {
    System.out.println(contador);
    contador--;
}

System.out.println("¡Despegue!");
```

**Resultado:**
```text
5
4
3
2
1
¡Despegue!
```
<br>

---

### ¿Cuándo usar while?

Usamos `while` cuando no sabemos exactamente cuántas veces se repetirá algo.

**Por ejemplo:**

- Esperar a que un usuario ingrese una respuesta válida.

- Esperar a que termine una descarga.

- Mantener un juego funcionando mientras el jugador tenga vidas.

**Ejemplo:**

```java
int vidas = 3;

while (vidas > 0) {
    System.out.println("Sigues jugando");
    vidas--;
}
```

<br>

---

### Error común de principiantes

Observa este código:

```java
int contador = 5;

while (contador >= 1) {
    System.out.println(contador);
}
```

**¿Qué ocurre?**

El valor de `contador` nunca cambia.

La condición siempre será verdadera y el programa quedará atrapado en un ciclo infinito.

Por eso es importante actualizar la variable dentro del bucle:

```java
contador--;
```

<br>

---

## Práctica (1 min)

🏆 **Reto 4: Controlando un videojuego**

Realiza las siguientes actividades:

**Parte 1: Verificar edad**

Crea una variable:

```java
int edad = 16;
```
Usa `if-else` para mostrar si el jugador es mayor o menor de edad.

<br>

**Parte 2: Mostrar niveles**

Usa un `for` para imprimir los niveles del 1 al 5.

Resultado esperado:

```text
Nivel 1 
Nivel 2 
Nivel 3 
Nivel 4 
Nivel 5
```

<br>

**Parte 3: Cuenta regresiva**

Usa un `while` para mostrar una cuenta regresiva desde 5 hasta 1.

Al finalizar, muestra:

```text
¡Inicio del juego!
```

Ejecuta tu programa y verifica que todo funcione correctamente.

<br>

---

## Cierre (30 seg)

¡Excelente trabajo!

Hoy aprendiste a controlar el comportamiento de tus programas utilizando estructuras de decisión y repetición.

Ahora tu programa puede tomar decisiones usando `if`, `else` y `else if`, además de repetir acciones con `for` y `while`.

Estas herramientas son fundamentales porque permiten crear programas interactivos, videojuegos y aplicaciones mucho más interesantes.

En la siguiente lección aprenderemos a organizar mejor nuestro código utilizando métodos reutilizables.

¡Nos vemos en la próxima clase!

<br>

---
 
> **Equipo Los 5 Suyos** · Universidad Peruana de Ciencias Aplicadas  
> Ingeniería de Software · 1ASI0729 Desarrollo de Aplicaciones Open Source · 202610