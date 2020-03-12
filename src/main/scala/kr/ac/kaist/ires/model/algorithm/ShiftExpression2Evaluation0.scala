package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ShiftExpression2Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""ShiftExpression2Evaluation0""", List(Id("""this"""), Id("""ShiftExpression"""), Id("""AdditiveExpression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""ShiftExpression"""))), EStr("""Evaluation""")).setId(20464), ILet(Id("""lref"""), ERef(RefId(Id("""__x0__""")))).setId(20465), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""lref"""))))).setId(20467), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(20468), IReturn(ERef(RefId(Id("""__x1__""")))).setId(20469)).setId(20470), ISeq(List()).setId(20512)).setId(20472), ILet(Id("""lval"""), ERef(RefId(Id("""__x1__""")))).setId(20473), IAccess(Id("""__x2__"""), ERef(RefId(Id("""AdditiveExpression"""))), EStr("""Evaluation""")).setId(20476), ILet(Id("""rref"""), ERef(RefId(Id("""__x2__""")))).setId(20477), IApp(Id("""__x3__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""rref"""))))).setId(20479), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(20480), IReturn(ERef(RefId(Id("""__x3__""")))).setId(20481)).setId(20482), ISeq(List()).setId(20521)).setId(20483), ILet(Id("""rval"""), ERef(RefId(Id("""__x3__""")))).setId(20484), IApp(Id("""__x4__"""), ERef(RefId(Id("""ToInt32"""))), List(ERef(RefId(Id("""lval"""))))).setId(20486), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(20487), IReturn(ERef(RefId(Id("""__x4__""")))).setId(20488)).setId(20489), ISeq(List()).setId(20528)).setId(20490), ILet(Id("""lnum"""), ERef(RefId(Id("""__x4__""")))).setId(20491), IApp(Id("""__x5__"""), ERef(RefId(Id("""ToUint32"""))), List(ERef(RefId(Id("""rval"""))))).setId(20493), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(20494), IReturn(ERef(RefId(Id("""__x5__""")))).setId(20495)).setId(20496), ISeq(List()).setId(20535)).setId(20497), ILet(Id("""rnum"""), ERef(RefId(Id("""__x5__""")))).setId(20498), ILet(Id("""shiftCount"""), EBOp(OBAnd, ERef(RefId(Id("""rnum"""))), EINum(31L))).setId(20500), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OSRShift, ERef(RefId(Id("""lnum"""))), ERef(RefId(Id("""shiftCount""")))))).setId(20502), IReturn(ERef(RefId(Id("""__x6__""")))).setId(20503))).setId(20541))
  val instToStepMap: Map[Int, Int] = HashMap(20473 -> 1, 20499 -> 5, 20500 -> 6, 20485 -> 3, 20504 -> 7, 20493 -> 5, 20476 -> 2, 20486 -> 4, 20501 -> 6, 20479 -> 3, 20497 -> 5, 20467 -> 1, 20483 -> 3, 20491 -> 4, 20492 -> 4, 20503 -> 7, 20464 -> 0, 20484 -> 3, 20477 -> 2, 20465 -> 0, 20472 -> 1, 20490 -> 4, 20466 -> 0, 20478 -> 2, 20502 -> 7, 20474 -> 1, 20498 -> 5)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(20464, 20465, 20466), 5 -> HashSet(20499, 20493, 20497, 20498), 1 -> HashSet(20473, 20472, 20467, 20474), 6 -> HashSet(20500, 20501), 2 -> HashSet(20477, 20476, 20478), 7 -> HashSet(20503, 20504, 20502), 3 -> HashSet(20484, 20485, 20479, 20483), 4 -> HashSet(20490, 20486, 20491, 20492))
  /* Beautified form:
  "ShiftExpression2Evaluation0" (this, ShiftExpression, AdditiveExpression) => {
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
    app __x6__ = (WrapCompletion (>> lnum shiftCount))
    return __x6__
  }
  */
}
