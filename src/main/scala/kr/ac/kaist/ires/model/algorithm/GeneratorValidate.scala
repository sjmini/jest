package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GeneratorValidate {
  val length: Int = 1
  val func: Func = Func("""GeneratorValidate""", List(Id("""generator""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""RequireInternalSlot"""))), List(ERef(RefId(Id("""generator"""))), EStr("""GeneratorState"""))).setId(10419), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(10420), IReturn(ERef(RefId(Id("""__x0__""")))).setId(10421)).setId(10422), ISeq(List()).setId(10442)).setId(10424), IExpr(ERef(RefId(Id("""__x0__""")))).setId(10425), ILet(Id("""state"""), ERef(RefProp(RefId(Id("""generator""")), EStr("""GeneratorState""")))).setId(10427), IIf(EBOp(OEq, ERef(RefId(Id("""state"""))), EStr("""executing""")), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(10429), IReturn(ERef(RefId(Id("""__x1__""")))).setId(10430))).setId(10448), ISeq(List()).setId(10449)).setId(10432), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""state"""))))).setId(10434), IReturn(ERef(RefId(Id("""__x2__""")))).setId(10435))).setId(10453))
  val instToStepMap: Map[Int, Int] = HashMap(10431 -> 3, 10433 -> 4, 10427 -> 2, 10419 -> 0, 10426 -> 0, 10423 -> 1, 10429 -> 3, 10424 -> 0, 10428 -> 2, 10434 -> 5, 10430 -> 3, 10425 -> 0, 10435 -> 5, 10436 -> 5, 10432 -> 4)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(10419, 10426, 10425, 10424), 5 -> HashSet(10434, 10435, 10436), 1 -> HashSet(10423), 2 -> HashSet(10427, 10428), 3 -> HashSet(10431, 10430, 10429), 4 -> HashSet(10433, 10432))
  /* Beautified form:
  "GeneratorValidate" (generator) => {
    app __x0__ = (RequireInternalSlot generator "GeneratorState")
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    __x0__
    let state = generator["GeneratorState"]
    if (= state "executing") {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    app __x2__ = (WrapCompletion state)
    return __x2__
  }
  */
}
