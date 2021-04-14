/**
 * Определить пройдет ли кирпич с данными сторонами(a, b, c) 
 * в прямоугольное отверстие со сторонами r s.
 * Стороны вставляются параллельно.
 * Считать что совпадения длин достаточно для прохождения. 
 * Например: Кирпич 4х4х4 пройдет в отверстие 4х4.
 * Вернуть true, если кирпич пройдет.
 */

fun brickPasses(a: Int, b: Int, c: Int, r: Int, s: Int): Boolean = when {
    ((a <= r && b <= s) || (b <= r && a <= s)) -> true
    ((b <= r && c <= s) || (c <= r && b <= s)) -> true
    ((c <= r && a <= s) || (a <= r && c <= s)) -> true
    else -> false
}
/**
 * Стороны кирпича
 */
const val BRICK_SIDE_A = 2
const val BRICK_SIDE_B = 5
const val BRICK_SIDE_C = 4
/**
 * Стороны отверстия
 */
const val HOLE_SIDE_A = 3
const val HOLE_SIDE_B = 5
/**
 * Строки
 */
const val BREAK_TRUE = "Кирпич пройдёт"
const val BREAK_FALSE = "Кирпич не пройдёт"

fun main() {
    var check = brickPasses(BRICK_SIDE_A, BRICK_SIDE_B, BRICK_SIDE_C, HOLE_SIDE_A, HOLE_SIDE_B)
    when (check) {
        true  -> println(BREAK_TRUE)
        false ->println(BREAK_FALSE)
    }
}
