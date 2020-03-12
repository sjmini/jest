package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object HoistableDeclaration3Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""HoistableDeclaration3Evaluation0""", List(Id("""this"""), Id("""AsyncGeneratorDeclaration""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))).setId(26043), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(26044), IReturn(ERef(RefId(Id("""__x1__""")))).setId(26045))).setId(26051))
  val instToStepMap: Map[Int, Int] = Map(26043 -> 0, 26044 -> 0, 26045 -> 0, 26046 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(26044, 26043, 26046, 26045))
  /* Beautified form:
  "HoistableDeclaration3Evaluation0" (this, AsyncGeneratorDeclaration) => {
    app __x0__ = (NormalCompletion CONST_empty)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
