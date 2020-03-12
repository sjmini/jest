package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GlobalEnvironmentRecordDOTHasLexicalDeclaration {
  val length: Int = 1
  val func: Func = Func("""GlobalEnvironmentRecord.HasLexicalDeclaration""", List(Id("""this"""), Id("""N""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefId(Id("""this""")))).setId(48571), ILet(Id("""DclRec"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""DeclarativeRecord""")))).setId(48573), IApp(Id("""__x0__"""), ERef(RefProp(RefId(Id("""DclRec""")), EStr("""HasBinding"""))), List(ERef(RefId(Id("""DclRec"""))), ERef(RefId(Id("""N"""))))).setId(48575), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(48576), IReturn(ERef(RefId(Id("""__x1__""")))).setId(48577))).setId(48585))
  val instToStepMap: Map[Int, Int] = HashMap(48572 -> 0, 48575 -> 2, 48577 -> 2, 48578 -> 2, 48576 -> 2, 48573 -> 1, 48574 -> 1, 48571 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(48572, 48571), 1 -> HashSet(48573, 48574), 2 -> HashSet(48575, 48577, 48578, 48576))
  /* Beautified form:
  "GlobalEnvironmentRecord.HasLexicalDeclaration" (this, N) => {
    let envRec = this
    let DclRec = envRec["DeclarativeRecord"]
    app __x0__ = (DclRec["HasBinding"] DclRec N)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
