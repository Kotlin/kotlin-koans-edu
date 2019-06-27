// Return the most expensive product among all delivered products.
// Check Order.isDelivered flag.
fun findMostExpensiveProductBy(customer: Customer): Product? {
    return customer
            .orders
            .asSequence()
            .filter(Order::isDelivered)
            .flatMap { it.products.asSequence() }
            .maxBy(Product::price)
}

// Count the amount of times the given product was ordered.
// Note that a customer may order the same product for several times.
fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int {
    return customers
            .asSequence()
            .flatMap(Customer::getOrderedProducts)
            .count { it == product }
}

fun Customer.getOrderedProducts(): Sequence<Product> =
        orders.flatMap(Order::products).asSequence()
