// Rewrite each of the following functions as anonymous functions:

object LessonFifteen {

    // 1.
    def multiply(s: String, n: Int): Int = s.length * n
    val multiply = (s: Int, n: Int) => s.length * n

    // 2.
    def toDouble(n: Int): Double = n.toDouble
    val toDouble = (n: Int) => n.toDouble

    // 3.
    def concat(s1: String, s2: String): String = s1 + s2
    val concat = (s1: String, s2: String) => s1 + s2

    // 4.
    def invertseConcat(s1: String, s2: String): String = s2 + s1
    val inverseConcat = (s1: String, s2: String) => s2 + s1

    //5.
    def myLongFunc(s: String): String = {
        val length = s.length
        s.reverse * length
    }
    val myLongFunc = { s: String =>
        val length = s.length
        s.reverse * length
    }
}