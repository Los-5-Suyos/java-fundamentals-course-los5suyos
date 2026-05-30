# Lección 10 — Buenas Prácticas y Próximos Pasos
 
## Introducción (30 seg)
 
Esta es la última lección del curso. No vamos a introducir código nuevo; en cambio, vamos a hablar de los hábitos que separan a los buenos programadores de los que recién empiezan, y de los recursos que puedes usar para seguir aprendiendo.
 
---
 
## Desarrollo (3.5 min)
 
### 1. Usa nombres descriptivos
 
El código se lee mucho más veces de las que se escribe. Un nombre claro vale más que un comentario.
 
```java
// ❌ Difícil de entender
int x = 15;
double r = x * 1.18;
 
// ✅ Se entiende solo
int precioBase = 15;
double precioConImpuesto = precioBase * 1.18;
```
 
### 2. No repitas código — crea métodos
 
Si copias y pegas el mismo bloque de código dos veces, es momento de convertirlo en un método.
 
```java
// ❌ Código repetido
System.out.println("Nombre: " + estudiante1.getNombre());
System.out.println("Nota: " + estudiante1.getNota());
System.out.println("Nombre: " + estudiante2.getNombre());
System.out.println("Nota: " + estudiante2.getNota());
 
// ✅ Un método que hace el trabajo
public void mostrarInfo() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Nota: " + nota);
}
```
 
### 3. Lee los mensajes de error con calma
 
Los errores no significan que eres malo programando — son pistas. Java siempre te dice en qué línea está el problema y qué tipo de error es.
 
Errores comunes que verás:
- `cannot find symbol` → escribiste mal el nombre de una variable o método
- `incompatible types` → estás mezclando tipos de datos (por ejemplo, guardar un `String` en un `int`)
- `ArrayIndexOutOfBoundsException` → intentaste acceder a un índice que no existe en el array
Cuando veas un error: **lee el mensaje**, **busca la línea indicada**, y si no entiendes, copia el mensaje de error en un buscador web — hay miles de personas que tuvieron el mismo problema.
 
### 4. Practica todos los días, aunque sea 15 minutos
 
La programación es como aprender a tocar un instrumento: la constancia importa más que la intensidad. Escribir código pequeño todos los días te hace progresar más rápido que estudiar muchas horas de golpe una vez a la semana.
 
### ¿Qué aprender después de este curso?
 
Ahora que conoces los fundamentos de Java y la Programación Orientada a Objetos, estos son los siguientes temas naturales:
 
- **Herencia y polimorfismo** — cómo una clase puede "heredar" comportamiento de otra
- **Interfaces** — una forma de definir contratos entre clases
- **Colecciones** (`ArrayList`, `HashMap`) — versiones más flexibles que los arrays
- **Manejo de excepciones** — cómo controlar errores en tiempo de ejecución
### Recursos gratuitos para continuar
 
- **Documentación oficial de Oracle Java**: [docs.oracle.com/en/java](https://docs.oracle.com/en/java/) — la fuente más completa y confiable
- **Codecademy — Learn Java**: [codecademy.com/learn/learn-java](https://www.codecademy.com/learn/learn-java) — lecciones interactivas paso a paso
- **W3Schools Java**: [w3schools.com/java](https://www.w3schools.com/java/) — referencia rápida con ejemplos
- **Replit**: sigue usando [replit.com](https://replit.com) para practicar sin instalar nada
---
 
## Cierre (1 min)
 
Felicitaciones. Empezaste este curso sin saber nada de programación, y ahora puedes crear clases, manejar objetos, trabajar con arrays y aplicar los principios básicos de la Programación Orientada a Objetos. Eso no es poca cosa.
 
La programación es una habilidad que se construye con práctica y paciencia. Cada error que corriges te enseña algo nuevo. Sigue construyendo cosas, aunque sean pequeñas — una calculadora, un juego de adivinanzas, un registro de tareas. Cada proyecto te hace mejor.
 
Gracias por completar el curso. ¡Mucho éxito!

---
 
> **Equipo Los 5 Suyos** · Universidad Peruana de Ciencias Aplicadas  
> Ingeniería de Software · 1ASI0729 Desarrollo de Aplicaciones Open Source · 202610