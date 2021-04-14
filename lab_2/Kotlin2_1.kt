/** 
 * Определить возраст.
 * Функция выводит строку вида: 
 * «31 год», «42 года», «11 лет», 
 * если 0 < age < 200.
 */

/**
 * Метод возвращает десяток от числа
 */
fun allocateTen(age: Int): Int = age % 100 / 10

const val OPT_YEAR_1: String = "Лет"
const val OPT_YEAR_2: String = "Год"
const val OPT_YEAR_3: String = "Года"

fun ageDescription(age: Int): String {
    var result: String = age.toString() + " "
    var lastDigit: Int
      
    if (allocateTen(age) == 1) {
        lastDigit = 10
    } else {
        lastDigit = age % 10
    }
    
	result += when (lastDigit) {
		0, in 5..9, 10 -> OPT_YEAR_1
       	1    	   	   -> OPT_YEAR_2
        in 2..4        -> OPT_YEAR_3
        else -> println("Exeption")
	}
    
    return result
}

const val AGE: Int = 114

fun main() {
    if (AGE in 1..199) {
    	println(ageDescription(AGE))
    }
    else {
        println("Exeption")
    }
}
