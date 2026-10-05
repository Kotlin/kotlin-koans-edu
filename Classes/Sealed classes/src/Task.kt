fun eval(expr: Expr): Int =
        when (expr) {
            is Num -> TODO()
            is Sum -> TODO()
        }

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr
