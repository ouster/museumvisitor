package museumvisitor

class Right() : Command(Commands.RIGHT) {

    override fun execute(museumVisitor: MuseumVisitor): String {

        checkIfPlaced(museumVisitor)

        val newFacing = when (museumVisitor.position?.facing) {
            Facing.NORTH -> {
                Facing.EAST
            }
            Facing.SOUTH -> {
                Facing.WEST
            }
            Facing.EAST -> {
                Facing.SOUTH
            }
            Facing.WEST -> {
                Facing.NORTH
            }
            else -> throw UnsupportedOperationException()
        }

        museumVisitor.position = Position(museumVisitor.position!!.x, museumVisitor.position!!.y, newFacing)
        return "Museum Visitor turned to (${museumVisitor.position?.x},${museumVisitor.position?.y}) Facing: ${museumVisitor.position?.facing}"
    }

}