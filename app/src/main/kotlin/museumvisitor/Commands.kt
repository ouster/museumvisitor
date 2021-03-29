package museumvisitor

enum class Commands(val l: Char) {
    LEFT('L'),
    RIGHT('R'),
    MOVE('M'),
    PLACE('P'),
    REPORT('R')
}