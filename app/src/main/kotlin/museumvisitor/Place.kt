package museumvisitor

class Place(private val x: Int = 0, private val y: Int = 0, private val f: Facing = Facing.NORTH) : Command(Commands.PLACE) {

    override fun execute(museumVisitor: MuseumVisitor): String {

        if (x >= museumVisitor.museum.columns ||
                x < 0 ||
                y >= museumVisitor.museum.rows ||
                y < 0) {
            throw DangerException()
        }

        museumVisitor.position = Position(x, y, f)
        return "Museum Visitor placed at: ${x}, ${y}, facing: ${f.name}"
    }

}