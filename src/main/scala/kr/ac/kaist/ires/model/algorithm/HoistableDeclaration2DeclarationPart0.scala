package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object HoistableDeclaration2DeclarationPart0 {
  val length: Int = 0
  val func: Func = Func("""HoistableDeclaration2DeclarationPart0""", List(Id("""this"""), Id("""AsyncFunctionDeclaration""")), None, IReturn(ERef(RefId(Id("""AsyncFunctionDeclaration""")))).setId(25809))
  val instToStepMap: Map[Int, Int] = Map(25809 -> 0, 25810 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(25810, 25809))
  /* Beautified form:
  "HoistableDeclaration2DeclarationPart0" (this, AsyncFunctionDeclaration) => return AsyncFunctionDeclaration
  */
}
