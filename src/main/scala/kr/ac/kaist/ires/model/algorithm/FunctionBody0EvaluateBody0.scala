package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object FunctionBody0EvaluateBody0 {
  val length: Int = 0
  val func: Func = Func("""FunctionBody0EvaluateBody0""", List(Id("""this"""), Id("""FunctionStatementList"""), Id("""functionObject"""), Id("""argumentsList""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""FunctionDeclarationInstantiation"""))), List(ERef(RefId(Id("""functionObject"""))), ERef(RefId(Id("""argumentsList"""))))).setId(38130), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(38131), IReturn(ERef(RefId(Id("""__x0__""")))).setId(38132)).setId(38133), ISeq(List()).setId(38148)).setId(38135), IExpr(ERef(RefId(Id("""__x0__""")))).setId(38136), IAccess(Id("""__x1__"""), ERef(RefId(Id("""FunctionStatementList"""))), EStr("""Evaluation""")).setId(38139), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(38140), IReturn(ERef(RefId(Id("""__x2__""")))).setId(38141))).setId(38154))
  val instToStepMap: Map[Int, Int] = HashMap(38135 -> 0, 38140 -> 1, 38136 -> 0, 38139 -> 1, 38142 -> 1, 38141 -> 1, 38130 -> 0, 38137 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(38135, 38136, 38130, 38137), 1 -> HashSet(38140, 38139, 38142, 38141))
  /* Beautified form:
  "FunctionBody0EvaluateBody0" (this, FunctionStatementList, functionObject, argumentsList) => {
    app __x0__ = (FunctionDeclarationInstantiation functionObject argumentsList)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    __x0__
    access __x1__ = (FunctionStatementList "Evaluation")
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
