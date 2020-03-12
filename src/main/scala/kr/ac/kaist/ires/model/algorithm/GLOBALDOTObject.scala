package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTObject {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.Object""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(63636), ILet(Id("""value"""), ERef(RefId(Id("""__x0__""")))).setId(63637), IIf(EUOp(ONot, EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""NewTarget"""))), EUndef), EBOp(OEq, ERef(RefId(Id("""NewTarget"""))), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""Function""")))))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""OrdinaryCreateFromConstructor"""))), List(ERef(RefId(Id("""NewTarget"""))), EStr("""%ObjectPrototype%"""))).setId(63639), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(63640), IReturn(ERef(RefId(Id("""__x1__""")))).setId(63641)).setId(63642), ISeq(List()).setId(63672)).setId(63644), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(63645), IReturn(ERef(RefId(Id("""__x2__""")))).setId(63646))).setId(63676), ISeq(List()).setId(63677)).setId(63649), IIf(EBOp(OOr, EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""value"""))), ENull), EBOp(OEq, ERef(RefId(Id("""value"""))), EUndef)), EBOp(OEq, ERef(RefId(Id("""value"""))), EAbsent)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefId(Id("""INTRINSIC_ObjectPrototype"""))))).setId(63651), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(63652), IReturn(ERef(RefId(Id("""__x4__""")))).setId(63653))).setId(63682), ISeq(List()).setId(63683)).setId(63655), IApp(Id("""__x5__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""value"""))))).setId(63657), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(63658), IReturn(ERef(RefId(Id("""__x5__""")))).setId(63659)).setId(63660), ISeq(List()).setId(63689)).setId(63661), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(63662), IReturn(ERef(RefId(Id("""__x6__""")))).setId(63663))).setId(63693))
  val instToStepMap: Map[Int, Int] = HashMap(63636 -> 0, 63648 -> 3, 63662 -> 7, 63654 -> 5, 63663 -> 7, 63637 -> 0, 63644 -> 3, 63638 -> 0, 63652 -> 5, 63656 -> 6, 63651 -> 5, 63661 -> 7, 63655 -> 6, 63657 -> 7, 63653 -> 5, 63650 -> 4, 63645 -> 3, 63639 -> 3, 63649 -> 4, 63646 -> 3, 63647 -> 3, 63664 -> 7)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(63636, 63637, 63638), 5 -> HashSet(63651, 63653, 63654, 63652), 6 -> HashSet(63655, 63656), 7 -> HashSet(63661, 63657, 63662, 63663, 63664), 3 -> HashSet(63648, 63646, 63644, 63647, 63645, 63639), 4 -> HashSet(63650, 63649))
  /* Beautified form:
  "GLOBAL.Object" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let value = __x0__
    if (! (|| (= NewTarget undefined) (= NewTarget GLOBAL_context["Function"]))) {
      app __x1__ = (OrdinaryCreateFromConstructor NewTarget "%ObjectPrototype%")
      if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      app __x2__ = (WrapCompletion __x1__)
      return __x2__
    } else {}
    if (|| (|| (= value null) (= value undefined)) (= value absent)) {
      app __x3__ = (ObjectCreate INTRINSIC_ObjectPrototype)
      app __x4__ = (WrapCompletion __x3__)
      return __x4__
    } else {}
    app __x5__ = (ToObject value)
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    app __x6__ = (WrapCompletion __x5__)
    return __x6__
  }
  */
}
