package museumvisitor

import kotlin.properties.Delegates

class MuseumVisitor(val table: Table, private val parserStrategy: ParserStrategy, private val commands: List<Command>) {

    var listeners = mutableListOf<VisitorStateChangeListener>()

    var result: String by Delegates.observable<String>("No action") { _, _, newValue ->
        this.listeners.forEach { it.onResult(newValue) }
    }

    var position: Position? = null

    fun action(input: String) {
        result = try {
            val command = parserStrategy.parse(input)

            if (commands.any { it.commandName == command.commandName }) {
                try {
                    command.execute(this)
                } catch (e: NotPlacedException) {
                    "Museum Visitor is not placed"
                }
            } else {
                "I don't support command $input"
            }
        } catch(e: CommandParseException) {
            "command $input not recognised, try place 0,0,north or move or left or right or report"
        } catch(e: DangerException) {
            "Cannot proceed"
        }
    }

}