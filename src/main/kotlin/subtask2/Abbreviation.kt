package subtask2

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        var result = ""
        a.toUpperCase().forEach { aChar ->
            b.forEach { bChar -> if (aChar == bChar) result += aChar }
        }
        return if (result == b) "YES" else "NO"
    }
}
