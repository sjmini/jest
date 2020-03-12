package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncConciseBody0EvaluateBody0 {
  val length: Int = 0
  val func: Func = Func("""AsyncConciseBody0EvaluateBody0""", List(Id("""this"""), Id("""AssignmentExpression"""), Id("""functionObject"""), Id("""argumentsList""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""NewPromiseCapability"""))), List(ERef(RefId(Id("""INTRINSIC_Promise"""))))).setId(44392), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(44393), IReturn(ERef(RefId(Id("""__x0__""")))).setId(44394)).setId(44395), ISeq(List()).setId(44430)).setId(44397), ILet(Id("""promiseCapability"""), ERef(RefId(Id("""__x0__""")))).setId(44398), IApp(Id("""__x1__"""), ERef(RefId(Id("""FunctionDeclarationInstantiation"""))), List(ERef(RefId(Id("""functionObject"""))), ERef(RefId(Id("""argumentsList"""))))).setId(44400), ILet(Id("""declResult"""), ERef(RefId(Id("""__x1__""")))).setId(44401), IApp(Id("""__x2__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""declResult"""))))).setId(44403), IIf(EUOp(ONot, ERef(RefId(Id("""__x2__""")))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""AsyncFunctionStart"""))), List(ERef(RefId(Id("""promiseCapability"""))), ERef(RefId(Id("""AssignmentExpression"""))))).setId(44404), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(44405), IReturn(ERef(RefId(Id("""__x3__""")))).setId(44406)).setId(44407), ISeq(List()).setId(44440)).setId(44408), IExpr(ERef(RefId(Id("""__x3__""")))).setId(44409))).setId(44443), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""declResult""")), EStr("""Value"""))))))).setId(44412), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(44413), IReturn(ERef(RefId(Id("""__x4__""")))).setId(44414)).setId(44415), ISeq(List()).setId(44448)).setId(44416), IExpr(ERef(RefId(Id("""__x4__""")))).setId(44417))).setId(44451)).setId(44420), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EMap(Ty("""Completion"""), List((EStr("""Type"""), ERef(RefId(Id("""CONST_return""")))), (EStr("""Value"""), ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise""")))), (EStr("""Target"""), ERef(RefId(Id("""CONST_empty""")))))))).setId(44422), IReturn(ERef(RefId(Id("""__x5__""")))).setId(44423))).setId(44455))
  val instToStepMap: Map[Int, Int] = HashMap(44401 -> 1, 44418 -> 7, 44411 -> 4, 44421 -> 7, 44404 -> 4, 44420 -> 7, 44403 -> 7, 44400 -> 1, 44409 -> 4, 44424 -> 8, 44402 -> 1, 44423 -> 8, 44398 -> 0, 44408 -> 4, 44422 -> 8, 44416 -> 7, 44399 -> 0, 44412 -> 7, 44417 -> 7, 44392 -> 0, 44397 -> 0, 44410 -> 4, 44419 -> 7)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(44398, 44399, 44392, 44397), 1 -> HashSet(44401, 44400, 44402), 7 -> HashSet(44418, 44421, 44416, 44420, 44403, 44419, 44412, 44417), 8 -> HashSet(44422, 44424, 44423), 4 -> HashSet(44408, 44411, 44404, 44409, 44410))
  /* Beautified form:
  "AsyncConciseBody0EvaluateBody0" (this, AssignmentExpression, functionObject, argumentsList) => {
    app __x0__ = (NewPromiseCapability INTRINSIC_Promise)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let promiseCapability = __x0__
    app __x1__ = (FunctionDeclarationInstantiation functionObject argumentsList)
    let declResult = __x1__
    app __x2__ = (IsAbruptCompletion declResult)
    if (! __x2__) {
      app __x3__ = (AsyncFunctionStart promiseCapability AssignmentExpression)
      if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      __x3__
    } else {
      app __x4__ = (Call promiseCapability["Reject"] undefined (new [declResult["Value"]]))
      if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      __x4__
    }
    app __x5__ = (WrapCompletion (new Completion("Type" -> CONST_return, "Value" -> promiseCapability["Promise"], "Target" -> CONST_empty)))
    return __x5__
  }
  */
}
