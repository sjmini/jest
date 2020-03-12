package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Call {
  val length: Int = 2
  val func: Func = Func("""Call""", List(Id("""F"""), Id("""V"""), Id("""argumentsList""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""argumentsList"""))), EAbsent), IAssign(RefId(Id("""argumentsList""")), EList(List())).setId(5434), ISeq(List()).setId(5455)).setId(5437), IApp(Id("""__x0__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""F"""))))).setId(5439), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(false)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(5440), IReturn(ERef(RefId(Id("""__x1__""")))).setId(5441))).setId(5460), ISeq(List()).setId(5461)).setId(5443), IApp(Id("""__x2__"""), ERef(RefProp(RefId(Id("""F""")), EStr("""Call"""))), List(ERef(RefId(Id("""F"""))), ERef(RefId(Id("""V"""))), ERef(RefId(Id("""argumentsList"""))))).setId(5445), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(5446), IReturn(ERef(RefId(Id("""__x2__""")))).setId(5447)).setId(5448), ISeq(List()).setId(5467)).setId(5449), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(5450), IReturn(ERef(RefId(Id("""__x3__""")))).setId(5451))).setId(5471))
  val instToStepMap: Map[Int, Int] = HashMap(5437 -> 1, 5444 -> 3, 5434 -> 0, 5451 -> 4, 5449 -> 4, 5439 -> 3, 5442 -> 2, 5435 -> 0, 5452 -> 4, 5450 -> 4, 5445 -> 4, 5443 -> 3, 5438 -> 1, 5441 -> 2, 5440 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(5434, 5435), 1 -> HashSet(5437, 5438), 2 -> HashSet(5442, 5441, 5440), 3 -> HashSet(5444, 5443, 5439), 4 -> HashSet(5451, 5449, 5452, 5450, 5445))
  /* Beautified form:
  "Call" (F, V, argumentsList) => {
    if (= argumentsList absent) argumentsList = (new []) else {}
    app __x0__ = (IsCallable F)
    if (= __x0__ false) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    app __x2__ = (F["Call"] F V argumentsList)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
