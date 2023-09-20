class Main {
}

class Person(
    private var age: Int,
    public var name: String="Noname",
    sayhi: String
)
{
    init {
        println("$name ($age): $sayhi")
    }
}


fun max(a: Int, b: Int): Int {
    return if(a > b) a else b
}

fun main() {
//    println("Hello kotlin!")

//    val a = 5
//    val b = 12
//    var max = -1
//
//    if(a > b) {
//        max = a
//    } else {
//        max = b
//    }
//
//    println(max)


    // when - else 문
//    val groupSize = 3
//    when (groupSize) {
//        1 -> println("Single")
//        2 -> println("Pair")
//        3 -> {
//            println("Trio")
//            println("test")
//        }
//        else -> println("This is either nobody or a big crowd")
//    }

    // for 문
//    for (i in 1..5) {
//        println(i)
//    }
//
//    for (i in arrayOf(50, 39, 6, -1)) {
//        println(i * -1.0)
//    }

//    println(max(5,-1))

//    var p1: Person = Person(10, "Kevin", "Hu, there!")
//    println(p1.name)


    //230920
    /*
    val o1: TestDataClass = TestDataClass(3)
    val o2: TestDataClass = TestDataClass(5, "hello")
    val o3: TestDataClass = o2.copy()

    val eq: Boolean = o1.equals(o2)
    println(eq)
    println(o2.equals(o3))

    val (a,b) = o1
    println("$a\t$b")
    println(o1)
    println(o2)
    */
    var c1 = Cat(name="Tom")
    c1.talk()
}
