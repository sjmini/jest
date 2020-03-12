package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ShiftExpression3Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""ShiftExpression3Evaluation0""", List(Id("""this"""), Id("""ShiftExpression"""), Id("""AdditiveExpression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""ShiftExpression"""))), EStr("""Evaluation""")).setId(20579), ILet(Id("""lref"""), ERef(RefId(Id("""__x0__""")))).setId(20580), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""lref"""))))).setId(20582), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(20583), IReturn(ERef(RefId(Id("""__x1__""")))).setId(20584)).setId(20585), ISeq(List()).setId(20627)).setId(20587), ILet(Id("""lval"""), ERef(RefId(Id("""__x1__""")))).setId(20588), IAccess(Id("""__x2__"""), ERef(RefId(Id("""AdditiveExpression"""))), EStr("""Evaluation""")).setId(20591), ILet(Id("""rref"""), ERef(RefId(Id("""__x2__""")))).setId(20592), IApp(Id("""__x3__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""rref"""))))).setId(20594), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(20595), IReturn(ERef(RefId(Id("""__x3__""")))).setId(20596)).setId(20597), ISeq(List()).setId(20636)).setId(20598), ILet(Id("""rval"""), ERef(RefId(Id("""__x3__""")))).setId(20599), IApp(Id("""__x4__"""), ERef(RefId(Id("""ToUint32"""))), List(ERef(RefId(Id("""lval"""))))).setId(20601), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(20602), IReturn(ERef(RefId(Id("""__x4__""")))).setId(20603)).setId(20604), ISeq(List()).setId(20643)).setId(20605), ILet(Id("""lnum"""), ERef(RefId(Id("""__x4__""")))).setId(20606), IApp(Id("""__x5__"""), ERef(RefId(Id("""ToUint32"""))), List(ERef(RefId(Id("""rval"""))))).setId(20608), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(20609), IReturn(ERef(RefId(Id("""__x5__""")))).setId(20610)).setId(20611), ISeq(List()).setId(20650)).setId(20612), ILet(Id("""rnum"""), ERef(RefId(Id("""__x5__""")))).setId(20613), ILet(Id("""shiftCount"""), EBOp(OBAnd, ERef(RefId(Id("""rnum"""))), EINum(31L))).setId(20615), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OURShift, ERef(RefId(Id("""lnum"""))), ERef(RefId(Id("""shiftCount""")))))).setId(20617), IReturn(ERef(RefId(Id("""__x6__""")))).setId(20618))).setId(20656))
  val instToStepMap: Map[Int, Int] = HashMap(20601 -> 4, 20598 -> 3, 20592 -> 2, 20579 -> 0, 20582 -> 1, 20593 -> 2, 20613 -> 5, 20599 -> 3, 20587 -> 1, 20612 -> 5, 20580 -> 0, 20591 -> 2, 20588 -> 1, 20594 -> 3, 20615 -> 6, 20619 -> 7, 20605 -> 4, 20606 -> 4, 20589 -> 1, 20614 -> 5, 20600 -> 3, 20581 -> 0, 20617 -> 7, 20607 -> 4, 20608 -> 5, 20618 -> 7, 20616 -> 6)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(20579, 20581, 20580), 5 -> HashSet(20614, 20613, 20612, 20608), 1 -> HashSet(20588, 20582, 20589, 20587), 6 -> HashSet(20615, 20616), 2 -> HashSet(20591, 20592, 20593), 7 -> HashSet(20619, 20617, 20618), 3 -> HashSet(20598, 20594, 20600, 20599), 4 -> HashSet(20601, 20605, 20606, 20607))
  /* Beautified form:
  "ShiftExpression3Evaluation0" (this, ShiftExpression, AdditiveExpression) => {
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
    app __x4__ = (ToUint32 lval)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let lnum = __x4__
    app __x5__ = (ToUint32 rval)
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let rnum = __x5__
    let shiftCount = (& rnum 31i)
    app __x6__ = (WrapCompletion (>>> lnum shiftCount))
    return __x6__
  }
  */
}
