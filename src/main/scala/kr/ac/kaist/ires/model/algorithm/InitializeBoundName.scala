package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object InitializeBoundName {
  val length: Int = 3
  val func: Func = Func("""InitializeBoundName""", List(Id("""name"""), Id("""value"""), Id("""environment""")), None, IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""environment"""))), EUndef)), ISeq(List(ILet(Id("""env"""), ERef(RefProp(RefId(Id("""environment""")), EStr("""EnvironmentRecord""")))).setId(13296), IApp(Id("""__x0__"""), ERef(RefProp(RefId(Id("""env""")), EStr("""InitializeBinding"""))), List(ERef(RefId(Id("""env"""))), ERef(RefId(Id("""name"""))), ERef(RefId(Id("""value"""))))).setId(13298), IExpr(ERef(RefId(Id("""__x0__""")))).setId(13299), IApp(Id("""__x1__"""), ERef(RefId(Id("""NormalCompletion"""))), List(EUndef)).setId(13301), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(13302), IReturn(ERef(RefId(Id("""__x2__""")))).setId(13303))).setId(13305), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""ResolveBinding"""))), List(ERef(RefId(Id("""name"""))))).setId(13306), ILet(Id("""lhs"""), ERef(RefId(Id("""__x3__""")))).setId(13307), IApp(Id("""__x4__"""), ERef(RefId(Id("""PutValue"""))), List(ERef(RefId(Id("""lhs"""))), ERef(RefId(Id("""value"""))))).setId(13309), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(13310), IReturn(ERef(RefId(Id("""__x4__""")))).setId(13311)).setId(13312), ISeq(List()).setId(13295)).setId(13313), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(13314), IReturn(ERef(RefId(Id("""__x5__""")))).setId(13315))).setId(13317)).setId(13318))
  /* Beautified form:
  "InitializeBoundName" (name, value, environment) => if (! (= environment undefined)) {
    let env = environment["EnvironmentRecord"]
    app __x0__ = (env["InitializeBinding"] env name value)
    __x0__
    app __x1__ = (NormalCompletion undefined)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  } else {
    app __x3__ = (ResolveBinding name)
    let lhs = __x3__
    app __x4__ = (PutValue lhs value)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }
  */
}
