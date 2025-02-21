fun main(){

      val obj = LazyVsLateInit()


      obj.userLateInit = User("Test", 100)


    println(obj.userLazy)


}






class  LazyVsLateInit()
{
    lateinit var userLateInit: User

    val userLazy:User by lazy {
        User("Tesla", 10)
    }
}