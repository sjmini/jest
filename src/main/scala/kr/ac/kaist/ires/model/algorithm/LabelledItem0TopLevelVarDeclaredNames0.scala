package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object LabelledItem0TopLevelVarDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""LabelledItem0TopLevelVarDeclaredNames0""", List(Id("""this"""), Id("""Statement""")), None, ISeq(List(IIf(EIsInstanceOf(ERef(RefId(Id("""Statement"""))), """Statement10"""), ISeq(List(IAccess(Id("""LabelledStatement"""), ERef(RefId(Id("""Statement"""))), EStr("""LabelledStatement""")).setId(36369), IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""TopLevelVarDeclaredNames""")).setId(36366), IReturn(ERef(RefId(Id("""__x0__""")))).setId(36367))).setId(36380), ISeq(List()).setId(36381)).setId(36372), IAccess(Id("""__x1__"""), ERef(RefId(Id("""Statement"""))), EStr("""VarDeclaredNames""")).setId(36373), IReturn(ERef(RefId(Id("""__x1__""")))).setId(36374))).setId(36385))
  val instToStepMap: Map[Int, Int] = HashMap(36375 -> 1, 36368 -> 0, 36374 -> 1, 36373 -> 1, 36366 -> 0, 36367 -> 0, 36372 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(36368, 36366, 36367, 36372), 1 -> HashSet(36375, 36374, 36373))
  /* Beautified form:
  "LabelledItem0TopLevelVarDeclaredNames0" (this, Statement) => {
    if (is-instance-of Statement Statement10) {
      access LabelledStatement = (Statement "LabelledStatement")
      access __x0__ = (Statement "TopLevelVarDeclaredNames")
      return __x0__
    } else {}
    access __x1__ = (Statement "VarDeclaredNames")
    return __x1__
  }
  */
}
