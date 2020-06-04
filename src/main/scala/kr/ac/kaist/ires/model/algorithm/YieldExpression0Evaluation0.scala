package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object YieldExpression0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""YieldExpression0Evaluation0""", List(Id("""this""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetGeneratorKind"""))), List()).setId(40454), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(40455), IReturn(ERef(RefId(Id("""__x0__""")))).setId(40456)).setId(40457), ISeq(List()).setId(40458)).setId(40459), ILet(Id("""generatorKind"""), ERef(RefId(Id("""__x0__""")))).setId(40460), IIf(EBOp(OEq, ERef(RefId(Id("""generatorKind"""))), ERef(RefId(Id("""CONST_async""")))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""AsyncGeneratorYield"""))), List(EUndef)).setId(40462), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(40463), IReturn(ERef(RefId(Id("""__x1__""")))).setId(40464)).setId(40465), ISeq(List()).setId(40458)).setId(40466), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(40467), IReturn(ERef(RefId(Id("""__x2__""")))).setId(40468))).setId(40469), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(EUndef, EBool(false))).setId(40470), IApp(Id("""__x4__"""), ERef(RefId(Id("""GeneratorYield"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(40471), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(40472), IReturn(ERef(RefId(Id("""__x4__""")))).setId(40473)).setId(40474), ISeq(List()).setId(40458)).setId(40475), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(40476), IReturn(ERef(RefId(Id("""__x5__""")))).setId(40477))).setId(40478)).setId(40479))).setId(-1))
  /* Beautified form:
  "YieldExpression0Evaluation0" (this) => {
    app __x0__ = (GetGeneratorKind )
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let generatorKind = __x0__
    if (= generatorKind CONST_async) {
      app __x1__ = (AsyncGeneratorYield undefined)
      if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      app __x2__ = (WrapCompletion __x1__)
      return __x2__
    } else {
      app __x3__ = (CreateIterResultObject undefined false)
      app __x4__ = (GeneratorYield __x3__)
      if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      app __x5__ = (WrapCompletion __x4__)
      return __x5__
    }
  }
  */
}
