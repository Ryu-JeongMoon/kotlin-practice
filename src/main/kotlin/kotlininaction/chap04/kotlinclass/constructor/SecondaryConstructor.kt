package kotlininaction.chap04.kotlinclass.constructor

import javax.naming.Context
import javax.print.attribute.AttributeSet
import javax.print.attribute.HashAttributeSet

fun main() {

}

open class View {
  constructor(ctx: Context)
  constructor(ctx: Context, attr: AttributeSet)
}

class MyButton : View {
  constructor(ctx: Context) : this(ctx, HashAttributeSet())
  constructor(ctx: Context, attr: AttributeSet) : super(ctx, attr)
}