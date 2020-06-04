package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateMethodProperty {
  val length: Int = 3
  val func: Func = Func("""CreateMethodProperty""", List(Id("""O"""), Id("""P"""), Id("""V""")), None, ISeq(List(ILet(Id("""newDesc"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""V""")))), (EStr("""Writable"""), EBool(true)), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(true))))).setId(5122), IApp(Id("""__x0__"""), ERef(RefProp(RefId(Id("""O""")), EStr("""DefineOwnProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""newDesc"""))))).setId(5124), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(5125), IReturn(ERef(RefId(Id("""__x0__""")))).setId(5126)).setId(5127), ISeq(List()).setId(5121)).setId(5128), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(5129), IReturn(ERef(RefId(Id("""__x1__""")))).setId(5130))).setId(-1))
  /* Beautified form:
  "CreateMethodProperty" (O, P, V) => {
    let newDesc = (new PropertyDescriptor("Value" -> V, "Writable" -> true, "Enumerable" -> false, "Configurable" -> true))
    app __x0__ = (O["DefineOwnProperty"] O P newDesc)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
