# Lección 3 de 5 — Métodos, arrays y textos

> **Duración objetivo:** 12 minutos
> **Editor recomendado:** OnlineGDB (lenguaje: Java). Usen el mismo editor en las 5 lecciones.
> **Recordatorio del enunciado:** el video NO debe mostrar nombres, caras, logos ni marca del equipo. Solo pantalla + narración en off + texto en pantalla.

---

## 1. Objetivos de aprendizaje

Al terminar esta lección, el estudiante podrá:

1. Crear métodos propios para no repetir código.
2. Enviar datos a un método con parámetros y recibir un resultado con `return`.
3. Guardar varios datos en un array y recorrerlo con `for` y `for-each`.
4. Usar métodos útiles de `String`: `length()`, `toUpperCase()`, `toLowerCase()`, `charAt()`, `contains()` y `equals()`.

## 2. Preparación antes de grabar

- OnlineGDB con **Java** seleccionado y letra a 18–20 px.
- Esta lección no usa `Scanner`, así que todos los ejemplos se ejecutan directo con **Run**.
- Sobre `static`: en esta lección todos los métodos llevan `static`. No se explica a fondo; se promete que en la lección 4 tendrá sentido.

## 3. Archivos para el repositorio

| Ruta en el repositorio | Contenido |
|---|---|
| `starter-files/lesson-3/Main.java` | Código inicial (sección 4.1) |
| `completed-examples/lesson-3/Main.java` | Ejemplo terminado (sección 4.6) |

---

## 4. Código completo

### 4.1 Código inicial (starter file): el problema de repetir

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("************************");
        System.out.println("  Bienvenida al juego");
        System.out.println("************************");

        System.out.println("Nivel 1 completado");

        System.out.println("************************");
        System.out.println("  Bienvenida al juego");
        System.out.println("************************");

        System.out.println("Nivel 2 completado");
    }
}
```

### 4.2 Primer método y método con parámetros

```java
public class Main {

    // Método sin parámetros: siempre hace lo mismo
    static void showBanner() {
        System.out.println("************************");
        System.out.println("  Bienvenida al juego");
        System.out.println("************************");
    }

    // Método con parámetros: recibe datos para trabajar
    static void greet(String name, int level) {
        System.out.println("¡Hola, " + name + "! Estás en el nivel " + level);
    }

    public static void main(String[] args) {
        showBanner();
        greet("Lucía", 1);

        showBanner();
        greet("Mateo", 2);
    }
}
```

### 4.3 Métodos que devuelven un resultado (return)

```java
public class Main {

    static int add(int a, int b) {
        return a + b;
    }

    static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        int result = add(8, 5);
        System.out.println("8 + 5 = " + result);                         // 13

        System.out.println("30 °C = " + celsiusToFahrenheit(30) + " °F");  // 86.0
        System.out.println("¿7 es par? " + isEven(7));                    // false
        System.out.println("¿10 es par? " + isEven(10));                  // true
    }
}
```

### 4.4 Arrays: listas de datos

```java
public class Main {
    public static void main(String[] args) {
        String[] foods = {"ceviche", "lomo saltado", "papa rellena", "anticuchos"};

        System.out.println("Primera comida: " + foods[0]);   // ceviche
        System.out.println("Tercera comida: " + foods[2]);   // papa rellena
        System.out.println("Cantidad: " + foods.length);     // 4

        foods[3] = "ají de gallina";   // cambiamos el último elemento

        // Recorrer con for clásico (cuando necesitas la posición)
        for (int i = 0; i < foods.length; i++) {
            System.out.println((i + 1) + ". " + foods[i]);
        }

        // Recorrer con for-each (cuando solo necesitas cada elemento)
        int[] scores = {120, 85, 240, 60};
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        System.out.println("Puntaje total: " + total);   // 505
    }
}
```

### 4.5 Textos (String) y sus métodos

```java
public class Main {
    public static void main(String[] args) {
        String name = "Lucía Torres";

        System.out.println("Letras (con espacio): " + name.length());   // 12
        System.out.println("En mayúsculas: " + name.toUpperCase());     // LUCÍA TORRES
        System.out.println("En minúsculas: " + name.toLowerCase());     // lucía torres
        System.out.println("Primera letra: " + name.charAt(0));         // L
        System.out.println("¿Contiene 'Torres'? " + name.contains("Torres"));  // true

        // Para comparar textos se usa equals, NO ==
        String password = "gato123";
        String attempt = "gato123";
        System.out.println("¿Contraseña correcta? " + password.equals(attempt));  // true
    }
}
```

### 4.6 Ejemplo terminado (completed example): tablero de puntajes

```java
public class Main {

