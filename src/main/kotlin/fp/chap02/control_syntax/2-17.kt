package fp.chap02.control_syntax

fun main(args: Array<String>) {
    val collection = listOf(1, 2, 3)

    for (item in collection)
        println(item)

    for ((index, item) in collection.withIndex())
        println("the element at $index is $item")
}

/*
for 문을 파이썬 같이 쓰네
index 쓰려면 .withIndex() 써줘야 한당
 */