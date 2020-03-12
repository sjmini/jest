package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CallExpression3Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""CallExpression3Evaluation0""", List(Id("""this"""), Id("""CallExpression"""), Id("""Arguments""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""CallExpression"""))), EStr("""Evaluation""")).setId(17343), ILet(Id("""ref"""), ERef(RefId(Id("""__x0__""")))).setId(17344), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""ref"""))))).setId(17346), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(17347), IReturn(ERef(RefId(Id("""__x1__""")))).setId(17348)).setId(17349), ISeq(List()).setId(17374)).setId(17351), ILet(Id("""func"""), ERef(RefId(Id("""__x1__""")))).setId(17352), ILet(Id("""thisCall"""), ERef(RefId(Id("""this""")))).setId(17354), IApp(Id("""__x2__"""), ERef(RefId(Id("""IsInTailPosition"""))), List(ERef(RefId(Id("""thisCall"""))))).setId(17356), ILet(Id("""tailCall"""), ERef(RefId(Id("""__x2__""")))).setId(17357), IApp(Id("""__x3__"""), ERef(RefId(Id("""EvaluateCall"""))), List(ERef(RefId(Id("""func"""))), ERef(RefId(Id("""ref"""))), ERef(RefId(Id("""Arguments"""))), ERef(RefId(Id("""tailCall"""))))).setId(17359), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(17360), IReturn(ERef(RefId(Id("""__x3__""")))).setId(17361)).setId(17362), ISeq(List()).setId(17384)).setId(17363), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(17364), IReturn(ERef(RefId(Id("""__x4__""")))).setId(17365))).setId(17388))
  val instToStepMap: Map[Int, Int] = HashMap(17358 -> 3, 17343 -> 0, 17366 -> 4, 17354 -> 2, 17363 -> 4, 17353 -> 1, 17346 -> 1, 17357 -> 3, 17345 -> 0, 17364 -> 4, 17344 -> 0, 17351 -> 1, 17356 -> 3, 17352 -> 1, 17359 -> 4, 17355 -> 2, 17365 -> 4)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(17343, 17345, 17344), 1 -> HashSet(17353, 17346, 17351, 17352), 2 -> HashSet(17354, 17355), 3 -> HashSet(17358, 17357, 17356), 4 -> HashSet(17366, 17363, 17364, 17359, 17365))
  /* Beautified form:
  "CallExpression3Evaluation0" (this, CallExpression, Arguments) => {
    access __x0__ = (CallExpression "Evaluation")
    let ref = __x0__
    app __x1__ = (GetValue ref)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let func = __x1__
    let thisCall = this
    app __x2__ = (IsInTailPosition thisCall)
    let tailCall = __x2__
    app __x3__ = (EvaluateCall func ref Arguments tailCall)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
