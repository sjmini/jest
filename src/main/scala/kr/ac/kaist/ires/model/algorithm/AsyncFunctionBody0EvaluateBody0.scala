package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncFunctionBody0EvaluateBody0 {
  val length: Int = 0
  val func: Func = Func("""AsyncFunctionBody0EvaluateBody0""", List(Id("""this"""), Id("""FunctionBody"""), Id("""functionObject"""), Id("""argumentsList""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""NewPromiseCapability"""))), List(ERef(RefId(Id("""INTRINSIC_Promise"""))))).setId(43608), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(43609), IReturn(ERef(RefId(Id("""__x0__""")))).setId(43610)).setId(43611), ISeq(List()).setId(43646)).setId(43613), ILet(Id("""promiseCapability"""), ERef(RefId(Id("""__x0__""")))).setId(43614), IApp(Id("""__x1__"""), ERef(RefId(Id("""FunctionDeclarationInstantiation"""))), List(ERef(RefId(Id("""functionObject"""))), ERef(RefId(Id("""argumentsList"""))))).setId(43616), ILet(Id("""declResult"""), ERef(RefId(Id("""__x1__""")))).setId(43617), IApp(Id("""__x2__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""declResult"""))))).setId(43619), IIf(EUOp(ONot, ERef(RefId(Id("""__x2__""")))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""AsyncFunctionStart"""))), List(ERef(RefId(Id("""promiseCapability"""))), ERef(RefId(Id("""FunctionBody"""))))).setId(43620), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(43621), IReturn(ERef(RefId(Id("""__x3__""")))).setId(43622)).setId(43623), ISeq(List()).setId(43656)).setId(43624), IExpr(ERef(RefId(Id("""__x3__""")))).setId(43625))).setId(43659), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""declResult""")), EStr("""Value"""))))))).setId(43628), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(43629), IReturn(ERef(RefId(Id("""__x4__""")))).setId(43630)).setId(43631), ISeq(List()).setId(43664)).setId(43632), IExpr(ERef(RefId(Id("""__x4__""")))).setId(43633))).setId(43667)).setId(43636), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EMap(Ty("""Completion"""), List((EStr("""Type"""), ERef(RefId(Id("""CONST_return""")))), (EStr("""Value"""), ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise""")))), (EStr("""Target"""), ERef(RefId(Id("""CONST_empty""")))))))).setId(43638), IReturn(ERef(RefId(Id("""__x5__""")))).setId(43639))).setId(43671))
  val instToStepMap: Map[Int, Int] = HashMap(43615 -> 0, 43624 -> 4, 43625 -> 4, 43620 -> 4, 43635 -> 7, 43628 -> 7, 43614 -> 0, 43617 -> 1, 43637 -> 7, 43627 -> 4, 43618 -> 1, 43639 -> 8, 43626 -> 4, 43640 -> 8, 43619 -> 7, 43613 -> 0, 43636 -> 7, 43638 -> 8, 43632 -> 7, 43616 -> 1, 43633 -> 7, 43634 -> 7, 43608 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(43615, 43614, 43613, 43608), 1 -> HashSet(43617, 43618, 43616), 7 -> HashSet(43635, 43628, 43636, 43632, 43637, 43633, 43634, 43619), 8 -> HashSet(43638, 43639, 43640), 4 -> HashSet(43624, 43625, 43620, 43627, 43626))
  /* Beautified form:
  "AsyncFunctionBody0EvaluateBody0" (this, FunctionBody, functionObject, argumentsList) => {
    app __x0__ = (NewPromiseCapability INTRINSIC_Promise)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let promiseCapability = __x0__
    app __x1__ = (FunctionDeclarationInstantiation functionObject argumentsList)
    let declResult = __x1__
    app __x2__ = (IsAbruptCompletion declResult)
    if (! __x2__) {
      app __x3__ = (AsyncFunctionStart promiseCapability FunctionBody)
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
