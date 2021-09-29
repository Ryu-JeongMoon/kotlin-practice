package fp.chap02.pattern_matching

enum class Error(val num: Int) {
    WARN(2) {
        override fun getErrorName(): String {
            return "WARN"
        }
    },

    ERROR(3) {
        override fun getErrorName(): String {
            return "ERROR"
        }
    },

    FAULT(1) {
        override fun getErrorName(): String {
            return "FAULT"
        }
    };

    abstract fun getErrorName(): String
}

fun main(args: Array<String>) {
    println(Error.ERROR)
    //println(Error(2).getErrorName())
}

/*
kotlin enum 에서는 프로퍼티와 함수가 모두 동일한 타입이어야 한다
 */