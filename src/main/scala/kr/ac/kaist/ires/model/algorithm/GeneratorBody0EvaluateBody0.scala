package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GeneratorBody0EvaluateBody0 {
  val length: Int = 0
  val func: Func = Func("""GeneratorBody0EvaluateBody0""", List(Id("""this"""), Id("""FunctionBody"""), Id("""functionObject"""), Id("""argumentsList""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""FunctionDeclarationInstantiation"""))), List(ERef(RefId(Id("""functionObject"""))), ERef(RefId(Id("""argumentsList"""))))).setId(40057), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(40058), IReturn(ERef(RefId(Id("""__x0__""")))).setId(40059)).setId(40060), ISeq(List()).setId(40061)).setId(40062), IExpr(ERef(RefId(Id("""__x0__""")))).setId(40063), IApp(Id("""__x1__"""), ERef(RefId(Id("""OrdinaryCreateFromConstructor"""))), List(ERef(RefId(Id("""functionObject"""))), EStr("""%GeneratorPrototype%"""), EList(List(EStr("""GeneratorState"""), EStr("""GeneratorContext"""))))).setId(40065), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(40066), IReturn(ERef(RefId(Id("""__x1__""")))).setId(40067)).setId(40068), ISeq(List()).setId(40061)).setId(40069), ILet(Id("""G"""), ERef(RefId(Id("""__x1__""")))).setId(40070), IApp(Id("""__x2__"""), ERef(RefId(Id("""GeneratorStart"""))), List(ERef(RefId(Id("""G"""))), ERef(RefId(Id("""FunctionBody"""))))).setId(40072), IExpr(ERef(RefId(Id("""__x2__""")))).setId(40073), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EMap(Ty("""Completion"""), List((EStr("""Type"""), ERef(RefId(Id("""CONST_return""")))), (EStr("""Value"""), ERef(RefId(Id("""G""")))), (EStr("""Target"""), ERef(RefId(Id("""CONST_empty""")))))))).setId(40075), IReturn(ERef(RefId(Id("""__x3__""")))).setId(40076))).setId(-1))
  /* Beautified form:
  "GeneratorBody0EvaluateBody0" (this, FunctionBody, functionObject, argumentsList) => {
    app __x0__ = (FunctionDeclarationInstantiation functionObject argumentsList)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    __x0__
    app __x1__ = (OrdinaryCreateFromConstructor functionObject "%GeneratorPrototype%" (new ["GeneratorState", "GeneratorContext"]))
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let G = __x1__
    app __x2__ = (GeneratorStart G FunctionBody)
    __x2__
    app __x3__ = (WrapCompletion (new Completion("Type" -> CONST_return, "Value" -> G, "Target" -> CONST_empty)))
    return __x3__
  }
  */
}
