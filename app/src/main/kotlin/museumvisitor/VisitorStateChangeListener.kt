package museumvisitor

class VisitorStateChangeListener: StateChangeListener {

    var output: String = ""

    override fun onResult(result: String) {
        output = result
    }

}