package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GeneratorBody0EvaluateBody0 {
  val length: Int = 0
  val func: Func = Func("""GeneratorBody0EvaluateBody0""", List(Id("""this"""), Id("""FunctionBody"""), Id("""functionObject"""), Id("""argumentsList""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""FunctionDeclarationInstantiation"""))), List(ERef(RefId(Id("""functionObject"""))), ERef(RefId(Id("""argumentsList"""))))).setId(40057), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(40058), IReturn(ERef(RefId(Id("""__x0__""")))).setId(40059)).setId(40060), ISeq(List()).setId(40083)).setId(40062), IExpr(ERef(RefId(Id("""__x0__""")))).setId(40063), IApp(Id("""__x1__"""), ERef(RefId(Id("""OrdinaryCreateFromConstructor"""))), List(ERef(RefId(Id("""functionObject"""))), EStr("""%GeneratorPrototype%"""), EList(List(EStr("""GeneratorState"""), EStr("""GeneratorContext"""))))).setId(40065), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(40066), IReturn(ERef(RefId(Id("""__x1__""")))).setId(40067)).setId(40068), ISeq(List()).setId(40090)).setId(40069), ILet(Id("""G"""), ERef(RefId(Id("""__x1__""")))).setId(40070), IApp(Id("""__x2__"""), ERef(RefId(Id("""GeneratorStart"""))), List(ERef(RefId(Id("""G"""))), ERef(RefId(Id("""FunctionBody"""))))).setId(40072), IExpr(ERef(RefId(Id("""__x2__""")))).setId(40073), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EMap(Ty("""Completion"""), List((EStr("""Type"""), ERef(RefId(Id("""CONST_return""")))), (EStr("""Value"""), ERef(RefId(Id("""G""")))), (EStr("""Target"""), ERef(RefId(Id("""CONST_empty""")))))))).setId(40075), IReturn(ERef(RefId(Id("""__x3__""")))).setId(40076))).setId(40097))
  val instToStepMap: Map[Int, Int] = HashMap(40065 -> 1, 40075 -> 3, 40070 -> 1, 40064 -> 0, 40071 -> 1, 40074 -> 2, 40063 -> 0, 40073 -> 2, 40072 -> 2, 40077 -> 3, 40062 -> 0, 40069 -> 1, 40076 -> 3, 40057 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(40064, 40063, 40062, 40057), 1 -> HashSet(40065, 40070, 40071, 40069), 2 -> HashSet(40074, 40073, 40072), 3 -> HashSet(40075, 40077, 40076))
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
