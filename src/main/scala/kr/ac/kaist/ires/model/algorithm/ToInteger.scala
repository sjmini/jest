package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ToInteger {
  val length: Int = 1
  val func: Func = Func("""ToInteger""", List(Id("""argument""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""argument"""))))).setId(2383), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(2384), IReturn(ERef(RefId(Id("""__x0__""")))).setId(2385)).setId(2386), ISeq(List()).setId(2409)).setId(2388), ILet(Id("""number"""), ERef(RefId(Id("""__x0__""")))).setId(2389), IIf(EBOp(OEq, ERef(RefId(Id("""number"""))), ENum(Double.NaN)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EINum(0L))).setId(2391), IReturn(ERef(RefId(Id("""__x1__""")))).setId(2392))).setId(2414), ISeq(List()).setId(2415)).setId(2394), IIf(EBOp(OOr, EBOp(OOr, EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""number"""))), EINum(0L)), EBOp(OEq, ERef(RefId(Id("""number"""))), ENum(-0.0))), EBOp(OEq, ERef(RefId(Id("""number"""))), ENum(Double.PositiveInfinity))), EBOp(OEq, ERef(RefId(Id("""number"""))), ENum(Double.NegativeInfinity))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""number"""))))).setId(2396), IReturn(ERef(RefId(Id("""__x2__""")))).setId(2397))).setId(2419), ISeq(List()).setId(2420)).setId(2399), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EConvert(ERef(RefId(Id("""number"""))), CNumToInt, List()))).setId(2401), IReturn(ERef(RefId(Id("""__x3__""")))).setId(2402))).setId(2424))
  val instToStepMap: Map[Int, Int] = HashMap(2395 -> 2, 2400 -> 4, 2392 -> 1, 2396 -> 3, 2402 -> 5, 2391 -> 1, 2383 -> 0, 2397 -> 3, 2399 -> 4, 2403 -> 5, 2388 -> 0, 2393 -> 1, 2398 -> 3, 2401 -> 5, 2390 -> 0, 2389 -> 0, 2394 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(2388, 2383, 2390, 2389), 5 -> HashSet(2403, 2402, 2401), 1 -> HashSet(2392, 2391, 2393), 2 -> HashSet(2395, 2394), 3 -> HashSet(2396, 2398, 2397), 4 -> HashSet(2400, 2399))
  /* Beautified form:
  "ToInteger" (argument) => {
    app __x0__ = (ToNumber argument)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let number = __x0__
    if (= number NaN) {
      app __x1__ = (WrapCompletion 0i)
      return __x1__
    } else {}
    if (|| (|| (|| (= number 0i) (= number -0.0)) (= number Infinity)) (= number -Infinity)) {
      app __x2__ = (WrapCompletion number)
      return __x2__
    } else {}
    app __x3__ = (WrapCompletion (convert number num2int ))
    return __x3__
  }
  */
}
