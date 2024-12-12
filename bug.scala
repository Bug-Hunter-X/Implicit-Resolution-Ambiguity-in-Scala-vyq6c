```scala
class MyClass[T](val value: T) {
  def myMethod(implicit ev: T => Int): Int = ev(value)
}

val myInstance = new MyClass(10)
println(myInstance.myMethod)
```