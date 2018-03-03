package pfad

import cats.Eq
import cats.implicits._
//import strawman.collection.immutable._

object Chap01 {
  //For simplicity
  type Nat = Int

  //An inefficient solution, requiring Θ(n^2) steps
  val minfreeInefficient: List[Nat] => Nat = { xs =>
    implicit class `List\\`[A : Eq](us: List[A]) {
      def \\(vs: List[A]): List[A] = us.filterNot(u => vs.exists(_ === u))
    }

    (List(0 to Int.MaxValue: _*) \\ xs).head
  }

  val minfreeArray: List[Nat] => Nat = { xs =>
    val search = ???

    ???
  }
}
