package museumvisitor

abstract class Command(val command: Commands) {

    open fun execute(museumVisitor: MuseumVisitor): String = "not implemented"

    fun checkIfPlaced(museumVisitor: MuseumVisitor) {
        if (museumVisitor.position == null) {
            throw NotPlacedException()
        }
    }
}

