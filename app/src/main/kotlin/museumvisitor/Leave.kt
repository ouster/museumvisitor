package museumvisitor

class Leave() : Command(Commands.QUIT) {

    override fun execute(museumVisitor: MuseumVisitor): String {

        throw ExitException()

    }

}