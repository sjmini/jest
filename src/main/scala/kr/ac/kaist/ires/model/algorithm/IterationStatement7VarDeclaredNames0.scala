package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement7VarDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement7VarDeclaredNames0""", List(Id("""this"""), Id("""ForDeclaration"""), Id("""Expression"""), Id("""Statement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""VarDeclaredNames""")).setId(32209), IReturn(ERef(RefId(Id("""__x0__""")))).setId(32210))).setId(32215))
  val instToStepMap: Map[Int, Int] = Map(32209 -> 0, 32210 -> 0, 32211 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(32210, 32211, 32209))
  /* Beautified form:
  "IterationStatement7VarDeclaredNames0" (this, ForDeclaration, Expression, Statement) => {
    access __x0__ = (Statement "VarDeclaredNames")
    return __x0__
  }
  */
}
