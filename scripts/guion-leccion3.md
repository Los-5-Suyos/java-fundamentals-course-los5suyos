# Lección 3 — Operadores y Expresiones

## Introducción (1 min)

Ya sabemos guardar datos en variables. Ahora vamos a aprender a operar con ellos: hacer cálculos, comparar valores y combinar condiciones. Abre tu Replit.

---

## Desarrollo (5 min)

### Operadores aritméticos

```java
int a = 10;
int b = 3;

System.out.println(a + b);  // 13 — suma
System.out.println(a - b);  // 7  — resta
System.out.println(a * b);  // 30 — multiplicación
System.out.println(a / b);  // 3  — división entera (sin decimales)
System.out.println(a % b);  // 1  — residuo (lo que sobra de dividir)
```

El operador `%` es muy útil para saber si un número es par o impar: si `numero % 2 == 0` es par.

### Operadores de comparación

Comparan dos valores y devuelven `true` o `false`:

```java
System.out.println(a > b);   // true  — mayor que
System.out.println(a < b);   // false — menor que
System.out.println(a == b);  // false — igual a (ojo: doble ==)
System.out.println(a != b);  // true  — distinto de
System.out.println(a >= b);  // true  — mayor o igual
```

### Operadores lógicos

Combinan condiciones boolean:

```java
boolean tieneInternet = true;
boolean tieneComputadora = false;

// && (y): ambos deben ser true para que el resultado sea true
System.out.println(tieneInternet && tieneComputadora); // false

// || (o): basta con que uno sea true
System.out.println(tieneInternet || tieneComputadora); // true

// ! (no): invierte el valor
System.out.println(!tieneInternet); // false
```

---

## Práctica (1 min)

En tu Replit:
1. Imprime suma, multiplicación y residuo de dos números
2. Compara los números con `>` y `==`
3. Combina dos boolean con `&&` y `||`

---

## Cierre (30 seg)

Con operadores ya puedes hacer cálculos y comparaciones. En la próxima lección usaremos esas comparaciones para que el programa tome decisiones con `if-else` y repita acciones con bucles.