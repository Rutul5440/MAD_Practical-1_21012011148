import java.util.*

fun main(){

    val array = arrayOf(10, 90, 60, 80, 100)
    println("created array -1 by using arrayOf method: ")
    println(array.contentDeepToString())

    val array2 = Array<Int>(5){4}
    println("create array-2 by using array<>  method")
    println(Arrays.deepToString(array2))

    val array3 = Array<Int>(5){i:Int ->i}
    println("create array 3 using array<> and lamda function")
    println(Arrays.deepToString(array3))

    val array4 = IntArray(5)
    println("create array 4 using IntArray method")
    array4[0] = 1
    array4[1] = 3
    array4[2] = 5
    array4[3] = 7
    array4[4] = 9

for(i in 0..4){
    print("${array4[i]}, ")
}

//    val array5 = intArrayOf(11, 50, 22, 44, 88, 10)
//    println("create array  using IntArrayOf method")
//    array5[0] = 11
//    array5[1] = 50
//    array5[2] = 22
//    array5[3] = 44
//    array5[4] = 88
//    array5[5] = 10

//    for(i in 0..5){
//        print("${array5[i]}, ")
//    }


}