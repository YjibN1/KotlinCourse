/**
 * Заполняем MutableList
 */
fun fillList(numb: Int): MutableList<Int> {
    val tempList: MutableList<Int> = mutableListOf()
    for (i in 0 until numb) {
        tempList.add((0..100).random())
    }
    return tempList
}

/**
 * Перестановка элементов списка по индексам
 */
fun <T> MutableList<T>.swapItems(index1: Int, index2: Int) {
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}

/**
 * 1. Вывести максимальный и минимальный элемент из списка.
 */
fun findMinMax(list: MutableList<Int>) {
    println("Min: " + list.minOrNull())
    println("Max: " + list.maxOrNull())
}

/**
 * 2. Найти произведение суммы всех элементов массива и разности всех элементов массива.
 */
fun arrayOperations(array: ArrayList<Int>): Int {
    var sum = 0
    var diff = 0
    array.forEach{ ig ->
        sum += ig
        diff -= ig
    }/*
    for (i in 0..array.lastIndex) {
        sum += array[i]
        diff -= array[i]
    }*/
    return sum * diff
}

/**
 * 3. Реализовать пузырьковую сортировку.
 */
fun bubbleSort(list: MutableList<Int>): List<Int> {
    for (i in 1..list.lastIndex) {
        for (j in 0..list.lastIndex - i) {
            if (list[j] > list[j + 1])
                list.swapItems(j, j + 1)
        }
    }
    return list.toList()
}

/**
 * 4. Реализовать словарь. Использовать HashMap, где ключ является словом
 * на английском языке, а значение является переводом ключа на русский.
 */
fun getTranslation(englishWord: String): String {
    val translateMap = hashMapOf(
        "car" to "машина",
        "house" to "дом",
        "tree" to "дерево",
        "apple" to "яблоко"
    )
    return translateMap[englishWord].toString()
}

/**
 * 5. Реализовать быструю сортировку (quick sort).
 */
fun quickSort(array: ArrayList<Int>): List<Int> =
    quickSort(array.toMutableList(), 0, array.lastIndex).toList()

fun quickSort(list: MutableList<Int>, start: Int, end: Int): MutableList<Int> {
    if (start >= end) return list
    val foothold = footholdSelection(list, start, end)
    quickSort(list, start, foothold - 1)
    quickSort(list, foothold + 1, end)
    return list
}

/**
 * Выбор опорной точки.
 */
fun footholdSelection(list: MutableList<Int>, start: Int, end: Int): Int {
    var marker = start
    for (i in start..end) {
        if (list[i] <= list[end]) {
            list.swapItems(marker, i)
            marker += 1
        }
    }
    return marker - 1
}

const val LIST_LENGTH = 11
const val SEARCH_STRING = "erg"

fun main() {
    if (LIST_LENGTH <= 0) {
        println("Число элементов не корректно")
        return
    }
    val list = fillList(LIST_LENGTH)
    println("---------------Начальный список---------------")
    println(list)
    println("--------------------Task_1--------------------")
    println(list)
    findMinMax(list)
    println("--------------------Task_2--------------------")
    println(arrayOperations(list.toCollection(ArrayList())))
    println("--------------------Task_3--------------------")
    print(list)
    println(" => ")
    println(bubbleSort(list.toMutableList()))
    println("--------------------Task_4--------------------")
    val str = getTranslation(SEARCH_STRING)
    if (str != "null") {
        println("$SEARCH_STRING => $str")
    } else {
        println("Слово не найдено в коллекции")
    }
    println("--------------------Task_5--------------------")
    print(list)
    println(" => ")
    println(quickSort(list.toCollection(ArrayList())))
}
