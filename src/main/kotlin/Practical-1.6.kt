fun main(){


    arithOps()
}

fun arithOps(){
    print("Enter fist number : ")
    var usrInputOne = readln().toInt()
    print("Enter second number : ")
    var usrInputTwo = readln().toInt()
    print("Enter third number : ")
    var usrInputThree = readln().toInt()

    print("Sum : ")
    println(usrInputOne + usrInputTwo + usrInputThree)
    print("Sub : ")
    println(usrInputOne - usrInputTwo - usrInputThree)
    print("Mul : ")
    println(usrInputOne * usrInputTwo * usrInputThree)
    print("Div : ")
    println(usrInputOne / usrInputTwo)
}