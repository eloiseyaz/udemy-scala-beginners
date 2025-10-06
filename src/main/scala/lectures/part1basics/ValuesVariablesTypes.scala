package lectures.part1basics

object ValuesVariablesTypes extends App {

  //Values

  val x: Int = 42
  println(x)

  //vals are immutable

  //compiler can infer types

  val aString: String = "hello"
  val anotherString = "goodbye"

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = x //4 bytes
  val aShort: Short = 4613 //2 bytes
  val aLong: Long = 528675896747895L //L needed to signify long (8 bytes)
  val aFloat: Float = 2.0f //f needed to signify float (4 bytes)
  val aDouble: Double = 3.14 //default for decimals (8 bytes)

  //Variables

  var aVar: Int = 4

  aVar = 5 //vars can be reassigned

  //Side Effects
  //Variables are used for what functional programming calls side effects.
  //They allow us to see what our programs are doing
  //Examples include changing a variable, printing something to the console and displaying something on screen
  //Programs without side effects are easier to understand
  //We cannot eliminate these completely as our programs need to do something

}
