object q5{
    def main(args:Array[String]): Unit={
        print("Input an Int ");
        var n=scala.io.StdIn.readInt();
       
        for(i<-0 until n){
             var n1=Fibonacci(i);
             print(n1 + " ")
        }

    }

    def Fibonacci(a:Int):Int=a match{
        case x if (x==0) => 0
        case x if(x==1)=> 1
        case _ => Fibonacci(a-1)+Fibonacci(a-2)
    }

}