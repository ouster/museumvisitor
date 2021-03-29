package museumvisitor

abstract class Command {
    abstract val commandName: String

    open fun execute(museumVisitor: MuseumVisitor): String = "not implemented"

    fun checkIfPlaced(museumVisitor: MuseumVisitor) {
        if (museumVisitor.position == null) {
            throw NotPlacedException()
        }
    }
}

