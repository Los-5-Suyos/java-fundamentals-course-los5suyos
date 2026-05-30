# Lección 5 — Métodos y Entrada/Salida de Datos

## Introducción (1 min)

Imagina que tienes que saludar al usuario en 10 partes distintas del programa. ¿Escribirías el mismo código 10 veces? Los métodos nos permiten escribir código una sola vez y reutilizarlo. Abre tu Replit.

---

## Desarrollo (6 min)

### ¿Qué es un método?

Un método es un bloque de código con nombre que agrupa instrucciones. Se define una vez y se puede llamar (usar) tantas veces como necesites.

### Método sin parámetros ni retorno

```java
public static void saludar() {
    System.out.println("¡Hola desde un método!");
}
```

- `public static` — modificadores (los verás con más detalle en cursos avanzados)
- `void` — significa que el método no devuelve ningún valor
- `saludar` — el nombre del método
- `()` — los parámetros (en este caso ninguno)

Para usarlo, lo llamamos desde el `main`:
```java
saludar();
```

### Método con parámetros y retorno

```java
public static int sumar(int a, int b) {
    return a + b;
}
```

- Recibe dos enteros como parámetros
- `return` devuelve el resultado al lugar donde se llamó

Uso:
```java
int resultado = sumar(8, 5);
System.out.println("Resultado: " + resultado); // 13
```

### Leer datos del usuario con Scanner

```java
import java.util.Scanner; // se escribe al inicio del archivo

Scanner sc = new Scanner(System.in);
System.out.print("¿Cuál es tu nombre? ");
String nombre = sc.nextLine(); // lee una línea de texto
System.out.println("Hola, " + nombre);
```

---

## Práctica (1 min)

En tu Replit:
1. Crea un método `saludar()` y llámalo
2. Crea un método `sumar(int a, int b)` y úsalo
3. Usa Scanner para pedir el nombre del usuario e imprimirlo

---

## Cierre (30 seg)

Los métodos hacen el código más ordenado y reutilizable. En la próxima lección damos el salto a la Programación Orientada a Objetos con clases y objetos.

---
 
> **Equipo Los 5 Suyos** · Universidad Peruana de Ciencias Aplicadas  
> Ingeniería de Software · 1ASI0729 Desarrollo de Aplicaciones Open Source · 202610