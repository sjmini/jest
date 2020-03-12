package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ToUint8 {
  val length: Int = 1
  val func: Func = Func("""ToUint8""", List(Id("""argument""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""argument"""))))).setId(2765), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(2766), IReturn(ERef(RefId(Id("""__x0__""")))).setId(2767)).setId(2768), ISeq(List()).setId(2790)).setId(2770), ILet(Id("""number"""), ERef(RefId(Id("""__x0__""")))).setId(2771), IIf(EBOp(OOr, EBOp(OOr, EBOp(OOr, EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""number"""))), ENum(Double.NaN)), EBOp(OEq, ERef(RefId(Id("""number"""))), EINum(0L))), EBOp(OEq, ERef(RefId(Id("""number"""))), ENum(-0.0))), EBOp(OEq, ERef(RefId(Id("""number"""))), ENum(Double.PositiveInfinity))), EBOp(OEq, ERef(RefId(Id("""number"""))), ENum(Double.NegativeInfinity))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EINum(0L))).setId(2773), IReturn(ERef(RefId(Id("""__x1__""")))).setId(2774))).setId(2795), ISeq(List()).setId(2796)).setId(2776), ILet(Id("""int"""), EConvert(ERef(RefId(Id("""number"""))), CNumToInt, List())).setId(2778), ILet(Id("""int8bit"""), EBOp(OUMod, ERef(RefId(Id("""int"""))), EINum(256L))).setId(2780), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""int8bit"""))))).setId(2782), IReturn(ERef(RefId(Id("""__x2__""")))).setId(2783))).setId(2802))
  val instToStepMap: Map[Int, Int] = HashMap(2778 -> 3, 2776 -> 2, 2772 -> 0, 2773 -> 1, 2781 -> 0, 2774 -> 1, 2780 -> 0, 2784 -> 1, 2775 -> 1, 2779 -> 3, 2783 -> 1, 2771 -> 0, 2782 -> 1, 2777 -> 2, 2770 -> 0, 2765 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(2772, 2781, 2780, 2771, 2770, 2765), 1 -> HashSet(2782, 2773, 2774, 2784, 2775, 2783), 2 -> HashSet(2776, 2777), 3 -> HashSet(2778, 2779))
  /* Beautified form:
  "ToUint8" (argument) => {
    app __x0__ = (ToNumber argument)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let number = __x0__
    if (|| (|| (|| (|| (= number NaN) (= number 0i)) (= number -0.0)) (= number Infinity)) (= number -Infinity)) {
      app __x1__ = (WrapCompletion 0i)
      return __x1__
    } else {}
    let int = (convert number num2int )
    let int8bit = (%% int 256i)
    app __x2__ = (WrapCompletion int8bit)
    return __x2__
  }
  */
}
