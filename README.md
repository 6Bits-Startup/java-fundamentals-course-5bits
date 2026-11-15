# Fundamentos de Java para Principiantes

Curso en video de 1 hora para estudiantes de secundaria (12 a 17 años) sin experiencia en programación. Cubre los fundamentos de Java y una introducción a la Programación Orientada a Objetos (POO).

**¡No necesitas instalar nada!** Todo se practica desde el navegador.

## Requisitos

- Un navegador web: Chrome, Firefox, Safari o Edge.
- Conexión a internet.

## Cómo practicar con este repositorio

1. Entra a [OnlineGDB](https://www.onlinegdb.com).
2. En **Language** (arriba a la derecha), elige **Java**.
3. Abre en este repositorio el archivo `Main.java` de la lección que quieras.
4. Copia todo su contenido y pégalo en el editor, reemplazando el código que aparece.
5. Presiona **Run**. Si el programa pide datos, haz clic en la consola de abajo, escríbelos y presiona Enter.

> Los números con decimales se escriben con punto: `15.5`, no `15,5`.

## Estructura del repositorio

| Carpeta | Contenido |
|---|---|
| `starter-files/` | Código inicial de cada lección, para empezar a practicar. |
| `completed-examples/` | Ejemplos terminados y soluciones de las pausas y retos. |
| `scripts/` | Guiones de narración de cada lección. |

Cada carpeta tiene una subcarpeta por lección: `lesson-1`, `lesson-2`, ... `lesson-5`.

## Lecciones

| # | Lección | Duración |
|---|---|---|
| 1 | ¿Qué es programar? Variables, tipos de datos y operadores | ~12 min |
| 2 | Entrada de datos, decisiones y bucles | ~12 min |
| 3 | Métodos, arrays y textos | ~12 min |
| 4 | Clases y objetos: tu mascota virtual | ~12 min |
| 5 | Proyecto final, buenas prácticas y errores comunes | ~12 min |

El plan completo del curso, con los enlaces a los videos y a las prácticas, está en `course-plan.md`.

## Flujo de trabajo del repositorio

- `main`: versión publicada del curso.
- `develop`: integración del trabajo en curso.
- `feature/lesson-N`: trabajo de cada lección. Se integra a `develop` mediante pull request.

Los mensajes de commit siguen [Conventional Commits](https://www.conventionalcommits.org/) (`feat:`, `docs:`, `fix:`, `chore:`).
