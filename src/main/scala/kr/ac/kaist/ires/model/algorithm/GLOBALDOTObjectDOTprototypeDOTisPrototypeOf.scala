package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTObjectDOTprototypeDOTisPrototypeOf {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Object.prototype.isPrototypeOf""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(65644), ILet(Id("""V"""), ERef(RefId(Id("""__x0__""")))).setId(65645), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""V"""))))).setId(65647), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(65648), IReturn(ERef(RefId(Id("""__x2__""")))).setId(65649))).setId(65650), ISeq(List()).setId(65651)).setId(65652), IApp(Id("""__x3__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""this"""))))).setId(65654), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(65655), IReturn(ERef(RefId(Id("""__x3__""")))).setId(65656)).setId(65657), ISeq(List()).setId(65651)).setId(65658), ILet(Id("""O"""), ERef(RefId(Id("""__x3__""")))).setId(65659), IWhile(EBool(true), ISeq(List(IApp(Id("""__x4__"""), ERef(RefProp(RefId(Id("""V""")), EStr("""GetPrototypeOf"""))), List(ERef(RefId(Id("""V"""))))).setId(65661), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(65662), IReturn(ERef(RefId(Id("""__x4__""")))).setId(65663)).setId(65664), ISeq(List()).setId(65651)).setId(65665), IAssign(RefId(Id("""V""")), ERef(RefId(Id("""__x4__""")))).setId(65666), IIf(EBOp(OEq, ERef(RefId(Id("""V"""))), ENull), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(65668), IReturn(ERef(RefId(Id("""__x5__""")))).setId(65669))).setId(65670), ISeq(List()).setId(65651)).setId(65671), IApp(Id("""__x6__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""V"""))))).setId(65673), IIf(EBOp(OEq, ERef(RefId(Id("""__x6__"""))), EBool(true)), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(65674), IReturn(ERef(RefId(Id("""__x7__""")))).setId(65675))).setId(65676), ISeq(List()).setId(65651)).setId(65677))).setId(65679)).setId(65680))).setId(-1))
  /* Beautified form:
  "GLOBAL.Object.prototype.isPrototypeOf" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let V = __x0__
    app __x1__ = (Type V)
    if (! (= __x1__ Object)) {
      app __x2__ = (WrapCompletion false)
      return __x2__
    } else {}
    app __x3__ = (ToObject this)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let O = __x3__
    while true {
      app __x4__ = (V["GetPrototypeOf"] V)
      if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      V = __x4__
      if (= V null) {
        app __x5__ = (WrapCompletion false)
        return __x5__
      } else {}
      app __x6__ = (SameValue O V)
      if (= __x6__ true) {
        app __x7__ = (WrapCompletion true)
        return __x7__
      } else {}
    }
  }
  */
}
