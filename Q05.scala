@main def Question_05: Unit ={
    print("Enter the Number : ")
    var value = scala.io.StdIn.readInt()
    print("Result : " + addEven(value - 1))
}

def addEven(n: Int): Int ={
    if(n < 2){
        0
    } else {
        if (evenCheck(n)){
            n + addEven(n - 1)
        }else {
            addEven(n - 1)
        }
    }
    
}

def evenCheck(n: Int): Boolean = {
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