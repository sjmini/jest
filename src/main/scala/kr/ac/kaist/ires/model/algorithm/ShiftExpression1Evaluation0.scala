package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ShiftExpression1Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""ShiftExpression1Evaluation0""", List(Id("""this"""), Id("""ShiftExpression"""), Id("""AdditiveExpression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""ShiftExpression"""))), EStr("""Evaluation""")).setId(20349), ILet(Id("""lref"""), ERef(RefId(Id("""__x0__""")))).setId(20350), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""lref"""))))).setId(20352), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(20353), IReturn(ERef(RefId(Id("""__x1__""")))).setId(20354)).setId(20355), ISeq(List()).setId(20397)).setId(20357), ILet(Id("""lval"""), ERef(RefId(Id("""__x1__""")))).setId(20358), IAccess(Id("""__x2__"""), ERef(RefId(Id("""AdditiveExpression"""))), EStr("""Evaluation""")).setId(20361), ILet(Id("""rref"""), ERef(RefId(Id("""__x2__""")))).setId(20362), IApp(Id("""__x3__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""rref"""))))).setId(20364), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(20365), IReturn(ERef(RefId(Id("""__x3__""")))).setId(20366)).setId(20367), ISeq(List()).setId(20406)).setId(20368), ILet(Id("""rval"""), ERef(RefId(Id("""__x3__""")))).setId(20369), IApp(Id("""__x4__"""), ERef(RefId(Id("""ToInt32"""))), List(ERef(RefId(Id("""lval"""))))).setId(20371), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(20372), IReturn(ERef(RefId(Id("""__x4__""")))).setId(20373)).setId(20374), ISeq(List()).setId(20413)).setId(20375), ILet(Id("""lnum"""), ERef(RefId(Id("""__x4__""")))).setId(20376), IApp(Id("""__x5__"""), ERef(RefId(Id("""ToUint32"""))), List(ERef(RefId(Id("""rval"""))))).setId(20378), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(20379), IReturn(ERef(RefId(Id("""__x5__""")))).setId(20380)).setId(20381), ISeq(List()).setId(20420)).setId(20382), ILet(Id("""rnum"""), ERef(RefId(Id("""__x5__""")))).setId(20383), ILet(Id("""shiftCount"""), EBOp(OBAnd, ERef(RefId(Id("""rnum"""))), EINum(31L))).setId(20385), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OLShift, ERef(RefId(Id("""lnum"""))), ERef(RefId(Id("""shiftCount""")))))).setId(20387), IReturn(ERef(RefId(Id("""__x6__""")))).setId(20388))).setId(20426))
  val instToStepMap: Map[Int, Int] = HashMap(20369 -> 3, 20352 -> 1, 20377 -> 4, 20364 -> 3, 20370 -> 3, 20387 -> 7, 20359 -> 1, 20388 -> 7, 20383 -> 5, 20371 -> 4, 20375 -> 4, 20385 -> 6, 20382 -> 5, 20389 -> 7, 20386 -> 6, 20376 -> 4, 20368 -> 3, 20358 -> 1, 20349 -> 0, 20363 -> 2, 20384 -> 5, 20362 -> 2, 20351 -> 0, 20361 -> 2, 20378 -> 5, 20350 -> 0, 20357 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(20349, 20351, 20350), 5 -> HashSet(20384, 20383, 20382, 20378), 1 -> HashSet(20352, 20358, 20359, 20357), 6 -> HashSet(20386, 20385), 2 -> HashSet(20363, 20362, 20361), 7 -> HashSet(20387, 20388, 20389), 3 -> HashSet(20369, 20364, 20368, 20370), 4 -> HashSet(20376, 20377, 20371, 20375))
  /* Beautified form:
  "ShiftExpression1Evaluation0" (this, ShiftExpression, AdditiveExpression) => {
    access __x0__ = (ShiftExpression "Evaluation")
    let lref = __x0__
    app __x1__ = (GetValue lref)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let lval = __x1__
    access __x2__ = (AdditiveExpression "Evaluation")
    let rref = __x2__
    app __x3__ = (GetValue rref)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let rval = __x3__
    app __x4__ = (ToInt32 lval)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let lnum = __x4__
    app __x5__ = (ToUint32 rval)
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let rnum = __x5__
    let shiftCount = (& rnum 31i)
    app __x6__ = (WrapCompletion (<< lnum shiftCount))
    return __x6__
  }
  */
}
