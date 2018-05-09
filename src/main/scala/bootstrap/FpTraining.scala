package bootstrap

import scala.annotation.tailrec

object FpTraining {

  def add(x: Int, y: Int): Int = x + y

  def sum(l: List[Int]): Int = {
    @tailrec
    def sum(l: List[Int], acc: Int): Int = l match {
      case Nil => acc
      case _ => sum(l.tail, acc + l.head)
    }
    sum(l, 0)
  }

  def format(x: Int): String = s"$x is formatted"

  def curriedAddF: Int => (Int => Int) = (x: Int) => (y: Int) => add(x,y)
}

