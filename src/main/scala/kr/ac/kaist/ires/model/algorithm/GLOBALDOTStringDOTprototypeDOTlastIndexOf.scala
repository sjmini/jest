package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTStringDOTprototypeDOTlastIndexOf {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.String.prototype.lastIndexOf""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(71615), ILet(Id("""searchString"""), ERef(RefId(Id("""__x0__""")))).setId(71616), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(71618), ILet(Id("""position"""), ERef(RefId(Id("""__x1__""")))).setId(71619), IApp(Id("""__x2__"""), ERef(RefId(Id("""RequireObjectCoercible"""))), List(ERef(RefId(Id("""this"""))))).setId(71621), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(71622), IReturn(ERef(RefId(Id("""__x2__""")))).setId(71623)).setId(71624), ISeq(List()).setId(71625)).setId(71626), ILet(Id("""O"""), ERef(RefId(Id("""__x2__""")))).setId(71627), IApp(Id("""__x3__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""O"""))))).setId(71629), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(71630), IReturn(ERef(RefId(Id("""__x3__""")))).setId(71631)).setId(71632), ISeq(List()).setId(71625)).setId(71633), ILet(Id("""S"""), ERef(RefId(Id("""__x3__""")))).setId(71634), IApp(Id("""__x4__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""searchString"""))))).setId(71636), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(71637), IReturn(ERef(RefId(Id("""__x4__""")))).setId(71638)).setId(71639), ISeq(List()).setId(71625)).setId(71640), ILet(Id("""searchStr"""), ERef(RefId(Id("""__x4__""")))).setId(71641), IApp(Id("""__x5__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""position"""))))).setId(71643), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(71644), IReturn(ERef(RefId(Id("""__x5__""")))).setId(71645)).setId(71646), ISeq(List()).setId(71625)).setId(71647), ILet(Id("""numPos"""), ERef(RefId(Id("""__x5__""")))).setId(71648), IIf(EBOp(OEq, ERef(RefId(Id("""numPos"""))), ENum(Double.NaN)), ILet(Id("""pos"""), ENum(Double.PositiveInfinity)).setId(71650), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""ToInteger"""))), List(ERef(RefId(Id("""numPos"""))))).setId(71652), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(71653), IReturn(ERef(RefId(Id("""__x6__""")))).setId(71654)).setId(71655), ISeq(List()).setId(71625)).setId(71656), ILet(Id("""pos"""), ERef(RefId(Id("""__x6__""")))).setId(71657))).setId(71658)).setId(71659), ILet(Id("""len"""), ERef(RefProp(RefId(Id("""S""")), EStr("""length""")))).setId(71661), IApp(Id("""__x7__"""), ERef(RefId(Id("""max"""))), List(ERef(RefId(Id("""pos"""))), EINum(0L))).setId(71663), IApp(Id("""__x8__"""), ERef(RefId(Id("""min"""))), List(ERef(RefId(Id("""__x7__"""))), ERef(RefId(Id("""len"""))))).setId(71664), ILet(Id("""start"""), ERef(RefId(Id("""__x8__""")))).setId(71665), ILet(Id("""searchLen"""), ERef(RefProp(RefId(Id("""searchStr""")), EStr("""length""")))).setId(71667), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ENotSupported("""NumberOp"""))).setId(71669), IReturn(ERef(RefId(Id("""__x9__""")))).setId(71670))).setId(-1))
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
