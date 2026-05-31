# Lección 5 — Métodos y Entrada/Salida de Datos

## Introducción (1 min)

¡Bienvenido de nuevo!

Imagina que en un videojuego necesitas mostrar el mensaje "¡Bienvenido al juego!" muchas veces.

Podrías copiar y pegar la misma instrucción una y otra vez.

Pero los programadores tienen una forma mucho más eficiente de hacerlo.

Utilizan **métodos**.

Los métodos permiten agrupar instrucciones, darles un nombre y reutilizarlas cuando sea necesario.

Además, aprenderemos a recibir información escrita por el usuario utilizando el teclado.

Abre tu Replit y empecemos.

<br>

---

## Desarrollo (6 min)

### ¿Qué es un método?

Un método es un bloque de código con nombre que realiza una tarea específica.

Piensa en un botón de una aplicación.

Cuando presionas el botón, ocurre una acción determinada.

Los métodos funcionan de manera parecida: los llamamos por su nombre y ejecutan las instrucciones que contienen.

<br>

---

### Método sin parámetros ni retorno

Veamos un ejemplo sencillo:

```java
public static void saludar() {
    System.out.println("¡Hola desde un método!");
}
```

Analicemos sus partes:

```java
public static void
```
Por ahora no necesitas memorizar estas palabras.

Solo recuerda que Java las necesita para que el método funcione correctamente.

```text
saludar
```

Es el nombre del método.

```text
()
```

Son los parámetros.

En este caso están vacíos porque no recibe información.

<br>

---

### ¿Cómo usar un método?

Definir un método no es suficiente.

También debemos llamarlo desde el programa.

```java
public class Main { 
    public static void saludar() { 
        System.out.println("¡Hola desde un método!"); 
        } 
    public static void main(String[] args) { 
        saludar(); 
        } 
    }
```
**Resultado:**

> ¡Hola desde un método!

<br>

---
### Reutilizar un método


Podemos llamarlo varias veces:

```text
saludar();
saludar();
saludar();
```

**Resultado:**

```text
¡Hola desde un método!
¡Hola desde un método!
¡Hola desde un método!
```

Es mucho más práctico que escribir el mismo código repetidamente.

<br>

---

### Métodos con parámetros

Los parámetros permiten enviar información al método.

**Por ejemplo:**

```java
public static void saludarPersona(String nombre) {
    System.out.println("Hola " + nombre);
}
```

**Uso:**

```text
saludarPersona("Ana");
saludarPersona("Carlos");
```

**Resultado:**

```text
Hola Ana
Hola Carlos
```

El mismo método puede funcionar con diferentes datos.

<br>

---

### Métodos con retorno

Algunos métodos calculan un resultado y lo devuelven.

**Por ejemplo:**

```java
public static int sumar(int a, int b) {
    return a + b;
}
```

**Uso:**

```java
int resultado = sumar(8, 5);

System.out.println(resultado);
```

**Resultado:**

```text
13
```
<br>

---

### ¿Qué significa return?

La palabra:

```text
return
```

significa "devolver".

El método realiza un cálculo y entrega el resultado al lugar donde fue llamado.

<br>

---

### Entrada de datos con Scanner

Hasta ahora nuestros programas mostraban información.

Ahora aprenderemos a recibir información del usuario.

Para ello utilizamos la clase `Scanner`.

**Paso 1: Importar Scanner**

Al inicio del archivo escribimos:

```java
import java.util.Scanner;
```

Esto permite utilizar la herramienta que leerá los datos ingresados por el usuario.

**Paso 2: Crear el Scanner**

```java
Scanner sc = new Scanner(System.in);
```

**Paso 3: Pedir información**

```java
System.out.print("¿Cuál es tu nombre? ");
```

**Paso 4: Leer la respuesta**

```java
String nombre = sc.nextLine();
```

**Ejemplo completo**

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuál es tu nombre? ");

        String nombre = sc.nextLine();

        System.out.println("Hola, " + nombre);
    }
}
```

**Ejemplo de ejecución:**

```java
¿Cuál es tu nombre? Ana
Hola, Ana
```

Ahora el programa puede interactuar con el usuario.

<br>

---

### Error común de principiantes

Muchos estudiantes olvidan importar Scanner:

```java
import java.util.Scanner;
```

Si falta esta línea, Java mostrará un error porque no reconoce la palabra `Scanner`.

Por eso siempre debe colocarse al inicio del archivo.

<br>

---

## Práctica (1 min)

🏆 **Reto 5: Tu asistente personal**

Realiza las siguientes actividades:

<br>

**Parte 1: Crear un método**

Crea un método llamado:

> saludar()

Que muestre:

> ¡Bienvenido al programa!

Y llámalo desde el `main`.

<br>

**Parte 2: Crear un método de suma**

Crea el método:

> sumar(int a, int b)

Utilízalo para sumar dos números y mostrar el resultado.

<br>

**Parte 3: Hablar con el usuario**

Usa Scanner para preguntar:

> ¿Cuál es tu nombre?

Luego muestra:

> Hola, [nombre]

Reemplazando `[nombre]` por la respuesta del usuario.

<br>

---

## Cierre (30 seg)

¡Excelente trabajo!

Hoy aprendiste a crear métodos para reutilizar código y mantener los programas organizados.

También aprendiste a recibir información desde el teclado utilizando Scanner.

Ahora tus programas no solo muestran información, sino que también pueden interactuar con las personas que los utilizan.

En la siguiente lección daremos el salto a la Programación Orientada a Objetos aprendiendo qué son las clases y los objetos.

¡Nos vemos en la próxima clase!

<br>

---
 
> **Equipo Los 5 Suyos** · Universidad Peruana de Ciencias Aplicadas  
> Ingeniería de Software · 1ASI0729 Desarrollo de Aplicaciones Open Source · 202610