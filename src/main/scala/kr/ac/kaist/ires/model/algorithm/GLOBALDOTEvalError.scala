package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTEvalError {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.EvalError""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(68205), ILet(Id("""message"""), ERef(RefId(Id("""__x0__""")))).setId(68206), IIf(EBOp(OEq, ERef(RefId(Id("""NewTarget"""))), EUndef), ILet(Id("""newTarget"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""Function""")))).setId(68208), ILet(Id("""newTarget"""), ERef(RefId(Id("""NewTarget""")))).setId(68210)).setId(68212), IApp(Id("""__x1__"""), ERef(RefId(Id("""OrdinaryCreateFromConstructor"""))), List(ERef(RefId(Id("""newTarget"""))), EStr("""%EvalErrorPrototype%"""), EList(List(EStr("""ErrorData"""))))).setId(68214), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(68215), IReturn(ERef(RefId(Id("""__x1__""")))).setId(68216)).setId(68217), ISeq(List()).setId(68218)).setId(68219), ILet(Id("""O"""), ERef(RefId(Id("""__x1__""")))).setId(68220), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""message"""))), EUndef)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""message"""))))).setId(68222), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(68223), IReturn(ERef(RefId(Id("""__x2__""")))).setId(68224)).setId(68225), ISeq(List()).setId(68218)).setId(68226), ILet(Id("""msg"""), ERef(RefId(Id("""__x2__""")))).setId(68227), ILet(Id("""msgDesc"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""msg""")))), (EStr("""Writable"""), EBool(true)), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(true))))).setId(68229), IApp(Id("""__x3__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""O"""))), EStr("""message"""), ERef(RefId(Id("""msgDesc"""))))).setId(68231), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(68232), IReturn(ERef(RefId(Id("""__x3__""")))).setId(68233)).setId(68234), ISeq(List()).setId(68218)).setId(68235), IExpr(ERef(RefId(Id("""__x3__""")))).setId(68236))).setId(68238), ISeq(List()).setId(68218)).setId(68239), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""O"""))))).setId(68241), IReturn(ERef(RefId(Id("""__x4__""")))).setId(68242))).setId(-1))
  /* Beautified form:
  "GLOBAL.EvalError" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let message = __x0__
    if (= NewTarget undefined) let newTarget = GLOBAL_context["Function"] else let newTarget = NewTarget
    app __x1__ = (OrdinaryCreateFromConstructor newTarget "%EvalErrorPrototype%" (new ["ErrorData"]))
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let O = __x1__
    if (! (= message undefined)) {
      app __x2__ = (ToString message)
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      let msg = __x2__
      let msgDesc = (new PropertyDescriptor("Value" -> msg, "Writable" -> true, "Enumerable" -> false, "Configurable" -> true))
      app __x3__ = (DefinePropertyOrThrow O "message" msgDesc)
      if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      __x3__
    } else {}
    app __x4__ = (WrapCompletion O)
    return __x4__
  }
  */
}
