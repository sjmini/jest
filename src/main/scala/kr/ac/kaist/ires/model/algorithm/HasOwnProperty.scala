package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object HasOwnProperty {
  val length: Int = 2
  val func: Func = Func("""HasOwnProperty""", List(Id("""O"""), Id("""P""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefProp(RefId(Id("""O""")), EStr("""GetOwnProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""P"""))))).setId(5388), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(5389), IReturn(ERef(RefId(Id("""__x0__""")))).setId(5390)).setId(5391), ISeq(List()).setId(5408)).setId(5392), ILet(Id("""desc"""), ERef(RefId(Id("""__x0__""")))).setId(5393), IIf(EBOp(OEq, ERef(RefId(Id("""desc"""))), EUndef), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(5395), IReturn(ERef(RefId(Id("""__x1__""")))).setId(5396))).setId(5413), ISeq(List()).setId(5414)).setId(5398), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(5400), IReturn(ERef(RefId(Id("""__x2__""")))).setId(5401))).setId(5418))
  val instToStepMap: Map[Int, Int] = HashMap(5393 -> 2, 5397 -> 3, 5401 -> 5, 5396 -> 3, 5387 -> 1, 5402 -> 5, 5400 -> 5, 5395 -> 3, 5392 -> 2, 5394 -> 2, 5398 -> 4, 5388 -> 2, 5399 -> 4)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(5387), 5 -> HashSet(5401, 5402, 5400), 1 -> HashSet(5387), 2 -> HashSet(5393, 5392, 5388, 5394), 3 -> HashSet(5397, 5396, 5395), 4 -> HashSet(5399, 5398))
  /* Beautified form:
  "HasOwnProperty" (O, P) => {
    app __x0__ = (O["GetOwnProperty"] O P)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let desc = __x0__
    if (= desc undefined) {
      app __x1__ = (WrapCompletion false)
      return __x1__
    } else {}
    app __x2__ = (WrapCompletion true)
    return __x2__
  }
  */
}
