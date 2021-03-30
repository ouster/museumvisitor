package museumvisitor

class Report : Command(Commands.REPORT) {

    override fun execute(museumVisitor: MuseumVisitor): String {
        checkIfPlaced(museumVisitor)

        return "Museum Visitor is at (${museumVisitor.position?.x},${museumVisitor.position?.y}) Facing: ${museumVisitor.position?.facing}"
    }
}