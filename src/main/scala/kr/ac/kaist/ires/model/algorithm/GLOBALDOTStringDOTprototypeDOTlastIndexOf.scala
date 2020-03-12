package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTStringDOTprototypeDOTlastIndexOf {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.String.prototype.lastIndexOf""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(71615), ILet(Id("""searchString"""), ERef(RefId(Id("""__x0__""")))).setId(71616), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(71618), ILet(Id("""position"""), ERef(RefId(Id("""__x1__""")))).setId(71619), IApp(Id("""__x2__"""), ERef(RefId(Id("""RequireObjectCoercible"""))), List(ERef(RefId(Id("""this"""))))).setId(71621), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(71622), IReturn(ERef(RefId(Id("""__x2__""")))).setId(71623)).setId(71624), ISeq(List()).setId(71681)).setId(71626), ILet(Id("""O"""), ERef(RefId(Id("""__x2__""")))).setId(71627), IApp(Id("""__x3__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""O"""))))).setId(71629), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(71630), IReturn(ERef(RefId(Id("""__x3__""")))).setId(71631)).setId(71632), ISeq(List()).setId(71688)).setId(71633), ILet(Id("""S"""), ERef(RefId(Id("""__x3__""")))).setId(71634), IApp(Id("""__x4__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""searchString"""))))).setId(71636), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(71637), IReturn(ERef(RefId(Id("""__x4__""")))).setId(71638)).setId(71639), ISeq(List()).setId(71695)).setId(71640), ILet(Id("""searchStr"""), ERef(RefId(Id("""__x4__""")))).setId(71641), IApp(Id("""__x5__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""position"""))))).setId(71643), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(71644), IReturn(ERef(RefId(Id("""__x5__""")))).setId(71645)).setId(71646), ISeq(List()).setId(71702)).setId(71647), ILet(Id("""numPos"""), ERef(RefId(Id("""__x5__""")))).setId(71648), IIf(EBOp(OEq, ERef(RefId(Id("""numPos"""))), ENum(Double.NaN)), ILet(Id("""pos"""), ENum(Double.PositiveInfinity)).setId(71650), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""ToInteger"""))), List(ERef(RefId(Id("""numPos"""))))).setId(71652), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(71653), IReturn(ERef(RefId(Id("""__x6__""")))).setId(71654)).setId(71655), ISeq(List()).setId(71710)).setId(71656), ILet(Id("""pos"""), ERef(RefId(Id("""__x6__""")))).setId(71657))).setId(71713)).setId(71659), ILet(Id("""len"""), ERef(RefProp(RefId(Id("""S""")), EStr("""length""")))).setId(71661), IApp(Id("""__x7__"""), ERef(RefId(Id("""max"""))), List(ERef(RefId(Id("""pos"""))), EINum(0L))).setId(71663), IApp(Id("""__x8__"""), ERef(RefId(Id("""min"""))), List(ERef(RefId(Id("""__x7__"""))), ERef(RefId(Id("""len"""))))).setId(71664), ILet(Id("""start"""), ERef(RefId(Id("""__x8__""")))).setId(71665), ILet(Id("""searchLen"""), ERef(RefProp(RefId(Id("""searchStr""")), EStr("""length""")))).setId(71667), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ENotSupported("""NumberOp"""))).setId(71669), IReturn(ERef(RefId(Id("""__x9__""")))).setId(71670))).setId(71722))
  val instToStepMap: Map[Int, Int] = HashMap(71671 -> 11, 71666 -> 9, 71641 -> 4, 71649 -> 5, 71634 -> 3, 71664 -> 9, 71656 -> 7, 71647 -> 5, 71669 -> 11, 71640 -> 4, 71652 -> 7, 71667 -> 10, 71650 -> 7, 71617 -> 0, 71663 -> 9, 71625 -> 6, 71670 -> 11, 71621 -> 2, 71657 -> 7, 71628 -> 2, 71660 -> 7, 71642 -> 4, 71615 -> 0, 71633 -> 3, 71665 -> 9, 71643 -> 5, 71648 -> 5, 71626 -> 2, 71658 -> 7, 71651 -> 7, 71629 -> 3, 71620 -> 1, 71616 -> 0, 71661 -> 8, 71619 -> 1, 71659 -> 7, 71627 -> 2, 71635 -> 3, 71662 -> 8, 71618 -> 1, 71668 -> 10, 71636 -> 4)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(71617, 71615, 71616), 5 -> HashSet(71649, 71647, 71643, 71648), 10 -> HashSet(71667, 71668), 1 -> HashSet(71620, 71619, 71618), 6 -> HashSet(71625), 9 -> HashSet(71666, 71663, 71664, 71665), 2 -> HashSet(71626, 71627, 71621, 71628), 7 -> HashSet(71657, 71660, 71656, 71652, 71659, 71650, 71658, 71651), 3 -> HashSet(71634, 71633, 71629, 71635), 11 -> HashSet(71671, 71670, 71669), 8 -> HashSet(71661, 71662), 4 -> HashSet(71641, 71642, 71640, 71636))
  /* Beautified form:
  "GLOBAL.String.prototype.lastIndexOf" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let searchString = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let position = __x1__
    app __x2__ = (RequireObjectCoercible this)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let O = __x2__
    app __x3__ = (ToString O)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let S = __x3__
    app __x4__ = (ToString searchString)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let searchStr = __x4__
    app __x5__ = (ToNumber position)
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let numPos = __x5__
    if (= numPos NaN) let pos = Infinity else {
      app __x6__ = (ToInteger numPos)
      if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      let pos = __x6__
    }
    let len = S["length"]
    app __x7__ = (max pos 0i)
    app __x8__ = (min __x7__ len)
    let start = __x8__
    let searchLen = searchStr["length"]
    app __x9__ = (WrapCompletion !!! "NumberOp")
    return __x9__
  }
  */
}
