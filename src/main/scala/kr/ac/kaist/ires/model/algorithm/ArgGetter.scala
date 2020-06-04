package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ArgGetter {
  val length: Int = 2
  val func: Func = Func("""ArgGetter""", List(Id("""_0"""), Id("""_1"""), Id("""_2"""), Id("""f""")), None, ISeq(List(ILet(Id("""f"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""Function""")))).setId(56360), ILet(Id("""name"""), ERef(RefProp(RefId(Id("""f""")), EStr("""Name""")))).setId(56362), ILet(Id("""env"""), ERef(RefProp(RefId(Id("""f""")), EStr("""Env""")))).setId(56364), IApp(Id("""__x0__"""), ERef(RefProp(RefId(Id("""env""")), EStr("""GetBindingValue"""))), List(ERef(RefId(Id("""env"""))), ERef(RefId(Id("""name"""))), EBool(false))).setId(56366), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(56367), IReturn(ERef(RefId(Id("""__x1__""")))).setId(56368))).setId(-1))
  /* Beautified form:
  "ArgGetter" (_0, _1, _2, f) => {
    let f = GLOBAL_context["Function"]
    let name = f["Name"]
    let env = f["Env"]
    app __x0__ = (env["GetBindingValue"] env name false)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
