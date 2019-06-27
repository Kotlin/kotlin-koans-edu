// Return the sum of prices of all products that the given customer has ordered.
// Note that the customer may order the same product for several times.
fun moneySpentBy(customer: Customer): Double =
        customer.orders.flatMap { it.products }.sumByDouble { it.price }
