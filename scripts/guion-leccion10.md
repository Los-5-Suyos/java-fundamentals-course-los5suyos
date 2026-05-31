# Lección 10 — Buenas Prácticas y Próximos Pasos

## Introducción (30 seg)

¡Felicitaciones por llegar hasta aquí!

Has completado tu primer curso de programación en Java.

Durante estas lecciones aprendiste a crear programas, trabajar con variables, usar estructuras de control, crear métodos, utilizar clases y objetos, y desarrollar un proyecto completo utilizando Programación Orientada a Objetos.

En esta última lección no aprenderemos código nuevo.

En cambio, veremos algunas buenas prácticas que te ayudarán a convertirte en un mejor programador y exploraremos qué temas puedes estudiar después de este curso.

---

## Desarrollo (3.5 min)

# 1. Usa nombres descriptivos

Una de las reglas más importantes de la programación es escribir código que sea fácil de entender.

Recuerda que muchas veces leerás tu propio código semanas o meses después de haberlo escrito.

Observa la diferencia:

```java
// ❌ Poco claro
int x = 15;
double r = x * 1.18;
```

¿Qué representan `x` y `r`?

No lo sabemos.

Ahora veamos una versión más clara:

```java
// ✅ Más fácil de entender
int precioBase = 15;
double precioConImpuesto = precioBase * 1.18;
```

Aquí el propósito de cada variable es evidente.

Un buen nombre puede evitar muchos errores y ahorrar mucho tiempo.

---

# 2. Evita repetir código

Cuando encuentres el mismo bloque de código varias veces, pregúntate:

> ¿Podría convertir esto en un método?

Por ejemplo:

```java
// ❌ Código repetido
System.out.println("Nombre: " + estudiante1.getNombre());
System.out.println("Nota: " + estudiante1.getNota());

System.out.println("Nombre: " + estudiante2.getNombre());
System.out.println("Nota: " + estudiante2.getNota());
```

Podemos simplificarlo creando un método:

```java
public void mostrarInfo() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Nota: " + nota);
}
```

Luego simplemente llamamos:

```java
estudiante1.mostrarInfo();
estudiante2.mostrarInfo();
```

El código queda más limpio y fácil de mantener.

---

# 3. Aprende a leer los errores

Todos los programadores cometen errores.

Incluso los desarrolladores con años de experiencia ven mensajes de error todos los días.

La diferencia está en cómo reaccionan.

Los errores son información que nos ayuda a encontrar el problema.

Algunos errores comunes son:

### cannot find symbol

```text
cannot find symbol
```

Significa que Java no encuentra una variable, clase o método.

Normalmente ocurre por escribir mal un nombre.

---

### incompatible types

```text
incompatible types
```

Significa que estás mezclando tipos de datos incompatibles.

Por ejemplo:

```java
int edad = "15";
```

Aquí intentamos guardar texto dentro de una variable numérica.

---

### ArrayIndexOutOfBoundsException

```text
ArrayIndexOutOfBoundsException
```

Ocurre cuando intentas acceder a una posición que no existe dentro de un array.

Por ejemplo:

```java
int[] numeros = {1, 2, 3};

System.out.println(numeros[5]);
```

El índice 5 no existe.

---

### ¿Qué hacer cuando aparece un error?

Sigue estos pasos:

1. Lee el mensaje completo.
2. Identifica la línea indicada.
3. Revisa cuidadosamente el código.
4. Busca información si no entiendes el error.
5. Prueba nuevamente.

Resolver errores es una parte normal del proceso de programación.

---

# 4. Practica con frecuencia

Aprender programación se parece mucho a aprender un deporte o un instrumento musical.

La práctica constante es más importante que estudiar muchas horas una sola vez.

Incluso 15 o 20 minutos al día pueden marcar una gran diferencia.

Algunas ideas de proyectos pequeños son:

- Una calculadora
- Un juego de adivinanzas
- Un sistema de notas
- Una agenda de contactos
- Un registro de tareas

Cada proyecto te enseñará algo nuevo.

---

# ¿Qué aprender después de este curso?

Ahora que dominas los fundamentos de Java, estos son algunos de los siguientes pasos recomendados.

### Herencia y Polimorfismo

Aprenderás cómo una clase puede reutilizar características de otra.

---

### Interfaces

Permiten definir comportamientos comunes para diferentes clases.

---

### Colecciones

Estructuras más flexibles que los arrays.

Algunas muy utilizadas son:

- ArrayList
- HashMap
- HashSet

---

### Manejo de Excepciones

Aprenderás a controlar errores de forma profesional para que los programas sean más robustos.

---

## Recursos para seguir aprendiendo

Puedes continuar practicando con:

- La documentación oficial de Java.
- Tutoriales interactivos de Java.
- Sitios de referencia con ejemplos y ejercicios.
- Replit para crear proyectos sin necesidad de instalar software.

Lo más importante es seguir escribiendo código.

---

## Cierre (1 min)

¡Felicitaciones!

Cuando comenzaste este curso probablemente no sabías qué era una variable, un método o una clase.

Hoy eres capaz de:

✅ Crear programas en Java.

✅ Utilizar variables y operadores.

✅ Tomar decisiones con estructuras de control.

✅ Crear métodos reutilizables.

✅ Trabajar con clases y objetos.

✅ Aplicar encapsulamiento.

✅ Utilizar arrays para manejar múltiples datos.

✅ Desarrollar una aplicación sencilla utilizando Programación Orientada a Objetos.

Eso representa un gran avance.

Recuerda que ningún programador aprende todo de una vez.

Cada proyecto, cada error corregido y cada ejercicio resuelto forman parte del aprendizaje.

Sigue practicando, sigue construyendo proyectos y sigue teniendo curiosidad por aprender.

Este curso es solo el comienzo de tu camino en el desarrollo de software.

¡Mucho éxito en tus próximos proyectos y gracias por completar el curso!

---

> **Equipo Los 5 Suyos** · Universidad Peruana de Ciencias Aplicadas  
> Ingeniería de Software · 1ASI0729 Desarrollo de Aplicaciones Open Source · 202610