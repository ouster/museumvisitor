# museum visitor

The application is a simulation of a museum visitor moving around galleries in a museum. 
The galleries are arranged in a 5 x 5 grid.
● There are no other obstructions on the gallery floors.
● The visitor is free to roam around the museum galleries, but must be prevented from crashing into walls.
Any movement that would result in the visitor hitting a wall must be prevented, however further valid
movement commands must still be allowed.

## Building

This is in Kotlin

```
./gradlew clean build
```

This also outputs the test results to screen and to
```
./build/reports/tests/test/index.html
```

## Manual input testing

You can start it on the command line as following:

```
java -jar ./build/libs/museumvisitor-1.0.0-SNAPSHOT-all.jar
```

or

```
./gradlew run

./gradlew run < cmds.txt

```

## Museum Visitor instructions

PLACE X,Y,F
    MOVE
    LEFT
    RIGHT
    REPORT
PLACE will put the visitor on the Museum in position X,Y and facing NORTH, SOUTH, EAST or WEST. 

The origin (0,0) can be considered to be the SOUTH WEST most corner. 

It is required that the first command to the visitor is a PLACE command, after that, any sequence of commands may be issued,
in any order, including another PLACE command. 

The application will discard all commands in the sequence until a valid PLACE command has been executed.
MOVE will move the visitor one unit forward in the direction it is currently facing.
 