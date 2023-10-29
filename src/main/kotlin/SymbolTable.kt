import java.lang.Exception

class SymbolTable(private var size: Int) {
    private val theTable = HashTable<String>(size)

    public fun addSymbol(key: String): Pair<Int, Int> {
        return theTable.addKey(key)
    }

    public fun isSymbol(key: String): Boolean {
        return theTable.getPos(key)!=null
    }

    public fun getSymbolPosition(key: String): Pair<Int, Int> {
        val pos = theTable.getPos(key)
        if (pos != null){
            return pos
        }
        else throw Exception("Symbol does not exist!")
    }
}