# console-program-kotlin

assume command should be in the below order, and must be call `create canvas` first

```zsh
Command 		Description
C w h           Should create a new canvas of width w and height h.
L x1 y1 x2 y2   Should create a new line from (x1,y1) to (x2,y2). Currently only
                horizontal or vertical lines are supported. Horizontal and vertical lines
                will be drawn using the 'x' character.
R x1 y1 x2 y2   Should create a new rectangle, whose upper left corner is (x1,y1) and
                lower right corner is (x2,y2). Horizontal and vertical lines will be drawn
                using the 'x' character.
B x y c         Should fill the entire area connected to (x,y) with "colour" c. The
                behavior of this is the same as that of the "bucket fill" tool in paint
                programs.
Q               Should quit the program.

__Sample I/O__

Below is a sample run of the program. User input is prefixed with enter command:

enter command: C 20 4
----------------------
|                    |
|                    |
|                    |
|                    |
----------------------

enter command: L 1 2 6 2
----------------------
|                    |
|xxxxxx              |
|                    |
|                    |
----------------------

enter command: L 6 3 6 4
----------------------
|                    |
|xxxxxx              |
|     x              |
|     x              |
----------------------

enter command: R 14 1 18 3
----------------------
|             xxxxx  |
|xxxxxx       x   x  |
|     x       xxxxx  |
|     x              |
----------------------

enter command: B 10 3 o
----------------------
|oooooooooooooxxxxxoo|
|xxxxxxooooooox   xoo|
|     xoooooooxxxxxoo|
|     xoooooooooooooo|
----------------------

enter command: Q

```

## Requirement

- install java (1.8+)

open project in intellij idea

## Testing and run

```zsh
// build jar
$ ./gradlew build

// run jar
$ java -jar build/libs/console-program-kotlin-0.1.0.jar

// format kotlin code
$ ./gradlew formatKotlin

// start project
- run Main.kt

// run test case
- run ConsoleProgramTest.kt
```

```zsh
// create canvas
$ C <width> <height>

// draw line (horizontal, vertical)
$ L <x1> <y1> <x2> <y2>

// draw rectangle
$ R <x1> <y1> <x2> <y2>

// fill
$ B <x> <y> <color>

// quit
$ Q
```