    // Devuelve el promedio de los puntajes
    static double average(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;
    }

    // Devuelve la posición del puntaje más alto
    static int indexOfHighest(int[] scores) {
        int bestIndex = 0;
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > scores[bestIndex]) {
                bestIndex = i;
            }
        }
        return bestIndex;
    }

    // Crea un nombre de usuario: nombre en minúsculas, sin espacios, + número
    static String createUsername(String name, int number) {
        return name.toLowerCase().replace(" ", "") + number;
    }

    // Muestra una barra de estrellas proporcional al puntaje (1 estrella cada 20 puntos)
    static void printBar(String player, int score) {
        String bar = "";
        for (int i = 0; i < score / 20; i++) {
            bar += "★";
        }
        System.out.println(player + " | " + bar + " " + score);
    }

    public static void main(String[] args) {
        String[] players = {"Lucía Torres", "Mateo Ruiz", "Ana Quispe", "Diego Salas"};
        int[] scores = {120, 85, 240, 60};

        System.out.println("===== TABLERO DE PUNTAJES =====");
        for (int i = 0; i < players.length; i++) {
            String username = createUsername(players[i], i + 1);
            printBar(username, scores[i]);
        }

        int best = indexOfHighest(scores);
        System.out.println("-------------------------------");
        System.out.println("Promedio: " + average(scores));
        System.out.println("Ganador: " + players[best].toUpperCase()
                + " con " + scores[best] + " puntos 🏆");
    }
}
```

**Salida esperada:**

```
===== TABLERO DE PUNTAJES =====
lucíatorres1 | ★★★★★★ 120
mateoruiz2 | ★★★★ 85
anaquispe3 | ★★★★★★★★★★★★ 240
diegosalas4 | ★★★ 60
-------------------------------
Promedio: 126.25
Ganador: ANA QUISPE con 240 puntos 🏆
```

---

## 5. Guion completo

> Formato: **En pantalla** = lo que se ve y el texto/anotación que se agrega en edición. **Narración** = voz en off, leída tal cual.

### Escena 1 — Bienvenida (0:00 – 0:35)

**En pantalla:** Título "Lección 3: Métodos, arrays y textos". Mini repaso: "Lección 2 → Scanner, if/else, for, while".

**Narración:**
"¡Hola otra vez! Ya sabes pedir datos, tomar decisiones y repetir tareas. Hoy vas a aprender tres herramientas que usan todos los programadores: los métodos, para ordenar tu código en bloques reutilizables; los arrays, para guardar listas de datos; y los métodos de texto, para trabajar con palabras."

### Escena 2 — El problema de repetir (0:35 – 1:25)

**En pantalla:** Mostrar el código 4.1. Resaltar en rojo los dos bloques iguales de asteriscos. Anotación: "Código repetido = más errores".

**Narración:**
"Mira este programa. Muestra un letrero de bienvenida, luego un mensaje, y vuelve a mostrar el mismo letrero. Ese letrero está escrito dos veces. Ahora imagina que el juego tiene cincuenta niveles y quieres cambiar una palabra del letrero: tendrías que cambiarla cincuenta veces. Seguro te olvidarías de alguna. Los métodos resuelven justo este problema."

### Escena 3 — Crear un método (1:25 – 3:15)

**En pantalla:** Transformar el código 4.1 en el código 4.2 en vivo: cortar el letrero, crear `showBanner()`, reemplazar con llamadas. Luego agregar `greet`. Resaltar las partes: `static void` (anotación "no devuelve nada"), nombre del método, paréntesis con parámetros. Flecha animada desde `greet("Lucía", 1)` hacia los parámetros `name` y `level`.

**Narración:**
"Un método es un bloque de código con nombre que puedes usar todas las veces que quieras. Es como una receta: la escribes una vez y luego solo dices 'prepara la receta'.
Creamos el método fuera del `main`, pero dentro de la clase. Escribimos `static void`, luego el nombre, `showBanner`, paréntesis y llaves. Adentro ponemos el letrero. La palabra `void` significa 'vacío': este método hace algo, pero no devuelve ningún resultado. Y `static`, por ahora, solo escríbelo; en la próxima lección vas a entender para qué sirve.
Ahora, en el `main`, en lugar de repetir el letrero, escribimos `showBanner()`. A esto se le llama llamar al método. ¡Si quieres cambiar el letrero, lo cambias en un solo lugar!
Los métodos también pueden recibir datos. Mira `greet`: entre paréntesis dice `String name, int level`. Esos son los parámetros, los datos que el método necesita para trabajar. Cuando lo llamamos con 'Lucía' y 1, `name` toma el valor 'Lucía' y `level` toma el valor 1. Si lo llamamos con 'Mateo' y 2, cambian los valores, pero el código del método es el mismo."

### Escena 4 — Métodos con return (3:15 – 4:50)

**En pantalla:** Escribir el código 4.3. Animación: `add(8, 5)` → caja del método → sale "13" volando hacia `result`. Resaltar `int` antes del nombre con anotación "tipo del resultado".

**Narración:**
"Algunos métodos calculan algo y nos devuelven la respuesta. Para eso, en lugar de `void`, escribimos el tipo de dato que vamos a devolver, y dentro usamos la palabra `return`.
El método `add` recibe dos enteros y devuelve su suma. Cuando escribimos `add(8, 5)`, el método calcula 13 y lo devuelve, y ese 13 se guarda en la variable `result`.
Lo mismo con `celsiusToFahrenheit`: le das grados Celsius y te devuelve Fahrenheit. Y `isEven` devuelve un `boolean`: verdadero si el número es par. ¿Te acuerdas del módulo de la lección 1? Si un número dividido entre 2 no deja residuo, es par.
Un consejo: dale a cada método un nombre que diga lo que hace. Así tu código se lee casi como una oración."

### Escena 5 — ⏸ Pausa de práctica 1 (4:50 – 5:10)

**En pantalla:** Tarjeta "⏸ ¡PAUSA! Crea un método `rectangleArea(double base, double height)` que devuelva el área de un rectángulo y úsalo en el main".

**Narración:**
"Tu turno. Pausa y crea un método llamado `rectangleArea` que reciba la base y la altura, y devuelva el área. Recuerda: área es base por altura. Luego llámalo desde el `main` y muestra el resultado."

### Escena 6 — Arrays (5:10 – 7:45)

**En pantalla:** Animación de una fila de casilleros numerados 0, 1, 2, 3 con las comidas adentro. Escribir el código 4.4. Resaltar `foods[0]` con anotación "¡Se empieza a contar desde 0!". Mostrar la tarjeta "for → necesito la posición · for-each → solo necesito el elemento".

**Narración:**
"Ahora imagina que quieres guardar tus cuatro comidas favoritas. Podrías crear cuatro variables, pero si fueran cien, sería un desastre. Para eso existen los arrays: una sola variable que guarda una lista de datos del mismo tipo.
Se crea poniendo corchetes después del tipo, `String[]`, y los valores van entre llaves, separados por comas.
Piensa en un array como una fila de casilleros. Cada casillero tiene un número llamado índice. Y aquí viene algo muy importante: en Java se empieza a contar desde cero. Así que el primer elemento es `foods[0]`, ceviche, y el tercero es `foods[2]`, papa rellena.
Con `.length` sabemos cuántos elementos tiene: 4. Y podemos cambiar un casillero así: `foods[3] = "ají de gallina"`.
Para recorrer el array usamos el `for` que ya conoces: el contador empieza en 0 y llega hasta antes de `length`. Fíjate que es 'menor que', no 'menor o igual'. Como contamos desde cero, el último casillero es el 3, no el 4.
Hay otra forma más corta, el for-each: `for (int score : scores)` se lee 'por cada puntaje dentro de puntajes'. Es perfecto cuando no necesitas la posición, como para sumar todos los puntajes."

### Escena 7 — Textos y sus métodos (7:45 – 9:40)

**En pantalla:** Escribir el código 4.5. Mostrar cada resultado al lado de su línea. Resaltar `.equals` en verde y escribir al costado `==` tachado en rojo con anotación "Para textos: equals".

**Narración:**
"Los textos, o `String`, traen sus propios métodos listos para usar. Se llaman poniendo un punto después de la variable.
`length` te dice cuántos caracteres tiene, contando los espacios: 12. `toUpperCase` lo pasa todo a mayúsculas y `toLowerCase` a minúsculas. `charAt(0)` te da el carácter en la posición cero, la L; sí, los textos también cuentan desde cero. Y `contains` te dice si un texto contiene otro.
Ahora, algo muy importante. Para saber si dos textos son iguales, por ejemplo al revisar una contraseña, no uses el doble igual. Usa `equals`. El doble igual funciona con números, pero con textos puede darte resultados incorrectos aunque se vean iguales. Recuérdalo: para textos, siempre `equals`."

### Escena 8 — Ejemplo completo: tablero de puntajes (9:40 – 11:20)

**En pantalla:** Mostrar el código 4.6 ya escrito. Recorrer cada método con un recuadro de color y una etiqueta: `average`, `indexOfHighest`, `createUsername`, `printBar`. Luego el `main`. Ejecutar y mostrar la salida.

**Narración:**
"Juntemos todo en un tablero de puntajes para un juego. Tenemos dos arrays: uno con los nombres de los jugadores y otro con sus puntajes, en el mismo orden.
Creamos cuatro métodos, cada uno con una sola tarea. `average` recorre los puntajes y devuelve el promedio; ponemos `(double)` antes de la división para obtener decimales, ¿recuerdas la división entera? `indexOfHighest` busca la posición del puntaje más alto: empieza suponiendo que el mejor es el primero y, si encuentra uno mayor, actualiza la posición. `createUsername` usa métodos de texto para crear un nombre de usuario: todo en minúsculas, sin espacios y con un número. Y `printBar` dibuja una barra de estrellas según el puntaje.
El `main` queda cortito y fácil de leer, porque cada tarea está en su propio método. Ejecutamos… ¡y aparece el tablero con el ganador!"

### Escena 9 — ⏸ Reto y cierre (11:20 – 12:00)

**En pantalla:** Tarjeta "⏸ RETO: crea un método `countVowels(String text)` que devuelva cuántas vocales tiene un texto". Resumen: "Métodos = recetas reutilizables · return = devolver resultado · arrays cuentan desde 0 · textos se comparan con equals". Texto final: "Siguiente: Lección 4 — Clases y objetos".

**Narración:**
"Reto final: crea un método llamado `countVowels` que reciba un texto y devuelva cuántas vocales tiene. Pista: recorre el texto con un `for` y usa `charAt`.
Repasemos: los métodos son recetas reutilizables, `return` devuelve un resultado, los arrays guardan listas y cuentan desde cero, y los textos se comparan con `equals`. En la próxima lección viene lo más interesante: vas a crear tus propios tipos de datos con clases y objetos. ¡Nos vemos!"

---

## 6. Soluciones de las pausas (para `completed-examples/lesson-3/`)

**Pausa 1 — Área de un rectángulo:**

```java
public class Main {

