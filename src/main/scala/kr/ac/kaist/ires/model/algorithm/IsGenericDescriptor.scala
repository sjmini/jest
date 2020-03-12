package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IsGenericDescriptor {
  val length: Int = 1
  val func: Func = Func("""IsGenericDescriptor""", List(Id("""Desc""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""Desc"""))), EUndef), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(1211), IReturn(ERef(RefId(Id("""__x0__""")))).setId(1212))).setId(1230), ISeq(List()).setId(1231)).setId(1215), IApp(Id("""__x1__"""), ERef(RefId(Id("""IsAccessorDescriptor"""))), List(ERef(RefId(Id("""Desc"""))))).setId(1217), IApp(Id("""__x2__"""), ERef(RefId(Id("""IsDataDescriptor"""))), List(ERef(RefId(Id("""Desc"""))))).setId(1218), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(false)), EBOp(OEq, ERef(RefId(Id("""__x2__"""))), EBool(false))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(1219), IReturn(ERef(RefId(Id("""__x3__""")))).setId(1220))).setId(1237), ISeq(List()).setId(1238)).setId(1222), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(1224), IReturn(ERef(RefId(Id("""__x4__""")))).setId(1225))).setId(1242))
  val instToStepMap: Map[Int, Int] = HashMap(1211 -> 0, 1222 -> 3, 1215 -> 1, 1219 -> 2, 1226 -> 4, 1224 -> 4, 1213 -> 0, 1225 -> 4, 1221 -> 2, 1216 -> 1, 1212 -> 0, 1223 -> 3, 1217 -> 3, 1218 -> 3, 1220 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(1211, 1213, 1212), 1 -> HashSet(1215, 1216), 2 -> HashSet(1219, 1220, 1221), 3 -> HashSet(1222, 1218, 1223, 1217), 4 -> HashSet(1226, 1224, 1225))
  /* Beautified form:
  "IsGenericDescriptor" (Desc) => {
    if (= Desc undefined) {
      app __x0__ = (WrapCompletion false)
      return __x0__
    } else {}
    app __x1__ = (IsAccessorDescriptor Desc)
    app __x2__ = (IsDataDescriptor Desc)
    if (&& (= __x1__ false) (= __x2__ false)) {
      app __x3__ = (WrapCompletion true)
      return __x3__
    } else {}
    app __x4__ = (WrapCompletion false)
    return __x4__
  }
  */
}
