package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object LabelledStatement0VarScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""LabelledStatement0VarScopedDeclarations0""", List(Id("""this"""), Id("""LabelIdentifier"""), Id("""LabelledItem""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""LabelledItem"""))), EStr("""VarScopedDeclarations""")).setId(36464), IReturn(ERef(RefId(Id("""__x0__""")))).setId(36465))).setId(36470))
  val instToStepMap: Map[Int, Int] = Map(36464 -> 0, 36465 -> 0, 36466 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(36465, 36466, 36464))
  /* Beautified form:
  "LabelledStatement0VarScopedDeclarations0" (this, LabelIdentifier, LabelledItem) => {
    access __x0__ = (LabelledItem "VarScopedDeclarations")
    return __x0__
  }
  */
}
