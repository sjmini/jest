package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ConciseBody0EvaluateBody0 {
  val length: Int = 0
  val func: Func = Func("""ConciseBody0EvaluateBody0""", List(Id("""this"""), Id("""AssignmentExpression"""), Id("""functionObject"""), Id("""argumentsList""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""FunctionDeclarationInstantiation"""))), List(ERef(RefId(Id("""functionObject"""))), ERef(RefId(Id("""argumentsList"""))))).setId(39301), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(39302), IReturn(ERef(RefId(Id("""__x0__""")))).setId(39303)).setId(39304), ISeq(List()).setId(39328)).setId(39306), IExpr(ERef(RefId(Id("""__x0__""")))).setId(39307), IAccess(Id("""__x1__"""), ERef(RefId(Id("""AssignmentExpression"""))), EStr("""Evaluation""")).setId(39310), ILet(Id("""exprRef"""), ERef(RefId(Id("""__x1__""")))).setId(39311), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""exprRef"""))))).setId(39313), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(39314), IReturn(ERef(RefId(Id("""__x2__""")))).setId(39315)).setId(39316), ISeq(List()).setId(39337)).setId(39317), ILet(Id("""exprValue"""), ERef(RefId(Id("""__x2__""")))).setId(39318), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EMap(Ty("""Completion"""), List((EStr("""Type"""), ERef(RefId(Id("""CONST_return""")))), (EStr("""Value"""), ERef(RefId(Id("""exprValue""")))), (EStr("""Target"""), ERef(RefId(Id("""CONST_empty""")))))))).setId(39320), IReturn(ERef(RefId(Id("""__x3__""")))).setId(39321))).setId(39342))
  val instToStepMap: Map[Int, Int] = HashMap(39317 -> 2, 39311 -> 1, 39320 -> 3, 39322 -> 3, 39312 -> 1, 39318 -> 2, 39313 -> 2, 39321 -> 3, 39308 -> 0, 39310 -> 1, 39306 -> 0, 39319 -> 2, 39307 -> 0, 39301 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(39308, 39306, 39307, 39301), 1 -> HashSet(39310, 39311, 39312), 2 -> HashSet(39317, 39319, 39318, 39313), 3 -> HashSet(39321, 39320, 39322))
  /* Beautified form:
  "ConciseBody0EvaluateBody0" (this, AssignmentExpression, functionObject, argumentsList) => {
    app __x0__ = (FunctionDeclarationInstantiation functionObject argumentsList)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    __x0__
    access __x1__ = (AssignmentExpression "Evaluation")
    let exprRef = __x1__
    app __x2__ = (GetValue exprRef)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let exprValue = __x2__
    app __x3__ = (WrapCompletion (new Completion("Type" -> CONST_return, "Value" -> exprValue, "Target" -> CONST_empty)))
    return __x3__
  }
  */
}
