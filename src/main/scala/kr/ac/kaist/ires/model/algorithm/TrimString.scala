package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TrimString {
  val length: Int = 2
  val func: Func = Func("""TrimString""", List(Id("""string"""), Id("""where""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""RequireObjectCoercible"""))), List(ERef(RefId(Id("""string"""))))).setId(74293), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(74294), IReturn(ERef(RefId(Id("""__x0__""")))).setId(74295)).setId(74296), ISeq(List()).setId(74297)).setId(74298), ILet(Id("""str"""), ERef(RefId(Id("""__x0__""")))).setId(74299), IApp(Id("""__x1__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""str"""))))).setId(74301), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(74302), IReturn(ERef(RefId(Id("""__x1__""")))).setId(74303)).setId(74304), ISeq(List()).setId(74297)).setId(74305), ILet(Id("""S"""), ERef(RefId(Id("""__x1__""")))).setId(74306), IIf(EBOp(OEq, ERef(RefId(Id("""where"""))), EStr("""start""")), ILet(Id("""T"""), ENotSupported("""StringOp""")).setId(74308), IIf(EBOp(OEq, ERef(RefId(Id("""where"""))), EStr("""end""")), ILet(Id("""T"""), ENotSupported("""StringOp""")).setId(74310), ILet(Id("""T"""), ENotSupported("""StringOp""")).setId(74312)).setId(74315)).setId(74317), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""T"""))))).setId(74319), IReturn(ERef(RefId(Id("""__x2__""")))).setId(74320))).setId(-1))
  /* Beautified form:
  "TrimString" (string, where) => {
    app __x0__ = (RequireObjectCoercible string)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let str = __x0__
    app __x1__ = (ToString str)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let S = __x1__
    if (= where "start") let T = !!! "StringOp" else if (= where "end") let T = !!! "StringOp" else let T = !!! "StringOp"
    app __x2__ = (WrapCompletion T)
    return __x2__
  }
  */
}
