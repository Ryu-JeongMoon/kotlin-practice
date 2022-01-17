package kotlininaction.chap10.annotation.jkid

interface Company {
  val name: String
}

data class CompanyImpl(override val name: String): Company