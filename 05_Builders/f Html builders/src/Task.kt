fun renderProductTable(): String {
    return html {
        table {
            // TODO() add headers (product, price, popularity

            val products = getProducts()
            for ((index, product) in products.withIndex()) {
                // TODO() add products
            }
        }
    }.toString()
}

fun getTitleColor() = "#b9c9fe"
fun getCellColor(index: Int, column: Int) = if ((index + column) % 2 == 0) "#dce4ff" else "#eff2ff"
