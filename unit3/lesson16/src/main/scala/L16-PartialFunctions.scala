// Implement a function to parse a string to an integer. If you cannot parse it, return its length instead.

object LessonSixteen {
    def toIntTry(str: String): Int = try {
        str.toInt
        } catch {
            case e: Exception => str.length
        }
}

