// Return a list of customers, sorted in the descending by number of orders they made
fun Shop.getCustomersSortedByOrders(): List<Customer> =
        customers.sortedByDescending { it.orders.size }
