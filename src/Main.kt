import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.sqrt

fun task1() {
    println("Завдання №1")

    print("Введіть суму для задіяння першої знижки S1: ")
    val S1: Double = readln().toDouble()
    var S2: Double
    var p1: Double
    var p2: Double

    do {
        print("Введіть суму для задіяння другої знижки S2( S1 < S2): ")
        S2 = readln().toDouble()
    } while (S2 <= S1)

    do {
        print("Введіть першу знижку p1( 0 <= p1 <= 1): ")
        p1 = readln().toDouble()
    } while (p1 >= 1 || p1 <= 0)

    do {
        print("Введіть першу знижку p2( 0 <= p2 <= 1): ")
        p2 = readln().toDouble()
    } while (p2 >= 1 || p2 <= 0)


    print("Введіть суму цін продуктів: ")
    val S: Double = readln().toDouble()

    if (S >= S1) {
        if (S >= S2) {
            println("Сума цін продуктів: " + (S * (1 - p2)))
        }
        else{
            println("Сума цін продуктів: " + (S * (1 - p1)))
        }
    }
    else{
        println("Сума цін продуктів: $S")
    }
}

fun task2() {
    println("Завдання №2")
    val delta: Double

    var a: Double
    var b: Double

    do {
        //ввід a
        print("Enter а: ")
        a = readln().toDouble()

        //ввід b
        print("Enter b: ")
        b = readln().toDouble()
    } while (a == 0.0 && b == 0.0)

    print("Введіть коефіцієнт c: ")
    val c: Double = readln().toDouble()

    delta = a * a * c * c + 4 * b * c

    if (delta > 0) {
        println(
            "Інтервал, що буде розв'язком: [-inf;"
                    + ((a * c - sqrt(delta)) / 2)
                    + "]U["
                    + ((a * c + sqrt(delta)) / 2)
                    + ";inf]"
        )
    } else if (delta <= 0) {
        println("Інтервал, що буде розв'язком: [-inf;inf]")
    }
}

fun main() {
    task1()

    task2()
}