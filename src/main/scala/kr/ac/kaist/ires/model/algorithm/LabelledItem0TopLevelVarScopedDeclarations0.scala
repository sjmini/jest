package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object LabelledItem0TopLevelVarScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""LabelledItem0TopLevelVarScopedDeclarations0""", List(Id("""this"""), Id("""Statement""")), None, ISeq(List(IIf(EIsInstanceOf(ERef(RefId(Id("""Statement"""))), """Statement10"""), ISeq(List(IAccess(Id("""LabelledStatement"""), ERef(RefId(Id("""Statement"""))), EStr("""LabelledStatement""")).setId(36418), IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""TopLevelVarScopedDeclarations""")).setId(36415), IReturn(ERef(RefId(Id("""__x0__""")))).setId(36416))).setId(36429), ISeq(List()).setId(36430)).setId(36421), IAccess(Id("""__x1__"""), ERef(RefId(Id("""Statement"""))), EStr("""VarScopedDeclarations""")).setId(36422), IReturn(ERef(RefId(Id("""__x1__""")))).setId(36423))).setId(36434))
  val instToStepMap: Map[Int, Int] = HashMap(36422 -> 1, 36415 -> 0, 36417 -> 0, 36424 -> 1, 36423 -> 1, 36421 -> 0, 36416 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(36415, 36417, 36421, 36416), 1 -> HashSet(36422, 36424, 36423))
  /* Beautified form:
  "LabelledItem0TopLevelVarScopedDeclarations0" (this, Statement) => {
    if (is-instance-of Statement Statement10) {
      access LabelledStatement = (Statement "LabelledStatement")
      access __x0__ = (Statement "TopLevelVarScopedDeclarations")
      return __x0__
    } else {}
    access __x1__ = (Statement "VarScopedDeclarations")
    return __x1__
  }
  */
}
