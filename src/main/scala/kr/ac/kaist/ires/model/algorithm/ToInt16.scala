package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ToInt16 {
  val length: Int = 1
  val func: Func = Func("""ToInt16""", List(Id("""argument""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""argument"""))))).setId(2570), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(2571), IReturn(ERef(RefId(Id("""__x0__""")))).setId(2572)).setId(2573), ISeq(List()).setId(2600)).setId(2575), ILet(Id("""number"""), ERef(RefId(Id("""__x0__""")))).setId(2576), IIf(EBOp(OOr, EBOp(OOr, EBOp(OOr, EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""number"""))), ENum(Double.NaN)), EBOp(OEq, ERef(RefId(Id("""number"""))), EINum(0L))), EBOp(OEq, ERef(RefId(Id("""number"""))), ENum(-0.0))), EBOp(OEq, ERef(RefId(Id("""number"""))), ENum(Double.PositiveInfinity))), EBOp(OEq, ERef(RefId(Id("""number"""))), ENum(Double.NegativeInfinity))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EINum(0L))).setId(2578), IReturn(ERef(RefId(Id("""__x1__""")))).setId(2579))).setId(2605), ISeq(List()).setId(2606)).setId(2581), ILet(Id("""int"""), EConvert(ERef(RefId(Id("""number"""))), CNumToInt, List())).setId(2583), ILet(Id("""int16bit"""), EBOp(OUMod, ERef(RefId(Id("""int"""))), EINum(65536L))).setId(2585), IIf(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""int16bit"""))), EINum(32768L))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OSub, ERef(RefId(Id("""int16bit"""))), EINum(65536L)))).setId(2587), IReturn(ERef(RefId(Id("""__x2__""")))).setId(2588))).setId(2612), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""int16bit"""))))).setId(2590), IReturn(ERef(RefId(Id("""__x3__""")))).setId(2591))).setId(2615)).setId(2593))).setId(2617))
  val instToStepMap: Map[Int, Int] = HashMap(2590 -> 0, 2586 -> 0, 2589 -> 0, 2577 -> 0, 2581 -> 2, 2592 -> 0, 2582 -> 2, 2588 -> 0, 2576 -> 0, 2587 -> 0, 2583 -> 3, 2580 -> 1, 2575 -> 0, 2585 -> 0, 2570 -> 0, 2593 -> 0, 2578 -> 1, 2579 -> 1, 2584 -> 3, 2591 -> 0, 2594 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(2590, 2575, 2586, 2589, 2577, 2593, 2592, 2588, 2576, 2587, 2585, 2570, 2591, 2594), 1 -> HashSet(2580, 2578, 2579), 2 -> HashSet(2581, 2582), 3 -> HashSet(2584, 2583))
  /* Beautified form:
  "ToInt16" (argument) => {
    app __x0__ = (ToNumber argument)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let number = __x0__
    if (|| (|| (|| (|| (= number NaN) (= number 0i)) (= number -0.0)) (= number Infinity)) (= number -Infinity)) {
      app __x1__ = (WrapCompletion 0i)
      return __x1__
    } else {}
    let int = (convert number num2int )
    let int16bit = (%% int 65536i)
    if (! (< int16bit 32768i)) {
      app __x2__ = (WrapCompletion (- int16bit 65536i))
      return __x2__
    } else {
      app __x3__ = (WrapCompletion int16bit)
      return __x3__
    }
  }
  */
}
