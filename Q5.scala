object q5{
    def main(args:Array[String]): Unit={
        print("Input an Int ");
        var n=scala.io.StdIn.readInt();
        println(Add(n));

    }

    def Add(a:Int,b:Int=0):Int=a match{
        case x if (x<0) => 0
        case x if(x==0) => b
        case x => Add(x-2,b+x)
    }

}
