package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IsAccessorDescriptor {
  val length: Int = 1
  val func: Func = Func("""IsAccessorDescriptor""", List(Id("""Desc""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""Desc"""))), EUndef), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(1129), IReturn(ERef(RefId(Id("""__x0__""")))).setId(1130))).setId(1146), ISeq(List()).setId(1147)).setId(1133), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Get"""))), EAbsent), EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Set"""))), EAbsent)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(1135), IReturn(ERef(RefId(Id("""__x1__""")))).setId(1136))).setId(1151), ISeq(List()).setId(1152)).setId(1138), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(1140), IReturn(ERef(RefId(Id("""__x2__""")))).setId(1141))).setId(1156))
  val instToStepMap: Map[Int, Int] = HashMap(1142 -> 4, 1137 -> 2, 1136 -> 2, 1138 -> 3, 1131 -> 0, 1135 -> 2, 1139 -> 3, 1134 -> 1, 1130 -> 0, 1133 -> 1, 1129 -> 0, 1141 -> 4, 1140 -> 4)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(1131, 1130, 1129), 1 -> HashSet(1134, 1133), 2 -> HashSet(1137, 1136, 1135), 3 -> HashSet(1138, 1139), 4 -> HashSet(1142, 1141, 1140))
  /* Beautified form:
  "IsAccessorDescriptor" (Desc) => {
    if (= Desc undefined) {
      app __x0__ = (WrapCompletion false)
      return __x0__
    } else {}
    if (&& (= Desc["Get"] absent) (= Desc["Set"] absent)) {
      app __x1__ = (WrapCompletion false)
      return __x1__
    } else {}
    app __x2__ = (WrapCompletion true)
    return __x2__
  }
  */
}
