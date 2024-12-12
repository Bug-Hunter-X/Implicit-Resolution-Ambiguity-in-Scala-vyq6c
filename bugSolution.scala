```scala
class MyClass[T](val value: T) {
  def myMethod(implicit ev: T => Int): Int = ev(value)
}

object MyImplicits {
  implicit def intToInt(i: Int): Int = i
  implicit def stringToInt(s: String): Int = s.toInt
}

import MyImplicits._

val myInstance1 = new MyClass(10)
println(myInstance1.myMethod) // Works fine

val myInstance2 = new MyClass("20")
println(myInstance2.myMethod) // Works fine now

//Without Import, this will cause compiler error when both Int and String are available
//val myInstance3 = new MyClass("20")
//println(myInstance3.myMethod) //Compiler Error
```