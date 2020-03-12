package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IteratorComplete {
  val length: Int = 1
  val func: Func = Func("""IteratorComplete""", List(Id("""iterResult""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""iterResult"""))), EStr("""done"""))).setId(7339), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(7340), IReturn(ERef(RefId(Id("""__x0__""")))).setId(7341)).setId(7342), ISeq(List()).setId(7357)).setId(7343), IApp(Id("""__x1__"""), ERef(RefId(Id("""ToBoolean"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(7344), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(7345), IReturn(ERef(RefId(Id("""__x1__""")))).setId(7346)).setId(7347), ISeq(List()).setId(7363)).setId(7348), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(7349), IReturn(ERef(RefId(Id("""__x2__""")))).setId(7350))).setId(7367))
  val instToStepMap: Map[Int, Int] = HashMap(7343 -> 1, 7349 -> 1, 7350 -> 1, 7339 -> 1, 7351 -> 1, 7348 -> 1, 7344 -> 1, 7338 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(7338), 1 -> HashSet(7343, 7349, 7350, 7339, 7351, 7348, 7344))
  /* Beautified form:
  "IteratorComplete" (iterResult) => {
    app __x0__ = (Get iterResult "done")
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (ToBoolean __x0__)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
