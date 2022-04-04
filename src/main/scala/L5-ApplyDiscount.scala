// Write a program to compute the discount for a given price as follows:
// 0% discount if the price is less than $50
// 10% discount if the price is at least $50 but less than $100
// 15% discount if the price is at least $100

object Lesson5 {
    def applyDiscount(price: Double): Double = {
        val discount = {
            if (price < 50) 1
            else if (price >= 50 && price < 100) 0.90
            else 0.85
        }

        price * discount
    }
}