package museumvisitor

import java.lang.UnsupportedOperationException

class Move() : Command(Commands.MOVE) {

    override fun execute(museumVisitor: MuseumVisitor): String {

        checkIfPlaced(museumVisitor)

        var deltaX = museumVisitor.position!!.x
        var deltaY = museumVisitor.position!!.y
        var noDanger = false

        when (museumVisitor.position?.facing) {
            Facing.NORTH -> {
                if (deltaY + 1 < museumVisitor.museum.rows) {
                    deltaY++
                    noDanger = true
                }
            }
            Facing.SOUTH -> {
                if (deltaY - 1 >= 0) {
                    deltaY--
                    noDanger = true
                }
            }
            Facing.EAST -> {
                if (deltaX + 1 < museumVisitor.museum.rows) {
                    deltaX++
                    noDanger = true
                }
            }
            Facing.WEST -> {
                if (deltaX - 1 >= 0) {
                    deltaX--
                    noDanger = true
                }
            }
            else -> throw UnsupportedOperationException()
        }

        if (noDanger) {
            museumVisitor.position = Position(deltaX, deltaY, museumVisitor.position!!.facing)
            return "Museum Visitor moved to (${museumVisitor.position?.x},${museumVisitor.position?.y}) Facing: ${museumVisitor.position?.facing}"
        }

        throw DangerException()
    }

}