// Build a map from the customer name to the customer
fun Shop.nameToCustomerMap(): Map<String, Customer> =
        customers.associateBy(Customer::name)

// Build a map from the customer to their city
fun Shop.customerToCityMap(): Map<Customer, City> =
        customers.associateWith(Customer::city)

// Build a map from the customer name to their city
fun Shop.customerNameToCityMap(): Map<String, City> =
        customers.associate { it.name to it.city }