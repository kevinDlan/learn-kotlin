fun main() {


    val car = Car()

    car.technicalData()

}



open class Vehicle (
    private val brand: String,
    private val color: String,
    private val model: String
){


    fun technicalData(){

        println("" +
                "Brand : $brand" +
                "Color : $color" +
                "Model : $model")
    }

}

class Car(): Vehicle(brand = "car", color = "blue", model = "purple") {

}
