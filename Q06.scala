@main def Question_06: Unit ={
    print("Enter the Number : ")
    var value = scala.io.StdIn.readInt()
    print("Resukt : ")
    printFibonacci(value)
}

def printFibonacci(n: Int): Unit = {
    def fibonacci(num: Int): Int = {
        if (num <= 1){
            num
        } else {
            fibonacci(num - 1) + fibonacci(num - 2)
        }
    }

    def countTracker(current: Int, count: Int): Unit = {
        if (count <= n) {
            print(s"${fibonacci(current)} ")
            countTracker(current + 1, count + 1)
        }
    }
    countTracker(0, 1)
}
