package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ForDeclaration0BoundNames0 {
  val length: Int = 0
  val func: Func = Func("""ForDeclaration0BoundNames0""", List(Id("""this"""), Id("""LetOrConst"""), Id("""ForBinding""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""ForBinding"""))), EStr("""BoundNames""")).setId(31778), IReturn(ERef(RefId(Id("""__x0__""")))).setId(31779))).setId(31784))
  val instToStepMap: Map[Int, Int] = Map(31778 -> 0, 31779 -> 0, 31780 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(31780, 31778, 31779))
  /* Beautified form:
  "ForDeclaration0BoundNames0" (this, LetOrConst, ForBinding) => {
    access __x0__ = (ForBinding "BoundNames")
    return __x0__
  }
  */
}
