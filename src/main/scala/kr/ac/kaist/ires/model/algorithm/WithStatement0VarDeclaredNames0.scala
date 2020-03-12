package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object WithStatement0VarDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""WithStatement0VarDeclaredNames0""", List(Id("""this"""), Id("""Expression"""), Id("""Statement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""VarDeclaredNames""")).setId(34162), IReturn(ERef(RefId(Id("""__x0__""")))).setId(34163))).setId(34168))
  val instToStepMap: Map[Int, Int] = Map(34162 -> 0, 34163 -> 0, 34164 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(34164, 34163, 34162))
  /* Beautified form:
  "WithStatement0VarDeclaredNames0" (this, Expression, Statement) => {
    access __x0__ = (Statement "VarDeclaredNames")
    return __x0__
  }
  */
}
