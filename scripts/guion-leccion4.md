# Lección 4 — Estructuras de Control: Decisiones y Bucles

## Introducción (1 min)

Un programa que solo ejecuta instrucciones en orden es muy limitado. Lo que hace a los programas poderosos es que pueden tomar decisiones y repetir acciones. Hoy aprenderemos `if-else`, `for` y `while`. Abre tu Replit.

---

## Desarrollo (8 min)

### if-else: tomar decisiones

```java
int edad = 15;

if (edad >= 18) {
    System.out.println("Eres mayor de edad");
} else {
    System.out.println("Eres menor de edad");
}
```

La computadora evalúa la condición entre paréntesis. Si es `true` ejecuta el primer bloque; si es `false` ejecuta el `else`.

También puedes encadenar condiciones con `else if`:

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

### Bucle for: repetir un número fijo de veces

```java
// Imprime los números del 1 al 5
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

Estructura: `for (inicio; condición; incremento)`
- `int i = 1` — empieza en 1
- `i <= 5` — repite mientras i sea menor o igual a 5
- `i++` — suma 1 a i después de cada vuelta

### Bucle while: repetir mientras se cumpla una condición

```java
int contador = 5;
while (contador >= 1) {
    System.out.println(contador);
    contador--;
}
System.out.println("¡Despegue!");
```

El `while` es útil cuando no sabes exactamente cuántas veces repetir.

---

## Práctica (1 min)

En tu Replit:
1. Usa `if-else` para verificar si una edad es mayor o igual a 18
2. Usa `for` para imprimir del 1 al 5
3. Usa `while` para hacer una cuenta regresiva del 5 al 1

---

## Cierre (30 seg)

Con `if-else`, `for` y `while` tu programa ya puede tomar decisiones y automatizar tareas repetitivas. En la próxima lección aprenderemos a organizar el código en métodos reutilizables.