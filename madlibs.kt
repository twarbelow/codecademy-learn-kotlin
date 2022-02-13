fun main () {
  val costOfGas = 2.28
  val mileage = 25

  println("Please choose a whole number between 400 and 600:")
  val distance = Integer.valueOf(readLine())

  var totalForGas = Math.round(((costOfGas / mileage) * distance) * 100) / 100.00

  var totalMoneySaved = totalForGas + 200
    
  println("What's your name?")
  var name = readLine()

  println("What is your friend's name?")
  var friendsName = readLine()

  println("Please enter an adjective:")
  var adjective = readLine()

  println("Please enter a city:")
  var city = readLine()

  println("What is your favorite band?")
  var bandName = readLine()

  println("What job does $friendsName have?")
  var work = readLine()

  print("""
    A long time ago, $name and their friend $friendsName planned a(n) $adjective road trip to see their favorite band: $bandName. 
    The venue was $distance miles away which meant they needed to save $$totalForGas dollars to get there.
    Both of them worked as $work for the whole summer and managed to save up a total of $$totalMoneySaved dollars!
    To celebrate, they ended up driving to $city for the whole weekend; seeing their band and buying $bandName t-shirts to remember their trip.
    """.trimIndent())
}