package museumvisitor

class Left() : Command() {

    override val commandName: String
        get() = Commands.LEFT.name

    override fun execute(museumVisitor: MuseumVisitor): String {

        checkIfPlaced(museumVisitor)

        val newFacing = when (museumVisitor.position?.facing) {
            Facing.NORTH -> {
                Facing.WEST
            }
            Facing.SOUTH -> {
                Facing.EAST
            }
            Facing.EAST -> {
                Facing.NORTH
            }
            Facing.WEST -> {
                Facing.SOUTH
            }
            else -> throw UnsupportedOperationException()
        }

        museumVisitor.position = Position(museumVisitor.position!!.x, museumVisitor.position!!.y, newFacing)
        return "Museum Visitor turned to (${museumVisitor.position?.x},${museumVisitor.position?.y}) Facing: ${museumVisitor.position?.facing}"
    }

}