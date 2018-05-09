package bootstrap

import scala.annotation.tailrec

object FpTraining {
  def sum(l: List[Int]): Int = {
    @tailrec
    def sum(l: List[Int], acc: Int): Int = l match {
      case Nil => acc
      case _ => sum(l.tail, acc + l.head)
    }
    sum(l, 0)
  }

  def format(x: Int): String = s"$x is formatted"
}

