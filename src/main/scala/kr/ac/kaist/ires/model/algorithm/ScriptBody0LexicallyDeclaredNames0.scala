package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ScriptBody0LexicallyDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""ScriptBody0LexicallyDeclaredNames0""", List(Id("""this"""), Id("""StatementList""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""TopLevelLexicallyDeclaredNames""")).setId(46264), IReturn(ERef(RefId(Id("""__x0__""")))).setId(46265))).setId(46270))
  val instToStepMap: Map[Int, Int] = Map(46264 -> 0, 46265 -> 0, 46266 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(46264, 46265, 46266))
  /* Beautified form:
  "ScriptBody0LexicallyDeclaredNames0" (this, StatementList) => {
    access __x0__ = (StatementList "TopLevelLexicallyDeclaredNames")
    return __x0__
  }
  */
}
