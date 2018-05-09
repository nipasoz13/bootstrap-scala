package bootstrap

import scala.annotation.tailrec

object FpTraining {

  def addMethod(x: Int, y: Int): Int = x + y

  def addFunction: (Int, Int) => Int = addMethod _

  def sum(l: List[Int]): Int = {
    @tailrec
    def sum(l: List[Int], acc: Int): Int = l match {
      case Nil => acc
      case _ => sum(l.tail, acc + l.head)
    }
    sum(l, 0)
  }

  def format(x: Int): String = s"$x is formatted"

  def curriedAddFunction: Int => (Int => Int) = (x: Int) => addFunction(x,_)

  def curriedAddMethod(x: Int)(y: Int) : Int = addMethod(x,y)

  val curriedM2 = curriedAddMethod(2)
  val curriedF2 = curriedAddFunction(2)

  def add2ThenFormat: Int => String = format _ compose curriedF2
  def SumOfListThenAdd2: List[Int] => Int = curriedF2 compose sum _
}

