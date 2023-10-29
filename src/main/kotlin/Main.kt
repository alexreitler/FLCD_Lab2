import java.lang.Exception

fun main(){
    val symbolTable: SymbolTable = SymbolTable(10)
    print("Adding \"a\", position:")
    println(symbolTable.addSymbol("a"))
    print("Adding \"k\", position:")
    println(symbolTable.addSymbol("k"))
    print("Adding \"5\", position:")
    println(symbolTable.addSymbol("5"))
    println("Adding \"a\" again")
    try {
        println(symbolTable.addSymbol("a"))
    }
    catch (e:Exception) {
        println(e)
    }


    print("Check presence of \"a\":")
    println(symbolTable.isSymbol("a"))
    print("Check presence of \"k\":")
    println(symbolTable.isSymbol("k"))
    print("Check presence of \"5\":")
    println(symbolTable.isSymbol("5"))
    print("Check presence of \"c\":")
    println(symbolTable.isSymbol("c"))

    print("Getting position of \"a\":")
    println(symbolTable.getSymbolPosition("a"))
    print("Getting position of \"k\":")
    println(symbolTable.getSymbolPosition("k"))
    print("Getting position of \"5\":")
    println(symbolTable.getSymbolPosition("5"))
    println("Getting position of \"c\":")
    try {
        println(symbolTable.getSymbolPosition("c"))
    }
    catch (e:Exception) {
        println(e)
    }
}
