package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Catch0VarScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""Catch0VarScopedDeclarations0""", List(Id("""this"""), Id("""CatchParameter"""), Id("""Block""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Block"""))), EStr("""VarScopedDeclarations""")).setId(37368), IReturn(ERef(RefId(Id("""__x0__""")))).setId(37369))).setId(37374))
  val instToStepMap: Map[Int, Int] = Map(37368 -> 0, 37369 -> 0, 37370 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(37369, 37370, 37368))
  /* Beautified form:
  "Catch0VarScopedDeclarations0" (this, CatchParameter, Block) => {
    access __x0__ = (Block "VarScopedDeclarations")
    return __x0__
  }
  */
}
