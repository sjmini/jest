package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ToInt8 {
  val length: Int = 1
  val func: Func = Func("""ToInt8""", List(Id("""argument""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""argument"""))))).setId(2695), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(2696), IReturn(ERef(RefId(Id("""__x0__""")))).setId(2697)).setId(2698), ISeq(List()).setId(2725)).setId(2700), ILet(Id("""number"""), ERef(RefId(Id("""__x0__""")))).setId(2701), IIf(EBOp(OOr, EBOp(OOr, EBOp(OOr, EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""number"""))), ENum(Double.NaN)), EBOp(OEq, ERef(RefId(Id("""number"""))), EINum(0L))), EBOp(OEq, ERef(RefId(Id("""number"""))), ENum(-0.0))), EBOp(OEq, ERef(RefId(Id("""number"""))), ENum(Double.PositiveInfinity))), EBOp(OEq, ERef(RefId(Id("""number"""))), ENum(Double.NegativeInfinity))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EINum(0L))).setId(2703), IReturn(ERef(RefId(Id("""__x1__""")))).setId(2704))).setId(2730), ISeq(List()).setId(2731)).setId(2706), ILet(Id("""int"""), EConvert(ERef(RefId(Id("""number"""))), CNumToInt, List())).setId(2708), ILet(Id("""int8bit"""), EBOp(OUMod, ERef(RefId(Id("""int"""))), EINum(256L))).setId(2710), IIf(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""int8bit"""))), EINum(128L))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OSub, ERef(RefId(Id("""int8bit"""))), EINum(256L)))).setId(2712), IReturn(ERef(RefId(Id("""__x2__""")))).setId(2713))).setId(2737), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""int8bit"""))))).setId(2715), IReturn(ERef(RefId(Id("""__x3__""")))).setId(2716))).setId(2740)).setId(2718))).setId(2742))
  val instToStepMap: Map[Int, Int] = HashMap(2712 -> 0, 2713 -> 0, 2718 -> 0, 2705 -> 1, 2709 -> 3, 2702 -> 0, 2717 -> 0, 2706 -> 2, 2710 -> 0, 2715 -> 0, 2711 -> 0, 2707 -> 2, 2719 -> 0, 2708 -> 3, 2703 -> 1, 2716 -> 0, 2695 -> 0, 2700 -> 0, 2701 -> 0, 2704 -> 1, 2714 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(2712, 2713, 2718, 2702, 2717, 2710, 2715, 2711, 2719, 2714, 2716, 2695, 2700, 2701), 1 -> HashSet(2703, 2705, 2704), 2 -> HashSet(2706, 2707), 3 -> HashSet(2708, 2709))
  /* Beautified form:
  "ToInt8" (argument) => {
    app __x0__ = (ToNumber argument)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let number = __x0__
    if (|| (|| (|| (|| (= number NaN) (= number 0i)) (= number -0.0)) (= number Infinity)) (= number -Infinity)) {
      app __x1__ = (WrapCompletion 0i)
      return __x1__
    } else {}
    let int = (convert number num2int )
    let int8bit = (%% int 256i)
    if (! (< int8bit 128i)) {
      app __x2__ = (WrapCompletion (- int8bit 256i))
      return __x2__
    } else {
      app __x3__ = (WrapCompletion int8bit)
      return __x3__
    }
  }
  */
}
