// Define a class Employee with three values: a name of type String, an age of Int, and a salary of type Double.
// The name should be publicly accessible, age should be visible only from its class and subclasses, and salary should be private.

class Employee {
    val name: String
    protected val age: Int
    private val salary: Double
}