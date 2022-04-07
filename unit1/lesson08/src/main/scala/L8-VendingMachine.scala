// Implement a class that represents a vending machine that sells chocolate bars for $1.50 and granola bards for $1.00
// A customer can buy an item by selecting a specific product and inserting money into the vending machine. 
// Once the vending machine receives the request, it should check that the product is available and the given money is enough; 
// if all the checks are successful, it should collect the money and release the product.

class VendingMachine {
    var chocolateBar = 0
    var granolaBar = 0
    var totalMoney = 0.0

    def buy(product: String, money: Double): String = 
        if (!isProductAvailable(product))
            s"Sorry, $product is not available"
        else if (!isMoneyEnough(product, money))
            "Please, insert more money"
        else completeRequest(product, money)

    def isProductAvailable(product: String): Boolean = 
        if (product == "chocolate") chocolateBar > 0
        else if (product == "granola") granolaBar > 0
        else false
    
    def isMoneyEnough(product: String, money: Double): Boolean = {
        val cost = if (product == "chocolate") 1.5 else 1
        money >= cost
    }
    
    def completeRequest(product: String, money: Double): String = {
        collectMoney(money)
        releaseProduct(product)
        s"There you go! Have a $product bar"
    }
    
    def collectMoney(money: Double) = 
        totalMoney += money

    def releaseProduct(product: String) = {
        if (product == "chocolate") chocolateBar -= 1
        else if (product == "granola") granolaBar -= 1
    }
}