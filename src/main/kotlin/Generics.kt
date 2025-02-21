fun main(){


    val productOne = SomeProduct(id = 1, name = "Mac Book Pro 2025", 5555.0)

    val  productTwo = SomeProduct(id = 2, name = "Iphone 16 Pro", 1555.0)


    val productRepo = Repository<SomeProduct>()

    productRepo.add(productOne)
    productRepo.add(productTwo)


    productRepo.getAllItems().forEach{ rep ->
        println(rep)
    }


    productRepo.getAllItems().forEach{
        println(it)
    }

    println(productOne)



}



class Repository<T> {

    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun remove(item: T) {
        items.remove(item)
    }

    fun getAllItems(): List<T>  = items.toList()
    }

data class SomeProduct (val id: Int, val name: String, val price: Double)
{

}
