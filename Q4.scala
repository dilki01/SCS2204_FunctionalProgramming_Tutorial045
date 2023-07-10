object q5 {
  def main(args: Array[String]): Unit = {
    print("Input an Int: ")
    var n = scala.io.StdIn.readInt()
    println(EvenOdd(n))
  }

  def EvenOdd(a: Int): String = a match {
    
    case x if (x == 0) => "Zero"
    case x if (x%2==0) => "Even"
    case _ => "Odd"
  }

}
