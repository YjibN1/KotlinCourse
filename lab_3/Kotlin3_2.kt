/**
 * Проверить является ли число n палиндромом.
 */
import kotlin.math.*

/*
 * Метод для проверки числа на палиндром
 */
fun isPalindrome(n: Int): Boolean {
	if (n < 0) return false
    
	var simpleList = intToMutableList(n)
    var numbOfDigits = simpleList.count()

    for (item in 0..(numbOfDigits / 2  - 1)) {
        if (simpleList[item] != simpleList[numbOfDigits - item - 1])
        {
            return false
        }
    }
	return true
}

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
const val NUMB_N = 4896984

/**
 * Строковые литералы
 */
const val RESULT_OUTPUT = "Число $NUMB_N: "
const val NUMBER_PALINDROME = "палиндром"
const val NUMBER_NOT_PALINDROME = "не палиндром"

fun main() {   
    print(RESULT_OUTPUT)
    if (isPalindrome(NUMB_N)) {
		println(NUMBER_PALINDROME)
    } else {
		println(NUMBER_NOT_PALINDROME)
    }	   
}