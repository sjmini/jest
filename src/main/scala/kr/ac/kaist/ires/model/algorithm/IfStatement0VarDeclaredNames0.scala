package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IfStatement0VarDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""IfStatement0VarDeclaredNames0""", List(Id("""this"""), Id("""Expression"""), Id("""Statement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""VarDeclaredNames""")).setId(30366), IReturn(ERef(RefId(Id("""__x0__""")))).setId(30367))).setId(30372))
  val instToStepMap: Map[Int, Int] = Map(30368 -> 0, 30366 -> 0, 30367 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(30366, 30367, 30368))
  /* Beautified form:
  "IfStatement0VarDeclaredNames0" (this, Expression, Statement) => {
    access __x0__ = (Statement "VarDeclaredNames")
    return __x0__
  }
  */
}
