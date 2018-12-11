/**
 * The type checker will try to infer types according to the (direct) type constraints on the statement.
 * It will (lazily) derive the tyoe the barely matches under the current constraints but will not
 * calculate the "greatest common divisor". Also it will not consider constraints on the type which
 * lie ahead (see [inferredTypeToBroad]).
 *
 * Example [workingWithExplicitTypeHint] gives the compiler a direct constraint on the type.
 *
 * Example [workingWithImplicitTypeHint] also gives the compiler a constraint on the type as the method
 * parameter does not accept anything else than `List<Number>`
 */
@Suppress("UNUSED_VARIABLE", "UNUSED_PARAMETER")
class TypeInference {

    fun workingWithExplicitTypeHint() {
        val ints = listOf(1, 2, 3)
        val doubles = listOf(1.0, 2.0, 3.0)

        val numbers: List<Number> = ints + doubles

        doSomethingWithNumbers(numbers)
    }

    fun workingWithImplicitTypeHint() {
        val ints = listOf(1, 2, 3)
        val doubles = listOf(1.0, 2.0, 3.0)

        doSomethingWithNumbers(ints + doubles)
    }

    fun inferredTypeToBroad() {
        val ints = listOf(1, 2, 3)
        val doubles = listOf(1.0, 2.0, 3.0)

        val numbers = ints + doubles        // inferred type is List<Any>
        // doSomethingWithNumbers(numbers)  // COMPILATION ERROR - type mismatch
    }

    private fun doSomethingWithNumbers(numbers: List<Number>) {
        // ...
    }


}