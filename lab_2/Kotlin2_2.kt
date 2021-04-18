/**
 * Треугольник. Проверить является ли треугольник:
 * - остроугольным (вернуть 0)
 * - тупоугольным (вернуть 1)
 * Если треугольник не существует вернуть -1.
 */

import kotlin.math.*

/**
 * Метод переводит радианы в градусы
 */
fun radToDeg(rad: Double): Double {
    var deg: Double = rad * 180 / PI 
	return deg
}

 /**
 * Метод получает угол (в градусах) по трём сторонам
 * с: Double - противолежащая сторона угла
 */
fun getAngle(a: Double, b: Double, c: Double): Double {
    var rad: Double
    rad = acos((b.pow(2) + a.pow(2) - c.pow(2)) / (2 * a * b))
    var deg: Double = radToDeg(rad)
    return deg
}

/**
 * Метод определяет тип треугольника
 */
fun triangleKind(a: Double, b: Double, c: Double): Int? {
    val RIGHT_ANGLE: Double = 90.0
    
    // TODO: Исользовать массив/ структуру
    var angleAlpha: Double = getAngle(b, c, a)
    var angleBetta: Double = getAngle(a, c, b)
    var angleGamma: Double = getAngle(a, b, c)
    
    var angleNull: Boolean = (angleAlpha == 0.0) || (angleBetta == 0.0) || (angleGamma == 0.0)
    var angleNaN: Boolean  = (angleAlpha == Double.NaN) || (angleBetta == Double.NaN) || (angleGamma == Double.NaN)
    
    if ((angleAlpha < RIGHT_ANGLE) && (angleBetta < RIGHT_ANGLE) && (angleGamma < RIGHT_ANGLE)) {
        return 0
    } else if ((angleAlpha > RIGHT_ANGLE) || (angleBetta > RIGHT_ANGLE) || (angleGamma > RIGHT_ANGLE)) {
        return 1
    } else if (angleNull || angleNaN) {
        return -1
    } else {
        return -1
    }
}

/**
 * Стороны треугольника константами
 */
const val SIDE_A = 3.0
const val SIDE_B = 4.0
const val SIDE_C = 5.0

/**
 * Строки
 */
const val STRING_TRIANGLE 	= "Треугольник со сторонами: $SIDE_A, $SIDE_B, $SIDE_C. "
const val STRING_ACUTE		= "Остроугольный"
const val STRING_BLUNT		= "Тупоугольный"
const val STRING_NAN		= "Не определён или не существует"

fun main() {
    var trKind = triangleKind(SIDE_A, SIDE_B, SIDE_C)
    print(STRING_TRIANGLE)
    if (trKind == -1) {    
        println(STRING_NAN)
    } else if (trKind == 0) {
        println(STRING_ACUTE)
    } else if (trKind == 1) {
        println(STRING_BLUNT)
    }
}
