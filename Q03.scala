@main def Question_03: Unit ={
    print("Enter the Number : ")
    var value = scala.io.StdIn.readInt()
    print("Result : " + sum(value))
}

def sum(n: Int): Int = {
    if (n <= 0) {
        0
    } else {
        n + sum(n - 1)
    }
}