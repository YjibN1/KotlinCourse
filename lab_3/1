/**
 * Найти число вхождений цифры m в число n.
 */
import java.lang.IllegalArgumentException
import kotlin.math.*

/*
 * Метод для нахождения числа вхождений цифры m в число n
 */
fun digitCountInNumber(n: Int, m: Int): Int {
    var result = 0
    
	var simpleList = intToMutableList(n)
    simpleList.forEach{
    	if (it == m) result++  
	}
    return result
}

/*
 * Является ли переменная цифрой не меньше ноля 
 */
 fun isPositiveDigit(dig: Int) = if (dig / 10 == 0 && dig >= 0) true else false

/*
 * Метод возвращает MutableList по модулю от числа Int
 */
fun intToMutableList(number: Int): MutableList<Int> {
	var value = abs(number)
    
    var simpleList: MutableList<Int> = mutableListOf()
    while(value > 0) {
        simpleList.add(value % 10)
        value = value / 10        
	}
    simpleList.reverse()
 
    return simpleList
}

/**
 * Входные данные
 */
const val NUMB_N = -1424254242
const val NUMB_M = 5

/**
 * Строковые литералы
 */
const val ARGUMENT_EXCEPTION = "В NUMB_M ожидалась цифра не меньше ноля"
const val RESULT_OUTPUT = "Число вхождений цифры $NUMB_M в число $NUMB_N равно: "

fun main() { 
    if (isPositiveDigit(NUMB_M)) {
		println(RESULT_OUTPUT + digitCountInNumber(NUMB_N, NUMB_M))
    } else {
        throw IllegalArgumentException(ARGUMENT_EXCEPTION)
    }	
}
