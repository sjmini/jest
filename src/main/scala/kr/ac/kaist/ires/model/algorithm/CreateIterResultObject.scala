package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateIterResultObject {
  val length: Int = 2
  val func: Func = Func("""CreateIterResultObject""", List(Id("""value"""), Id("""done""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefId(Id("""INTRINSIC_ObjectPrototype"""))))).setId(7731), ILet(Id("""obj"""), ERef(RefId(Id("""__x0__""")))).setId(7732), IApp(Id("""__x1__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""obj"""))), EStr("""value"""), ERef(RefId(Id("""value"""))))).setId(7734), IExpr(ERef(RefId(Id("""__x1__""")))).setId(7735), IApp(Id("""__x2__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""obj"""))), EStr("""done"""), ERef(RefId(Id("""done"""))))).setId(7737), IExpr(ERef(RefId(Id("""__x2__""")))).setId(7738), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""obj"""))))).setId(7740), IReturn(ERef(RefId(Id("""__x3__""")))).setId(7741))).setId(-1))
  /* Beautified form:
  "CreateIterResultObject" (value, done) => {
    app __x0__ = (ObjectCreate INTRINSIC_ObjectPrototype)
    let obj = __x0__
    app __x1__ = (CreateDataProperty obj "value" value)
    __x1__
    app __x2__ = (CreateDataProperty obj "done" done)
    __x2__
    app __x3__ = (WrapCompletion obj)
    return __x3__
  }
  */
}
