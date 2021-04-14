import kotlin.math.*

const val SEC = 86400	// Секунд в сутках 
const val MINUT_IN_HOUR = 60
const val SEC_IN_HOUR = 3600

fun seconds(hours: Int, minutes: Int, seconds: Int): Int? {
    
    if (hours >= 0 && minutes >= 0 && seconds >= 0) {
    	return (seconds + minutes *  MINUT_IN_HOUR + hours * SEC_IN_HOUR) % SEC
    }
    return null
}

fun sqr(x: Double) = x * x

fun trackLength(x1: Double, x2: Double, y1: Double, y2: Double): Double {
    return sqrt(sqr(x2 - x1) + sqr(y2 - y1))
}

fun secondDigit(number: Int, digitNumb: Int): Int {
    var value = number
    var numb = digitNumb
    
    var result: Int
    var simpleList: MutableList<Int> = mutableListOf()
    var i = 10
    while(value > 0) {
        simpleList.add(value % i)
        value = value / i        
    }  
    simpleList.reverse()
    result = simpleList.get(numb - 1)
    return result;
}

fun numberRevert(number: Int): Int {
	var value = number
    
    var result: Int = 0
    var simpleList: MutableList<Int> = mutableListOf()
    while(value > 0) {
        simpleList.add(value % 10)
        value = value / 10        
	}
    var index = simpleList.size
    var j = 1
    while(index > 0)
    {
        result += j * simpleList.get(index - 1)
        j *= 10
        index--
    }
	return result;  
}

/* Найти время в секундах, прошедшее с начала суток */
const val HOURS: Int = 0
const val MINUTES: Int = -1
const val SECONDS: Int = 0

/* Найти цифру по индексу от числа */
const val VALUE = 387344212	// Число
const val DIG_NUMB = 4		// Индекс цифры от числа VALUE (отсчёт слева)

/* Длина вектора по координатам */
const val X1: Double = 105.0
const val X2: Double = 10.0
const val Y1: Double = 0.0
const val Y2: Double = 5.0

/* Развернуть число */
const val VAL_REV = -546789

fun main() {
    var res = seconds(HOURS, MINUTES, SECONDS)
    if (res != null) {
		println("Время в секундах спустя ($HOURS часов $MINUTES минут $SECONDS секунд): $res секунд")      
    } else {
        println("Exception")
    }
    println("Длина вектора ${trackLength(X1, X2, Y1, Y2)}")
    println("$DIG_NUMB-я цифра слева числа $VALUE: ${secondDigit(VALUE, DIG_NUMB)}")
    println("Развернутое число $VAL_REV: ${numberRevert(VAL_REV)}")
}




