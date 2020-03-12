package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Catch0VarDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""Catch0VarDeclaredNames0""", List(Id("""this"""), Id("""CatchParameter"""), Id("""Block""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Block"""))), EStr("""VarDeclaredNames""")).setId(37212), IReturn(ERef(RefId(Id("""__x0__""")))).setId(37213))).setId(37218))
  val instToStepMap: Map[Int, Int] = Map(37212 -> 0, 37213 -> 0, 37214 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(37213, 37214, 37212))
  /* Beautified form:
  "Catch0VarDeclaredNames0" (this, CatchParameter, Block) => {
    access __x0__ = (Block "VarDeclaredNames")
    return __x0__
  }
  */
}
