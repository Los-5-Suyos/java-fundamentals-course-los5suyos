# Lección 7 — Encapsulamiento, Getters y Setters

## Introducción (1 min)

En la lección anterior accedíamos a los atributos directamente: `e1.nombre = "Ana"`. Esto puede ser problemático porque cualquiera puede modificar los datos sin control. El encapsulamiento soluciona eso. Abre tu Replit.

---

## Desarrollo (5 min)

### ¿Qué es el encapsulamiento?

Es proteger los atributos de una clase para que no puedan modificarse desde fuera de forma directa. Se hace declarándolos como `private`.

```java
class Producto {
    private String nombre;  // solo accesible desde dentro de la clase
    private double precio;
}
```

### Getters: leer el valor

Un getter es un método público que devuelve el valor de un atributo privado:

```java
public String getNombre() {
    return nombre;
}
```

Convención de nombre: `get` + nombre del atributo con mayúscula inicial.

### Setters: modificar el valor con control

Un setter es un método público que asigna el valor de forma controlada:

```java
public void setNombre(String nombre) {
    this.nombre = nombre;
}
```

`this.nombre` se refiere al atributo de la clase; `nombre` (sin `this`) es el parámetro recibido.

Puedes agregar validaciones:

```java
public void setPrecio(double precio) {
    if (precio >= 0) {
        this.precio = precio;
    } else {
        System.out.println("Error: el precio no puede ser negativo.");
    }
}
```

### Uso en el main

```java
Producto p = new Producto();
p.setNombre("Cuaderno");
p.setPrecio(5.50);

System.out.println(p.getNombre()); // Cuaderno
System.out.println(p.getPrecio()); // 5.5
```

---

## Práctica (1 min)

En tu Replit:
1. Declara atributos `private` en la clase `Producto`
2. Crea getters y setters para cada uno
3. Agrega validación en el setter de precio
4. Úsalos desde el `main`

---

## Cierre (30 seg)

El encapsulamiento protege los datos y da control sobre cómo se modifican. En la próxima lección aprenderemos a manejar múltiples datos con arrays.


---
 
> **Equipo Los 5 Suyos** · Universidad Peruana de Ciencias Aplicadas  
> Ingeniería de Software · 1ASI0729 Desarrollo de Aplicaciones Open Source · 202610