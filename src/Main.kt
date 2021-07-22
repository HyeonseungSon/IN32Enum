/*
열거형
 - Program 개발 시 특정 Group 안의 구성 요소를 정의하는 값이 필요할 때 사용 하는 것을 열거형 이라고 칭합니다.
 */
fun main() {
    printDirection(Direction.EAST)
    printDirection(Direction.WEST)

    val dir1:Direction = Direction.SOUTH
    val dir2:Direction = Direction.NORTH

    println(dir1)
    printDirection(dir2)

    println(Direction.NORTH)
    println(Direction.EAST)

    println("----- Number -----")
    printNumber(Number.ONE)

    val num1:Number = Number.TWO
    println(num1)
    printNumber(num1)

    println(Number.THREE)

}

enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

enum class Number (val num:Int, val str:String) {
    ONE(1, "하나"), TWO(2, "둘"), THREE(3, "셋")
}

fun printDirection(a1:Direction) {
    when (a1) {
        Direction.NORTH -> println("북")
        Direction.SOUTH -> println("남")
        Direction.WEST -> println("서")
        Direction.EAST -> println("동")
    }
}

fun printNumber (a1:Number) {
    when (a1) {
        Number.ONE -> println("ONE 입니다.")
        Number.TWO -> println("TWO 입니다.")
        Number.THREE -> println("THREE 입니다.")
    }

    when (a1.num) {
        1 -> println("1 입니다.")
        2 -> println("2 입니다.")
        3 -> println("3 입니다.")
    }
    
    when (a1.str) {
        "하나" -> println("하나 입니다.")
        "둘" -> println("둘 입니다.")
        "셋" -> println("셋 입니다.")
    }
    
    println("a1.num : ${a1.num}")
    println("a1.str : ${a1.str}")
    println("a1.name : ${a1.name}")
    println("a1.ordinal : ${a1.ordinal}")
}









