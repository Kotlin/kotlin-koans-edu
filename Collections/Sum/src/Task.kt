// Return the sum of prices for all the ordered products by the given customer
fun moneySpentBy(customer: Customer): Double =
        customer.orders.flatMap { it.products }.sumByDouble { it.price }
