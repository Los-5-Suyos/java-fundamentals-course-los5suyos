# Lección 8 — Arrays: Guardar Muchos Datos a la Vez
 
## Introducción (1 min)
 
Imagina que quieres guardar las notas de 30 estudiantes. ¿Crearías 30 variables distintas? Eso sería muy tedioso. Los **arrays** resuelven exactamente ese problema: te permiten guardar muchos valores del mismo tipo en una sola variable. Abre tu Replit para seguir los ejemplos.
 
---
 
## Desarrollo (5 min)
 
### ¿Qué es un array?
 
Un array es una lista ordenada de valores del mismo tipo. Cada valor ocupa una posición llamada **índice**, y los índices siempre empiezan en **0**.
 
```java
int[] notas = {15, 18, 12, 20, 16};
```
 
Aquí `notas` es un array de 5 enteros. El primer elemento es `notas[0]` (vale 15), y el último es `notas[4]` (vale 16).
 
### Declarar y crear un array vacío
 
Si aún no sabes los valores, puedes crear el array con un tamaño fijo:
 
```java
String[] nombres = new String[3];  // espacio para 3 nombres
nombres[0] = "Ana";
nombres[1] = "Luis";
nombres[2] = "María";
```
 
### Acceder a un elemento
 
```java
System.out.println(notas[0]);  // imprime 15
System.out.println(notas[2]);  // imprime 12
```
 
### Conocer el tamaño de un array
 
```java
System.out.println(notas.length);  // imprime 5
```
 
### Recorrer un array con `for` clásico
 
```java
for (int i = 0; i < notas.length; i++) {
    System.out.println("Nota " + i + ": " + notas[i]);
}
```
 
### Recorrer con `for-each` (más sencillo)
 
Cuando solo necesitas leer los valores y no el índice, usa `for-each`:
 
```java
for (int nota : notas) {
    System.out.println(nota);
}
```
 
Se lee como: "para cada `nota` dentro de `notas`, haz...".
 
### Ejemplo completo: promedio de notas
 
```java
int[] notas = {15, 18, 12, 20, 16};
int suma = 0;
 
for (int nota : notas) {
    suma = suma + nota;
}
 
double promedio = (double) suma / notas.length;
System.out.println("Promedio: " + promedio);
```
 
El `(double)` antes de `suma` convierte el resultado a decimal para no perder la parte fraccionaria.
 
---
 
## Práctica (1 min)
 
En tu Replit:
1. Crea un array con los nombres de 4 amigos o familiares
2. Recórrelo con `for-each` e imprime un saludo para cada uno: `"Hola, Ana!"`
3. **Reto extra**: crea un array de 5 números enteros y muestra cuál es el mayor
---
 
## Cierre (30 seg)
 
Los arrays son la base para manejar colecciones de datos. En la próxima lección vamos a combinar todo lo que hemos aprendido — clases, encapsulamiento y arrays — para construir nuestro **proyecto final**: un registro de estudiantes completo.
 
 
---
 
> **Equipo Los 5 Suyos** · Universidad Peruana de Ciencias Aplicadas  
> Ingeniería de Software · 1ASI0729 Desarrollo de Aplicaciones Open Source · 202610