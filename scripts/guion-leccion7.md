# Lección 7 — Encapsulamiento, Getters y Setters

## Introducción (1 min)

¡Bienvenido de nuevo!

En la lección anterior aprendimos a crear clases y objetos.

Sin embargo, teníamos un problema.

Podíamos modificar cualquier dato directamente:

`e1.nombre = "Ana";`

¿Y qué pasaría si alguien asigna un precio negativo a un producto?

¿O una edad imposible como 500 años?

Los programas reales necesitan proteger su información.

Para eso existe el **encapsulamiento**.

Hoy aprenderás cómo proteger los atributos de una clase utilizando:

- `private`
- `Getters`
- `Setters`

Abre en JDoodle de esta lección y empecemos.

<br>

---

## Desarrollo (5 min)

### ¿Qué es el encapsulamiento?

Imagina que tienes una cuenta bancaria.

No cualquiera puede modificar tu saldo directamente.

Para retirar o depositar dinero debes hacerlo mediante operaciones controladas.

En programación ocurre algo parecido.

El encapsulamiento consiste en proteger los datos de una clase para que no puedan modificarse libremente desde cualquier parte del programa.

<br>

---
### Proteger atributos con private

Para lograrlo utilizamos la palabra clave:

`private`

**Ejemplo:**

```java
class Producto {

    private String nombre;
    private double precio;

}
```

Ahora los atributos solo pueden ser utilizados dentro de la propia clase.

Si intentamos hacer esto:

```java
Producto p = new Producto();

p.nombre = "Cuaderno";
```

Java mostrará un error porque el atributo es privado.

<br>

---

### ¿Cómo acceder a los atributos?

Para acceder de forma segura utilizamos métodos especiales llamados:

- Getters

- Setters

<br>

---

### Getters: leer información

Un getter permite obtener el valor de un atributo privado.

**Ejemplo:**

```java
public String getNombre() {
    return nombre;
}
```

La palabra:

```java
return
```

devuelve el valor almacenado.
<br>

---

### Uso del getter

```java
System.out.println(p.getNombre());
```

**Resultado:**

`Cuaderno`

<br>

---

### Regla de nombres para getters

La convención es:

```java
get + NombreDelAtributo
```

**Ejemplos:**

```java
getNombre()
getPrecio()
getEdad()
```

Esto hace que el código sea más fácil de leer y mantener.

<br>

---

### Setters: modificar información

Un setter permite cambiar el valor de un atributo privado.

**Ejemplo:**

```java
public void setNombre(String nombre) {
    this.nombre = nombre;
}
```
<br>

---

### ¿Qué significa this?

Observa esta línea:

```java
this.nombre = nombre;
```

Aquí existen dos variables con el mismo nombre.

El parámetro:

```text
nombre
```

contiene el valor recibido.

Mientras que:

```java
this.nombre
```
se refiere al atributo del objeto.

Por eso usamos `this` para diferenciar ambos elementos.

<br>

---

### Uso del setter

```java
p.setNombre("Cuaderno");
```

Ahora el atributo cambia de forma controlada.

<br>

---

### Agregar validaciones

La gran ventaja de los setters es que permiten validar información.

**Por ejemplo:**

```java
public void setPrecio(double precio) {

    if (precio >= 0) {
        this.precio = precio;
    } else {
        System.out.println("Error: el precio no puede ser negativo.");
    }

}
```

Ahora el programa evita guardar datos incorrectos.

<br>

---

### Ejemplo completo

```java
class Producto {

    private String nombre;
    private double precio;

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {

        if (precio >= 0) {
            this.precio = precio;
        }

    }

}
```

**Uso:**

```java
Producto p = new Producto();

p.setNombre("Cuaderno");
p.setPrecio(5.50);

System.out.println(p.getNombre());
System.out.println(p.getPrecio());
```

**Resultado:**

```text
Cuaderno
5.5
```

<br>

---

### Error común de principiantes

Muchos estudiantes creen que encapsular significa ocultar los datos para siempre.

No es así.

Los datos siguen siendo accesibles.

La diferencia es que ahora se accede mediante getters y setters.

**Incorrecto:**

```java
p.nombre = "Cuaderno";
```

**Correcto:**

```java
p.setNombre("Cuaderno");
```

<br>

---

### Práctica (1 min)

🏆 **Reto 7: Sistema de productos**

Realiza las siguientes actividades:

**Parte 1: Crear la clase**

Crea una clase llamada:

```text
Producto
```

Con los atributos privados:

```java
private String nombre;
private double precio;
```

<br>

**Parte 2: Crear getters y setters**

Implementa:

```java
getNombre()
getPrecio()
setNombre()
setPrecio()
```
<br>

**Parte 3: Validar precios**

Modifica el setter de precio para que solo acepte valores mayores o iguales a cero.

Si el valor es negativo, muestra:

```text
Error: el precio no puede ser negativo.
```

<br>

**Parte 4: Probar la clase**

Desde el `main`:

1. Crea un producto.
2. Asigna nombre y precio usando setters.
3. Muestra la información usando getters.

<br>

---

## Cierre (30 seg)

¡Excelente trabajo!

Hoy aprendiste uno de los principios fundamentales de la Programación Orientada a Objetos: el encapsulamiento.

Ahora sabes que:

- `private` protege los atributos.

- Los getters permiten leer información.

- Los setters permiten modificar información de forma controlada.

- Las validaciones ayudan a evitar datos incorrectos.

Estas técnicas son utilizadas en prácticamente todas las aplicaciones profesionales desarrolladas en Java.

En la siguiente lección aprenderemos a almacenar múltiples datos utilizando arrays.

¡Nos vemos en la próxima clase!

<br>

---
 
> **Equipo Los 5 Suyos** · Universidad Peruana de Ciencias Aplicadas  
> Ingeniería de Software · 1ASI0729 Desarrollo de Aplicaciones Open Source · 202610