package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object SwitchStatement0VarScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""SwitchStatement0VarScopedDeclarations0""", List(Id("""this"""), Id("""Expression"""), Id("""CaseBlock""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""CaseBlock"""))), EStr("""VarScopedDeclarations""")).setId(35270), IReturn(ERef(RefId(Id("""__x0__""")))).setId(35271))).setId(35276))
  val instToStepMap: Map[Int, Int] = Map(35270 -> 0, 35271 -> 0, 35272 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(35271, 35270, 35272))
  /* Beautified form:
  "SwitchStatement0VarScopedDeclarations0" (this, Expression, CaseBlock) => {
    access __x0__ = (CaseBlock "VarScopedDeclarations")
    return __x0__
  }
  */
}
