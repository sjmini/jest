package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object thisStringValue {
  val length: Int = 0
  val func: Func = Func("""thisStringValue""", List(Id("""value""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""value"""))))).setId(70674), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""String""")))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""value"""))))).setId(70675), IReturn(ERef(RefId(Id("""__x1__""")))).setId(70676))).setId(70697), ISeq(List()).setId(70698)).setId(70679), IApp(Id("""__x2__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""value"""))))).setId(70681), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""__x2__"""))), ERef(RefId(Id("""Object""")))), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""value""")), EStr("""StringData"""))), EAbsent))), ISeq(List(ILet(Id("""s"""), ERef(RefProp(RefId(Id("""value""")), EStr("""StringData""")))).setId(70682), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""s"""))))).setId(70684), IReturn(ERef(RefId(Id("""__x3__""")))).setId(70685))).setId(70704), ISeq(List()).setId(70705)).setId(70688), IApp(Id("""__x4__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(70690), IReturn(ERef(RefId(Id("""__x4__""")))).setId(70691))).setId(70709))
  val instToStepMap: Map[Int, Int] = HashMap(70684 -> 6, 70691 -> 8, 70687 -> 6, 70680 -> 1, 70688 -> 7, 70685 -> 6, 70679 -> 1, 70681 -> 7, 70678 -> 6, 70686 -> 6, 70677 -> 0, 70692 -> 8, 70690 -> 8, 70676 -> 0, 70674 -> 1, 70689 -> 7, 70675 -> 0, 70682 -> 6, 70683 -> 6)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(70676, 70675, 70677), 5 -> HashSet(70678), 1 -> HashSet(70680, 70674, 70679), 6 -> HashSet(70684, 70687, 70685, 70678, 70686, 70682, 70683), 7 -> HashSet(70688, 70689, 70681), 8 -> HashSet(70691, 70690, 70692), 4 -> HashSet(70682, 70683))
  /* Beautified form:
  "thisStringValue" (value) => {
    app __x0__ = (Type value)
    if (= __x0__ String) {
      app __x1__ = (WrapCompletion value)
      return __x1__
    } else {}
    app __x2__ = (Type value)
    if (&& (= __x2__ Object) (! (= value["StringData"] absent))) {
      let s = value["StringData"]
      app __x3__ = (WrapCompletion s)
      return __x3__
    } else {}
    app __x4__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
    return __x4__
  }
  */
}
