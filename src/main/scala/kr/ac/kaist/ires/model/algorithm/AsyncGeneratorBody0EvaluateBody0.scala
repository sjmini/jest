package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncGeneratorBody0EvaluateBody0 {
  val length: Int = 0
  val func: Func = Func("""AsyncGeneratorBody0EvaluateBody0""", List(Id("""this"""), Id("""FunctionBody"""), Id("""functionObject"""), Id("""argumentsList""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""FunctionDeclarationInstantiation"""))), List(ERef(RefId(Id("""functionObject"""))), ERef(RefId(Id("""argumentsList"""))))).setId(41516), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(41517), IReturn(ERef(RefId(Id("""__x0__""")))).setId(41518)).setId(41519), ISeq(List()).setId(41546)).setId(41521), IExpr(ERef(RefId(Id("""__x0__""")))).setId(41522), IApp(Id("""__x1__"""), ERef(RefId(Id("""OrdinaryCreateFromConstructor"""))), List(ERef(RefId(Id("""functionObject"""))), EStr("""%AsyncGeneratorPrototype%"""), EList(List(EStr("""AsyncGeneratorState"""), EStr("""AsyncGeneratorContext"""), EStr("""AsyncGeneratorQueue"""))))).setId(41524), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(41525), IReturn(ERef(RefId(Id("""__x1__""")))).setId(41526)).setId(41527), ISeq(List()).setId(41553)).setId(41528), ILet(Id("""generator"""), ERef(RefId(Id("""__x1__""")))).setId(41529), IApp(Id("""__x2__"""), ERef(RefId(Id("""AsyncGeneratorStart"""))), List(ERef(RefId(Id("""generator"""))), ERef(RefId(Id("""FunctionBody"""))))).setId(41531), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(41532), IReturn(ERef(RefId(Id("""__x2__""")))).setId(41533)).setId(41534), ISeq(List()).setId(41560)).setId(41535), IExpr(ERef(RefId(Id("""__x2__""")))).setId(41536), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EMap(Ty("""Completion"""), List((EStr("""Type"""), ERef(RefId(Id("""CONST_return""")))), (EStr("""Value"""), ERef(RefId(Id("""generator""")))), (EStr("""Target"""), ERef(RefId(Id("""CONST_empty""")))))))).setId(41538), IReturn(ERef(RefId(Id("""__x3__""")))).setId(41539))).setId(41565))
  val instToStepMap: Map[Int, Int] = HashMap(41524 -> 1, 41528 -> 1, 41521 -> 0, 41538 -> 3, 41523 -> 0, 41540 -> 3, 41531 -> 2, 41535 -> 2, 41539 -> 3, 41536 -> 2, 41530 -> 1, 41537 -> 2, 41529 -> 1, 41516 -> 0, 41522 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(41521, 41523, 41516, 41522), 1 -> HashSet(41524, 41528, 41530, 41529), 2 -> HashSet(41536, 41537, 41531, 41535), 3 -> HashSet(41539, 41538, 41540))
  /* Beautified form:
  "AsyncGeneratorBody0EvaluateBody0" (this, FunctionBody, functionObject, argumentsList) => {
    app __x0__ = (FunctionDeclarationInstantiation functionObject argumentsList)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    __x0__
    app __x1__ = (OrdinaryCreateFromConstructor functionObject "%AsyncGeneratorPrototype%" (new ["AsyncGeneratorState", "AsyncGeneratorContext", "AsyncGeneratorQueue"]))
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let generator = __x1__
    app __x2__ = (AsyncGeneratorStart generator FunctionBody)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    __x2__
    app __x3__ = (WrapCompletion (new Completion("Type" -> CONST_return, "Value" -> generator, "Target" -> CONST_empty)))
    return __x3__
  }
  */
}
