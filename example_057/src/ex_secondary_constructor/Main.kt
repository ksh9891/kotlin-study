package ex_secondary_constructor

class Time(val second: Int)
{
    init
    {
        println("init 블록 실행 중")
    }

    // 보조 생성자 1
    constructor(minute: Int, second: Int): this(minute * 60 + second)
    {
        println("보조 생성자1 실행 중")
    }

    // 보조 생성자 2
    constructor(hour: Int, minute: Int, second: Int): this(hour * 60 + minute, second)
    {
        println("보조 생성자2 실행 중")
    }

    init
    {
        println("또 다른 init 블록 실행 중")
    }
}

fun main(args: Array<String>): Unit
{
    println("${Time(15, 6).second} 초")
    println("${Time(6, 3, 17).second} 초")
}