    static double rectangleArea(double base, double height) {
        return base * height;
    }

    public static void main(String[] args) {
        double area = rectangleArea(4.5, 2);
        System.out.println("El área es: " + area);   // 9.0
    }
}
```

**Reto final — Contar vocales:**

```java
public class Main {

    static int countVowels(String text) {
        String vowels = "aeiouáéíóú";
        String lowerText = text.toLowerCase();
        int count = 0;

        for (int i = 0; i < lowerText.length(); i++) {
            char letter = lowerText.charAt(i);
            if (vowels.indexOf(letter) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countVowels("Programar es genial"));   // 7
    }
}
```

---

## 7. Descripción para YouTube (copiar y pegar)

```
Lección 3 de 5 — Métodos, arrays y textos en Java

Aprende a ordenar tu código con métodos, guardar listas de datos con arrays y trabajar con textos. Terminamos creando un tablero de puntajes para un juego. Sin instalar nada: solo tu navegador.

▶ Practica aquí (código listo para ejecutar): [ENLACE_ONLINEGDB_LECCION_3]
▶ Código fuente del curso: [ENLACE_REPOSITORIO_GITHUB]

Contenido:
0:00 Bienvenida
0:35 El problema de repetir código
1:25 Crear un método
3:15 Métodos con return
5:10 Arrays
7:45 Textos y sus métodos
9:40 Tablero de puntajes
11:20 Reto final

Lección anterior: [ENLACE_LECCION_2]
Siguiente lección: [ENLACE_LECCION_4]
```

## 8. Checklist antes de subir

- [ ] Ningún nombre, rostro, logo ni marca del equipo en el video ni en el código.
- [ ] Se remarcó que los arrays y los textos cuentan desde 0.
- [ ] Letra del editor legible en 1080p.
- [ ] Narración sin palabras penalizadas: no decir "testear", "librería", "requerimiento", "aplicativo", "apartado", "metodología".
- [ ] Video subido como **No listado**.
- [ ] Enlace al editor con el código precargado en la descripción.
