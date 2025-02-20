package pratices
fun main()
{

    val word = "kevin"

    println(isPalimdrome("radar"))
}

fun reverseWord( word : String) : String
{
    var newWord : String = ""
    for( i in 1..word.length )
    {
        newWord += word[word.length - i]
    }

    return newWord
}


fun isPalimdrome (word: String) : Boolean
{
    return word == reverseWord(word)
}