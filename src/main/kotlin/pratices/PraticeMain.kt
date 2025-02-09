package pratices

fun main() {

    val operation = Operation(listOf(5,4,2))

    operation.addition()

    println(operation.getResult)

    val phone:Map<String, Any> = mapOf(
        "brand" to "Iphone",
        "numberOfSim" to 1,
        "screenSize" to 14.5
    )

    val smartPhone: SmartPhone = SmartPhone.fromJson(phone)

    val newSmartPhone:SmartPhone = smartPhone.copyWith(screenSize = 15.0)

    println(smartPhone.toString())

    println(newSmartPhone.toString())

}




class Operation ( private val numbers : List<Int>) {


    private var result:Int = 0;

    fun addition() {
        for (i in numbers) {
            result += i
        }
    }

    fun subtraction() {
        result = numbers[0]
        for (i in numbers) {
            result -= i
        }
    }

    fun multiply() {
        result = numbers[0]
        for (i in numbers) {
            result *= i
        }
    }

    fun divide() {
        result = numbers[0]
        for (i in numbers) {
            result /= i
        }
    }

    val getResult : Int get() = result

}


class SmartPhone(
    private val brand: String,
    private val numberOfSim: Int,
    private val screenSize: Double,
)
{

    companion object {
        fun fromJson(json: Map<String, Any>) : SmartPhone
        {
                return SmartPhone(
                    brand = json["brand"] as String,
                    numberOfSim = json["numberOfSim"] as Int,
                    screenSize = json["screenSize"] as Double,
                )
        }
    }

    fun copyWith(
        brand: String? = null,
        numberOfSim: Int? = null ,
        screenSize: Double? = null,
        ) : SmartPhone
    {
        return SmartPhone(
            brand = brand ?: this.brand,
            numberOfSim = numberOfSim ?:  this.numberOfSim,
            screenSize =  screenSize ?: this.screenSize,
        )
    }

    val getBrand : String get() = brand
    val getNumberOfSim : Int get() = numberOfSim
    val getScreenSize : Double get() = screenSize


    override fun toString(): String {
        return "Brand : $brand, NumberOfSim : $numberOfSim, ScreenSize : $screenSize"
    }

}