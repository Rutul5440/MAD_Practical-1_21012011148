import java.util.*

fun bubbleSort(arr: IntArray) {
    val n = arr.size
    for (i in 0 until n - 1) {
        for (j in 0 until n - i - 1) {
            if (arr[j] > arr[j + 1]) {
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
    }
}


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


    println("Array created using IntArrayOf()")
    var a5 = intArrayOf(12,24,36,47,52)
    println(a5.joinToString(", "))

    println("Array created by using arrayof() and intArrayOf()")
    var a6 = arrayOf(intArrayOf(5,3), intArrayOf(4,1), intArrayOf(6,2))
    println(a6.contentDeepToString())

    print("Enter number of Elements : ")
    val size : Int = readLine()!!.toInt()
    val userarray = IntArray(size) {0}


    for(i in 0 until size)
    {
        print("a[$i]:")
        userarray[i] = readLine()!!.toInt()
    }
    print("Entered Array = ")
    println(userarray.contentToString())
    val userarray1 = userarray.toMutableList()


    println("------Sort the arry using built in function -------")
    println("before sorting array elements are :")
    println(userarray1.joinToString())
    println("after sorting array elements are :")
    userarray1.sort()
    println(userarray1.joinToString())

    println("")

    println("------Sort the arry without built in function -------")
    println("before sorting array elements are :")
    println(userarray.joinToString())
    println("after sorting array elements are :")
    bubbleSort(userarray)
    println(userarray.joinToString())


}