package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object thisSymbolValue {
  val length: Int = 0
  val func: Func = Func("""thisSymbolValue""", List(Id("""value""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""value"""))))).setId(67721), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Symbol""")))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""value"""))))).setId(67722), IReturn(ERef(RefId(Id("""__x1__""")))).setId(67723))).setId(67744), ISeq(List()).setId(67745)).setId(67726), IApp(Id("""__x2__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""value"""))))).setId(67728), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""__x2__"""))), ERef(RefId(Id("""Object""")))), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""value""")), EStr("""SymbolData"""))), EAbsent))), ISeq(List(ILet(Id("""s"""), ERef(RefProp(RefId(Id("""value""")), EStr("""SymbolData""")))).setId(67729), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""s"""))))).setId(67731), IReturn(ERef(RefId(Id("""__x3__""")))).setId(67732))).setId(67751), ISeq(List()).setId(67752)).setId(67735), IApp(Id("""__x4__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(67737), IReturn(ERef(RefId(Id("""__x4__""")))).setId(67738))).setId(67756))
  val instToStepMap: Map[Int, Int] = HashMap(67736 -> 7, 67726 -> 1, 67721 -> 1, 67731 -> 6, 67735 -> 7, 67724 -> 0, 67732 -> 6, 67728 -> 7, 67733 -> 6, 67729 -> 6, 67730 -> 6, 67739 -> 8, 67725 -> 6, 67738 -> 8, 67723 -> 0, 67737 -> 8, 67722 -> 0, 67734 -> 6, 67727 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(67724, 67723, 67722), 5 -> HashSet(67725), 1 -> HashSet(67726, 67721, 67727), 6 -> HashSet(67731, 67725, 67732, 67733, 67729, 67734, 67730), 7 -> HashSet(67736, 67735, 67728), 8 -> HashSet(67739, 67738, 67737), 4 -> HashSet(67729, 67730))
  /* Beautified form:
  "thisSymbolValue" (value) => {
    app __x0__ = (Type value)
    if (= __x0__ Symbol) {
      app __x1__ = (WrapCompletion value)
      return __x1__
    } else {}
    app __x2__ = (Type value)
    if (&& (= __x2__ Object) (! (= value["SymbolData"] absent))) {
      let s = value["SymbolData"]
      app __x3__ = (WrapCompletion s)
      return __x3__
    } else {}
    app __x4__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
    return __x4__
  }
  */
}
