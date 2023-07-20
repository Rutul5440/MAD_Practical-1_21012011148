fun main(){
    print("Enter a number : ")
    var ui = readln().toInt()
    println("Factorial = " + factorial(ui))

}

fun factorial(num: Int): Int {
    if (num == 0 || num == 1)
        return 1
    else{
        return num * (num - 1)
    }
}