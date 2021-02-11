class PropertyExample() {
    var counter = 0
    var propertyWithCounter: Int? = null
        set(v) {
            field = v
            counter++
        }
}
