package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ToUint16 {
  val length: Int = 1
  val func: Func = Func("""ToUint16""", List(Id("""argument""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""argument"""))))).setId(2640), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(2641), IReturn(ERef(RefId(Id("""__x0__""")))).setId(2642)).setId(2643), ISeq(List()).setId(2665)).setId(2645), ILet(Id("""number"""), ERef(RefId(Id("""__x0__""")))).setId(2646), IIf(EBOp(OOr, EBOp(OOr, EBOp(OOr, EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""number"""))), ENum(Double.NaN)), EBOp(OEq, ERef(RefId(Id("""number"""))), EINum(0L))), EBOp(OEq, ERef(RefId(Id("""number"""))), ENum(-0.0))), EBOp(OEq, ERef(RefId(Id("""number"""))), ENum(Double.PositiveInfinity))), EBOp(OEq, ERef(RefId(Id("""number"""))), ENum(Double.NegativeInfinity))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EINum(0L))).setId(2648), IReturn(ERef(RefId(Id("""__x1__""")))).setId(2649))).setId(2670), ISeq(List()).setId(2671)).setId(2651), ILet(Id("""int"""), EConvert(ERef(RefId(Id("""number"""))), CNumToInt, List())).setId(2653), ILet(Id("""int16bit"""), EBOp(OUMod, ERef(RefId(Id("""int"""))), EINum(65536L))).setId(2655), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""int16bit"""))))).setId(2657), IReturn(ERef(RefId(Id("""__x2__""")))).setId(2658))).setId(2677))
  val instToStepMap: Map[Int, Int] = HashMap(2659 -> 1, 2654 -> 3, 2650 -> 1, 2646 -> 0, 2653 -> 3, 2649 -> 1, 2645 -> 0, 2657 -> 1, 2647 -> 0, 2652 -> 2, 2656 -> 0, 2658 -> 1, 2648 -> 1, 2651 -> 2, 2640 -> 0, 2655 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(2646, 2645, 2647, 2656, 2640, 2655), 1 -> HashSet(2659, 2650, 2649, 2657, 2658, 2648), 2 -> HashSet(2652, 2651), 3 -> HashSet(2654, 2653))
  /* Beautified form:
  "ToUint16" (argument) => {
    app __x0__ = (ToNumber argument)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let number = __x0__
    if (|| (|| (|| (|| (= number NaN) (= number 0i)) (= number -0.0)) (= number Infinity)) (= number -Infinity)) {
      app __x1__ = (WrapCompletion 0i)
      return __x1__
    } else {}
    let int = (convert number num2int )
    let int16bit = (%% int 65536i)
    app __x2__ = (WrapCompletion int16bit)
    return __x2__
  }
  */
}
