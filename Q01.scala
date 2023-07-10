@main def Question_01: Unit ={
    print("Enter the Number to check : ")
    var value = scala.io.StdIn.readInt()
    print("Result : " + prime(value))
}

def prime(n: Int): Boolean = {
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

