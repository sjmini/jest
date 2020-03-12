package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ObjectLiteral0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""ObjectLiteral0Evaluation0""", List(Id("""this""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefId(Id("""INTRINSIC_ObjectPrototype"""))))).setId(14601), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(14602), IReturn(ERef(RefId(Id("""__x1__""")))).setId(14603))).setId(14609))
  val instToStepMap: Map[Int, Int] = Map(14601 -> 0, 14602 -> 0, 14603 -> 0, 14604 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(14602, 14601, 14604, 14603))
  /* Beautified form:
  "ObjectLiteral0Evaluation0" (this) => {
    app __x0__ = (ObjectCreate INTRINSIC_ObjectPrototype)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
