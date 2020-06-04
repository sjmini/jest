package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AwaitFulfilledFunctions {
  val length: Int = 0
  val func: Func = Func("""AwaitFulfilledFunctions""", List(), None, ISeq(List(ILet(Id("""F"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""Function""")))).setId(294), ILet(Id("""asyncContext"""), ERef(RefProp(RefId(Id("""F""")), EStr("""AsyncContext""")))).setId(296), ILet(Id("""prevContext"""), ERef(RefId(Id("""GLOBAL_context""")))).setId(298), IAssign(RefId(Id("""GLOBAL_context""")), ENull).setId(300), IAssign(RefId(Id("""prevContext""")), ENull).setId(301), IAppend(ERef(RefId(Id("""asyncContext"""))), ERef(RefId(Id("""GLOBAL_executionStack""")))).setId(303), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))).setId(304), IApp(Id("""__x0__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""value"""))))).setId(306), IWithCont(Id("""__x1__"""), List(), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""asyncContext""")), EStr("""ReturnCont"""))), EAbsent), IAssign(RefProp(RefId(Id("""asyncContext""")), EStr("""ReturnCont""")), EList(List())).setId(307), ISeq(List()).setId(309)).setId(310), IAppend(ERef(RefId(Id("""__x1__"""))), ERef(RefProp(RefId(Id("""asyncContext""")), EStr("""ReturnCont""")))).setId(311), IApp(Id("""__x2__"""), ERef(RefProp(RefId(Id("""asyncContext""")), EStr("""ResumeCont"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(312))).setId(313)).setId(314), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(317), IReturn(ERef(RefId(Id("""__x3__""")))).setId(318))).setId(-1))
  /* Beautified form:
  "AwaitFulfilledFunctions" () => {
    let F = GLOBAL_context["Function"]
    let asyncContext = F["AsyncContext"]
    let prevContext = GLOBAL_context
    GLOBAL_context = null
    prevContext = null
    append asyncContext -> GLOBAL_executionStack
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    app __x0__ = (NormalCompletion value)
    withcont __x1__ () ={
      if (= asyncContext["ReturnCont"] absent) asyncContext["ReturnCont"] = (new []) else {}
      append __x1__ -> asyncContext["ReturnCont"]
      app __x2__ = (asyncContext["ResumeCont"] __x0__)
    }
    app __x3__ = (WrapCompletion undefined)
    return __x3__
  }
  */
}
