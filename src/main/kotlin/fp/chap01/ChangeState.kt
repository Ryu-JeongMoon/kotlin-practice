package fp.chap01

// 인자로 들어온 객체의 상태 변경 시켜버림
data class MutablePerson(var name: String, var age: Int)

fun addAge(person: MutablePerson, num: Int) {
    person.age += num
}

data class ImmutablePerson(var name: String, var age: Int)

fun addAge2(person: ImmutablePerson, num: Int): ImmutablePerson {
    return ImmutablePerson(person.name, person.age + num)
}

fun main(args: Array<String>) {

}