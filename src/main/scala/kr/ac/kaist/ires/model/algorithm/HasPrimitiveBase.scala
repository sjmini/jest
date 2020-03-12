package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object HasPrimitiveBase {
  val length: Int = 1
  val func: Func = Func("""HasPrimitiveBase""", List(Id("""V""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefProp(RefId(Id("""V""")), EStr("""BaseValue"""))))).setId(483), IIf(EBOp(OOr, EBOp(OOr, EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Boolean""")))), EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""String"""))))), EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Symbol"""))))), EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Number"""))))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(484), IReturn(ERef(RefId(Id("""__x1__""")))).setId(485))).setId(496), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(487), IReturn(ERef(RefId(Id("""__x2__""")))).setId(488))).setId(499)).setId(490))).setId(501))
  val instToStepMap: Map[Int, Int] = HashMap(485 -> 1, 484 -> 1, 483 -> 1, 482 -> 0, 488 -> 1, 489 -> 1, 490 -> 1, 487 -> 1, 486 -> 1, 491 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(482), 1 -> HashSet(485, 484, 483, 488, 489, 490, 487, 486, 491))
  /* Beautified form:
  "HasPrimitiveBase" (V) => {
    app __x0__ = (Type V["BaseValue"])
    if (|| (|| (|| (= __x0__ Boolean) (= __x0__ String)) (= __x0__ Symbol)) (= __x0__ Number)) {
      app __x1__ = (WrapCompletion true)
      return __x1__
    } else {
      app __x2__ = (WrapCompletion false)
      return __x2__
    }
  }
  */
}
