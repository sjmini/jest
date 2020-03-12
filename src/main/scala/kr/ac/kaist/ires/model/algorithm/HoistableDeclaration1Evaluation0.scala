package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object HoistableDeclaration1Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""HoistableDeclaration1Evaluation0""", List(Id("""this"""), Id("""GeneratorDeclaration""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))).setId(26017), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(26018), IReturn(ERef(RefId(Id("""__x1__""")))).setId(26019))).setId(26025))
  val instToStepMap: Map[Int, Int] = Map(26017 -> 0, 26018 -> 0, 26019 -> 0, 26020 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(26017, 26018, 26019, 26020))
  /* Beautified form:
  "HoistableDeclaration1Evaluation0" (this, GeneratorDeclaration) => {
    app __x0__ = (NormalCompletion CONST_empty)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
