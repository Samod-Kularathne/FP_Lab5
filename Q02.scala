@main def Question_02: Unit ={
    print("Enter the Number : ")
    var value = scala.io.StdIn.readInt()
    print("Result : ")
    primePrint(value)
}

def primePrint(n: Int): Unit ={
    if(n > 2){
        primePrint(n-1)
    }
    if(primeCheck(n)){
        print(n + " ")
    }
}

def primeCheck(n: Int): Boolean = {
    def isPrime(n: Int, i: Int): Boolean = {
        if(n <= 2){
            if (n == 2){
                true
            } else {
                false
            }
        } else {
            if(n % i == 0){ 
                false
            } else if(i * i > n) {
                true
            } else {
                isPrime(n, i + 1)
            }
        }
    }
    isPrime(n, 2)
}