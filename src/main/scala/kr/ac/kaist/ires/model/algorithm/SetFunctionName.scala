package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SetFunctionName {
  val length: Int = 2
  val func: Func = Func("""SetFunctionName""", List(Id("""F"""), Id("""name"""), Id("""prefix""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""name"""))))).setId(52460), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Symbol""")))), ISeq(List(ILet(Id("""description"""), ERef(RefProp(RefId(Id("""name""")), EStr("""Description""")))).setId(52461), IIf(EBOp(OEq, ERef(RefId(Id("""description"""))), EUndef), IAssign(RefId(Id("""name""")), EStr("""""")).setId(52463), IAssign(RefId(Id("""name""")), EBOp(OPlus, EBOp(OPlus, EStr("""["""), ERef(RefId(Id("""description""")))), EStr("""]"""))).setId(52465)).setId(52467))).setId(52469), ISeq(List()).setId(52459)).setId(52470), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""prefix"""))), EAbsent)), IAssign(RefId(Id("""name""")), EBOp(OPlus, EBOp(OPlus, ERef(RefId(Id("""prefix"""))), EStr(""" """)), ERef(RefId(Id("""name"""))))).setId(52472), ISeq(List()).setId(52459)).setId(52475), IApp(Id("""__x1__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""F"""))), EStr("""name"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""name""")))), (EStr("""Writable"""), EBool(false)), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(true)))))).setId(52477), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(52478), IReturn(ERef(RefId(Id("""__x1__""")))).setId(52479)).setId(52480), ISeq(List()).setId(52459)).setId(52481), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(52482), IReturn(ERef(RefId(Id("""__x2__""")))).setId(52483))).setId(-1))
  /* Beautified form:
  "SetFunctionName" (F, name, prefix) => {
    app __x0__ = (Type name)
    if (= __x0__ Symbol) {
      let description = name["Description"]
      if (= description undefined) name = "" else name = (+ (+ "[" description) "]")
    } else {}
    if (! (= prefix absent)) name = (+ (+ prefix " ") name) else {}
    app __x1__ = (DefinePropertyOrThrow F "name" (new PropertyDescriptor("Value" -> name, "Writable" -> false, "Enumerable" -> false, "Configurable" -> true)))
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
