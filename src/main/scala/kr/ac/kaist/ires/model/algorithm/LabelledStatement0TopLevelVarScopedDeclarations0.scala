package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object LabelledStatement0TopLevelVarScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""LabelledStatement0TopLevelVarScopedDeclarations0""", List(Id("""this"""), Id("""LabelIdentifier"""), Id("""LabelledItem""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""LabelledItem"""))), EStr("""TopLevelVarScopedDeclarations""")).setId(36405), IReturn(ERef(RefId(Id("""__x0__""")))).setId(36406))).setId(36411))
  val instToStepMap: Map[Int, Int] = Map(36405 -> 0, 36406 -> 0, 36407 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(36407, 36406, 36405))
  /* Beautified form:
  "LabelledStatement0TopLevelVarScopedDeclarations0" (this, LabelIdentifier, LabelledItem) => {
    access __x0__ = (LabelledItem "TopLevelVarScopedDeclarations")
    return __x0__
  }
  */
}
