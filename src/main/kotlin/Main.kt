fun main(args: Array<String>) {
    println("Hello Functional Calculator!")

    // Try adding program arguments at Run/Debug configuration
    println("Program arguments: ${args.joinToString()}")

    val fpCalculator = FpCalculator()

    println(fpCalculator.calculate({ n1, n2 -> n1 + n2 }, 3, 1))
    println(fpCalculator.calculate({ n1, n2 -> n1 - n2 }, 3, 1))
}

class FpCalculator {
    fun calculate(calculator: (Int, Int) -> Int, num1: Int, num2: Int): Int {
        if (num1 > num2 && num2 != 0) {
            return calculator(num1, num2)
        } else {
            throw IllegalArgumentException()
        }
    }
}