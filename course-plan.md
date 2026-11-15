# Fundamentos de Java para Principiantes

## Resumen del Curso

Este curso introduce a estudiantes de secundaria a los fundamentos de la programación con Java, desde las variables hasta la programación orientada a objetos. En cada lección construyes un pequeño programa de tu día a día: tu tarjeta de perfil, un tablero de puntajes de un juego, una mascota virtual y un registro de notas de tu salón. **¡No requiere descargas!** Solo abre tu navegador web.

**Duración total**: ~42 minutos (4 lecciones publicadas)  
**Público objetivo**: Estudiantes de 12 a 17 años sin experiencia en programación  
**Prerrequisitos**: Ninguno  
**Herramientas necesarias**: **¡Solo tu navegador web!** (Chrome, Firefox, Safari, Edge) y el editor gratuito [OnlineGDB](https://www.onlinegdb.com/online_java_compiler)

**📂 Repositorio de Código Fuente**: [https://github.com/6Bits-Startup/java-fundamentals-course-5bits](https://github.com/6Bits-Startup/java-fundamentals-course-5bits)

## Secuencia de la Lección

### Lección 1: ¿Qué es programar? Variables, tipos de datos y operadores (11 minutos)
- **Descripción**: Escribe tu primer programa en Java, guarda datos en variables y haz cálculos con ellos para armar tu tarjeta de perfil.
- **Enlace**: [Ver la lección](https://youtu.be/jQflPtEN0b8)
- **Conclusiones clave**: Una variable es una cajita con nombre que guarda un dato; usa `String`, `int`, `double`, `boolean` y `char`; opera con `+ - * / %`; compara con `> == !=` y el resultado siempre es `true` o `false`; atajos como `lives++` y `lives -= 2`.
- **Empieza a programar**: [Abrir OnlineGDB - Tarjeta de perfil](https://onlinegdb.com/IVhhe61dc) 👈 **¡No es necesario registrarse!**

### Lección 2: Entrada de datos, decisiones y bucles
- **Descripción**: Pide datos al usuario, toma decisiones con `if-else` y repite tareas con `for` y `while`.
- **Enlace**: Video pendiente de publicación.

### Lección 3: Métodos, arrays y textos (8 minutos)
- **Descripción**: Crea código reutilizable con métodos, guarda varios datos en un arreglo y trabaja con textos para construir el tablero de puntajes de un juego.
- **Enlace**: [Ver la lección](https://youtu.be/z_QKjcvLA3U)
- **Conclusiones clave**: Un método agrupa instrucciones con un nombre (`static void showBanner()`); los parámetros le pasan datos y `return` devuelve un resultado; un arreglo guarda varios valores (`String[] foods`) y se recorre con `for` o for-each; los textos tienen métodos como `length()`, `toUpperCase()` y `charAt()`; los textos se comparan con `equals`, nunca con `==`.
- **Práctica**: [Clic para programar - Tablero de puntajes](https://onlinegdb.com/06EEri0thv) 👈 **¡Inicio inmediato!**

### Lección 4: Clases y objetos: tu mascota virtual (9 minutos)
- **Descripción**: Crea tu propia clase `Pet` con atributos y comportamientos, crea varias mascotas con `new` y protégelas con encapsulación.
- **Enlace**: [Ver la lección](https://youtu.be/8NuUZLwPUIo)
- **Conclusiones clave**: Clase = molde, objeto = lo que creas con `new`; el constructor da los valores iniciales y `this` se refiere a "este objeto"; `private` protege los atributos; los getters permiten leerlos y los setters cambiarlos con reglas (la energía siempre queda entre 0 y 100).
- **Práctica**: [Haz clic para practicar - Mascota virtual](https://onlinegdb.com/ndjFkQcI4) 👈 **¡No necesitas registrarte!**

### Lección 5: Proyecto final, buenas prácticas y errores comunes (15 minutos)
- **Descripción**: Junta todo lo aprendido en un registro de notas de tu salón que pide datos por teclado con `Scanner`, valida las notas y muestra un reporte. Al final, aprende a reconocer los errores más comunes de quien empieza.
- **Enlace**: [Ver la lección](https://youtu.be/tEvGD6h88Ys)
- **Conclusiones clave**: `Scanner` lee datos del teclado (`nextInt`, `nextDouble`, `nextLine`); después de `nextInt` hay que limpiar el Enter con `nextLine()`; usa constantes `static final` para los valores fijos; valida los datos con `while`; errores comunes: escribir `system` en minúscula, comparar textos con `==` en lugar de `equals` y olvidar limpiar el Enter, que deja vacío el siguiente `nextLine()`.
- **Proyecto final**: [Crea tu registro de estudiantes](https://onlinegdb.com/jMpWM69--) 👈 **¡Guarda y comparte!**

## Recursos adicionales

- **Código fuente completo**: [Repositorio de GitHub](https://github.com/6Bits-Startup/java-fundamentals-course-5bits)
- **Todas las actividades prácticas**:

| Número de lección | Actividad | Empezar a programar | Solución |
|:---|:---|:---|:---|
| 1 | Tarjeta de perfil | [OnlineGDB](https://onlinegdb.com/IVhhe61dc) | [Ver solución](https://onlinegdb.com/M0bPbyLmyx) |
| 3 | Tablero de puntajes | [OnlineGDB](https://onlinegdb.com/06EEri0thv) | [Ver solución](https://onlinegdb.com/Wqc4Csnl9) |
| 4 | Mascota virtual | [OnlineGDB](https://onlinegdb.com/ndjFkQcI4) | [Ver solución](https://onlinegdb.com/gdszCPg_2z) |
| 5 | Registro de estudiantes | [OnlineGDB](https://onlinegdb.com/jMpWM69--) | [Ver solución](https://onlinegdb.com/IPUYjmzCM) |

- Documentación oficial de Java: [Tutoriales de Oracle](https://docs.oracle.com/javase/tutorial/)
- Compartir: #JavaBeginners

**¡Gracias por completar el curso!**

---

## 👥 Elaboración

Universidad Peruana de Ciencias Aplicadas  
Carrera de Ingeniería de Software  
Período 202620  
1ASI0729 Desarrollo de Aplicaciones Open Source  
NRC 7742

**Nombre del equipo**: 5Bits  
**Líder del equipo**: Olivares Lao, Gustavo Alonso  
**Integrantes del equipo**:
- Atencio Cristobal, Cielo Valentina — Lección 1
- Cáceres Pizarro, Albino Florencio — Lección 2
- Olivares Lao, Gustavo Alonso — Lección 3, repositorio de código y plan del curso
- Torres Huaman, Alexis Calin — Lección 4
- Quispe Almonacid, Andre Sebastian — Lección 5

**Fecha de entrega**: 15/11/2026
