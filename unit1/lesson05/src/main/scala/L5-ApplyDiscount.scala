// Write a program to compute the discount for a given price as follows:
// 15% discount if the price is at least $100, 10% discount if the price is at least $50 but less than $100, 0% discount if the price is less than $50

object LessonFive {
    def applyDiscount(price: Double): Double = {
        val discount = {
            if (price >= 100) 0.15
            else if (price >= 50) 10
            else 0
        }

        price * (1 - discount)
    }
}