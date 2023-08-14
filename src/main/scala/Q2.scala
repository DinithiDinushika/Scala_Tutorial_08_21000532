import scala.io.StdIn.readInt
object Q2 {

  val patternMatching: Int => String = (num: Int) =>
    num match {
      case n if n < 0 => "Negative"
      case n if n == 0 => "Zero"
      case n if n % 2 == 0 => "Even"
      case n if n % 2 == 1 => "Odd"
  }

  def main(args: Array[String]): Unit = {
    printf("Input any integer number: ")
    val number: Int = readInt()
    println(patternMatching(number))
  }
}