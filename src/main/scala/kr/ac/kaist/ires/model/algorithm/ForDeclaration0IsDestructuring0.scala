package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ForDeclaration0IsDestructuring0 {
  val length: Int = 0
  val func: Func = Func("""ForDeclaration0IsDestructuring0""", List(Id("""this"""), Id("""LetOrConst"""), Id("""ForBinding""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""ForBinding"""))), EStr("""IsDestructuring""")).setId(32139), IReturn(ERef(RefId(Id("""__x0__""")))).setId(32140))).setId(32145))
  val instToStepMap: Map[Int, Int] = Map(32139 -> 0, 32140 -> 0, 32141 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(32141, 32140, 32139))
  /* Beautified form:
  "ForDeclaration0IsDestructuring0" (this, LetOrConst, ForBinding) => {
    access __x0__ = (ForBinding "IsDestructuring")
    return __x0__
  }
  */
}
