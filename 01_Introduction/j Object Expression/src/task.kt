import java.util.*

fun getListObjectExpression(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, object { /*TODO()*/ })
    return arrayList
}
