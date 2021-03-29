package museumvisitor

class Report : Command() {

    override val commandName: String
        get() = Commands.REPORT.name

    override fun execute(museumVisitor: MuseumVisitor): String {
        checkIfPlaced(museumVisitor)

        return "Museum Visitor is at (${museumVisitor.position?.x},${museumVisitor.position?.y}) Facing: ${museumVisitor.position?.facing}"
    }
}