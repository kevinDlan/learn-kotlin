fun main() {


    val dog = Dogs()
    val cat = Cat()


    val petShopDog = PetShop(dog)
    val petShopCat = PetShop(cat)


    petShopDog.makeSound()
    petShopCat.makeSound()

}

 

interface Sound {
    fun makeSound()
}



class  Dogs : Sound {
    override fun makeSound() {
        println("Bark")
    }
}

class  Cat : Sound {
    override fun makeSound() {
        println("Meow")
    }
}

class PetShop(private val sound: Sound) : Sound by sound {

}