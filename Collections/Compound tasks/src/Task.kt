// Return the most expensive product among all delivered products.
// Check Order.isDelivered flag.
fun findMostExpensiveProductBy(customer: Customer): Product? {
    return customer
            .orders
            .filter(Order::isDelivered)
            .flatMap(Order::products)
            .maxBy(Product::price)
}

// Count the amount of times the given product was ordered.
// Note that a customer may order the same product for several times.
fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int {
    return customers
            .flatMap(Customer::getOrderedProducts)
            .count { it == product }
}

fun Customer.getOrderedProducts(): List<Product> =
        orders.flatMap(Order::products)
