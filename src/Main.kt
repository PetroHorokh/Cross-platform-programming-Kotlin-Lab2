import kotlin.math.sqrt

fun task1() {
    println("Завдання №1")

    print("Введіть суму для задіяння першої знижки S1: ")
    val s1: Double = readln().toDouble()
    var s2: Double
    var p1: Double
    var p2: Double

    do {
        print("Введіть суму для задіяння другої знижки S2( S1 < S2): ")
        s2 = readln().toDouble()
    } while (s2 <= s1)

    do {
        print("Введіть першу знижку p1( 0 <= p1 <= 1): ")
        p1 = readln().toDouble()
    } while (p1 >= 1 || p1 <= 0)

    do {
        print("Введіть першу знижку p2( 0 <= p2 <= 1): ")
        p2 = readln().toDouble()
    } while (p2 >= 1 || p2 <= 0)


    print("Введіть суму цін продуктів: ")
    val s: Double = readln().toDouble()

    if (s >= s1) {
        if (s >= s2) {
            println("Сума цін продуктів: " + (s * (1 - p2)))
        } else {
            println("Сума цін продуктів: " + (s * (1 - p1)))
        }
    } else {
        println("Сума цін продуктів: $s")
    }
}

fun task2() {
    println("Завдання №2")
    var a: Double
    var b: Double

    do {
        print("Введіть коефіцієнт а: ")
        a = readln().toDouble()

        print("Введіть коефіцієнт b: ")
        b = readln().toDouble()
    } while (a == 0.0 && b == 0.0)

    val l = -b / a

    print("Введіть коефіцієнт c: ")
    val c: Double = readln().toDouble()

    val delta = a * a * c * c + 4 * b * c

    if (delta <= 0) {
        println("Solution:($l;inf)")
    } else {
        val x1 = (a * c - sqrt(delta)) / 2
        val x2 = (a * c + sqrt(delta)) / 2

        if (l < x1) {
            println("Solution:($l;$x1]U[$x2;inf)")
        } else if (l == x1) {
            println("Solution:[$x2;inf)")
        } else if (x1 < l && l < x2) {
            println("Solution:[$x1;$l)U[$x2;inf)")
        } else if (l == x2) {
            println("Solution:[$x1;$x2)U($x2;inf)")
        } else if (x2 < l) {
            println("Solution:[$x1;$x2]U($l;inf)")
        }
    }
}

fun main() {
    task1()

    task2()
}