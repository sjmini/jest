package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IfStatement1ContainsDuplicateLabels0 {
  val length: Int = 0
  val func: Func = Func("""IfStatement1ContainsDuplicateLabels0""", List(Id("""this"""), Id("""Expression"""), Id("""Statement0"""), Id("""Statement1"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement0"""))), EStr("""ContainsDuplicateLabels""")).setId(30185), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(30186), ILet(Id("""hasDuplicate"""), ERef(RefId(Id("""__x1__""")))).setId(30187), IIf(EBOp(OEq, ERef(RefId(Id("""hasDuplicate"""))), EBool(true)), IReturn(EBool(true)).setId(30189), ISeq(List()).setId(30203)).setId(30192), IAccess(Id("""__x2__"""), ERef(RefId(Id("""Statement1"""))), EStr("""ContainsDuplicateLabels""")).setId(30194), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(30195), IReturn(ERef(RefId(Id("""__x3__""")))).setId(30196))).setId(30208))
  val instToStepMap: Map[Int, Int] = HashMap(30194 -> 3, 30186 -> 0, 30189 -> 1, 30195 -> 3, 30196 -> 3, 30188 -> 0, 30193 -> 2, 30197 -> 3, 30185 -> 0, 30192 -> 2, 30187 -> 0, 30190 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(30186, 30185, 30188, 30187), 1 -> HashSet(30189, 30190), 2 -> HashSet(30192, 30193), 3 -> HashSet(30194, 30195, 30196, 30197))
  /* Beautified form:
  "IfStatement1ContainsDuplicateLabels0" (this, Expression, Statement0, Statement1, labelSet) => {
    access __x0__ = (Statement0 "ContainsDuplicateLabels")
    app __x1__ = (__x0__ labelSet)
    let hasDuplicate = __x1__
    if (= hasDuplicate true) return true else {}
    access __x2__ = (Statement1 "ContainsDuplicateLabels")
    app __x3__ = (__x2__ labelSet)
    return __x3__
  }
  */
}
