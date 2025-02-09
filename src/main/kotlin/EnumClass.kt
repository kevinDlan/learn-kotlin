enum class Direction( private var degree: Int)
{
  NORTH(0),
  EAST(90),
  SOUTH(180),
  WEST(380);


    fun description(): String {
        return "Direction is $name and degree is/are  $degree"
    }

    fun degreeUpdater(newDegree: Int) {
        if (newDegree > degree)
        {
            degree = newDegree
        }
    }
}


fun main() {

    val direction: Direction = Direction.NORTH
    println( direction.description() )

    direction.degreeUpdater(10)

    println( direction.description() )

    for(dir in Direction.entries)
    {
        println(dir.name)
    }

}