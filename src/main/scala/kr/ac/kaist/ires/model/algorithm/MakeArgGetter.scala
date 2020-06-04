package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object MakeArgGetter {
  val length: Int = 2
  val func: Func = Func("""MakeArgGetter""", List(Id("""name"""), Id("""env""")), None, ISeq(List(ILet(Id("""steps"""), ERef(RefId(Id("""ArgGetter""")))).setId(56316), IApp(Id("""__x0__"""), ERef(RefId(Id("""CreateBuiltinFunction"""))), List(ERef(RefId(Id("""steps"""))), EList(List(EStr("""Name"""), EStr("""Env"""))))).setId(56318), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(56319), IReturn(ERef(RefId(Id("""__x0__""")))).setId(56320)).setId(56321), ISeq(List()).setId(56322)).setId(56323), ILet(Id("""getter"""), ERef(RefId(Id("""__x0__""")))).setId(56324), IAssign(RefProp(RefId(Id("""getter""")), EStr("""Name""")), ERef(RefId(Id("""name""")))).setId(56326), IAssign(RefProp(RefId(Id("""getter""")), EStr("""Env""")), ERef(RefId(Id("""env""")))).setId(56328), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""getter"""))))).setId(56330), IReturn(ERef(RefId(Id("""__x1__""")))).setId(56331))).setId(-1))
  /* Beautified form:
  "MakeArgGetter" (name, env) => {
    let steps = ArgGetter
    app __x0__ = (CreateBuiltinFunction steps (new ["Name", "Env"]))
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let getter = __x0__
    getter["Name"] = name
    getter["Env"] = env
    app __x1__ = (WrapCompletion getter)
    return __x1__
  }
  */
}
