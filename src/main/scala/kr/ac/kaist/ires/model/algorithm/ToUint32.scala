package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ToUint32 {
  val length: Int = 1
  val func: Func = Func("""ToUint32""", List(Id("""argument""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""argument"""))))).setId(2515), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(2516), IReturn(ERef(RefId(Id("""__x0__""")))).setId(2517)).setId(2518), ISeq(List()).setId(2540)).setId(2520), ILet(Id("""number"""), ERef(RefId(Id("""__x0__""")))).setId(2521), IIf(EBOp(OOr, EBOp(OOr, EBOp(OOr, EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""number"""))), ENum(Double.NaN)), EBOp(OEq, ERef(RefId(Id("""number"""))), EINum(0L))), EBOp(OEq, ERef(RefId(Id("""number"""))), ENum(-0.0))), EBOp(OEq, ERef(RefId(Id("""number"""))), ENum(Double.PositiveInfinity))), EBOp(OEq, ERef(RefId(Id("""number"""))), ENum(Double.NegativeInfinity))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EINum(0L))).setId(2523), IReturn(ERef(RefId(Id("""__x1__""")))).setId(2524))).setId(2545), ISeq(List()).setId(2546)).setId(2526), ILet(Id("""int"""), EConvert(ERef(RefId(Id("""number"""))), CNumToInt, List())).setId(2528), ILet(Id("""int32bit"""), EBOp(OUMod, ERef(RefId(Id("""int"""))), EINum(4294967296L))).setId(2530), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""int32bit"""))))).setId(2532), IReturn(ERef(RefId(Id("""__x2__""")))).setId(2533))).setId(2552))
  val instToStepMap: Map[Int, Int] = HashMap(2527 -> 2, 2531 -> 0, 2528 -> 3, 2515 -> 0, 2529 -> 3, 2524 -> 1, 2525 -> 1, 2521 -> 0, 2520 -> 0, 2533 -> 1, 2523 -> 1, 2530 -> 0, 2532 -> 1, 2526 -> 2, 2534 -> 1, 2522 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(2531, 2520, 2530, 2515, 2521, 2522), 1 -> HashSet(2533, 2523, 2524, 2525, 2532, 2534), 2 -> HashSet(2527, 2526), 3 -> HashSet(2528, 2529))
  /* Beautified form:
  "ToUint32" (argument) => {
    app __x0__ = (ToNumber argument)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let number = __x0__
    if (|| (|| (|| (|| (= number NaN) (= number 0i)) (= number -0.0)) (= number Infinity)) (= number -Infinity)) {
      app __x1__ = (WrapCompletion 0i)
      return __x1__
    } else {}
    let int = (convert number num2int )
    let int32bit = (%% int 4294967296i)
    app __x2__ = (WrapCompletion int32bit)
    return __x2__
  }
  */
}
