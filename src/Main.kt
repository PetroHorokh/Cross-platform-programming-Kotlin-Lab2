import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.sqrt

fun task1(bufferedReader: BufferedReader) {
    println("Завдання №1")

    print("Введіть суму для задіяння першої знижки S1: ")
    val S1: Double = bufferedReader.readLine().toDouble()
    var S2: Double
    var p1: Double
    var p2: Double
    val sum: Double

    do {
        print("Введіть суму для задіяння другої знижки S2( S1 < S2): ")
        S2 = bufferedReader.readLine().toDouble()
    } while (S2 <= S1)

    do {
        print("Введіть першу знижку p1( 0 <= p1 <= 1): ")
        p1 = bufferedReader.readLine().toDouble()
    } while (p1 >= 1 || p1 <= 0)

    do {
        print("Введіть першу знижку p2( 0 <= p2 <= 1): ")
        p2 = bufferedReader.readLine().toDouble()
    } while (p2 >= 1 || p2 <= 0)


    print("Введіть суму цін продуктів: ")
    val S: Double = bufferedReader.readLine().toDouble()

    if (S >= S1) {
        if (S >= S2) {
            sum = S * (1 - p2)

            println("Сума цін продуктів: $sum")
        }
        else{
            sum = S * (1 - p1)

            println("Сума цін продуктів: $sum")
        }
    }
    else{
        println("Сума цін продуктів: $S")
    }

}

fun task2(bufferedReader: BufferedReader) {
    println("Завдання №2")
    val delta: Double

    print("Введіть коефіцієнт а: ")
    val a: Double = bufferedReader.readLine().toDouble()

    print("Введіть коефіцієнт b: ")
    val b: Double = bufferedReader.readLine().toDouble()

    print("Введіть коефіцієнт c: ")
    val c: Double = bufferedReader.readLine().toDouble()

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
    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))

    task1(bufferedReader)

    task2(bufferedReader)
}