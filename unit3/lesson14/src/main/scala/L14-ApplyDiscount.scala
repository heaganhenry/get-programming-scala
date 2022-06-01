// Reimplement the discount algorithm from lesson 5 using pattern matching instead of an if-else construct.
// 15% discount if the price is at least $100, 10% discount if the price is at least $50 but less than $100, 0% discount if the price is less than $50

object LessonFourteen {
    def applyDiscount(price: Double): Double = {
        val discount = price match {
            case p if p >= 100 => 0.15
            case p if p >= 50 => 10
            case _ => 0
        }

        price * (1 - discount)
    }
}