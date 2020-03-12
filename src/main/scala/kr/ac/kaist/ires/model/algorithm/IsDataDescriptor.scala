package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IsDataDescriptor {
  val length: Int = 1
  val func: Func = Func("""IsDataDescriptor""", List(Id("""Desc""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""Desc"""))), EUndef), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(1170), IReturn(ERef(RefId(Id("""__x0__""")))).setId(1171))).setId(1187), ISeq(List()).setId(1188)).setId(1174), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Value"""))), EAbsent), EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Writable"""))), EAbsent)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(1176), IReturn(ERef(RefId(Id("""__x1__""")))).setId(1177))).setId(1192), ISeq(List()).setId(1193)).setId(1179), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(1181), IReturn(ERef(RefId(Id("""__x2__""")))).setId(1182))).setId(1197))
  val instToStepMap: Map[Int, Int] = HashMap(1179 -> 3, 1183 -> 4, 1174 -> 1, 1178 -> 2, 1182 -> 4, 1170 -> 0, 1175 -> 1, 1177 -> 2, 1181 -> 4, 1180 -> 3, 1172 -> 0, 1171 -> 0, 1176 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(1170, 1171, 1172), 1 -> HashSet(1174, 1175), 2 -> HashSet(1178, 1177, 1176), 3 -> HashSet(1179, 1180), 4 -> HashSet(1183, 1182, 1181))
  /* Beautified form:
  "IsDataDescriptor" (Desc) => {
    if (= Desc undefined) {
      app __x0__ = (WrapCompletion false)
      return __x0__
    } else {}
    if (&& (= Desc["Value"] absent) (= Desc["Writable"] absent)) {
      app __x1__ = (WrapCompletion false)
      return __x1__
    } else {}
    app __x2__ = (WrapCompletion true)
    return __x2__
  }
  */
}
