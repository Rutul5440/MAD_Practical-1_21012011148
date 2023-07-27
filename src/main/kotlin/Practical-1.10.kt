class student(var name : String) {
    var enno: String = "21012011148"

    constructor(name: String, enno: String) : this(name) {
        var en = enno
    }

    init {
        println("My name is $name")
        println("My Enrollment number is $enno")
    }

    override fun toString(): String {
        return super.toString()
    }
    open class person(var fn : String, var ln : String ){
        var first = fn
        var last = ln
    }
}
    fun main() {
        val s = student("Rutul")
        println(s)
        println(s.name)
        println(s.enno)
    }


