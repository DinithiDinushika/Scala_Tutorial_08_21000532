object Q3 {

  val toUpper: String => String = (str: String) => str.toUpperCase()
  val toLower: String => String = (str: String) => str.toLowerCase()

  val toCapital: (String, Int) => String = (str: String, index: Int) => {
    val letter = str.charAt(index).toString.toUpperCase()
    val capLetter = letter(0)
    //StringBuilder is a class that represents a mutable sequence of characters. So that, we can perform modifications to the string.
    val newStr = new StringBuilder(str)
    newStr.setCharAt(index, capLetter)
    val res = newStr.toString
    res
  }

  val formatNames: (String, (String) => String, Int) => String = (name: String, function: String => String, index: Int) => {
    if (index == -1) { //means there's no need to capitalize a middle character
      function(name)
    } else {
      toCapital(name, index)
    }
  }

  def main(args: Array[String]): Unit = {
    val result1 = formatNames("Benny", toUpper, -1)
    println(result1)
    val result2 = formatNames("Niroshan", toUpper, 1)
    println(result2)
    val result3 = formatNames("Saman", toLower, -1)
    println(result3)
    val result4 = formatNames("Kumara", toUpper, "Kumara".length - 1)
    println(result4)
  }
}
