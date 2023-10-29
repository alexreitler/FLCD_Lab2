import java.lang.Exception

class HashTable<T>(private var size: Int) {
    var table: Array<MutableList<T>> = Array(size) {mutableListOf()}

    private fun hashfunc(key: T): Int {
        var hash: Int = 0;
        for (character in key.toString()) hash+=character.code
        return hash % size
    }

    fun getPos(key: T): Pair<Int, Int>? {
        val keyHash = hashfunc(key)
        for(i in 0..<table[keyHash].size){
            if(table[keyHash][i] == key)
                return Pair(keyHash, i)
        }
        return null
    }

    fun addKey(key: T): Pair<Int, Int> {
        if (getPos(key) == null) {
            val keyHash = hashfunc(key)
            table[keyHash].add(key)
            return Pair(keyHash, table[keyHash].size-1)
        }
        else throw Exception("Key already exists!")
    }





}

