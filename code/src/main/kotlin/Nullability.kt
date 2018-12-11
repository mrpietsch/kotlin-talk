@Suppress("UNUSED_VARIABLE")
class Nullability {

    fun main() {

        val x = 123
        val y : Int? = 4711

        val incrementedX = x.inc()   // Int
        val incrementedY = y?.inc()  // Int?

        double(x)      // fine

        // double(y)   // WON'T COMPILE - type mismatch: Int != Int?
        double(y ?: 0) // provide a default value inc
        double(y!!)    // overrule nullability check -- may produce NullPointerException
        double(y)      // smart cast to non-nullable as we know `y` might not be null anymore after previous statement
    }

    fun double(i : Int): Int {
        return i * 2
    }

}