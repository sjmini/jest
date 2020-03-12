package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GlobalEnvironmentRecordDOTHasVarDeclaration {
  val length: Int = 1
  val func: Func = Func("""GlobalEnvironmentRecord.HasVarDeclaration""", List(Id("""this"""), Id("""N""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefId(Id("""this""")))).setId(48537), ILet(Id("""varDeclaredNames"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""VarNames""")))).setId(48539), IIf(EContains(ERef(RefId(Id("""varDeclaredNames"""))), ERef(RefId(Id("""N""")))), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(48541), IReturn(ERef(RefId(Id("""__x0__""")))).setId(48542))).setId(48555), ISeq(List()).setId(48556)).setId(48545), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(48547), IReturn(ERef(RefId(Id("""__x1__""")))).setId(48548))).setId(48560))
  val instToStepMap: Map[Int, Int] = HashMap(48545 -> 3, 48540 -> 1, 48549 -> 4, 48541 -> 2, 48542 -> 2, 48539 -> 1, 48546 -> 3, 48547 -> 4, 48537 -> 0, 48543 -> 2, 48548 -> 4, 48538 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(48537, 48538), 1 -> HashSet(48540, 48539), 2 -> HashSet(48543, 48541, 48542), 3 -> HashSet(48545, 48546), 4 -> HashSet(48549, 48548, 48547))
  /* Beautified form:
  "GlobalEnvironmentRecord.HasVarDeclaration" (this, N) => {
    let envRec = this
    let varDeclaredNames = envRec["VarNames"]
    if (contains varDeclaredNames N) {
      app __x0__ = (WrapCompletion true)
      return __x0__
    } else {}
    app __x1__ = (WrapCompletion false)
    return __x1__
  }
  */
}
