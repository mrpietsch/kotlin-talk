class Infix {

    data class Number(val value : Int) {

        infix fun plus(b: Number): Number {
            return Number(this.value + b.value)
        }

    }

    fun main() {
        Number(21) plus Number(12)

        Number(21).plus(Number(12))  // still possible
    }

}
