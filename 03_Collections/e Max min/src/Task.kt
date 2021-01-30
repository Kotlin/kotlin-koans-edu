// Return a customer who has placed the maximum amount of orders
fun Shop.getCustomerWithMaxOrders(): Customer? =
        customers.maxByOrNull { it.orders.size }

// Return the most expensive product that has been ordered by the given customer
fun getMostExpensiveProductBy(customer: Customer): Product? =
        customer.orders
                .flatMap(Order::products)
                .maxByOrNull(Product::price)
