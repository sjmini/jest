package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object MakeClassConstructor {
  val length: Int = 1
  val func: Func = Func("""MakeClassConstructor""", List(Id("""F""")), None, ISeq(List(IAssign(RefProp(RefId(Id("""F""")), EStr("""FunctionKind""")), EStr("""classConstructor""")).setId(52424), IApp(Id("""__x0__"""), ERef(RefId(Id("""NormalCompletion"""))), List(EUndef)).setId(52426), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(52427), IReturn(ERef(RefId(Id("""__x1__""")))).setId(52428))).setId(-1))
  /* Beautified form:
  "MakeClassConstructor" (F) => {
    F["FunctionKind"] = "classConstructor"
    app __x0__ = (NormalCompletion undefined)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
