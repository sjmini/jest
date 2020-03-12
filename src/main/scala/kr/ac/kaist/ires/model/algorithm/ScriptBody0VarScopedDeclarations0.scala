package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ScriptBody0VarScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""ScriptBody0VarScopedDeclarations0""", List(Id("""this"""), Id("""StatementList""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""TopLevelVarScopedDeclarations""")).setId(46294), IReturn(ERef(RefId(Id("""__x0__""")))).setId(46295))).setId(46300))
  val instToStepMap: Map[Int, Int] = Map(46294 -> 0, 46295 -> 0, 46296 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(46296, 46295, 46294))
  /* Beautified form:
  "ScriptBody0VarScopedDeclarations0" (this, StatementList) => {
    access __x0__ = (StatementList "TopLevelVarScopedDeclarations")
    return __x0__
  }
  */
}
