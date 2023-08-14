import scala.io.StdIn.readDouble
object Q1 {

  val interest: Double => Double = (deposit: Double) =>
    deposit match {
      case deposit if deposit > 0 && deposit < 20000 => deposit * 0.02
      case deposit if deposit < 200000 => deposit * 0.04
      case deposit if deposit < 2000000 => deposit * 0.035
      case deposit if deposit >= 2000000 => deposit * 0.065
  }

  def main(args: Array[String]): Unit = {
    printf("Input Deposit Amount: ")
    val depositAmt = readDouble()
    val result: Double = interest(depositAmt)
    printf("Amount of interest is: %.2f ", result)
  }
}