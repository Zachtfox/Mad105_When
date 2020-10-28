fun main(){
    print("Enter a number between 1 and 10 to see it's translation in Italian ")
    var num = readLine()!!.toInt()
    var word = "x"

    when(num){
        1 -> word = "Uno"
        2 -> word = "Due"
        3 -> word = "Tre"
        4 -> word = "Quattro"
        5 -> word = "Cinque"
        6 -> word = "Sei"
        7 -> word = "Sette"
        8 -> word = "Otto"
        9 -> word = "Nove"
        10 -> word = "Dieci"
        !in 1..10 -> word = "The number you entered was not an integer between 1 and 10!"
        else -> word = "Invalid"

    }

    println("The translation if $num into Italian is: $word")
}