object q5 {
  def main(args: Array[String]): Unit = {
    print("Input an Int: ")
    var n = scala.io.StdIn.readInt()
    primeSeq(n-1)
  }
  def primeSeq(a: Int): Unit = a match
    {
    case x if(x>1) => primeSeq(x-1)
      if (prime(x))
      {
        print("%d ".format(x))
      } 
      // case x if x>1 => primeSeq(x-1); if(prime(x)) printf("%d ",x)

      case _ => 
    }


  def prime(a: Int, b: Int = 2): Boolean = b match {
    case x if (x == a) => true
    case x if (GCD(a, x)) > 1 => false
    case x => prime(a, x + 1)
  }

  def GCD(n1: Int, n2: Int): Int = n2 match {
    case 0 => n1
    case x if x > n1 => GCD(x, n1)
    case x => GCD(x, n1 % x)
  }
}
