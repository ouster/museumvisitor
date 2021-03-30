package museumvisitor

enum class Commands(val shortcut: Char) {
    LEFT('L'),
    RIGHT('R'),
    MOVE('M'),
    PLACE('P'),
    REPORT('R'),
    QUIT('Q')
}