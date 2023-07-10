@main def Question_04: Unit ={
    print("Enter the Number : ")
    var value = scala.io.StdIn.readInt()
    print("Result : " + isEven(value))
}

def isEven(n: Int): Boolean = {
    if (n == 0){
        true
    } else if (n == 1){
        false
    } else if (n < 0){
        evenCheck(-n)
    } else {
        evenCheck(n - 2)
    }
}
