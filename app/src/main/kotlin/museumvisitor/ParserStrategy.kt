package museumvisitor

class ParserStrategy {

    fun parse(input: String): Command {
        try {
            val parts = input.trim().toUpperCase().split(" ", ",").toList()
            return when (enumValueOf<Commands>(parts[0])) {
                Commands.REPORT -> Report()
                Commands.PLACE -> parsePlace(parts.subList(1, parts.size))
                Commands.MOVE -> Move()
                Commands.LEFT -> Left()
                Commands.RIGHT -> Right()
            }
        } catch (e: Exception) {
            throw CommandParseException()
        }
    }
}

private fun parsePlace(parts: List<String>): Place {
    if (parts.size == 3) {
        val x = parts[0].toInt()
        val y = parts[1].toInt()
        val f = enumValueOf<Facing>(parts[2])
        return Place(x, y, f)
    } else {
        throw CommandParseException()
    }
}
