package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement10ContainsDuplicateLabels0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement10ContainsDuplicateLabels0""", List(Id("""this"""), Id("""ForDeclaration"""), Id("""AssignmentExpression"""), Id("""Statement"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""ContainsDuplicateLabels""")).setId(31853), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(31854), IReturn(ERef(RefId(Id("""__x1__""")))).setId(31855))).setId(31861))
  val instToStepMap: Map[Int, Int] = Map(31856 -> 0, 31853 -> 0, 31854 -> 0, 31855 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(31853, 31854, 31855, 31856))
  /* Beautified form:
  "IterationStatement10ContainsDuplicateLabels0" (this, ForDeclaration, AssignmentExpression, Statement, labelSet) => {
    access __x0__ = (Statement "ContainsDuplicateLabels")
    app __x1__ = (__x0__ labelSet)
    return __x1__
  }
  */
}
