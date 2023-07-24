fun main() {
    val arrayList = arrayListOf(5, 10, 3, 8, 15, 7)

    val maxNumber = arrayList.maxOrNull()

    if (maxNumber != null) {
        println("The maximum number is: $maxNumber")
    } else {
        println("The array list is empty.")
    }

}
