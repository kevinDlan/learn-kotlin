fun main()
{

    val pizza : Pizza = Pizza(name="Pepperoni Pizza", from = "Rifat", size = 5)

    pizza.setName("Cheese Pizza")

    println(pizza.getName)
}



class Pizza (
    private var name: String,
    private var from: String,
    private var size: Int
)
{

    val getName : String get() = name

    fun setName(name: String) { this.name = name }
}